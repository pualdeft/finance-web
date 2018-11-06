package com.atguigu.finance.bean;

import java.util.Date;

/**
 * 描述:nplm_repayment_record表的实体类
 * @version
 * @author:  zhangzhanbao
 * @创建时间: 2018-09-17
 */
public class RepaymentRecord {
    /**
     * id
     */
    private Integer id;

    /**
     * 业务请求ID
     */
    private Integer businessRequestId;

    /**
     * 合同编号
     */
    private Integer loanContractNum;

    /**
     * 还款请求日期
     */
    private Date repaymentDate;

    /**
     * 逾期天数
     */
    private Integer overdueDays;

    /**
     * 逾期总金额
     */
    private Integer overdueAmount;

    /**
     * 扣款金额
     */
    private Integer repaymentAmount;

    /**
     * 成功金额
     */
    private Integer successAmount;

    /**
     * 还款状态             0	处理中             1	成功             2	失败             3	部分成功             4	已撤销             5              不执行             
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 划扣特殊标识
     */
    private String specialCode;

    /**
     * 扣款顺序
     */
    private Integer sort;

    /**
     * 数据创建类型：             0	前期费用(先放后收模式)             1	正常             2	逾期             3	预约-逾期             4	预约-正常             5	预约-一次性提前还款             6	预约-部分提前还款             7	预约-前期费用             8	展期             9	转产品             10	部分提前还款             11	循环贷结清             12	退款-保证金             13	退款-还款             14	退款-前期费用             15	减免             16	减免结清             17	线下-正常             18	保证金抵偿             19	前期费用(先收后放模式)             20	线下-提前还款             21	晚确认提前还款结清             22	前期费用（差额放款模式）             23	线下-前期费用             24	线下-展期费用             25	逾期-晚回盘补算逾期             26	逾期-前期费用
     */
    private String dataCreateType;

    /**
     * 预约时间
     */
    private Date reserveTime;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 末次修改者
     */
    private String updater;

    /**
     * 末次修改时间
     */
    private Date updateTime;

    /**
     * 账户姓名
     */
    private String accountName;

    /**
     * 账户证件类型
     */
    private String acctIdenType;

    /**
     * 账户证件号
     */
    private String acctIdenNum;

    /**
     * 账户
     */
    private String accountNo;

    /**
     * 账户卡折标识
     */
    private String accountType;

    /**
     * 账户银行行别代码
     */
    private String accountBankid;

    /**
     * 账户开户行行号(支付行号)
     */
    private String accountBranchNo;

    /**
     * 账户开户行名称
     */
    private String accountBankName;

    /**
     * 账户对公对私标识
     */
    private String publicPrivate;

    /**
     * 账户开户省
     */
    private String actProvince;

    /**
     * 账户开户市
     */
    private String accountCity;

    /**
     * 修改类型
     */
    private String updateType;

    /**
     * id
     * @return ID id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 业务请求ID
     * @return BUSINESS_REQUEST_ID 业务请求ID
     */
    public Integer getBusinessRequestId() {
        return businessRequestId;
    }

    /**
     * 业务请求ID
     * @param businessRequestId 业务请求ID
     */
    public void setBusinessRequestId(Integer businessRequestId) {
        this.businessRequestId = businessRequestId;
    }

    /**
     * 合同编号
     * @return LOAN_CONTRACT_NUM 合同编号
     */
    public Integer getLoanContractNum() {
        return loanContractNum;
    }

