package com.test.org.dao;

import com.test.org.pojo.PromAward;
import com.test.org.pojo.PromAwardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromAwardMapper {
    long countByExample(PromAwardExample example);

    int deleteByExample(PromAwardExample example);

    int insert(PromAward record);

    int insertSelective(PromAward record);

    List<PromAward> selectByExample(PromAwardExample example);

    int updateByExampleSelective(@Param("record") PromAward record, @Param("example") PromAwardExample example);

    int updateByExample(@Param("record") PromAward record, @Param("example") PromAwardExample example);
}