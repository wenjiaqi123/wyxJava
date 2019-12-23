package com.gsm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gsm.dao.CourseDao;
import com.gsm.pojo.database.CourseDo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.CourseVo;
import com.gsm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;


    @Override
    public ListVo selectCourseList(CourseDo courseDo) {
        PageHelper.startPage(courseDo.getPage(), courseDo.getRows());
        List<CourseVo> courseVoList = courseDao.selectCourseList(courseDo);
        PageInfo<CourseVo> list = new PageInfo<>(courseVoList);
        ListVo listVo = ListVo.builder()
                .total(list.getTotal())
                .list(courseVoList)
                .msg("课程列表")
                .build();
        return listVo;
    }
}
