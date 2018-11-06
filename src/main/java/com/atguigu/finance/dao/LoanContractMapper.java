package com.atguigu.finance.dao;

import com.atguigu.finance.bean.LoanContract;
import com.atguigu.finance.bean.LoanContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanContractMapper {
    int countByExample(LoanContractExample example);

    int deleteByExample(LoanContractExample example);

    int deleteByPrimaryKey(String id);

    int insert(LoanContract record);

    int insertSelective(LoanContract record);

    List<LoanContract> selectByExample(LoanContractExample example);

    LoanContract selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LoanContract record, @Param("example") LoanContractExample example);

    int updateByExample(@Param("record") LoanContract record, @Param("example") LoanContractExample example);

    int updateByPrimaryKeySelective(LoanContract record);

    int updateByPrimaryKey(LoanContract record);
}