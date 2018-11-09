package com.atguigu.finance.bean;

import lombok.Data;

@Data
public class ContractAttributeVo {
    private  String contractno;
    private String loanContractNum;
    @Override
    public String toString() {
        return "ContractAttributeVo{" +
                "contractno='" + contractno + '\'' +
                '}';
    }
}
