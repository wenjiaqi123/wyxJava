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
@ApiModel("课程信息")
public class CourseVo{
    @ApiModelProperty("课程id")
    private Integer id;
    @ApiModelProperty("课程名")
    private String courseName;
    @ApiModelProperty("课程时长")
    private Integer courseTime;
    @ApiModelProperty("课程大小")
    private Integer courseSize;
    @ApiModelProperty("展示顺序")
    private Integer showOrder;
    @ApiModelProperty("课程类型")
    private Integer courseType;

}
