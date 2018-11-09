package com.atguigu.finance.bean;

import lombok.Data;

@Data
public class ContractnoVo {
    private String loanContractNum  ;

    @Override
    public String toString() {
        return "ContractnoVo{" +
                "loanContractNum='" + loanContractNum + '\'' +
                '}';
    }
}