    /**
     * 合同编号
     * @param loanContractNum 合同编号
     */
    public void setLoanContractNum(Integer loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    /**
     * 还款请求日期
     * @return REPAYMENT_DATE 还款请求日期
     */
    public Date getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * 还款请求日期
     * @param repaymentDate 还款请求日期
     */
    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    /**
     * 逾期天数
     * @return OVERDUE_DAYS 逾期天数
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * 逾期天数
     * @param overdueDays 逾期天数
     */
    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    /**
     * 逾期总金额
     * @return OVERDUE_AMOUNT 逾期总金额
     */
    public Integer getOverdueAmount() {
        return overdueAmount;
    }

    /**
     * 逾期总金额
     * @param overdueAmount 逾期总金额
     */
    public void setOverdueAmount(Integer overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    /**
     * 扣款金额
     * @return REPAYMENT_AMOUNT 扣款金额
     */
    public Integer getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * 扣款金额
     * @param repaymentAmount 扣款金额
     */
    public void setRepaymentAmount(Integer repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    /**
     * 成功金额
     * @return SUCCESS_AMOUNT 成功金额
     */
    public Integer getSuccessAmount() {
        return successAmount;
    }

    /**
     * 成功金额
     * @param successAmount 成功金额
     */
    public void setSuccessAmount(Integer successAmount) {
        this.successAmount = successAmount;
    }

    /**
     * 还款状态             0	处理中             1	成功             2	失败             3	部分成功             4	已撤销             5              不执行             
     * @return STATUS 还款状态             0	处理中             1	成功             2	失败             3	部分成功             4	已撤销             5              不执行             
     */
    public String getStatus() {
        return status;
    }

    /**
     * 还款状态             0	处理中             1	成功             2	失败             3	部分成功             4	已撤销             5              不执行             
     * @param status 还款状态             0	处理中             1	成功             2	失败             3	部分成功             4	已撤销             5              不执行             
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
     * 划扣特殊标识
     * @return SPECIAL_CODE 划扣特殊标识
     */
    public String getSpecialCode() {
        return specialCode;
    }

    /**
     * 划扣特殊标识
     * @param specialCode 划扣特殊标识
     */
    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode == null ? null : specialCode.trim();
    }

    /**
     * 扣款顺序
     * @return SORT 扣款顺序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 扣款顺序
     * @param sort 扣款顺序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 数据创建类型：             0	前期费用(先放后收模式)             1	正常             2	逾期             3	预约-逾期             4	预约-正常             5	预约-一次性提前还款             6	预约-部分提前还款             7	预约-前期费用             8	展期             9	转产品             10	部分提前还款             11	循环贷结清             12	退款-保证金             13	退款-还款             14	退款-前期费用             15	减免             16	减免结清             17	线下-正常             18	保证金抵偿             19	前期费用(先收后放模式)             20	线下-提前还款             21	晚确认提前还款结清             22	前期费用（差额放款模式）             23	线下-前期费用             24	线下-展期费用             25	逾期-晚回盘补算逾期             26	逾期-前期费用
     * @return data_create_type 数据创建类型：             0	前期费用(先放后收模式)             1	正常             2	逾期             3	预约-逾期             4	预约-正常             5	预约-一次性提前还款             6	预约-部分提前还款             7	预约-前期费用             8	展期             9	转产品             10	部分提前还款             11	循环贷结清             12	退款-保证金             13	退款-还款             14	退款-前期费用             15	减免             16	减免结清             17	线下-正常             18	保证金抵偿             19	前期费用(先收后放模式)             20	线下-提前还款             21	晚确认提前还款结清             22	前期费用（差额放款模式）             23	线下-前期费用             24	线下-展期费用             25	逾期-晚回盘补算逾期             26	逾期-前期费用
     */
    public String getDataCreateType() {
        return dataCreateType;
    }

    /**
     * 数据创建类型：             0	前期费用(先放后收模式)             1	正常             2	逾期             3	预约-逾期             4	预约-正常             5	预约-一次性提前还款             6	预约-部分提前还款             7	预约-前期费用             8	展期             9	转产品             10	部分提前还款             11	循环贷结清             12	退款-保证金             13	退款-还款             14	退款-前期费用             15	减免             16	减免结清             17	线下-正常             18	保证金抵偿             19	前期费用(先收后放模式)             20	线下-提前还款             21	晚确认提前还款结清             22	前期费用（差额放款模式）             23	线下-前期费用             24	线下-展期费用             25	逾期-晚回盘补算逾期             26	逾期-前期费用
     * @param dataCreateType 数据创建类型：             0	前期费用(先放后收模式)             1	正常             2	逾期             3	预约-逾期             4	预约-正常             5	预约-一次性提前还款             6	预约-部分提前还款             7	预约-前期费用             8	展期             9	转产品             10	部分提前还款             11	循环贷结清             12	退款-保证金             13	退款-还款             14	退款-前期费用             15	减免             16	减免结清             17	线下-正常             18	保证金抵偿             19	前期费用(先收后放模式)             20	线下-提前还款             21	晚确认提前还款结清             22	前期费用（差额放款模式）             23	线下-前期费用             24	线下-展期费用             25	逾期-晚回盘补算逾期             26	逾期-前期费用
     */
    public void setDataCreateType(String dataCreateType) {
        this.dataCreateType = dataCreateType == null ? null : dataCreateType.trim();
    }

    /**
     * 预约时间
     * @return RESERVE_TIME 预约时间
     */
    public Date getReserveTime() {
        return reserveTime;
    }

    /**
     * 预约时间
     * @param reserveTime 预约时间
     */
    public void setReserveTime(Date reserveTime) {
        this.reserveTime = reserveTime;
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
     * 账户姓名
     * @return ACCOUNT_NAME 账户姓名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 账户姓名
     * @param accountName 账户姓名
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * 账户证件类型
     * @return ACCT_IDEN_TYPE 账户证件类型
     */
    public String getAcctIdenType() {
        return acctIdenType;
    }

    /**
     * 账户证件类型
     * @param acctIdenType 账户证件类型
     */
    public void setAcctIdenType(String acctIdenType) {
        this.acctIdenType = acctIdenType == null ? null : acctIdenType.trim();
    }

    /**
     * 账户证件号
     * @return ACCT_IDEN_NUM 账户证件号
     */
    public String getAcctIdenNum() {
        return acctIdenNum;
    }

    /**
     * 账户证件号
     * @param acctIdenNum 账户证件号
     */
    public void setAcctIdenNum(String acctIdenNum) {
        this.acctIdenNum = acctIdenNum == null ? null : acctIdenNum.trim();
    }

    /**
     * 账户
     * @return ACCOUNT_NO 账户
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 账户
     * @param accountNo 账户
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * 账户卡折标识
     * @return ACCOUNT_TYPE 账户卡折标识
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 账户卡折标识
     * @param accountType 账户卡折标识
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * 账户银行行别代码
     * @return ACCOUNT_BANKID 账户银行行别代码
     */
    public String getAccountBankid() {
        return accountBankid;
    }

    /**
     * 账户银行行别代码
     * @param accountBankid 账户银行行别代码
     */
    public void setAccountBankid(String accountBankid) {
        this.accountBankid = accountBankid == null ? null : accountBankid.trim();
    }

    /**
     * 账户开户行行号(支付行号)
     * @return ACCOUNT_BRANCH_NO 账户开户行行号(支付行号)
     */
    public String getAccountBranchNo() {
        return accountBranchNo;
    }

    /**
     * 账户开户行行号(支付行号)
     * @param accountBranchNo 账户开户行行号(支付行号)
     */
    public void setAccountBranchNo(String accountBranchNo) {
        this.accountBranchNo = accountBranchNo == null ? null : accountBranchNo.trim();
    }

    /**
     * 账户开户行名称
     * @return ACCOUNT_BANK_NAME 账户开户行名称
     */
    public String getAccountBankName() {
        return accountBankName;
    }

    /**
     * 账户开户行名称
     * @param accountBankName 账户开户行名称
     */
    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName == null ? null : accountBankName.trim();
    }

    /**
     * 账户对公对私标识
     * @return PUBLIC_PRIVATE 账户对公对私标识
     */
    public String getPublicPrivate() {
        return publicPrivate;
    }

    /**
     * 账户对公对私标识
     * @param publicPrivate 账户对公对私标识
     */
    public void setPublicPrivate(String publicPrivate) {
        this.publicPrivate = publicPrivate == null ? null : publicPrivate.trim();
    }

    /**
     * 账户开户省
     * @return ACT_PROVINCE 账户开户省
     */
    public String getActProvince() {
        return actProvince;
    }

    /**
     * 账户开户省
     * @param actProvince 账户开户省
     */
    public void setActProvince(String actProvince) {
        this.actProvince = actProvince == null ? null : actProvince.trim();
    }

    /**
     * 账户开户市
     * @return ACCOUNT_CITY 账户开户市
     */
    public String getAccountCity() {
        return accountCity;
    }

    /**
     * 账户开户市
     * @param accountCity 账户开户市
     */
    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity == null ? null : accountCity.trim();
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