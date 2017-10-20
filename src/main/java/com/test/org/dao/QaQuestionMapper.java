package com.test.org.dao;

import com.test.org.pojo.QaQuestion;
import com.test.org.pojo.QaQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaQuestionMapper {
    long countByExample(QaQuestionExample example);

    int deleteByExample(QaQuestionExample example);

    int insert(QaQuestion record);

    int insertSelective(QaQuestion record);

    List<QaQuestion> selectByExample(QaQuestionExample example);

    int updateByExampleSelective(@Param("record") QaQuestion record, @Param("example") QaQuestionExample example);

    int updateByExample(@Param("record") QaQuestion record, @Param("example") QaQuestionExample example);
}