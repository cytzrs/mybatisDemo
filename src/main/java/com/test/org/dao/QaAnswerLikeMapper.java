package com.test.org.dao;

import com.test.org.pojo.QaAnswerLike;
import com.test.org.pojo.QaAnswerLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaAnswerLikeMapper {
    long countByExample(QaAnswerLikeExample example);

    int deleteByExample(QaAnswerLikeExample example);

    int insert(QaAnswerLike record);

    int insertSelective(QaAnswerLike record);

    List<QaAnswerLike> selectByExample(QaAnswerLikeExample example);

    int updateByExampleSelective(@Param("record") QaAnswerLike record, @Param("example") QaAnswerLikeExample example);

    int updateByExample(@Param("record") QaAnswerLike record, @Param("example") QaAnswerLikeExample example);
}