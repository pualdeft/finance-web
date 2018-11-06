package com.atguigu.finance.bean;

import java.util.Date;

/**
 * 描述:nplm_repayment_plan表的实体类
 * @version
 * @author:  zhangzhanbao
 * @创建时间: 2018-09-17
 */
public class RepaymentPlan {
    /**
     * id
     */
    private Integer id;

    /**
     * 合同编号
     */
    private Integer loanContractNum;

    /**
     * 所属分期
     */
    private Integer instalment;

    /**
     * 上一还款日期
     */
    private Date preRepaymentDate;

    /**
     * 还款日期
     */
    private Date repaymentDate;

    /**
     * 应收本金
     */
    private Integer capital;

    /**
     * 应收利息
     */
    private Integer interest;

    /**
     * 应收分期费用
     */
    private Integer installmentFee;

    /**
     * 应收罚息
     */
    private Integer amerce;

    /**
     * 应收滞纳金
     */
    private Integer forfeit;

    /**
     * 应收滞纳金
     */
    private Integer penalty;

    /**
     * 应收变更手续费
     */
    private Integer changeFee;

    /**
     * 应收其他费用
     */
    private Integer otherFee;

    /**
     * 应收还款总额
     */
    private Integer repaymentAmount;

    /**
     * 实收本金
     */
    private Integer indeedCapital;

    /**
     * 实收利息
     */
    private Integer indeedInterest;

    /**
     * 实收分期费用
     */
    private Integer indeedInstFee;

    /**
     * 实收罚息
     */
    private Integer indeedAmerce;

    /**
     * 实收滞纳金
     */
    private Integer indeedForfeit;

    /**
     * 实收违约金
     */
    private Integer indeedPenalty;

    /**
     * 实收变更手续费
     */
    private Integer indeedChangeFee;

    /**
     * 实收其他费用
     */
    private Integer indeedOtherFee;

    /**
     * 实收总额
     */
    private Integer indeedAmount;

    /**
     * 减免本金
     */
    private Integer reduceCapital;

    /**
     * 减免利息
     */
    private Integer reduceInterest;

    /**
     * 减免罚息
     */
    private Integer reduceAmerce;

    /**
     * 减免滞纳金
     */
    private Integer reduceForfeit;

    /**
     * 减免分期费用
     */
    private Integer reduceInstFee;

    /**
     * 减免违约金
     */
    private Integer reducePenalty;

    /**
     * 减免前期费用
     */
    private Integer reducePreFee;

    /**
     * 减免其他费用
     */
    private Integer reduceOtherFee;

    /**
     * 剩余本金
     */
    private Integer remainCapital;

    /**
     * NPV剩余本金
     */
    private Integer npvRemainCapital;

    /**
     * 一次性全部提前还款金额
     */
    private Integer allRepaymentAmount;

    /**
     * 还款状态：             0	未还款             1	已还款             2	部分还款             3	逾期             4	未满足收款条件（前期费用收取用）             
     */
    private String repaymentState;

    /**
     * 备注
     */
    private String remark;

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
     * Y:是  N：否
     */
    private String isOperating;

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
     * 所属分期
     * @return INSTALMENT 所属分期
     */
    public Integer getInstalment() {
        return instalment;
    }

    /**
     * 所属分期
     * @param instalment 所属分期
     */
    public void setInstalment(Integer instalment) {
        this.instalment = instalment;
    }

    /**
     * 上一还款日期
     * @return PRE_REPAYMENT_DATE 上一还款日期
     */
    public Date getPreRepaymentDate() {
        return preRepaymentDate;
    }

    /**
     * 上一还款日期
     * @param preRepaymentDate 上一还款日期
     */
    public void setPreRepaymentDate(Date preRepaymentDate) {
        this.preRepaymentDate = preRepaymentDate;
    }

    /**
     * 还款日期
     * @return REPAYMENT_DATE 还款日期
     */
    public Date getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * 还款日期
     * @param repaymentDate 还款日期
     */
    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    /**
     * 应收本金
     * @return CAPITAL 应收本金
     */
    public Integer getCapital() {
        return capital;
    }

    /**
     * 应收本金
     * @param capital 应收本金
     */
    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    /**
     * 应收利息
     * @return INTEREST 应收利息
     */
    public Integer getInterest() {
        return interest;
    }

    /**
     * 应收利息
     * @param interest 应收利息
     */
    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    /**
     * 应收分期费用
     * @return INSTALLMENT_FEE 应收分期费用
     */
    public Integer getInstallmentFee() {
        return installmentFee;
    }

    /**
     * 应收分期费用
     * @param installmentFee 应收分期费用
     */
    public void setInstallmentFee(Integer installmentFee) {
        this.installmentFee = installmentFee;
    }

    /**
     * 应收罚息
     * @return AMERCE 应收罚息
     */
    public Integer getAmerce() {
        return amerce;
    }

    /**
     * 应收罚息
     * @param amerce 应收罚息
     */
    public void setAmerce(Integer amerce) {
        this.amerce = amerce;
    }

    /**
     * 应收滞纳金
     * @return FORFEIT 应收滞纳金
     */
    public Integer getForfeit() {
        return forfeit;
    }

