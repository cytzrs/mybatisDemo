package com.test.org.dao;

import com.test.org.pojo.PromLottery;
import com.test.org.pojo.PromLotteryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromLotteryMapper {
    long countByExample(PromLotteryExample example);

    int deleteByExample(PromLotteryExample example);

    int insert(PromLottery record);

    int insertSelective(PromLottery record);

    List<PromLottery> selectByExample(PromLotteryExample example);

    int updateByExampleSelective(@Param("record") PromLottery record, @Param("example") PromLotteryExample example);

    int updateByExample(@Param("record") PromLottery record, @Param("example") PromLotteryExample example);
}