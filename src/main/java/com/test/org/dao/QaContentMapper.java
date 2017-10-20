package com.test.org.dao;

import com.test.org.pojo.QaContent;
import com.test.org.pojo.QaContentExample;
import com.test.org.pojo.QaContentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaContentMapper {
    long countByExample(QaContentExample example);

    int deleteByExample(QaContentExample example);

    int insert(QaContentWithBLOBs record);

    int insertSelective(QaContentWithBLOBs record);

    List<QaContentWithBLOBs> selectByExampleWithBLOBs(QaContentExample example);

    List<QaContent> selectByExample(QaContentExample example);

    int updateByExampleSelective(@Param("record") QaContentWithBLOBs record, @Param("example") QaContentExample example);

    int updateByExampleWithBLOBs(@Param("record") QaContentWithBLOBs record, @Param("example") QaContentExample example);

    int updateByExample(@Param("record") QaContent record, @Param("example") QaContentExample example);
}