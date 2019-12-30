package com.gsm.controller;

import com.gsm.pojo.database.CourseDiscussDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.service.DiscussService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("讨论模块")
@RestController
@RequestMapping("/discuss")
public class DiscussController {
    @Autowired
    private DiscussService discussService;

    @ApiOperation("提交讨论")
    @PostMapping("/insertDiscuss")
    public BoolVo insertDiscuss(CourseDiscussDo courseDiscussDo){
        BoolVo boolVo = discussService.insertDiscuss(courseDiscussDo);
        return boolVo;
    }
}
