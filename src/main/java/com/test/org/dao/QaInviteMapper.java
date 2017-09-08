package com.test.org.dao;

import com.test.org.pojo.QaInvite;
import com.test.org.pojo.QaInviteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QaInviteMapper {
    long countByExample(QaInviteExample example);

    int deleteByExample(QaInviteExample example);

    int insert(QaInvite record);

    int insertSelective(QaInvite record);

    List<QaInvite> selectByExample(QaInviteExample example);

    int updateByExampleSelective(@Param("record") QaInvite record, @Param("example") QaInviteExample example);

    int updateByExample(@Param("record") QaInvite record, @Param("example") QaInviteExample example);
}