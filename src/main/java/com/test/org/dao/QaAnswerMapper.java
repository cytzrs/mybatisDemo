package com.test.org.dao;

import com.test.org.pojo.QaAnswer;
import com.test.org.pojo.QaAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaAnswerMapper {
    long countByExample(QaAnswerExample example);

    int deleteByExample(QaAnswerExample example);

    int insert(QaAnswer record);

    int insertSelective(QaAnswer record);

    List<QaAnswer> selectByExample(QaAnswerExample example);

    int updateByExampleSelective(@Param("record") QaAnswer record, @Param("example") QaAnswerExample example);

    int updateByExample(@Param("record") QaAnswer record, @Param("example") QaAnswerExample example);
}