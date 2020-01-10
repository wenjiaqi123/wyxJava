package com.gsm.service;

import com.gsm.pojo.database.CourseDiscussDo;
import com.gsm.pojo.vo.baseVo.BoolVo;

public interface DiscussService {
    BoolVo insertDiscuss(CourseDiscussDo courseDiscussDo);
}
