package com.atguigu.finance.bean;

import java.util.Date;

/**
 * 描述:nplm_contract_attribute表的实体类
 * @version
 * @author:  zhangzhanbao
 * @创建时间: 2018-09-17
 */
public class ContractAttribute {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 合同id
     */
    private Integer loanContractId;

    /**
     * 合同编号
     */
    private Integer loanContractNum;

    /**
     * 业务模式 1:转债权 2:火凤凰 3:信托 4:互联网 5:融资租赁 6:房贷一对一
     */
    private String businessType;

    /**
     * 是否加急 Y : 是   N ： 否
     */
    private String isExpedited;

    /**
     * 签署时间
     */
    private Date signDate;

    /**
     * 签约方式 1：纸质  2：电子签约
     */
    private Integer signType;

    /**
     * 审核日期
     */
    private String approveDate;

    /**
     * 首期还款时间
     */
    private String firstRepayDate;

    /**
     * 收费方式 1:趸缴 2:双棒 3:期缴
     */
    private Integer feeFlag;

    /**
     * 计息方式 M:按月,S:按季,H:按半年,Y:按年,E:利随本清,D30:按30天
     */
    private String interestFlag;

    /**
     * 计息类型 1: 按期计息 2 :按实际天数计息             
     */
    private Integer interestType;

    /**
     * 宽限期
     */
    private Integer graceDays;

    /**
     * IRR
     */
    private Integer irr;

    /**
     * 利率
     */
    private Integer lnsRate;

    /**
     * 进件渠道代码：GD，CX，XW，RZ
     */
    private String channelCode;

    /**
     * 进件渠道：个贷、创新、小微、融资
     */
    private String channelName;

    /**
     * 所属信贷员ID
     */
    private String loanOfficerId;

    /**
     * 管辖城市ID
     */
    private String cityid;

    /**
     * 管辖城市
     */
    private String city;

    /**
     * 是否合同变更 Y:是  N:否
     */
    private String isModify;

    /**
     * 是否还款方案变更 Y:是  N:否
     */
    private String isSchemeModify;

    /**
     * 循环贷方式 1:差额  2:先结清旧合同 后放新合同款
     */
    private Integer recycleWay;

    /**
     * 是否循环贷 Y:是  N:否
     */
    private String isRecycleLoad;

    /**
     * 循环贷次数
     */
    private Integer recycleLoanCnt;

    /**
     * 旧合同号
     */
    private String oldContractNum;

    /**
     * 循环贷结清上一笔金额
     */
    private Integer settleAmount;

    /**
     * 合同变更后新合同编号
     */
    private String newContractNum;

    /**
     * 是否缩期 Y:是  N:否
     */
    private String isShorten;

    /**
     * 是否展期 Y:是  N:否
     */
    private String isExtend;

    /**
     * 是否转产品
     */
    private String isChangeProduce;

    /**
     * 是否违约 Y:是  N:否
     */
    private String isOverdue;

    /**
     * 是否一次性提前还款
     */
    private String isPayAhead;

    /**
     * 是否部分提前还款
     */
    private String isPayPart;

    /**
     * 借款用途
     */
    private String purpose;

    /**
     * 借款子用途
     */
    private String purposeSon;

    /**
     * 详细借款用途
     */
    private String purposeDetail;

    /**
     * 是否分账户回款 Y：是  N：否
     */
    private String isDivAccount;

    /**
     * 合同所属系统 0:新贷后   1：迁移-房贷系统   2：迁移-贷后系统
     */
    private String systemType;

    /**
     * 高危标识 1:高位 0或空 非高危
     */
    private String highRisk;

    /**
     * 是否买断 Y：是  N：否
     */
    private String isBuyout;

    /**
     * 前期费用处理模式 1:线上   2:线下? 默认线上
     */
    private String feeProcessType;

    /**
     * 助学贷合作机构名称
     */
    private String studentCorpName;

    /**
     * 合同结清日期
     */
    private String settleDate;

    /**
     * 习惯打款时间
     */
    private String habitTime;

    /**
     * 还款日
     */
    private String repayday;

    /**
     * 系统申请进件编号
     */
    private String applyId;

    /**
     * 系统申请进件父编号
     */
    private String oldApplyId;

    /**
     * 营业部编号
     */
    private String deptId;

