package com.test.org.dao;

import com.test.org.pojo.QaQuestion;
import com.test.org.pojo.QaQuestionExample;
import com.test.org.pojo.QaQuestionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaQuestionMapper {
    long countByExample(QaQuestionExample example);

    int deleteByExample(QaQuestionExample example);

    int insert(QaQuestionWithBLOBs record);

    int insertSelective(QaQuestionWithBLOBs record);

    List<QaQuestionWithBLOBs> selectByExampleWithBLOBs(QaQuestionExample example);

    List<QaQuestion> selectByExample(QaQuestionExample example);

    int updateByExampleSelective(@Param("record") QaQuestionWithBLOBs record, @Param("example") QaQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") QaQuestionWithBLOBs record, @Param("example") QaQuestionExample example);

    int updateByExample(@Param("record") QaQuestion record, @Param("example") QaQuestionExample example);
}