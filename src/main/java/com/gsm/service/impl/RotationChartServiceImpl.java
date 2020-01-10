package com.gsm.service.impl;

import com.gsm.dao.RotationChartDao;
import com.gsm.pojo.database.RotationChartDo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.RotationChartVo;
import com.gsm.service.RotationChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RotationChartServiceImpl implements RotationChartService {
    @Autowired
    private RotationChartDao rotationChartDao;

    @Override
    public ListVo selectRotationChartList(RotationChartVo chartVo) {
        List<RotationChartDo> chartDoList = rotationChartDao.selectRotationChartList(chartVo);
        ListVo listVo = ListVo.builder()
                .list(chartDoList)
                .msg("轮播图列表")
                .build();
        return listVo;
    }
}
