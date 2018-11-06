package com.atguigu.finance.bean;

import java.util.Date;

/**
 * 描述:nplm_repayment_detail表的实体类
 * @version
 * @author:  zhangzhanbao
 * @创建时间: 2018-09-17
 */
public class RepaymentDetail {
    /**
     * id
     */
    private Integer id;

    /**
     * 还款计划id
     */
    private Integer repaymentPlanId;

    /**
     * 还款记录id
     */
    private Integer repaymentRecordId;

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
     * 所属分期
     */
    private Integer instalment;

    /**
     * 应收本金
     */
    private Integer shouldCapital;

    /**
     * 应收利息
     */
    private Integer shouldInterest;

    /**
     * 应收分期费用
     */
    private Integer shouldInstFee;

    /**
     * 应收罚息
     */
    private Integer shouldAmerce;

    /**
     * 应收滞纳金
     */
    private Integer shouldForfeit;

    /**
     * 应收违约金
     */
    private Integer shouldPenalty;

    /**
     * 应收变更手续费
     */
    private Integer shouldChangeFee;

    /**
     * 应收其他费用
     */
    private Integer shouldOtherFee;

    /**
     * 应收总额
     */
    private Integer shouldAmount;

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
     * 还款状态             0	处理中             1	成功             2	失败             3	部分成功             4	已撤销             5              不执行
     */
    private String status;

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
     * 减免违约金
     */
    private Integer reducePenalty;

    /**
     * 减免分期费用
     */
    private Integer reduceInstFee;

    /**
     * 减免前期费用
     */
    private Integer reducePreFee;

    /**
     * 减免其他费用
     */
    private Integer reduceOtherFee;

    /**
     * 数据创建类型：             0	前期费用(先放后收模式)             1	正常             2	逾期             3	预约-逾期             4	预约-正常             5	预约-一次性提前还款             6	预约-部分提前还款             7	预约-前期费用             8	展期             9	转产品             10	部分提前还款             11	循环贷结清             12	退款-保证金             13	退款-还款             14	退款-前期费用             15	减免             16	减免结清             17	线下-正常             18	保证金抵偿             19	前期费用(先收后放模式)             20	线下-提前还款             21	晚确认提前还款结清             22	前期费用（差额放款模式）             23	线下-前期费用             24	线下-展期费用             25	逾期-晚回盘补算逾期             26	逾期-前期费用                                       
     */
    private String dataCreateType;

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
     * 还款计划id
     * @return REPAYMENT_PLAN_ID 还款计划id
     */
    public Integer getRepaymentPlanId() {
        return repaymentPlanId;
    }

    /**
     * 还款计划id
     * @param repaymentPlanId 还款计划id
     */
    public void setRepaymentPlanId(Integer repaymentPlanId) {
        this.repaymentPlanId = repaymentPlanId;
    }

    /**
     * 还款记录id
     * @return REPAYMENT_RECORD_ID 还款记录id
     */
    public Integer getRepaymentRecordId() {
        return repaymentRecordId;
    }

    /**
     * 还款记录id
     * @param repaymentRecordId 还款记录id
     */
    public void setRepaymentRecordId(Integer repaymentRecordId) {
        this.repaymentRecordId = repaymentRecordId;
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
     * 应收本金
     * @return SHOULD_CAPITAL 应收本金
     */
    public Integer getShouldCapital() {
        return shouldCapital;
    }

    /**
     * 应收本金
     * @param shouldCapital 应收本金
     */
    public void setShouldCapital(Integer shouldCapital) {
        this.shouldCapital = shouldCapital;
    }

    /**
     * 应收利息
     * @return SHOULD_INTEREST 应收利息
     */
    public Integer getShouldInterest() {
        return shouldInterest;
    }

    /**
     * 应收利息
     * @param shouldInterest 应收利息
     */
    public void setShouldInterest(Integer shouldInterest) {
        this.shouldInterest = shouldInterest;
    }

    /**
     * 应收分期费用
     * @return SHOULD_INST_FEE 应收分期费用
     */
    public Integer getShouldInstFee() {
        return shouldInstFee;
    }

    /**
     * 应收分期费用
     * @param shouldInstFee 应收分期费用
     */
    public void setShouldInstFee(Integer shouldInstFee) {
        this.shouldInstFee = shouldInstFee;
    }

    /**
     * 应收罚息
     * @return SHOULD_AMERCE 应收罚息
     */
    public Integer getShouldAmerce() {
        return shouldAmerce;
    }

    /**
     * 应收罚息
     * @param shouldAmerce 应收罚息
     */
    public void setShouldAmerce(Integer shouldAmerce) {
        this.shouldAmerce = shouldAmerce;
    }

    /**
     * 应收滞纳金
     * @return SHOULD_FORFEIT 应收滞纳金
     */
    public Integer getShouldForfeit() {
        return shouldForfeit;
    }

    /**
     * 应收滞纳金
     * @param shouldForfeit 应收滞纳金
     */
    public void setShouldForfeit(Integer shouldForfeit) {
        this.shouldForfeit = shouldForfeit;
    }

    /**
     * 应收违约金
     * @return should_penalty 应收违约金
     */
    public Integer getShouldPenalty() {
        return shouldPenalty;
    }

    /**
     * 应收违约金
     * @param shouldPenalty 应收违约金
     */
    public void setShouldPenalty(Integer shouldPenalty) {
        this.shouldPenalty = shouldPenalty;
    }

    /**
     * 应收变更手续费
     * @return should_change_fee 应收变更手续费
     */
    public Integer getShouldChangeFee() {
        return shouldChangeFee;
    }

    /**
     * 应收变更手续费
     * @param shouldChangeFee 应收变更手续费
     */
    public void setShouldChangeFee(Integer shouldChangeFee) {
        this.shouldChangeFee = shouldChangeFee;
    }

    /**
     * 应收其他费用
     * @return SHOULD_OTHER_FEE 应收其他费用
     */
    public Integer getShouldOtherFee() {
        return shouldOtherFee;
    }

    /**
     * 应收其他费用
     * @param shouldOtherFee 应收其他费用
     */
    public void setShouldOtherFee(Integer shouldOtherFee) {
        this.shouldOtherFee = shouldOtherFee;
    }

    /**
     * 应收总额
     * @return SHOULD_AMOUNT 应收总额
     */
    public Integer getShouldAmount() {
        return shouldAmount;
    }

    /**
     * 应收总额
     * @param shouldAmount 应收总额
     */
    public void setShouldAmount(Integer shouldAmount) {
        this.shouldAmount = shouldAmount;
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