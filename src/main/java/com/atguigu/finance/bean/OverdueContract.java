package com.atguigu.finance.bean;

import java.util.Date;

/**
 * 描述:nplm_overdue_contract表的实体类
 * @version
 * @author:  zhangzhanbao
 * @创建时间: 2018-09-17
 */
public class OverdueContract {
    /**
     * 
     */
    private String id;

    /**
     * 合同编号
     */
    private String loanContractNum;

    /**
     * 逾期状态             2：逾期，             9：正常还清
     */
    private String overdueStatus;

    /**
     * 现存逾期天数
     */
    private Integer overdueDays;

    /**
     * 现存逾期期数
     */
    private Integer instalmentCnt;

    /**
     * 累积逾期天数
     */
    private Integer allDays;

    /**
     * 累积逾期期数
     */
    private Integer allInstalmentCnt;

    /**
     * 累积逾期次数
     */
    private Integer allNumber;

    /**
     * 尚欠本息
     */
    private Integer principalInterest;

    /**
     * 滞纳金总额
     */
    private Integer allForfeit;

    /**
     * 罚息总额
     */
    private Integer allAmerce;

    /**
     * 累计应收款
     */
    private Integer allShould;

    /**
     * 累计实收款
     */
    private Integer allIndeed;

    /**
     * 当期应还总金额
     */
    private Integer currentRepay;

    /**
     * 一次性结清金额
     */
    private Integer allRepaymentAmount;

    /**
     * 首次逾期日期
     */
    private String firstDate;

    /**
     * 现存逾期开始日期
     */
    private String startDate;

    /**
     * 首次出现连续逾期的开始日期
     */
    private String serialStartDate;

    /**
     * 过去18个月逾期历史
     */
    private String overdueHistory;

    /**
     * 计算违约日期
     */
    private String computeDate;

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
     * 修改类型
     */
    private String updateType;

    /**
     * 
     * @return id 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
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
     * 逾期状态             2：逾期，             9：正常还清
     * @return OVERDUE_STATUS 逾期状态             2：逾期，             9：正常还清
     */
    public String getOverdueStatus() {
        return overdueStatus;
    }

    /**
     * 逾期状态             2：逾期，             9：正常还清
     * @param overdueStatus 逾期状态             2：逾期，             9：正常还清
     */
    public void setOverdueStatus(String overdueStatus) {
        this.overdueStatus = overdueStatus == null ? null : overdueStatus.trim();
    }

    /**
     * 现存逾期天数
     * @return OVERDUE_DAYS 现存逾期天数
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * 现存逾期天数
     * @param overdueDays 现存逾期天数
     */
    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    /**
     * 现存逾期期数
     * @return INSTALMENT_CNT 现存逾期期数
     */
    public Integer getInstalmentCnt() {
        return instalmentCnt;
    }

    /**
     * 现存逾期期数
     * @param instalmentCnt 现存逾期期数
     */
    public void setInstalmentCnt(Integer instalmentCnt) {
        this.instalmentCnt = instalmentCnt;
    }

    /**
     * 累积逾期天数
     * @return ALL_DAYS 累积逾期天数
     */
    public Integer getAllDays() {
        return allDays;
    }

    /**
     * 累积逾期天数
     * @param allDays 累积逾期天数
     */
    public void setAllDays(Integer allDays) {
        this.allDays = allDays;
    }

    /**
     * 累积逾期期数
     * @return ALL_INSTALMENT_CNT 累积逾期期数
     */
    public Integer getAllInstalmentCnt() {
        return allInstalmentCnt;
    }

    /**
     * 累积逾期期数
     * @param allInstalmentCnt 累积逾期期数
     */
    public void setAllInstalmentCnt(Integer allInstalmentCnt) {
        this.allInstalmentCnt = allInstalmentCnt;
    }

    /**
     * 累积逾期次数
     * @return ALL_NUMBER 累积逾期次数
     */
    public Integer getAllNumber() {
        return allNumber;
    }

    /**
     * 累积逾期次数
     * @param allNumber 累积逾期次数
     */
    public void setAllNumber(Integer allNumber) {
        this.allNumber = allNumber;
    }

