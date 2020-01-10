package com.gsm.service.impl;

import com.gsm.dao.DiscussDao;
import com.gsm.pojo.database.CourseDiscussDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscussServiceImpl implements DiscussService {
    @Autowired
    private DiscussDao discussDao;

    @Override
    public BoolVo insertDiscuss(CourseDiscussDo courseDiscussDo) {
        discussDao.insertDiscuss(courseDiscussDo);
        BoolVo boolVo = new BoolVo(true,"提交成功");
        return boolVo;
    }
}
