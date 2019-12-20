package com.gsm.controller;

import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.UserInfo;
import com.gsm.pojo.vo.vo.UserVo;
import com.gsm.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("登录模块")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("修改用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "id", value = "id", required = true),
            @ApiImplicitParam(paramType = "body", name = "userNickName", value = "昵称", required = true),
    })
    @PutMapping("/userInfo/{id}")
    public BoolVo updateUserInfo(@PathVariable("id")Long id, UserVo userVo){
        BoolVo boolVo = userService.updateUserInfo(id,userVo);
        return boolVo;
    }

    @ApiOperation("获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "id", value = "id", required = true),
            @ApiImplicitParam(paramType = "body", name = "userNickName", value = "昵称", required = true),
    })
    @GetMapping("/userInfo/{id}")
    public UserInfo selectUserInfo(@PathVariable("id")Long id){
        UserInfo userInfo = userService.selectUserInfo(id);
        return userInfo;
    }
}
