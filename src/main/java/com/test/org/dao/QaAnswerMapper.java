package com.test.org.dao;

import com.test.org.pojo.QaAnswer;
import com.test.org.pojo.QaAnswerExample;
import com.test.org.pojo.QaAnswerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaAnswerMapper {
    long countByExample(QaAnswerExample example);

    int deleteByExample(QaAnswerExample example);

    int insert(QaAnswerWithBLOBs record);

    int insertSelective(QaAnswerWithBLOBs record);

    List<QaAnswerWithBLOBs> selectByExampleWithBLOBs(QaAnswerExample example);

    List<QaAnswer> selectByExample(QaAnswerExample example);

    int updateByExampleSelective(@Param("record") QaAnswerWithBLOBs record, @Param("example") QaAnswerExample example);

    int updateByExampleWithBLOBs(@Param("record") QaAnswerWithBLOBs record, @Param("example") QaAnswerExample example);

    int updateByExample(@Param("record") QaAnswer record, @Param("example") QaAnswerExample example);
}