package com.gsm.service.impl;

import com.gsm.dao.UserDao;
import com.gsm.frame.globalException.MyException;
import com.gsm.frame.utils.CryptogramUtils;
import com.gsm.pojo.database.UserDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.UserInfo;
import com.gsm.pojo.vo.vo.UserVo;
import com.gsm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public BoolVo updateUserInfo(Long id, UserVo userVo) {
        String iphoneNo = userVo.getIphoneNo();
        String userNickName = userVo.getUserNickName();
        String pp = userVo.getPp();
        String pc = userVo.getPc();
        String userEmail = userVo.getUserEmail();

        String userPwd = CryptogramUtils.base64Decode(pp);
        UserDo userDo = UserDo.builder()
                .id(id)
                .userNickName(userNickName)
                .iphoneNo(iphoneNo)
                .userPwdPlaintext(userPwd)
                .userPwdCiphertext(pc)
                .userEmail(userEmail)
                .build();
        Integer count = userDao.updateUserInfo(userDo);
        BoolVo boolVo = new BoolVo(true, "修改成功");
        return boolVo;
    }

    @Override
    public UserInfo selectUserInfo(Long id) {
        UserInfo userInfo = userDao.selectUserInfo(id);
        if (userInfo == null) {
            throw new MyException("获取信息失败");
        }
        return userInfo;
    }
}
