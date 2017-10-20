package com.test.org.dao;

import com.test.org.pojo.QaLike;
import com.test.org.pojo.QaLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaLikeMapper {
    long countByExample(QaLikeExample example);

    int deleteByExample(QaLikeExample example);

    int insert(QaLike record);

    int insertSelective(QaLike record);

    List<QaLike> selectByExample(QaLikeExample example);

    int updateByExampleSelective(@Param("record") QaLike record, @Param("example") QaLikeExample example);

    int updateByExample(@Param("record") QaLike record, @Param("example") QaLikeExample example);
}