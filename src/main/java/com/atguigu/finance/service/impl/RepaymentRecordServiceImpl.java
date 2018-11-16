package com.atguigu.finance.service.impl;

import com.atguigu.finance.bean.RepaymentRecord;
import com.atguigu.finance.bean.RepaymentRecordVo;
import com.atguigu.finance.dao.RepaymentRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepaymentRecordServiceImpl implements  RepaymentRecordService {
    @Autowired
    RepaymentRecordMapper repaymentRecordMapper;

    @Override
    public RepaymentRecordVo getData(String loanContractNum) {
        RepaymentRecordVo recordVo  =repaymentRecordMapper.selectResource(loanContractNum);
        return recordVo;
    }
}
