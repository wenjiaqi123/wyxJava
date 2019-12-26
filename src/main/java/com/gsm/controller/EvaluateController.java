package com.gsm.controller;

import com.gsm.pojo.vo.baseVo.BoolVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Api("评价模块")
@RestController
@RequestMapping("/evaluate")
public class EvaluateController {

    @ApiOperation("提交评价")
    @PostMapping("/insertEvaluate")
    public BoolVo insertEvaluate(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BoolVo boolVo = new BoolVo(true,"提交成功");
        return boolVo;
    }
}