    /**
     * 营业部名称
     */
    private String deptName;

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
     * 前期服务费折扣
     */
    private Integer frontChargeDiscount;

    /**
     * 月管理费率
     */
    private Integer monthMRate;

    /**
     * 手续费率
     */
    private Integer handleChargeRate;

    /**
     * 贷款次数
     */
    private Integer loanTimes;

    /**
     * 抵押物
     */
    private String pawn;

    /**
     * 手续费
     */
    private Integer handleCharge;

    /**
     * 分期服务费折扣
     */
    private Integer monthChargeDiscount;

    /**
     * 担保费
     */
    private Integer guaranteeFee;

    /**
     * 担保公司
     */
    private String guaranteeCompany;

    /**
     * 自定义字段1
     */
    private String def1;

    /**
     * 自定义字段1
     */
    private String def2;

    /**
     * 自定义字段1
     */
    private String def3;

    /**
     * 自定义字段1
     */
    private String def4;

    /**
     * 自定义字段1
     */
    private String def5;

    /**
     * 自定义字段1
     */
    private String def6;

    /**
     * 自定义字段1
     */
    private String def7;

    /**
     * 自定义字段1
     */
    private String def8;

    /**
     * 自定义字段1
     */
    private String def9;

    /**
     * 自定义字段1
     */
    private String def10;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 合同id
     * @return loan_contract_id 合同id
     */
    public Integer getLoanContractId() {
        return loanContractId;
    }

    /**
     * 合同id
     * @param loanContractId 合同id
     */
    public void setLoanContractId(Integer loanContractId) {
        this.loanContractId = loanContractId;
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
     * 业务模式 1:转债权 2:火凤凰 3:信托 4:互联网 5:融资租赁 6:房贷一对一
     * @return business_type 业务模式 1:转债权 2:火凤凰 3:信托 4:互联网 5:融资租赁 6:房贷一对一
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 业务模式 1:转债权 2:火凤凰 3:信托 4:互联网 5:融资租赁 6:房贷一对一
     * @param businessType 业务模式 1:转债权 2:火凤凰 3:信托 4:互联网 5:融资租赁 6:房贷一对一
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     * 是否加急 Y : 是   N ： 否
     * @return is_expedited 是否加急 Y : 是   N ： 否
     */
    public String getIsExpedited() {
        return isExpedited;
    }

    /**
     * 是否加急 Y : 是   N ： 否
     * @param isExpedited 是否加急 Y : 是   N ： 否
     */
    public void setIsExpedited(String isExpedited) {
        this.isExpedited = isExpedited == null ? null : isExpedited.trim();
    }

    /**
     * 签署时间
     * @return sign_date 签署时间
     */
    public Date getSignDate() {
        return signDate;
    }

    /**
     * 签署时间
     * @param signDate 签署时间
     */
    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    /**
     * 签约方式 1：纸质  2：电子签约
     * @return sign_type 签约方式 1：纸质  2：电子签约
     */
    public Integer getSignType() {
        return signType;
    }

    /**
     * 签约方式 1：纸质  2：电子签约
     * @param signType 签约方式 1：纸质  2：电子签约
     */
    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    /**
     * 审核日期
     * @return approve_date 审核日期
     */
    public String getApproveDate() {
        return approveDate;
    }

    /**
     * 审核日期
     * @param approveDate 审核日期
     */
    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate == null ? null : approveDate.trim();
    }

    /**
     * 首期还款时间
     * @return first_repay_date 首期还款时间
     */
    public String getFirstRepayDate() {
        return firstRepayDate;
    }

    /**
     * 首期还款时间
     * @param firstRepayDate 首期还款时间
     */
    public void setFirstRepayDate(String firstRepayDate) {
        this.firstRepayDate = firstRepayDate == null ? null : firstRepayDate.trim();
    }

    /**
     * 收费方式 1:趸缴 2:双棒 3:期缴
     * @return fee_flag 收费方式 1:趸缴 2:双棒 3:期缴
     */
    public Integer getFeeFlag() {
        return feeFlag;
    }

    /**
     * 收费方式 1:趸缴 2:双棒 3:期缴
     * @param feeFlag 收费方式 1:趸缴 2:双棒 3:期缴
     */
    public void setFeeFlag(Integer feeFlag) {
        this.feeFlag = feeFlag;
    }

