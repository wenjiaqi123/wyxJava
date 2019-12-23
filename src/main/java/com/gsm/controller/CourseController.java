package com.gsm.controller;

import com.gsm.pojo.database.CourseDo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("课程模块")
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @ApiOperation("获取课程列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "page", value = "页码", required = true),
            @ApiImplicitParam(paramType = "query", name = "rows", value = "每页记录数", required = true),
            @ApiImplicitParam(paramType = "query", name = "courseType", value = "课程类型", required = true)
    })
    @GetMapping("/courseList")
    public ListVo selectCourseList(CourseDo courseDo){
        ListVo listVo = courseService.selectCourseList(courseDo);
        return listVo;
    }
}
