package com.gsm.pojo.vo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("用户注册")
public class UserVo {
    @ApiModelProperty("手机号")
    private String iphoneNo;
    @ApiModelProperty("昵称")
    private String userNickName;
    @ApiModelProperty("邮箱")
    private String userEmail;
    @ApiModelProperty("用户密码明文,userPwdPlaintext")
    private String pp;
    @ApiModelProperty("用户密码密文,userPwdCiphertext")
    private String pc;
}