    /**
     * 计息方式 M:按月,S:按季,H:按半年,Y:按年,E:利随本清,D30:按30天
     * @return interest_flag 计息方式 M:按月,S:按季,H:按半年,Y:按年,E:利随本清,D30:按30天
     */
    public String getInterestFlag() {
        return interestFlag;
    }

    /**
     * 计息方式 M:按月,S:按季,H:按半年,Y:按年,E:利随本清,D30:按30天
     * @param interestFlag 计息方式 M:按月,S:按季,H:按半年,Y:按年,E:利随本清,D30:按30天
     */
    public void setInterestFlag(String interestFlag) {
        this.interestFlag = interestFlag == null ? null : interestFlag.trim();
    }

    /**
     * 计息类型 1: 按期计息 2 :按实际天数计息             
     * @return interest_type 计息类型 1: 按期计息 2 :按实际天数计息             
     */
    public Integer getInterestType() {
        return interestType;
    }

    /**
     * 计息类型 1: 按期计息 2 :按实际天数计息             
     * @param interestType 计息类型 1: 按期计息 2 :按实际天数计息             
     */
    public void setInterestType(Integer interestType) {
        this.interestType = interestType;
    }

    /**
     * 宽限期
     * @return grace_days 宽限期
     */
    public Integer getGraceDays() {
        return graceDays;
    }

    /**
     * 宽限期
     * @param graceDays 宽限期
     */
    public void setGraceDays(Integer graceDays) {
        this.graceDays = graceDays;
    }

    /**
     * IRR
     * @return irr IRR
     */
    public Integer getIrr() {
        return irr;
    }

    /**
     * IRR
     * @param irr IRR
     */
    public void setIrr(Integer irr) {
        this.irr = irr;
    }

    /**
     * 利率
     * @return lns_rate 利率
     */
    public Integer getLnsRate() {
        return lnsRate;
    }

    /**
     * 利率
     * @param lnsRate 利率
     */
    public void setLnsRate(Integer lnsRate) {
        this.lnsRate = lnsRate;
    }

    /**
     * 进件渠道代码：GD，CX，XW，RZ
     * @return channel_code 进件渠道代码：GD，CX，XW，RZ
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * 进件渠道代码：GD，CX，XW，RZ
     * @param channelCode 进件渠道代码：GD，CX，XW，RZ
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    /**
     * 进件渠道：个贷、创新、小微、融资
     * @return channel_name 进件渠道：个贷、创新、小微、融资
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * 进件渠道：个贷、创新、小微、融资
     * @param channelName 进件渠道：个贷、创新、小微、融资
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * 所属信贷员ID
     * @return loan_officer_id 所属信贷员ID
     */
    public String getLoanOfficerId() {
        return loanOfficerId;
    }

    /**
     * 所属信贷员ID
     * @param loanOfficerId 所属信贷员ID
     */
    public void setLoanOfficerId(String loanOfficerId) {
        this.loanOfficerId = loanOfficerId == null ? null : loanOfficerId.trim();
    }

    /**
     * 管辖城市ID
     * @return cityID 管辖城市ID
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * 管辖城市ID
     * @param cityid 管辖城市ID
     */
    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    /**
     * 管辖城市
     * @return city 管辖城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 管辖城市
     * @param city 管辖城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 是否合同变更 Y:是  N:否
     * @return is_modify 是否合同变更 Y:是  N:否
     */
    public String getIsModify() {
        return isModify;
    }

    /**
     * 是否合同变更 Y:是  N:否
     * @param isModify 是否合同变更 Y:是  N:否
     */
    public void setIsModify(String isModify) {
        this.isModify = isModify == null ? null : isModify.trim();
    }

    /**
     * 是否还款方案变更 Y:是  N:否
     * @return is_scheme_modify 是否还款方案变更 Y:是  N:否
     */
    public String getIsSchemeModify() {
        return isSchemeModify;
    }

    /**
     * 是否还款方案变更 Y:是  N:否
     * @param isSchemeModify 是否还款方案变更 Y:是  N:否
     */
    public void setIsSchemeModify(String isSchemeModify) {
        this.isSchemeModify = isSchemeModify == null ? null : isSchemeModify.trim();
    }

