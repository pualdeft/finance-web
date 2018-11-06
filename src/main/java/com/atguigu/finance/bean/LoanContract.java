package com.atguigu.finance.bean;

import java.util.Date;

/**
 * 描述:nplm_loan_contract表的实体类
 * @version
 * @author:  zhangzhanbao
 * @创建时间: 2018-09-17
 */
public class LoanContract {
    /**
     * id
     */
    private String id;

    /**
     * 合同编号
     */
    private String loanContractNum;

    /**
     * 借款人id
     */
    private String borrowerId;

    /**
     * ECIF客户号
     */
    private String ecifId;

    /**
     * 产品分类代码
     */
    private String proCategoryCode;

    /**
     * 产品分类名称
     */
    private String proCategoryName;

    /**
     * 产品信息id
     */
    private Integer productInfoId;

    /**
     * 贷款分期数
     */
    private Integer loanInstalments;

    /**
     * 贷款分期单位
     */
    private String loanInstalmentUnit;

    /**
     * 贷款金额
     */
    private Integer loanAmount;

    /**
     * 前期费用
     */
    private Integer preFee;

    /**
     * 放款金额
     */
    private Integer putAmount;

    /**
     * 贷款形式 1为信用，2为担保，3为抵押，4为其他
     */
    private String creditType;

    /**
     * 支付方式 THIRD:第三方渠道  BANK:银行渠道
     */
    private String payMod;

    /**
     * 还款方式             01-等额本息              02-等额本金              03-等本等息              04-付息通             05-一次性还本付息             06-等比累进             07-等额累进             08-0+N             09-分阶段还款
     */
    private String repayWay;

    /**
     * 放款模式：1:差额放款 3:先放款后收费 3:先收费后放款 4:先放款后收费（线下收取前期费用）
     */
    private String loanType;

    /**
     * 销售部门id
     */
    private Integer saleDepartmentId;

    /**
     * 还款账户姓名
     */
    private String repayAccountName;

    /**
     * 还款账户证件类型
     */
    private String repayAcctIdenType;

    /**
     * 还款账户证件号
     */
    private String repayAcctIdenNum;

    /**
     * 还款账户
     */
    private String repayAccount;

    /**
     * 还款账户卡折标识
     */
    private String repayAccountType;

    /**
     * 还款账户银行行别代码
     */
    private String repayAccountBankid;

    /**
     * 还款账户开户行行号(支付行号)
     */
    private String repayActBranchNo;

    /**
     * 还款账户开户行名称
     */
    private String repayAccountBankName;

    /**
     * 还款账户对公对私标识
     */
    private String publicPrivate;

    /**
     * 还款账户开户省
     */
    private String repayActProvince;

    /**
     * 还款账户开户市
     */
    private String repayAccountCity;

    /**
     * POS验证状态 未验证 0014 已验证为空
     */
    private String posStatus;

    /**
     * 首期还款日
     */
    private Date startDate;

    /**
     * 末期还款日
     */
    private Date endDate;

    /**
     * 合同来源：             NPLM_ICMP	综合信贷             NPLM_RZZL	融资租赁             NPLM_CDXT	车贷系统             NPLM_FDXT	房贷系统             
     */
    private String contractSource;

    /**
     * 未分配还款额
     */
    private Integer repayBalance;

    /**
     * 合同状态:             -1：合同废止             0：未放款，1：还款中，2：逾期，             9：正常还清，10：合同终止，11：合同核销，12：减免结清，13：特殊减免结清，14：提前结清，15：放款退回结清
     */
    private String contractType;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 末次修改者
     */
    private String updater;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 末次修改时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 循环授信编号
     */
    private String cycleCreditId;

    /**
     * 修改类型
     */
    private String updateType;

    /**
     * id
     * @return ID id
     */
    public String getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 合同编号
     * @return LOAN_CONTRACT_NUM 合同编号
     */
    public String getLoanContractNum() {
        return loanContractNum;
    }