    /**
     * 应收滞纳金
     * @param forfeit 应收滞纳金
     */
    public void setForfeit(Integer forfeit) {
        this.forfeit = forfeit;
    }

    /**
     * 应收滞纳金
     * @return PENALTY 应收滞纳金
     */
    public Integer getPenalty() {
        return penalty;
    }

    /**
     * 应收滞纳金
     * @param penalty 应收滞纳金
     */
    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    /**
     * 应收变更手续费
     * @return change_fee 应收变更手续费
     */
    public Integer getChangeFee() {
        return changeFee;
    }

    /**
     * 应收变更手续费
     * @param changeFee 应收变更手续费
     */
    public void setChangeFee(Integer changeFee) {
        this.changeFee = changeFee;
    }

    /**
     * 应收其他费用
     * @return OTHER_FEE 应收其他费用
     */
    public Integer getOtherFee() {
        return otherFee;
    }

    /**
     * 应收其他费用
     * @param otherFee 应收其他费用
     */
    public void setOtherFee(Integer otherFee) {
        this.otherFee = otherFee;
    }

    /**
     * 应收还款总额
     * @return REPAYMENT_AMOUNT 应收还款总额
     */
    public Integer getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * 应收还款总额
     * @param repaymentAmount 应收还款总额
     */
    public void setRepaymentAmount(Integer repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    /**
     * 实收本金
     * @return INDEED_CAPITAL 实收本金
     */
    public Integer getIndeedCapital() {
        return indeedCapital;
    }

    /**
     * 实收本金
     * @param indeedCapital 实收本金
     */
    public void setIndeedCapital(Integer indeedCapital) {
        this.indeedCapital = indeedCapital;
    }

    /**
     * 实收利息
     * @return INDEED_INTEREST 实收利息
     */
    public Integer getIndeedInterest() {
        return indeedInterest;
    }

    /**
     * 实收利息
     * @param indeedInterest 实收利息
     */
    public void setIndeedInterest(Integer indeedInterest) {
        this.indeedInterest = indeedInterest;
    }

    /**
     * 实收分期费用
     * @return INDEED_INST_FEE 实收分期费用
     */
    public Integer getIndeedInstFee() {
        return indeedInstFee;
    }

    /**
     * 实收分期费用
     * @param indeedInstFee 实收分期费用
     */
    public void setIndeedInstFee(Integer indeedInstFee) {
        this.indeedInstFee = indeedInstFee;
    }

    /**
     * 实收罚息
     * @return INDEED_AMERCE 实收罚息
     */
    public Integer getIndeedAmerce() {
        return indeedAmerce;
    }

    /**
     * 实收罚息
     * @param indeedAmerce 实收罚息
     */
    public void setIndeedAmerce(Integer indeedAmerce) {
        this.indeedAmerce = indeedAmerce;
    }

    /**
     * 实收滞纳金
     * @return INDEED_FORFEIT 实收滞纳金
     */
    public Integer getIndeedForfeit() {
        return indeedForfeit;
    }

    /**
     * 实收滞纳金
     * @param indeedForfeit 实收滞纳金
     */
    public void setIndeedForfeit(Integer indeedForfeit) {
        this.indeedForfeit = indeedForfeit;
    }

    /**
     * 实收违约金
     * @return indeed_penalty 实收违约金
     */
    public Integer getIndeedPenalty() {
        return indeedPenalty;
    }

    /**
     * 实收违约金
     * @param indeedPenalty 实收违约金
     */
    public void setIndeedPenalty(Integer indeedPenalty) {
        this.indeedPenalty = indeedPenalty;
    }

    /**
     * 实收变更手续费
     * @return indeed_change_fee 实收变更手续费
     */
    public Integer getIndeedChangeFee() {
        return indeedChangeFee;
    }

    /**
     * 实收变更手续费
     * @param indeedChangeFee 实收变更手续费
     */
    public void setIndeedChangeFee(Integer indeedChangeFee) {
        this.indeedChangeFee = indeedChangeFee;
    }

    /**
     * 实收其他费用
     * @return indeed_OTHER_FEE 实收其他费用
     */
    public Integer getIndeedOtherFee() {
        return indeedOtherFee;
    }

    /**
     * 实收其他费用
     * @param indeedOtherFee 实收其他费用
     */
    public void setIndeedOtherFee(Integer indeedOtherFee) {
        this.indeedOtherFee = indeedOtherFee;
    }

    /**
     * 实收总额
     * @return INDEED_AMOUNT 实收总额
     */
    public Integer getIndeedAmount() {
        return indeedAmount;
    }

    /**
     * 实收总额
     * @param indeedAmount 实收总额
     */
    public void setIndeedAmount(Integer indeedAmount) {
        this.indeedAmount = indeedAmount;
    }

    /**
     * 减免本金
     * @return reduce_CAPITAL 减免本金
     */
    public Integer getReduceCapital() {
        return reduceCapital;
    }

    /**
     * 减免本金
     * @param reduceCapital 减免本金
     */
    public void setReduceCapital(Integer reduceCapital) {
        this.reduceCapital = reduceCapital;
    }

    /**
     * 减免利息
     * @return reduce_INTEREST 减免利息
     */
    public Integer getReduceInterest() {
        return reduceInterest;
    }

    /**
     * 减免利息
     * @param reduceInterest 减免利息
     */
    public void setReduceInterest(Integer reduceInterest) {
        this.reduceInterest = reduceInterest;
    }

    /**
     * 减免罚息
     * @return reduce_AMERCE 减免罚息
     */
    public Integer getReduceAmerce() {
        return reduceAmerce;
    }

    /**
     * 减免罚息
     * @param reduceAmerce 减免罚息
     */
    public void setReduceAmerce(Integer reduceAmerce) {
        this.reduceAmerce = reduceAmerce;
    }

    /**
     * 减免滞纳金
     * @return reduce_FORFEIT 减免滞纳金
     */
    public Integer getReduceForfeit() {
        return reduceForfeit;
    }

    /**
     * 减免滞纳金
     * @param reduceForfeit 减免滞纳金
     */
    public void setReduceForfeit(Integer reduceForfeit) {
        this.reduceForfeit = reduceForfeit;
    }

    /**
     * 减免分期费用
     * @return reduce_INST_FEE 减免分期费用
     */
    public Integer getReduceInstFee() {
        return reduceInstFee;
    }

    /**
     * 减免分期费用
     * @param reduceInstFee 减免分期费用
     */
    public void setReduceInstFee(Integer reduceInstFee) {
        this.reduceInstFee = reduceInstFee;
    }

    /**
     * 减免违约金
     * @return reduce_penalty 减免违约金
     */
    public Integer getReducePenalty() {
        return reducePenalty;
    }

    /**
     * 减免违约金
     * @param reducePenalty 减免违约金
     */
    public void setReducePenalty(Integer reducePenalty) {
        this.reducePenalty = reducePenalty;
    }

    /**
     * 减免前期费用
     * @return reduce_PRE_FEE 减免前期费用
     */
    public Integer getReducePreFee() {
        return reducePreFee;
    }

    /**
     * 减免前期费用
     * @param reducePreFee 减免前期费用
     */
    public void setReducePreFee(Integer reducePreFee) {
        this.reducePreFee = reducePreFee;
    }

    /**
     * 减免其他费用
     * @return reduce_OTHER_FEE 减免其他费用
     */
    public Integer getReduceOtherFee() {
        return reduceOtherFee;
    }

    /**
     * 减免其他费用
     * @param reduceOtherFee 减免其他费用
     */
    public void setReduceOtherFee(Integer reduceOtherFee) {
        this.reduceOtherFee = reduceOtherFee;
    }

    /**
     * 剩余本金
     * @return REMAIN_CAPITAL 剩余本金
     */
    public Integer getRemainCapital() {
        return remainCapital;
    }

    /**
     * 剩余本金
     * @param remainCapital 剩余本金
     */
    public void setRemainCapital(Integer remainCapital) {
        this.remainCapital = remainCapital;
    }

    /**
     * NPV剩余本金
     * @return NPV_remain_capital NPV剩余本金
     */
    public Integer getNpvRemainCapital() {
        return npvRemainCapital;
    }

    /**
     * NPV剩余本金
     * @param npvRemainCapital NPV剩余本金
     */
    public void setNpvRemainCapital(Integer npvRemainCapital) {
        this.npvRemainCapital = npvRemainCapital;
    }

    /**
     * 一次性全部提前还款金额
     * @return ALL_REPAYMENT_AMOUNT 一次性全部提前还款金额
     */
    public Integer getAllRepaymentAmount() {
        return allRepaymentAmount;
    }

    /**
     * 一次性全部提前还款金额
     * @param allRepaymentAmount 一次性全部提前还款金额
     */
    public void setAllRepaymentAmount(Integer allRepaymentAmount) {
        this.allRepaymentAmount = allRepaymentAmount;
    }

    /**
     * 还款状态：             0	未还款             1	已还款             2	部分还款             3	逾期             4	未满足收款条件（前期费用收取用）             
     * @return REPAYMENT_STATE 还款状态：             0	未还款             1	已还款             2	部分还款             3	逾期             4	未满足收款条件（前期费用收取用）             
     */
    public String getRepaymentState() {
        return repaymentState;
    }

    /**
     * 还款状态：             0	未还款             1	已还款             2	部分还款             3	逾期             4	未满足收款条件（前期费用收取用）             
     * @param repaymentState 还款状态：             0	未还款             1	已还款             2	部分还款             3	逾期             4	未满足收款条件（前期费用收取用）             
     */
    public void setRepaymentState(String repaymentState) {
        this.repaymentState = repaymentState == null ? null : repaymentState.trim();
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
     * Y:是  N：否
     * @return IS_OPERATING Y:是  N：否
     */
    public String getIsOperating() {
        return isOperating;
    }

    /**
     * Y:是  N：否
     * @param isOperating Y:是  N：否
     */
    public void setIsOperating(String isOperating) {
        this.isOperating = isOperating == null ? null : isOperating.trim();
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