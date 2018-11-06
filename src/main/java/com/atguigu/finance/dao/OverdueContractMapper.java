package com.atguigu.finance.dao;

import com.atguigu.finance.bean.OverdueContract;
import com.atguigu.finance.bean.OverdueContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OverdueContractMapper {
    int countByExample(OverdueContractExample example);

    int deleteByExample(OverdueContractExample example);

    int deleteByPrimaryKey(String id);

    int insert(OverdueContract record);

    int insertSelective(OverdueContract record);

    List<OverdueContract> selectByExample(OverdueContractExample example);

    OverdueContract selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OverdueContract record, @Param("example") OverdueContractExample example);

    int updateByExample(@Param("record") OverdueContract record, @Param("example") OverdueContractExample example);

    int updateByPrimaryKeySelective(OverdueContract record);

    int updateByPrimaryKey(OverdueContract record);
}