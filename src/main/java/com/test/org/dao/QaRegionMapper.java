package com.test.org.dao;

import com.test.org.pojo.QaRegion;
import com.test.org.pojo.QaRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaRegionMapper {
    long countByExample(QaRegionExample example);

    int deleteByExample(QaRegionExample example);

    int insert(QaRegion record);

    int insertSelective(QaRegion record);

    List<QaRegion> selectByExample(QaRegionExample example);

    int updateByExampleSelective(@Param("record") QaRegion record, @Param("example") QaRegionExample example);

    int updateByExample(@Param("record") QaRegion record, @Param("example") QaRegionExample example);
}