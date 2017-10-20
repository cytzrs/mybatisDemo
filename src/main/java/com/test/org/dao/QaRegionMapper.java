package com.test.org.dao;

import com.test.org.pojo.QaRegion;

public interface QaRegionMapper {
    int insert(QaRegion record);

    int insertSelective(QaRegion record);
}