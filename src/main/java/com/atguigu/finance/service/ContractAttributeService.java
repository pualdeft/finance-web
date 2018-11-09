package com.atguigu.finance.service;

import com.atguigu.finance.bean.ContractAttribute;
import com.atguigu.finance.bean.ContractAttributeVo;
import com.atguigu.finance.bean.ContractVo;
import com.atguigu.finance.bean.ContractnoVo;

import java.util.List;

public interface ContractAttributeService {
    List<ContractAttribute> getAll();


    ContractAttributeVo getData(ContractAttribute contractAttribute);


    ContractnoVo getSingle(Integer loanContractNum);
}
