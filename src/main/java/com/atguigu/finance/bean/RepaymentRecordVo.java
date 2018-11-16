package com.atguigu.finance.bean;

import lombok.Data;

import java.util.Date;

@Data
public class RepaymentRecordVo {
    private Date repaymentDate;
    private Integer repaymentAmount;
    private String accountType;
    private String accountBankName;
    private String accountNo;
    private String dataCreateType;

    @Override
    public String toString() {
        return "RepaymentRecordVo{" +
                "repaymentDate=" + repaymentDate +
                ", repaymentAmount=" + repaymentAmount +
                ", accountType='" + accountType + '\'' +
                ", accountBankName='" + accountBankName + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", dataCreateType='" + dataCreateType + '\'' +
                '}';
    }
}
