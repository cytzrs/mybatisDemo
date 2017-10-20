package com.test.org.dao;

import com.test.org.pojo.PromRecord;
import com.test.org.pojo.PromRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromRecordMapper {
    long countByExample(PromRecordExample example);

    int deleteByExample(PromRecordExample example);

    int insert(PromRecord record);

    int insertSelective(PromRecord record);

    List<PromRecord> selectByExample(PromRecordExample example);

    int updateByExampleSelective(@Param("record") PromRecord record, @Param("example") PromRecordExample example);

    int updateByExample(@Param("record") PromRecord record, @Param("example") PromRecordExample example);
}