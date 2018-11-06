package com.atguigu.finance.dao;

import com.atguigu.finance.bean.BorrowerInfo;
import com.atguigu.finance.bean.BorrowerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowerInfoMapper {
    int countByExample(BorrowerInfoExample example);

    int deleteByExample(BorrowerInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowerInfo record);

    int insertSelective(BorrowerInfo record);

    List<BorrowerInfo> selectByExample(BorrowerInfoExample example);

    BorrowerInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowerInfo record, @Param("example") BorrowerInfoExample example);

    int updateByExample(@Param("record") BorrowerInfo record, @Param("example") BorrowerInfoExample example);

    int updateByPrimaryKeySelective(BorrowerInfo record);

    int updateByPrimaryKey(BorrowerInfo record);
}