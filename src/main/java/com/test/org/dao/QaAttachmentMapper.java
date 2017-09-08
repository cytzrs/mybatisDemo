package com.test.org.dao;

import com.test.org.pojo.QaAttachment;
import com.test.org.pojo.QaAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaAttachmentMapper {
    long countByExample(QaAttachmentExample example);

    int deleteByExample(QaAttachmentExample example);

    int insert(QaAttachment record);

    int insertSelective(QaAttachment record);

    List<QaAttachment> selectByExample(QaAttachmentExample example);

    int updateByExampleSelective(@Param("record") QaAttachment record, @Param("example") QaAttachmentExample example);

    int updateByExample(@Param("record") QaAttachment record, @Param("example") QaAttachmentExample example);
}