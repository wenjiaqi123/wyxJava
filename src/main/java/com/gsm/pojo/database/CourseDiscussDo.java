package com.gsm.pojo.database;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("课程讨论对象模型")
public class CourseDiscussDo {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("课程id")
    private Long courseId;
    @ApiModelProperty("用户id")
    private Long userId;
    @ApiModelProperty("讨论内容")
    private String courseDiscuss;
}