    /**
     * 合同编号
     * @param loanContractNum 合同编号
     */
    public void setLoanContractNum(String loanContractNum) {
        this.loanContractNum = loanContractNum == null ? null : loanContractNum.trim();
    }

    /**
     * 借款人id
     * @return borrower_id 借款人id
     */
    public String getBorrowerId() {
        return borrowerId;
    }

    /**
     * 借款人id
     * @param borrowerId 借款人id
     */
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId == null ? null : borrowerId.trim();
    }

    /**
     * ECIF客户号
     * @return ECIF_ID ECIF客户号
     */
    public String getEcifId() {
        return ecifId;
    }

    /**
     * ECIF客户号
     * @param ecifId ECIF客户号
     */
    public void setEcifId(String ecifId) {
        this.ecifId = ecifId == null ? null : ecifId.trim();
    }

    /**
     * 产品分类代码
     * @return pro_CATEGORY_CODE 产品分类代码
     */
    public String getProCategoryCode() {
        return proCategoryCode;
    }

    /**
     * 产品分类代码
     * @param proCategoryCode 产品分类代码
     */
    public void setProCategoryCode(String proCategoryCode) {
        this.proCategoryCode = proCategoryCode == null ? null : proCategoryCode.trim();
    }

    /**
     * 产品分类名称
     * @return pro_CATEGORY_NAME 产品分类名称
     */
    public String getProCategoryName() {
        return proCategoryName;
    }

    /**
     * 产品分类名称
     * @param proCategoryName 产品分类名称
     */
    public void setProCategoryName(String proCategoryName) {
        this.proCategoryName = proCategoryName == null ? null : proCategoryName.trim();
    }

    /**
     * 产品信息id
     * @return PRODUCT_INFO_ID 产品信息id
     */
    public Integer getProductInfoId() {
        return productInfoId;
    }

    /**
     * 产品信息id
     * @param productInfoId 产品信息id
     */
    public void setProductInfoId(Integer productInfoId) {
        this.productInfoId = productInfoId;
    }

    /**
     * 贷款分期数
     * @return LOAN_INSTALMENTS 贷款分期数
     */
    public Integer getLoanInstalments() {
        return loanInstalments;
    }

    /**
     * 贷款分期数
     * @param loanInstalments 贷款分期数
     */
    public void setLoanInstalments(Integer loanInstalments) {
        this.loanInstalments = loanInstalments;
    }

    /**
     * 贷款分期单位
     * @return LOAN_INSTALMENT_UNIT 贷款分期单位
     */
    public String getLoanInstalmentUnit() {
        return loanInstalmentUnit;
    }

    /**
     * 贷款分期单位
     * @param loanInstalmentUnit 贷款分期单位
     */
    public void setLoanInstalmentUnit(String loanInstalmentUnit) {
        this.loanInstalmentUnit = loanInstalmentUnit == null ? null : loanInstalmentUnit.trim();
    }

    /**
     * 贷款金额
     * @return LOAN_AMOUNT 贷款金额
     */
    public Integer getLoanAmount() {
        return loanAmount;
    }

    /**
     * 贷款金额
     * @param loanAmount 贷款金额
     */
    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * 前期费用
     * @return PRE_FEE 前期费用
     */
    public Integer getPreFee() {
        return preFee;
    }

    /**
     * 前期费用
     * @param preFee 前期费用
     */
    public void setPreFee(Integer preFee) {
        this.preFee = preFee;
    }

    /**
     * 放款金额
     * @return PUT_AMOUNT 放款金额
     */
    public Integer getPutAmount() {
        return putAmount;
    }

    /**
     * 放款金额
     * @param putAmount 放款金额
     */
    public void setPutAmount(Integer putAmount) {
        this.putAmount = putAmount;
    }

    /**
     * 贷款形式 1为信用，2为担保，3为抵押，4为其他
     * @return CREDIT_TYPE 贷款形式 1为信用，2为担保，3为抵押，4为其他
     */
    public String getCreditType() {
        return creditType;
    }

    /**
     * 贷款形式 1为信用，2为担保，3为抵押，4为其他
     * @param creditType 贷款形式 1为信用，2为担保，3为抵押，4为其他
     */
    public void setCreditType(String creditType) {
        this.creditType = creditType == null ? null : creditType.trim();
    }

    /**
     * 支付方式 THIRD:第三方渠道  BANK:银行渠道
     * @return PAY_MOD 支付方式 THIRD:第三方渠道  BANK:银行渠道
     */
    public String getPayMod() {
        return payMod;
    }

    /**
     * 支付方式 THIRD:第三方渠道  BANK:银行渠道
     * @param payMod 支付方式 THIRD:第三方渠道  BANK:银行渠道
     */
    public void setPayMod(String payMod) {
        this.payMod = payMod == null ? null : payMod.trim();
    }

    /**
     * 还款方式             01-等额本息              02-等额本金              03-等本等息              04-付息通             05-一次性还本付息             06-等比累进             07-等额累进             08-0+N             09-分阶段还款
     * @return REPAY_WAY 还款方式             01-等额本息              02-等额本金              03-等本等息              04-付息通             05-一次性还本付息             06-等比累进             07-等额累进             08-0+N             09-分阶段还款
     */
    public String getRepayWay() {
        return repayWay;
    }

    /**
     * 还款方式             01-等额本息              02-等额本金              03-等本等息              04-付息通             05-一次性还本付息             06-等比累进             07-等额累进             08-0+N             09-分阶段还款
     * @param repayWay 还款方式             01-等额本息              02-等额本金              03-等本等息              04-付息通             05-一次性还本付息             06-等比累进             07-等额累进             08-0+N             09-分阶段还款
     */
    public void setRepayWay(String repayWay) {
        this.repayWay = repayWay == null ? null : repayWay.trim();
    }

    /**
     * 放款模式：1:差额放款 3:先放款后收费 3:先收费后放款 4:先放款后收费（线下收取前期费用）
     * @return LOAN_TYPE 放款模式：1:差额放款 3:先放款后收费 3:先收费后放款 4:先放款后收费（线下收取前期费用）
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * 放款模式：1:差额放款 3:先放款后收费 3:先收费后放款 4:先放款后收费（线下收取前期费用）
     * @param loanType 放款模式：1:差额放款 3:先放款后收费 3:先收费后放款 4:先放款后收费（线下收取前期费用）
     */
    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    /**
     * 销售部门id
     * @return SALE_DEPARTMENT_ID 销售部门id
     */
    public Integer getSaleDepartmentId() {
        return saleDepartmentId;
    }

    /**
     * 销售部门id
     * @param saleDepartmentId 销售部门id
     */
    public void setSaleDepartmentId(Integer saleDepartmentId) {
        this.saleDepartmentId = saleDepartmentId;
    }

    /**
     * 还款账户姓名
     * @return REPAY_ACCOUNT_NAME 还款账户姓名
     */
    public String getRepayAccountName() {
        return repayAccountName;
    }

    /**
     * 还款账户姓名
     * @param repayAccountName 还款账户姓名
     */
    public void setRepayAccountName(String repayAccountName) {
        this.repayAccountName = repayAccountName == null ? null : repayAccountName.trim();
    }

    /**
     * 还款账户证件类型
     * @return REPAY_ACCT_IDEN_TYPE 还款账户证件类型
     */
    public String getRepayAcctIdenType() {
        return repayAcctIdenType;
    }

    /**
     * 还款账户证件类型
     * @param repayAcctIdenType 还款账户证件类型
     */
    public void setRepayAcctIdenType(String repayAcctIdenType) {
        this.repayAcctIdenType = repayAcctIdenType == null ? null : repayAcctIdenType.trim();
    }

    /**
     * 还款账户证件号
     * @return REPAY_ACCT_IDEN_NUM 还款账户证件号
     */
    public String getRepayAcctIdenNum() {
        return repayAcctIdenNum;
    }

    /**
     * 还款账户证件号
     * @param repayAcctIdenNum 还款账户证件号
     */
    public void setRepayAcctIdenNum(String repayAcctIdenNum) {
        this.repayAcctIdenNum = repayAcctIdenNum == null ? null : repayAcctIdenNum.trim();
    }

    /**
     * 还款账户
     * @return REPAY_ACCOUNT 还款账户
     */
    public String getRepayAccount() {
        return repayAccount;
    }

    /**
     * 还款账户
     * @param repayAccount 还款账户
     */
    public void setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount == null ? null : repayAccount.trim();
    }

    /**
     * 还款账户卡折标识
     * @return REPAY_ACCOUNT_TYPE 还款账户卡折标识
     */
    public String getRepayAccountType() {
        return repayAccountType;
    }

    /**
     * 还款账户卡折标识
     * @param repayAccountType 还款账户卡折标识
     */
    public void setRepayAccountType(String repayAccountType) {
        this.repayAccountType = repayAccountType == null ? null : repayAccountType.trim();
    }

    /**
     * 还款账户银行行别代码
     * @return REPAY_ACCOUNT_BANKID 还款账户银行行别代码
     */
    public String getRepayAccountBankid() {
        return repayAccountBankid;
    }

    /**
     * 还款账户银行行别代码
     * @param repayAccountBankid 还款账户银行行别代码
     */
    public void setRepayAccountBankid(String repayAccountBankid) {
        this.repayAccountBankid = repayAccountBankid == null ? null : repayAccountBankid.trim();
    }

    /**
     * 还款账户开户行行号(支付行号)
     * @return REPAY_ACT_BRANCH_NO 还款账户开户行行号(支付行号)
     */
    public String getRepayActBranchNo() {
        return repayActBranchNo;
    }

    /**
     * 还款账户开户行行号(支付行号)
     * @param repayActBranchNo 还款账户开户行行号(支付行号)
     */
    public void setRepayActBranchNo(String repayActBranchNo) {
        this.repayActBranchNo = repayActBranchNo == null ? null : repayActBranchNo.trim();
    }

    /**
     * 还款账户开户行名称
     * @return REPAY_ACCOUNT_BANK_NAME 还款账户开户行名称
     */
    public String getRepayAccountBankName() {
        return repayAccountBankName;
    }

    /**
     * 还款账户开户行名称
     * @param repayAccountBankName 还款账户开户行名称
     */
    public void setRepayAccountBankName(String repayAccountBankName) {
        this.repayAccountBankName = repayAccountBankName == null ? null : repayAccountBankName.trim();
    }

    /**
     * 还款账户对公对私标识
     * @return PUBLIC_PRIVATE 还款账户对公对私标识
     */
    public String getPublicPrivate() {
        return publicPrivate;
    }

    /**
     * 还款账户对公对私标识
     * @param publicPrivate 还款账户对公对私标识
     */
    public void setPublicPrivate(String publicPrivate) {
        this.publicPrivate = publicPrivate == null ? null : publicPrivate.trim();
    }

    /**
     * 还款账户开户省
     * @return REPAY_ACT_PROVINCE 还款账户开户省
     */
    public String getRepayActProvince() {
        return repayActProvince;
    }

    /**
     * 还款账户开户省
     * @param repayActProvince 还款账户开户省
     */
    public void setRepayActProvince(String repayActProvince) {
        this.repayActProvince = repayActProvince == null ? null : repayActProvince.trim();
    }

    /**
     * 还款账户开户市
     * @return REPAY_ACCOUNT_CITY 还款账户开户市
     */
    public String getRepayAccountCity() {
        return repayAccountCity;
    }

    /**
     * 还款账户开户市
     * @param repayAccountCity 还款账户开户市
     */
    public void setRepayAccountCity(String repayAccountCity) {
        this.repayAccountCity = repayAccountCity == null ? null : repayAccountCity.trim();
    }

    /**
     * POS验证状态 未验证 0014 已验证为空
     * @return POS_STATUS POS验证状态 未验证 0014 已验证为空
     */
    public String getPosStatus() {
        return posStatus;
    }

    /**
     * POS验证状态 未验证 0014 已验证为空
     * @param posStatus POS验证状态 未验证 0014 已验证为空
     */
    public void setPosStatus(String posStatus) {
        this.posStatus = posStatus == null ? null : posStatus.trim();
    }

    /**
     * 首期还款日
     * @return START_DATE 首期还款日
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 首期还款日
     * @param startDate 首期还款日
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 末期还款日
     * @return END_DATE 末期还款日
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 末期还款日
     * @param endDate 末期还款日
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 合同来源：             NPLM_ICMP	综合信贷             NPLM_RZZL	融资租赁             NPLM_CDXT	车贷系统             NPLM_FDXT	房贷系统             
     * @return CONTRACT_SOURCE 合同来源：             NPLM_ICMP	综合信贷             NPLM_RZZL	融资租赁             NPLM_CDXT	车贷系统             NPLM_FDXT	房贷系统             
     */
    public String getContractSource() {
        return contractSource;
    }

    /**
     * 合同来源：             NPLM_ICMP	综合信贷             NPLM_RZZL	融资租赁             NPLM_CDXT	车贷系统             NPLM_FDXT	房贷系统             
     * @param contractSource 合同来源：             NPLM_ICMP	综合信贷             NPLM_RZZL	融资租赁             NPLM_CDXT	车贷系统             NPLM_FDXT	房贷系统             
     */
    public void setContractSource(String contractSource) {
        this.contractSource = contractSource == null ? null : contractSource.trim();
    }

    /**
     * 未分配还款额
     * @return REPAY_BALANCE 未分配还款额
     */
    public Integer getRepayBalance() {
        return repayBalance;
    }

    /**
     * 未分配还款额
     * @param repayBalance 未分配还款额
     */
    public void setRepayBalance(Integer repayBalance) {
        this.repayBalance = repayBalance;
    }

    /**
     * 合同状态:             -1：合同废止             0：未放款，1：还款中，2：逾期，             9：正常还清，10：合同终止，11：合同核销，12：减免结清，13：特殊减免结清，14：提前结清，15：放款退回结清
     * @return CONTRACT_TYPE 合同状态:             -1：合同废止             0：未放款，1：还款中，2：逾期，             9：正常还清，10：合同终止，11：合同核销，12：减免结清，13：特殊减免结清，14：提前结清，15：放款退回结清
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * 合同状态:             -1：合同废止             0：未放款，1：还款中，2：逾期，             9：正常还清，10：合同终止，11：合同核销，12：减免结清，13：特殊减免结清，14：提前结清，15：放款退回结清
     * @param contractType 合同状态:             -1：合同废止             0：未放款，1：还款中，2：逾期，             9：正常还清，10：合同终止，11：合同核销，12：减免结清，13：特殊减免结清，14：提前结清，15：放款退回结清
     */
    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    /**
     * 创建者
     * @return CREATOR 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建者
     * @param creator 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 末次修改者
     * @return UPDATER 末次修改者
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 末次修改者
     * @param updater 末次修改者
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 末次修改时间
     * @return UPDATE_TIME 末次修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 末次修改时间
     * @param updateTime 末次修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 循环授信编号
     * @return CYCLE_CREDIT_ID 循环授信编号
     */
    public String getCycleCreditId() {
        return cycleCreditId;
    }

    /**
     * 循环授信编号
     * @param cycleCreditId 循环授信编号
     */
    public void setCycleCreditId(String cycleCreditId) {
        this.cycleCreditId = cycleCreditId == null ? null : cycleCreditId.trim();
    }

    /**
     * 修改类型
     * @return UPDATE_TYPE 修改类型
     */
    public String getUpdateType() {
        return updateType;
    }

    /**
     * 修改类型
     * @param updateType 修改类型
     */
    public void setUpdateType(String updateType) {
        this.updateType = updateType == null ? null : updateType.trim();
    }
}