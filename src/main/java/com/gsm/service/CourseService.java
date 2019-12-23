package com.gsm.service;

import com.gsm.pojo.database.CourseDo;
import com.gsm.pojo.vo.baseVo.ListVo;

public interface CourseService {
    ListVo selectCourseList(CourseDo courseDo);
}