    /**
     * 循环贷方式 1:差额  2:先结清旧合同 后放新合同款
     * @return recycle_way 循环贷方式 1:差额  2:先结清旧合同 后放新合同款
     */
    public Integer getRecycleWay() {
        return recycleWay;
    }

    /**
     * 循环贷方式 1:差额  2:先结清旧合同 后放新合同款
     * @param recycleWay 循环贷方式 1:差额  2:先结清旧合同 后放新合同款
     */
    public void setRecycleWay(Integer recycleWay) {
        this.recycleWay = recycleWay;
    }

    /**
     * 是否循环贷 Y:是  N:否
     * @return is_recycle_load 是否循环贷 Y:是  N:否
     */
    public String getIsRecycleLoad() {
        return isRecycleLoad;
    }

    /**
     * 是否循环贷 Y:是  N:否
     * @param isRecycleLoad 是否循环贷 Y:是  N:否
     */
    public void setIsRecycleLoad(String isRecycleLoad) {
        this.isRecycleLoad = isRecycleLoad == null ? null : isRecycleLoad.trim();
    }

    /**
     * 循环贷次数
     * @return recycle_loan_cnt 循环贷次数
     */
    public Integer getRecycleLoanCnt() {
        return recycleLoanCnt;
    }

    /**
     * 循环贷次数
     * @param recycleLoanCnt 循环贷次数
     */
    public void setRecycleLoanCnt(Integer recycleLoanCnt) {
        this.recycleLoanCnt = recycleLoanCnt;
    }

    /**
     * 旧合同号
     * @return old_contract_num 旧合同号
     */
    public String getOldContractNum() {
        return oldContractNum;
    }

    /**
     * 旧合同号
     * @param oldContractNum 旧合同号
     */
    public void setOldContractNum(String oldContractNum) {
        this.oldContractNum = oldContractNum == null ? null : oldContractNum.trim();
    }

    /**
     * 循环贷结清上一笔金额
     * @return settle_amount 循环贷结清上一笔金额
     */
    public Integer getSettleAmount() {
        return settleAmount;
    }

    /**
     * 循环贷结清上一笔金额
     * @param settleAmount 循环贷结清上一笔金额
     */
    public void setSettleAmount(Integer settleAmount) {
        this.settleAmount = settleAmount;
    }

    /**
     * 合同变更后新合同编号
     * @return new_contract_num 合同变更后新合同编号
     */
    public String getNewContractNum() {
        return newContractNum;
    }

    /**
     * 合同变更后新合同编号
     * @param newContractNum 合同变更后新合同编号
     */
    public void setNewContractNum(String newContractNum) {
        this.newContractNum = newContractNum == null ? null : newContractNum.trim();
    }

    /**
     * 是否缩期 Y:是  N:否
     * @return is_shorten 是否缩期 Y:是  N:否
     */
    public String getIsShorten() {
        return isShorten;
    }

    /**
     * 是否缩期 Y:是  N:否
     * @param isShorten 是否缩期 Y:是  N:否
     */
    public void setIsShorten(String isShorten) {
        this.isShorten = isShorten == null ? null : isShorten.trim();
    }

    /**
     * 是否展期 Y:是  N:否
     * @return is_extend 是否展期 Y:是  N:否
     */
    public String getIsExtend() {
        return isExtend;
    }

    /**
     * 是否展期 Y:是  N:否
     * @param isExtend 是否展期 Y:是  N:否
     */
    public void setIsExtend(String isExtend) {
        this.isExtend = isExtend == null ? null : isExtend.trim();
    }

    /**
     * 是否转产品
     * @return is_change_produce 是否转产品
     */
    public String getIsChangeProduce() {
        return isChangeProduce;
    }

    /**
     * 是否转产品
     * @param isChangeProduce 是否转产品
     */
    public void setIsChangeProduce(String isChangeProduce) {
        this.isChangeProduce = isChangeProduce == null ? null : isChangeProduce.trim();
    }

    /**
     * 是否违约 Y:是  N:否
     * @return is_overdue 是否违约 Y:是  N:否
     */
    public String getIsOverdue() {
        return isOverdue;
    }

