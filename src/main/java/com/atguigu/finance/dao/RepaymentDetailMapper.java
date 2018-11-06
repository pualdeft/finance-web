package com.atguigu.finance.dao;

import com.atguigu.finance.bean.RepaymentDetail;
import com.atguigu.finance.bean.RepaymentDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentDetailMapper {
    int countByExample(RepaymentDetailExample example);

    int deleteByExample(RepaymentDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepaymentDetail record);

    int insertSelective(RepaymentDetail record);

    List<RepaymentDetail> selectByExample(RepaymentDetailExample example);

    RepaymentDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepaymentDetail record, @Param("example") RepaymentDetailExample example);

    int updateByExample(@Param("record") RepaymentDetail record, @Param("example") RepaymentDetailExample example);

    int updateByPrimaryKeySelective(RepaymentDetail record);

    int updateByPrimaryKey(RepaymentDetail record);
}