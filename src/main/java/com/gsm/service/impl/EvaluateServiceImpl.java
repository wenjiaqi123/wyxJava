package com.gsm.service.impl;

import com.gsm.dao.EvaluateDao;
import com.gsm.pojo.database.CourseEvaluateDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluateServiceImpl implements EvaluateService {
    @Autowired
    private EvaluateDao evaluateDao;

    @Override
    public BoolVo insertEvaluate(CourseEvaluateDo courseEvaluateDo) {
        evaluateDao.insertEvaluate(courseEvaluateDo);
        BoolVo boolVo = new BoolVo(true, "提交成功");
        return boolVo;
    }
}
