package com.atguigu.finance.dao;

import com.atguigu.finance.bean.ContractAttribute;
import com.atguigu.finance.bean.ContractAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractAttributeMapper {
    int countByExample(ContractAttributeExample example);

    int deleteByExample(ContractAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContractAttribute record);

    int insertSelective(ContractAttribute record);

    List<ContractAttribute> selectByExample(ContractAttributeExample example);

    ContractAttribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContractAttribute record, @Param("example") ContractAttributeExample example);

    int updateByExample(@Param("record") ContractAttribute record, @Param("example") ContractAttributeExample example);

    int updateByPrimaryKeySelective(ContractAttribute record);

    int updateByPrimaryKey(ContractAttribute record);


    List<String> selectList();
}