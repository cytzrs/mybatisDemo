package com.test.org.dao;

import com.test.org.pojo.FundApplyLog;

public interface FundApplyLogMapper {
    int insert(FundApplyLog record);

    int insertSelective(FundApplyLog record);
}