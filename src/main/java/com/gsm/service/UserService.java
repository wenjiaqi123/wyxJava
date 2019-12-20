package com.gsm.service;

import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.UserInfo;
import com.gsm.pojo.vo.vo.UserVo;

public interface UserService {
    BoolVo updateUserInfo(Long id, UserVo userVo);

    UserInfo selectUserInfo(Long id);
}
