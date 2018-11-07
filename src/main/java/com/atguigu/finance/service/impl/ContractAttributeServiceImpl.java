package com.atguigu.finance.service.impl;

import com.atguigu.finance.dao.ContractAttributeMapper;
import com.atguigu.finance.service.ContractAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractAttributeServiceImpl implements ContractAttributeService {
    @Autowired
    ContractAttributeMapper contractAttributeMapper;

    @Override
    public List<String> getAll() {
      List<String> list= contractAttributeMapper.selectList();
        return list;
    }
}
