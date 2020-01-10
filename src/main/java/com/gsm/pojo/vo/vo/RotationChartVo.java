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
@ApiModel("轮播图信息")
public class RotationChartVo{
    @ApiModelProperty("轮播图id")
    private Long id;
    @ApiModelProperty("轮播图URL地址")
    private String chartUrl;
    @ApiModelProperty("轮播图URL跳转地址")
    private String webUrl;
    @ApiModelProperty("状态")
    private Integer status;
}
