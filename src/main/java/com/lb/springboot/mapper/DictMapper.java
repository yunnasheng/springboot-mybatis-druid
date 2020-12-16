package com.lb.springboot.mapper;


import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.lb.springboot.common.BaseMapper;
import com.lb.springboot.entity.LtDict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictMapper extends BaseMapper<LtDict> {

    List<LtDict> findByStatus(@Param("status")String status, PageBounds pageBounds);
}
