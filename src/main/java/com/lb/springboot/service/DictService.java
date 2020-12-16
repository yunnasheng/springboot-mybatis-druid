package com.lb.springboot.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.lb.springboot.entity.LtDict;
import com.lb.springboot.mapper.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DictService {

    @Autowired
    private DictMapper dictMapper;

    /**
     * 根据状态查询
     * @param status
     * @param page
     * @param limit
     * @return
     * @throws Exception
     */
    public List<LtDict> findByStatus(String status, int page, int limit) throws Exception {
        PageBounds pageBounds = new PageBounds(page, limit);
        return dictMapper.findByStatus(status, pageBounds);
    }
}
