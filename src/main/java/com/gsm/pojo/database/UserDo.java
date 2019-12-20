package com.gsm.pojo.database;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("用户信息")
public class UserDo {
  @ApiModelProperty("主键id")
  private Long id;
  @ApiModelProperty("用户名")
  private String userName;
  @ApiModelProperty("用户昵称")
  private String userNickName;
  @ApiModelProperty("用户密码明文")
  private String userPwdPlaintext;
  @ApiModelProperty("用户密码密文")
  private String userPwdCiphertext;
  @ApiModelProperty("身份证号")
  private String identityCard;
  @ApiModelProperty("手机号")
  private String iphoneNo;
  @ApiModelProperty("邮箱")
  private String userEmail;

  @ApiModelProperty("创建时间")
  private Date createDate;
  @ApiModelProperty("创建人")
  private String createUser;
  @ApiModelProperty("修改时间")
  private Date updateDate;
  @ApiModelProperty("修改人")
  private String updateUser;
  @ApiModelProperty("记录状态")
  private Integer status;
}
