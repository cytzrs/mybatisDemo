package com.test.org.dao;

import com.test.org.pojo.PromLive;
import com.test.org.pojo.PromLiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromLiveMapper {
    long countByExample(PromLiveExample example);

    int deleteByExample(PromLiveExample example);

    int insert(PromLive record);

    int insertSelective(PromLive record);

    List<PromLive> selectByExample(PromLiveExample example);

    int updateByExampleSelective(@Param("record") PromLive record, @Param("example") PromLiveExample example);

    int updateByExample(@Param("record") PromLive record, @Param("example") PromLiveExample example);
}