package com.atguigu.finance.service.impl;

import com.atguigu.finance.bean.ContractAttribute;
import com.atguigu.finance.bean.ContractVo;
import com.atguigu.finance.dao.ContractAttributeMapper;
import com.atguigu.finance.service.ContractAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ContractAttributeServiceImpl implements ContractAttributeService {
    @Autowired
    ContractAttributeMapper contractAttributeMapper;

    @Override
    public List<ContractAttribute> getAll() {
        ContractAttribute contractAttribute=  contractAttributeMapper.selectList();
      List<ContractAttribute> list=new ArrayList<>();
      list.add(contractAttribute);
      System.out.println("=========="+contractAttribute.getLoanContractNum());
        return list;
    }
}
