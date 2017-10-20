package com.test.org.dao;

import com.test.org.pojo.QaReply;
import com.test.org.pojo.QaReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaReplyMapper {
    long countByExample(QaReplyExample example);

    int deleteByExample(QaReplyExample example);

    int insert(QaReply record);

    int insertSelective(QaReply record);

    List<QaReply> selectByExample(QaReplyExample example);

    int updateByExampleSelective(@Param("record") QaReply record, @Param("example") QaReplyExample example);

    int updateByExample(@Param("record") QaReply record, @Param("example") QaReplyExample example);
}