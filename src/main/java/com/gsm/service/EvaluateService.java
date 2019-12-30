package com.gsm.service;

import com.gsm.pojo.database.CourseEvaluateDo;
import com.gsm.pojo.vo.baseVo.BoolVo;

public interface EvaluateService {
    BoolVo insertEvaluate(CourseEvaluateDo courseEvaluateDo);
}
