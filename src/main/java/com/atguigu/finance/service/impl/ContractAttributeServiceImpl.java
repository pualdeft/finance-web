package com.atguigu.finance.service.impl;

import com.atguigu.finance.dao.ContractAttributeMapper;
import com.atguigu.finance.service.ContractAttributeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContractAttributeServiceImpl implements ContractAttributeService {
    @Autowired
    ContractAttributeMapper contractAttributeMapper;

    @Override
    public List<String> getAll() {
      List<String>  list= contractAttributeMapper.selectList();
        return list;
    }
}
