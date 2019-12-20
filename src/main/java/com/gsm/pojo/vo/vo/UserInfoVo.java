package com.gsm.pojo.vo.vo;

import com.gsm.pojo.database.UserDo;
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
@ApiModel("用户信息和用户Token")
public class UserInfoVo {
    @ApiModelProperty("用户信息")
    private UserDo userInfo;
    @ApiModelProperty("用户Token")
    private String token;
}