    /**
     * 是否违约 Y:是  N:否
     * @param isOverdue 是否违约 Y:是  N:否
     */
    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue == null ? null : isOverdue.trim();
    }

    /**
     * 是否一次性提前还款
     * @return is_pay_ahead 是否一次性提前还款
     */
    public String getIsPayAhead() {
        return isPayAhead;
    }

    /**
     * 是否一次性提前还款
     * @param isPayAhead 是否一次性提前还款
     */
    public void setIsPayAhead(String isPayAhead) {
        this.isPayAhead = isPayAhead == null ? null : isPayAhead.trim();
    }

    /**
     * 是否部分提前还款
     * @return is_pay_part 是否部分提前还款
     */
    public String getIsPayPart() {
        return isPayPart;
    }

    /**
     * 是否部分提前还款
     * @param isPayPart 是否部分提前还款
     */
    public void setIsPayPart(String isPayPart) {
        this.isPayPart = isPayPart == null ? null : isPayPart.trim();
    }

    /**
     * 借款用途
     * @return purpose 借款用途
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * 借款用途
     * @param purpose 借款用途
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    /**
     * 借款子用途
     * @return purpose_son 借款子用途
     */
    public String getPurposeSon() {
        return purposeSon;
    }

    /**
     * 借款子用途
     * @param purposeSon 借款子用途
     */
    public void setPurposeSon(String purposeSon) {
        this.purposeSon = purposeSon == null ? null : purposeSon.trim();
    }

    /**
     * 详细借款用途
     * @return purpose_detail 详细借款用途
     */
    public String getPurposeDetail() {
        return purposeDetail;
    }

    /**
     * 详细借款用途
     * @param purposeDetail 详细借款用途
     */
    public void setPurposeDetail(String purposeDetail) {
        this.purposeDetail = purposeDetail == null ? null : purposeDetail.trim();
    }

    /**
     * 是否分账户回款 Y：是  N：否
     * @return is_div_account 是否分账户回款 Y：是  N：否
     */
    public String getIsDivAccount() {
        return isDivAccount;
    }

    /**
     * 是否分账户回款 Y：是  N：否
     * @param isDivAccount 是否分账户回款 Y：是  N：否
     */
    public void setIsDivAccount(String isDivAccount) {
        this.isDivAccount = isDivAccount == null ? null : isDivAccount.trim();
    }

    /**
     * 合同所属系统 0:新贷后   1：迁移-房贷系统   2：迁移-贷后系统
     * @return system_type 合同所属系统 0:新贷后   1：迁移-房贷系统   2：迁移-贷后系统
     */
    public String getSystemType() {
        return systemType;
    }

    /**
     * 合同所属系统 0:新贷后   1：迁移-房贷系统   2：迁移-贷后系统
     * @param systemType 合同所属系统 0:新贷后   1：迁移-房贷系统   2：迁移-贷后系统
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    /**
     * 高危标识 1:高位 0或空 非高危
     * @return high_risk 高危标识 1:高位 0或空 非高危
     */
    public String getHighRisk() {
        return highRisk;
    }

    /**
     * 高危标识 1:高位 0或空 非高危
     * @param highRisk 高危标识 1:高位 0或空 非高危
     */
    public void setHighRisk(String highRisk) {
        this.highRisk = highRisk == null ? null : highRisk.trim();
    }

    /**
     * 是否买断 Y：是  N：否
     * @return is_buyout 是否买断 Y：是  N：否
     */
    public String getIsBuyout() {
        return isBuyout;
    }

    /**
     * 是否买断 Y：是  N：否
     * @param isBuyout 是否买断 Y：是  N：否
     */
    public void setIsBuyout(String isBuyout) {
        this.isBuyout = isBuyout == null ? null : isBuyout.trim();
    }

    /**
     * 前期费用处理模式 1:线上   2:线下? 默认线上
     * @return fee_process_type 前期费用处理模式 1:线上   2:线下? 默认线上
     */
    public String getFeeProcessType() {
        return feeProcessType;
    }

    /**
     * 前期费用处理模式 1:线上   2:线下? 默认线上
     * @param feeProcessType 前期费用处理模式 1:线上   2:线下? 默认线上
     */
    public void setFeeProcessType(String feeProcessType) {
        this.feeProcessType = feeProcessType == null ? null : feeProcessType.trim();
    }

    /**
     * 助学贷合作机构名称
     * @return student_corp_name 助学贷合作机构名称
     */
    public String getStudentCorpName() {
        return studentCorpName;
    }

    /**
     * 助学贷合作机构名称
     * @param studentCorpName 助学贷合作机构名称
     */
    public void setStudentCorpName(String studentCorpName) {
        this.studentCorpName = studentCorpName == null ? null : studentCorpName.trim();
    }

    /**
     * 合同结清日期
     * @return settle_date 合同结清日期
     */
    public String getSettleDate() {
        return settleDate;
    }

    /**
     * 合同结清日期
     * @param settleDate 合同结清日期
     */
    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate == null ? null : settleDate.trim();
    }

    /**
     * 习惯打款时间
     * @return habit_time 习惯打款时间
     */
    public String getHabitTime() {
        return habitTime;
    }

    /**
     * 习惯打款时间
     * @param habitTime 习惯打款时间
     */
    public void setHabitTime(String habitTime) {
        this.habitTime = habitTime == null ? null : habitTime.trim();
    }

    /**
     * 还款日
     * @return RepayDay 还款日
     */
    public String getRepayday() {
        return repayday;
    }

    /**
     * 还款日
     * @param repayday 还款日
     */
    public void setRepayday(String repayday) {
        this.repayday = repayday == null ? null : repayday.trim();
    }

    /**
     * 系统申请进件编号
     * @return apply_Id 系统申请进件编号
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 系统申请进件编号
     * @param applyId 系统申请进件编号
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * 系统申请进件父编号
     * @return old_Apply_Id 系统申请进件父编号
     */
    public String getOldApplyId() {
        return oldApplyId;
    }

    /**
     * 系统申请进件父编号
     * @param oldApplyId 系统申请进件父编号
     */
    public void setOldApplyId(String oldApplyId) {
        this.oldApplyId = oldApplyId == null ? null : oldApplyId.trim();
    }

    /**
     * 营业部编号
     * @return dept_id 营业部编号
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * 营业部编号
     * @param deptId 营业部编号
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    /**
     * 营业部名称
     * @return dept_name 营业部名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 营业部名称
     * @param deptName 营业部名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
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

    /**
     * 前期服务费折扣
     * @return FRONT_CHARGE_DISCOUNT 前期服务费折扣
     */
    public Integer getFrontChargeDiscount() {
        return frontChargeDiscount;
    }

    /**
     * 前期服务费折扣
     * @param frontChargeDiscount 前期服务费折扣
     */
    public void setFrontChargeDiscount(Integer frontChargeDiscount) {
        this.frontChargeDiscount = frontChargeDiscount;
    }

    /**
     * 月管理费率
     * @return MONTH_M_RATE 月管理费率
     */
    public Integer getMonthMRate() {
        return monthMRate;
    }

    /**
     * 月管理费率
     * @param monthMRate 月管理费率
     */
    public void setMonthMRate(Integer monthMRate) {
        this.monthMRate = monthMRate;
    }

    /**
     * 手续费率
     * @return HANDLE_CHARGE_RATE 手续费率
     */
    public Integer getHandleChargeRate() {
        return handleChargeRate;
    }

    /**
     * 手续费率
     * @param handleChargeRate 手续费率
     */
    public void setHandleChargeRate(Integer handleChargeRate) {
        this.handleChargeRate = handleChargeRate;
    }

    /**
     * 贷款次数
     * @return LOAN_TIMES 贷款次数
     */
    public Integer getLoanTimes() {
        return loanTimes;
    }

    /**
     * 贷款次数
     * @param loanTimes 贷款次数
     */
    public void setLoanTimes(Integer loanTimes) {
        this.loanTimes = loanTimes;
    }

    /**
     * 抵押物
     * @return PAWN 抵押物
     */
    public String getPawn() {
        return pawn;
    }

    /**
     * 抵押物
     * @param pawn 抵押物
     */
    public void setPawn(String pawn) {
        this.pawn = pawn == null ? null : pawn.trim();
    }

    /**
     * 手续费
     * @return HANDLE_CHARGE 手续费
     */
    public Integer getHandleCharge() {
        return handleCharge;
    }

    /**
     * 手续费
     * @param handleCharge 手续费
     */
    public void setHandleCharge(Integer handleCharge) {
        this.handleCharge = handleCharge;
    }

    /**
     * 分期服务费折扣
     * @return MONTH_CHARGE_DISCOUNT 分期服务费折扣
     */
    public Integer getMonthChargeDiscount() {
        return monthChargeDiscount;
    }

    /**
     * 分期服务费折扣
     * @param monthChargeDiscount 分期服务费折扣
     */
    public void setMonthChargeDiscount(Integer monthChargeDiscount) {
        this.monthChargeDiscount = monthChargeDiscount;
    }

    /**
     * 担保费
     * @return GUARANTEE_FEE 担保费
     */
    public Integer getGuaranteeFee() {
        return guaranteeFee;
    }

    /**
     * 担保费
     * @param guaranteeFee 担保费
     */
    public void setGuaranteeFee(Integer guaranteeFee) {
        this.guaranteeFee = guaranteeFee;
    }

    /**
     * 担保公司
     * @return GUARANTEE_COMPANY 担保公司
     */
    public String getGuaranteeCompany() {
        return guaranteeCompany;
    }

    /**
     * 担保公司
     * @param guaranteeCompany 担保公司
     */
    public void setGuaranteeCompany(String guaranteeCompany) {
        this.guaranteeCompany = guaranteeCompany == null ? null : guaranteeCompany.trim();
    }

    /**
     * 自定义字段1
     * @return def1 自定义字段1
     */
    public String getDef1() {
        return def1;
    }

    /**
     * 自定义字段1
     * @param def1 自定义字段1
     */
    public void setDef1(String def1) {
        this.def1 = def1 == null ? null : def1.trim();
    }

    /**
     * 自定义字段1
     * @return def2 自定义字段1
     */
    public String getDef2() {
        return def2;
    }

    /**
     * 自定义字段1
     * @param def2 自定义字段1
     */
    public void setDef2(String def2) {
        this.def2 = def2 == null ? null : def2.trim();
    }

    /**
     * 自定义字段1
     * @return def3 自定义字段1
     */
    public String getDef3() {
        return def3;
    }

    /**
     * 自定义字段1
     * @param def3 自定义字段1
     */
    public void setDef3(String def3) {
        this.def3 = def3 == null ? null : def3.trim();
    }

    /**
     * 自定义字段1
     * @return def4 自定义字段1
     */
    public String getDef4() {
        return def4;
    }

    /**
     * 自定义字段1
     * @param def4 自定义字段1
     */
    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    /**
     * 自定义字段1
     * @return def5 自定义字段1
     */
    public String getDef5() {
        return def5;
    }

    /**
     * 自定义字段1
     * @param def5 自定义字段1
     */
    public void setDef5(String def5) {
        this.def5 = def5 == null ? null : def5.trim();
    }

    /**
     * 自定义字段1
     * @return def6 自定义字段1
     */
    public String getDef6() {
        return def6;
    }

    /**
     * 自定义字段1
     * @param def6 自定义字段1
     */
    public void setDef6(String def6) {
        this.def6 = def6 == null ? null : def6.trim();
    }

    /**
     * 自定义字段1
     * @return def7 自定义字段1
     */
    public String getDef7() {
        return def7;
    }

    /**
     * 自定义字段1
     * @param def7 自定义字段1
     */
    public void setDef7(String def7) {
        this.def7 = def7 == null ? null : def7.trim();
    }

    /**
     * 自定义字段1
     * @return def8 自定义字段1
     */
    public String getDef8() {
        return def8;
    }

    /**
     * 自定义字段1
     * @param def8 自定义字段1
     */
    public void setDef8(String def8) {
        this.def8 = def8 == null ? null : def8.trim();
    }

    /**
     * 自定义字段1
     * @return def9 自定义字段1
     */
    public String getDef9() {
        return def9;
    }

    /**
     * 自定义字段1
     * @param def9 自定义字段1
     */
    public void setDef9(String def9) {
        this.def9 = def9 == null ? null : def9.trim();
    }

    /**
     * 自定义字段1
     * @return def10 自定义字段1
     */
    public String getDef10() {
        return def10;
    }

    /**
     * 自定义字段1
     * @param def10 自定义字段1
     */
    public void setDef10(String def10) {
        this.def10 = def10 == null ? null : def10.trim();
    }
}