    /**
     * 尚欠本息
     * @return PRINCIPAL_INTEREST 尚欠本息
     */
    public Integer getPrincipalInterest() {
        return principalInterest;
    }

    /**
     * 尚欠本息
     * @param principalInterest 尚欠本息
     */
    public void setPrincipalInterest(Integer principalInterest) {
        this.principalInterest = principalInterest;
    }

    /**
     * 滞纳金总额
     * @return ALL_FORFEIT 滞纳金总额
     */
    public Integer getAllForfeit() {
        return allForfeit;
    }

    /**
     * 滞纳金总额
     * @param allForfeit 滞纳金总额
     */
    public void setAllForfeit(Integer allForfeit) {
        this.allForfeit = allForfeit;
    }

    /**
     * 罚息总额
     * @return ALL_AMERCE 罚息总额
     */
    public Integer getAllAmerce() {
        return allAmerce;
    }

    /**
     * 罚息总额
     * @param allAmerce 罚息总额
     */
    public void setAllAmerce(Integer allAmerce) {
        this.allAmerce = allAmerce;
    }

    /**
     * 累计应收款
     * @return ALL_SHOULD 累计应收款
     */
    public Integer getAllShould() {
        return allShould;
    }

    /**
     * 累计应收款
     * @param allShould 累计应收款
     */
    public void setAllShould(Integer allShould) {
        this.allShould = allShould;
    }

    /**
     * 累计实收款
     * @return ALL_INDEED 累计实收款
     */
    public Integer getAllIndeed() {
        return allIndeed;
    }

    /**
     * 累计实收款
     * @param allIndeed 累计实收款
     */
    public void setAllIndeed(Integer allIndeed) {
        this.allIndeed = allIndeed;
    }

    /**
     * 当期应还总金额
     * @return CURRENT_REPAY 当期应还总金额
     */
    public Integer getCurrentRepay() {
        return currentRepay;
    }

    /**
     * 当期应还总金额
     * @param currentRepay 当期应还总金额
     */
    public void setCurrentRepay(Integer currentRepay) {
        this.currentRepay = currentRepay;
    }

    /**
     * 一次性结清金额
     * @return ALL_REPAYMENT_AMOUNT 一次性结清金额
     */
    public Integer getAllRepaymentAmount() {
        return allRepaymentAmount;
    }

    /**
     * 一次性结清金额
     * @param allRepaymentAmount 一次性结清金额
     */
    public void setAllRepaymentAmount(Integer allRepaymentAmount) {
        this.allRepaymentAmount = allRepaymentAmount;
    }

    /**
     * 首次逾期日期
     * @return FIRST_DATE 首次逾期日期
     */
    public String getFirstDate() {
        return firstDate;
    }

    /**
     * 首次逾期日期
     * @param firstDate 首次逾期日期
     */
    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate == null ? null : firstDate.trim();
    }

    /**
     * 现存逾期开始日期
     * @return START_DATE 现存逾期开始日期
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 现存逾期开始日期
     * @param startDate 现存逾期开始日期
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    /**
     * 首次出现连续逾期的开始日期
     * @return SERIAL_START_DATE 首次出现连续逾期的开始日期
     */
    public String getSerialStartDate() {
        return serialStartDate;
    }

    /**
     * 首次出现连续逾期的开始日期
     * @param serialStartDate 首次出现连续逾期的开始日期
     */
    public void setSerialStartDate(String serialStartDate) {
        this.serialStartDate = serialStartDate == null ? null : serialStartDate.trim();
    }

    /**
     * 过去18个月逾期历史
     * @return OVERDUE_HISTORY 过去18个月逾期历史
     */
    public String getOverdueHistory() {
        return overdueHistory;
    }

    /**
     * 过去18个月逾期历史
     * @param overdueHistory 过去18个月逾期历史
     */
    public void setOverdueHistory(String overdueHistory) {
        this.overdueHistory = overdueHistory == null ? null : overdueHistory.trim();
    }

    /**
     * 计算违约日期
     * @return COMPUTE_DATE 计算违约日期
     */
    public String getComputeDate() {
        return computeDate;
    }

    /**
     * 计算违约日期
     * @param computeDate 计算违约日期
     */
    public void setComputeDate(String computeDate) {
        this.computeDate = computeDate == null ? null : computeDate.trim();
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