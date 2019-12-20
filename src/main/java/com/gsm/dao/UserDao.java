package com.gsm.dao;

import com.gsm.pojo.database.UserDo;
import com.gsm.pojo.vo.baseVo.UserInfo;

public interface UserDao {
    Integer updateUserInfo(UserDo userDo);

    UserInfo selectUserInfo(Long id);
}
