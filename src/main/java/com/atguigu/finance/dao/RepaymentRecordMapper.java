package com.atguigu.finance.dao;

import com.atguigu.finance.bean.RepaymentRecord;
import com.atguigu.finance.bean.RepaymentRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentRecordMapper {
    int countByExample(RepaymentRecordExample example);

    int deleteByExample(RepaymentRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepaymentRecord record);

    int insertSelective(RepaymentRecord record);

    List<RepaymentRecord> selectByExample(RepaymentRecordExample example);

    RepaymentRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepaymentRecord record, @Param("example") RepaymentRecordExample example);

    int updateByExample(@Param("record") RepaymentRecord record, @Param("example") RepaymentRecordExample example);

    int updateByPrimaryKeySelective(RepaymentRecord record);

    int updateByPrimaryKey(RepaymentRecord record);
}