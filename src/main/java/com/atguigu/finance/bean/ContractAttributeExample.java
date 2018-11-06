package com.atguigu.finance.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractAttributeExample {
    /**
     * nplm_contract_attribute
     */
    protected String orderByClause;

    /**
     * nplm_contract_attribute
     */
    protected boolean distinct;

    /**
     * nplm_contract_attribute
     */
    protected List<Criteria> oredCriteria;

    public ContractAttributeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * nplm_contract_attribute 2018-09-17
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdIsNull() {
            addCriterion("loan_contract_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdIsNotNull() {
            addCriterion("loan_contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdEqualTo(Integer value) {
            addCriterion("loan_contract_id =", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdNotEqualTo(Integer value) {
            addCriterion("loan_contract_id <>", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdGreaterThan(Integer value) {
            addCriterion("loan_contract_id >", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_contract_id >=", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdLessThan(Integer value) {
            addCriterion("loan_contract_id <", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("loan_contract_id <=", value, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdIn(List<Integer> values) {
            addCriterion("loan_contract_id in", values, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdNotIn(List<Integer> values) {
            addCriterion("loan_contract_id not in", values, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdBetween(Integer value1, Integer value2) {
            addCriterion("loan_contract_id between", value1, value2, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_contract_id not between", value1, value2, "loanContractId");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumIsNull() {
            addCriterion("LOAN_CONTRACT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumIsNotNull() {
            addCriterion("LOAN_CONTRACT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumEqualTo(Integer value) {
            addCriterion("LOAN_CONTRACT_NUM =", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumNotEqualTo(Integer value) {
            addCriterion("LOAN_CONTRACT_NUM <>", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumGreaterThan(Integer value) {
            addCriterion("LOAN_CONTRACT_NUM >", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOAN_CONTRACT_NUM >=", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumLessThan(Integer value) {
            addCriterion("LOAN_CONTRACT_NUM <", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumLessThanOrEqualTo(Integer value) {
            addCriterion("LOAN_CONTRACT_NUM <=", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumIn(List<Integer> values) {
            addCriterion("LOAN_CONTRACT_NUM in", values, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumNotIn(List<Integer> values) {
            addCriterion("LOAN_CONTRACT_NUM not in", values, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_CONTRACT_NUM between", value1, value2, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumNotBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_CONTRACT_NUM not between", value1, value2, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedIsNull() {
            addCriterion("is_expedited is null");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedIsNotNull() {
            addCriterion("is_expedited is not null");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedEqualTo(String value) {
            addCriterion("is_expedited =", value, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedNotEqualTo(String value) {
            addCriterion("is_expedited <>", value, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedGreaterThan(String value) {
            addCriterion("is_expedited >", value, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedGreaterThanOrEqualTo(String value) {
            addCriterion("is_expedited >=", value, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedLessThan(String value) {
            addCriterion("is_expedited <", value, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedLessThanOrEqualTo(String value) {
            addCriterion("is_expedited <=", value, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedLike(String value) {
            addCriterion("is_expedited like", value, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedNotLike(String value) {
            addCriterion("is_expedited not like", value, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedIn(List<String> values) {
            addCriterion("is_expedited in", values, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedNotIn(List<String> values) {
            addCriterion("is_expedited not in", values, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedBetween(String value1, String value2) {
            addCriterion("is_expedited between", value1, value2, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andIsExpeditedNotBetween(String value1, String value2) {
            addCriterion("is_expedited not between", value1, value2, "isExpedited");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterion("sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterion("sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterion("sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterion("sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterion("sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterion("sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterion("sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterion("sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterion("sign_date not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNull() {
            addCriterion("sign_type is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("sign_type is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(Integer value) {
            addCriterion("sign_type =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(Integer value) {
            addCriterion("sign_type <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(Integer value) {
            addCriterion("sign_type >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_type >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(Integer value) {
            addCriterion("sign_type <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sign_type <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<Integer> values) {
            addCriterion("sign_type in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<Integer> values) {
            addCriterion("sign_type not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(Integer value1, Integer value2) {
            addCriterion("sign_type between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_type not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNull() {
            addCriterion("approve_date is null");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNotNull() {
            addCriterion("approve_date is not null");
            return (Criteria) this;
        }

        public Criteria andApproveDateEqualTo(String value) {
            addCriterion("approve_date =", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotEqualTo(String value) {
            addCriterion("approve_date <>", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThan(String value) {
            addCriterion("approve_date >", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThanOrEqualTo(String value) {
            addCriterion("approve_date >=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThan(String value) {
            addCriterion("approve_date <", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThanOrEqualTo(String value) {
            addCriterion("approve_date <=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLike(String value) {
            addCriterion("approve_date like", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotLike(String value) {
            addCriterion("approve_date not like", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateIn(List<String> values) {
            addCriterion("approve_date in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotIn(List<String> values) {
            addCriterion("approve_date not in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateBetween(String value1, String value2) {
            addCriterion("approve_date between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotBetween(String value1, String value2) {
            addCriterion("approve_date not between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateIsNull() {
            addCriterion("first_repay_date is null");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateIsNotNull() {
            addCriterion("first_repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateEqualTo(String value) {
            addCriterion("first_repay_date =", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateNotEqualTo(String value) {
            addCriterion("first_repay_date <>", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateGreaterThan(String value) {
            addCriterion("first_repay_date >", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateGreaterThanOrEqualTo(String value) {
            addCriterion("first_repay_date >=", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateLessThan(String value) {
            addCriterion("first_repay_date <", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateLessThanOrEqualTo(String value) {
            addCriterion("first_repay_date <=", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateLike(String value) {
            addCriterion("first_repay_date like", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateNotLike(String value) {
            addCriterion("first_repay_date not like", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateIn(List<String> values) {
            addCriterion("first_repay_date in", values, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateNotIn(List<String> values) {
            addCriterion("first_repay_date not in", values, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateBetween(String value1, String value2) {
            addCriterion("first_repay_date between", value1, value2, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateNotBetween(String value1, String value2) {
            addCriterion("first_repay_date not between", value1, value2, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFeeFlagIsNull() {
            addCriterion("fee_flag is null");
            return (Criteria) this;
        }

        public Criteria andFeeFlagIsNotNull() {
            addCriterion("fee_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFeeFlagEqualTo(Integer value) {
            addCriterion("fee_flag =", value, "feeFlag");
            return (Criteria) this;
        }

        public Criteria andFeeFlagNotEqualTo(Integer value) {
            addCriterion("fee_flag <>", value, "feeFlag");
            return (Criteria) this;
        }

        public Criteria andFeeFlagGreaterThan(Integer value) {
            addCriterion("fee_flag >", value, "feeFlag");
            return (Criteria) this;
        }

        public Criteria andFeeFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_flag >=", value, "feeFlag");
            return (Criteria) this;
        }

        public Criteria andFeeFlagLessThan(Integer value) {
            addCriterion("fee_flag <", value, "feeFlag");
            return (Criteria) this;
        }

        public Criteria andFeeFlagLessThanOrEqualTo(Integer value) {
            addCriterion("fee_flag <=", value, "feeFlag");
            return (Criteria) this;
        }

        public Criteria andFeeFlagIn(List<Integer> values) {
            addCriterion("fee_flag in", values, "feeFlag");
            return (Criteria) this;
        }

        public Criteria andFeeFlagNotIn(List<Integer> values) {
            addCriterion("fee_flag not in", values, "feeFlag");
            return (Criteria) this;
        }

        public Criteria andFeeFlagBetween(Integer value1, Integer value2) {
            addCriterion("fee_flag between", value1, value2, "feeFlag");
            return (Criteria) this;
        }

        public Criteria andFeeFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_flag not between", value1, value2, "feeFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagIsNull() {
            addCriterion("interest_flag is null");
            return (Criteria) this;
        }

        public Criteria andInterestFlagIsNotNull() {
            addCriterion("interest_flag is not null");
            return (Criteria) this;
        }

        public Criteria andInterestFlagEqualTo(String value) {
            addCriterion("interest_flag =", value, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagNotEqualTo(String value) {
            addCriterion("interest_flag <>", value, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagGreaterThan(String value) {
            addCriterion("interest_flag >", value, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagGreaterThanOrEqualTo(String value) {
            addCriterion("interest_flag >=", value, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagLessThan(String value) {
            addCriterion("interest_flag <", value, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagLessThanOrEqualTo(String value) {
            addCriterion("interest_flag <=", value, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagLike(String value) {
            addCriterion("interest_flag like", value, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagNotLike(String value) {
            addCriterion("interest_flag not like", value, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagIn(List<String> values) {
            addCriterion("interest_flag in", values, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagNotIn(List<String> values) {
            addCriterion("interest_flag not in", values, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagBetween(String value1, String value2) {
            addCriterion("interest_flag between", value1, value2, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestFlagNotBetween(String value1, String value2) {
            addCriterion("interest_flag not between", value1, value2, "interestFlag");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIsNull() {
            addCriterion("interest_type is null");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIsNotNull() {
            addCriterion("interest_type is not null");
            return (Criteria) this;
        }

        public Criteria andInterestTypeEqualTo(Integer value) {
            addCriterion("interest_type =", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotEqualTo(Integer value) {
            addCriterion("interest_type <>", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeGreaterThan(Integer value) {
            addCriterion("interest_type >", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("interest_type >=", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLessThan(Integer value) {
            addCriterion("interest_type <", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLessThanOrEqualTo(Integer value) {
            addCriterion("interest_type <=", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIn(List<Integer> values) {
            addCriterion("interest_type in", values, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotIn(List<Integer> values) {
            addCriterion("interest_type not in", values, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeBetween(Integer value1, Integer value2) {
            addCriterion("interest_type between", value1, value2, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("interest_type not between", value1, value2, "interestType");
            return (Criteria) this;
        }

        public Criteria andGraceDaysIsNull() {
            addCriterion("grace_days is null");
            return (Criteria) this;
        }

        public Criteria andGraceDaysIsNotNull() {
            addCriterion("grace_days is not null");
            return (Criteria) this;
        }

        public Criteria andGraceDaysEqualTo(Integer value) {
            addCriterion("grace_days =", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysNotEqualTo(Integer value) {
            addCriterion("grace_days <>", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysGreaterThan(Integer value) {
            addCriterion("grace_days >", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("grace_days >=", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysLessThan(Integer value) {
            addCriterion("grace_days <", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysLessThanOrEqualTo(Integer value) {
            addCriterion("grace_days <=", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysIn(List<Integer> values) {
            addCriterion("grace_days in", values, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysNotIn(List<Integer> values) {
            addCriterion("grace_days not in", values, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysBetween(Integer value1, Integer value2) {
            addCriterion("grace_days between", value1, value2, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("grace_days not between", value1, value2, "graceDays");
            return (Criteria) this;
        }

        public Criteria andIrrIsNull() {
            addCriterion("irr is null");
            return (Criteria) this;
        }

        public Criteria andIrrIsNotNull() {
            addCriterion("irr is not null");
            return (Criteria) this;
        }

        public Criteria andIrrEqualTo(Integer value) {
            addCriterion("irr =", value, "irr");
            return (Criteria) this;
        }

        public Criteria andIrrNotEqualTo(Integer value) {
            addCriterion("irr <>", value, "irr");
            return (Criteria) this;
        }

        public Criteria andIrrGreaterThan(Integer value) {
            addCriterion("irr >", value, "irr");
            return (Criteria) this;
        }

        public Criteria andIrrGreaterThanOrEqualTo(Integer value) {
            addCriterion("irr >=", value, "irr");
            return (Criteria) this;
        }

        public Criteria andIrrLessThan(Integer value) {
            addCriterion("irr <", value, "irr");
            return (Criteria) this;
        }

        public Criteria andIrrLessThanOrEqualTo(Integer value) {
            addCriterion("irr <=", value, "irr");
            return (Criteria) this;
        }

        public Criteria andIrrIn(List<Integer> values) {
            addCriterion("irr in", values, "irr");
            return (Criteria) this;
        }

        public Criteria andIrrNotIn(List<Integer> values) {
            addCriterion("irr not in", values, "irr");
            return (Criteria) this;
        }

        public Criteria andIrrBetween(Integer value1, Integer value2) {
            addCriterion("irr between", value1, value2, "irr");
            return (Criteria) this;
        }

        public Criteria andIrrNotBetween(Integer value1, Integer value2) {
            addCriterion("irr not between", value1, value2, "irr");
            return (Criteria) this;
        }

        public Criteria andLnsRateIsNull() {
            addCriterion("lns_rate is null");
            return (Criteria) this;
        }

        public Criteria andLnsRateIsNotNull() {
            addCriterion("lns_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLnsRateEqualTo(Integer value) {
            addCriterion("lns_rate =", value, "lnsRate");
            return (Criteria) this;
        }

        public Criteria andLnsRateNotEqualTo(Integer value) {
            addCriterion("lns_rate <>", value, "lnsRate");
            return (Criteria) this;
        }

        public Criteria andLnsRateGreaterThan(Integer value) {
            addCriterion("lns_rate >", value, "lnsRate");
            return (Criteria) this;
        }

        public Criteria andLnsRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("lns_rate >=", value, "lnsRate");
            return (Criteria) this;
        }

        public Criteria andLnsRateLessThan(Integer value) {
            addCriterion("lns_rate <", value, "lnsRate");
            return (Criteria) this;
        }

        public Criteria andLnsRateLessThanOrEqualTo(Integer value) {
            addCriterion("lns_rate <=", value, "lnsRate");
            return (Criteria) this;
        }

        public Criteria andLnsRateIn(List<Integer> values) {
            addCriterion("lns_rate in", values, "lnsRate");
            return (Criteria) this;
        }

        public Criteria andLnsRateNotIn(List<Integer> values) {
            addCriterion("lns_rate not in", values, "lnsRate");
            return (Criteria) this;
        }

        public Criteria andLnsRateBetween(Integer value1, Integer value2) {
            addCriterion("lns_rate between", value1, value2, "lnsRate");
            return (Criteria) this;
        }

        public Criteria andLnsRateNotBetween(Integer value1, Integer value2) {
            addCriterion("lns_rate not between", value1, value2, "lnsRate");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("channel_code =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("channel_code <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("channel_code >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("channel_code <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("channel_code <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("channel_code like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("channel_code not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("channel_code in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("channel_code not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("channel_code between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("channel_code not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdIsNull() {
            addCriterion("loan_officer_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdIsNotNull() {
            addCriterion("loan_officer_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdEqualTo(String value) {
            addCriterion("loan_officer_id =", value, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdNotEqualTo(String value) {
            addCriterion("loan_officer_id <>", value, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdGreaterThan(String value) {
            addCriterion("loan_officer_id >", value, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdGreaterThanOrEqualTo(String value) {
            addCriterion("loan_officer_id >=", value, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdLessThan(String value) {
            addCriterion("loan_officer_id <", value, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdLessThanOrEqualTo(String value) {
            addCriterion("loan_officer_id <=", value, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdLike(String value) {
            addCriterion("loan_officer_id like", value, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdNotLike(String value) {
            addCriterion("loan_officer_id not like", value, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdIn(List<String> values) {
            addCriterion("loan_officer_id in", values, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdNotIn(List<String> values) {
            addCriterion("loan_officer_id not in", values, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdBetween(String value1, String value2) {
            addCriterion("loan_officer_id between", value1, value2, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andLoanOfficerIdNotBetween(String value1, String value2) {
            addCriterion("loan_officer_id not between", value1, value2, "loanOfficerId");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityID is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityID is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("cityID =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("cityID <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("cityID >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("cityID >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("cityID <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("cityID <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("cityID like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("cityID not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("cityID in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("cityID not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("cityID between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("cityID not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andIsModifyIsNull() {
            addCriterion("is_modify is null");
            return (Criteria) this;
        }

        public Criteria andIsModifyIsNotNull() {
            addCriterion("is_modify is not null");
            return (Criteria) this;
        }

        public Criteria andIsModifyEqualTo(String value) {
            addCriterion("is_modify =", value, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyNotEqualTo(String value) {
            addCriterion("is_modify <>", value, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyGreaterThan(String value) {
            addCriterion("is_modify >", value, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyGreaterThanOrEqualTo(String value) {
            addCriterion("is_modify >=", value, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyLessThan(String value) {
            addCriterion("is_modify <", value, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyLessThanOrEqualTo(String value) {
            addCriterion("is_modify <=", value, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyLike(String value) {
            addCriterion("is_modify like", value, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyNotLike(String value) {
            addCriterion("is_modify not like", value, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyIn(List<String> values) {
            addCriterion("is_modify in", values, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyNotIn(List<String> values) {
            addCriterion("is_modify not in", values, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyBetween(String value1, String value2) {
            addCriterion("is_modify between", value1, value2, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsModifyNotBetween(String value1, String value2) {
            addCriterion("is_modify not between", value1, value2, "isModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyIsNull() {
            addCriterion("is_scheme_modify is null");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyIsNotNull() {
            addCriterion("is_scheme_modify is not null");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyEqualTo(String value) {
            addCriterion("is_scheme_modify =", value, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyNotEqualTo(String value) {
            addCriterion("is_scheme_modify <>", value, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyGreaterThan(String value) {
            addCriterion("is_scheme_modify >", value, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyGreaterThanOrEqualTo(String value) {
            addCriterion("is_scheme_modify >=", value, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyLessThan(String value) {
            addCriterion("is_scheme_modify <", value, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyLessThanOrEqualTo(String value) {
            addCriterion("is_scheme_modify <=", value, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyLike(String value) {
            addCriterion("is_scheme_modify like", value, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyNotLike(String value) {
            addCriterion("is_scheme_modify not like", value, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyIn(List<String> values) {
            addCriterion("is_scheme_modify in", values, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyNotIn(List<String> values) {
            addCriterion("is_scheme_modify not in", values, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyBetween(String value1, String value2) {
            addCriterion("is_scheme_modify between", value1, value2, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andIsSchemeModifyNotBetween(String value1, String value2) {
            addCriterion("is_scheme_modify not between", value1, value2, "isSchemeModify");
            return (Criteria) this;
        }

        public Criteria andRecycleWayIsNull() {
            addCriterion("recycle_way is null");
            return (Criteria) this;
        }

        public Criteria andRecycleWayIsNotNull() {
            addCriterion("recycle_way is not null");
            return (Criteria) this;
        }

        public Criteria andRecycleWayEqualTo(Integer value) {
            addCriterion("recycle_way =", value, "recycleWay");
            return (Criteria) this;
        }

        public Criteria andRecycleWayNotEqualTo(Integer value) {
            addCriterion("recycle_way <>", value, "recycleWay");
            return (Criteria) this;
        }

        public Criteria andRecycleWayGreaterThan(Integer value) {
            addCriterion("recycle_way >", value, "recycleWay");
            return (Criteria) this;
        }

        public Criteria andRecycleWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("recycle_way >=", value, "recycleWay");
            return (Criteria) this;
        }

        public Criteria andRecycleWayLessThan(Integer value) {
            addCriterion("recycle_way <", value, "recycleWay");
            return (Criteria) this;
        }

        public Criteria andRecycleWayLessThanOrEqualTo(Integer value) {
            addCriterion("recycle_way <=", value, "recycleWay");
            return (Criteria) this;
        }

        public Criteria andRecycleWayIn(List<Integer> values) {
            addCriterion("recycle_way in", values, "recycleWay");
            return (Criteria) this;
        }

        public Criteria andRecycleWayNotIn(List<Integer> values) {
            addCriterion("recycle_way not in", values, "recycleWay");
            return (Criteria) this;
        }

        public Criteria andRecycleWayBetween(Integer value1, Integer value2) {
            addCriterion("recycle_way between", value1, value2, "recycleWay");
            return (Criteria) this;
        }

        public Criteria andRecycleWayNotBetween(Integer value1, Integer value2) {
            addCriterion("recycle_way not between", value1, value2, "recycleWay");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadIsNull() {
            addCriterion("is_recycle_load is null");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadIsNotNull() {
            addCriterion("is_recycle_load is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadEqualTo(String value) {
            addCriterion("is_recycle_load =", value, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadNotEqualTo(String value) {
            addCriterion("is_recycle_load <>", value, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadGreaterThan(String value) {
            addCriterion("is_recycle_load >", value, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadGreaterThanOrEqualTo(String value) {
            addCriterion("is_recycle_load >=", value, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadLessThan(String value) {
            addCriterion("is_recycle_load <", value, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadLessThanOrEqualTo(String value) {
            addCriterion("is_recycle_load <=", value, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadLike(String value) {
            addCriterion("is_recycle_load like", value, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadNotLike(String value) {
            addCriterion("is_recycle_load not like", value, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadIn(List<String> values) {
            addCriterion("is_recycle_load in", values, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadNotIn(List<String> values) {
            addCriterion("is_recycle_load not in", values, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadBetween(String value1, String value2) {
            addCriterion("is_recycle_load between", value1, value2, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andIsRecycleLoadNotBetween(String value1, String value2) {
            addCriterion("is_recycle_load not between", value1, value2, "isRecycleLoad");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntIsNull() {
            addCriterion("recycle_loan_cnt is null");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntIsNotNull() {
            addCriterion("recycle_loan_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntEqualTo(Integer value) {
            addCriterion("recycle_loan_cnt =", value, "recycleLoanCnt");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntNotEqualTo(Integer value) {
            addCriterion("recycle_loan_cnt <>", value, "recycleLoanCnt");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntGreaterThan(Integer value) {
            addCriterion("recycle_loan_cnt >", value, "recycleLoanCnt");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("recycle_loan_cnt >=", value, "recycleLoanCnt");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntLessThan(Integer value) {
            addCriterion("recycle_loan_cnt <", value, "recycleLoanCnt");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntLessThanOrEqualTo(Integer value) {
            addCriterion("recycle_loan_cnt <=", value, "recycleLoanCnt");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntIn(List<Integer> values) {
            addCriterion("recycle_loan_cnt in", values, "recycleLoanCnt");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntNotIn(List<Integer> values) {
            addCriterion("recycle_loan_cnt not in", values, "recycleLoanCnt");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntBetween(Integer value1, Integer value2) {
            addCriterion("recycle_loan_cnt between", value1, value2, "recycleLoanCnt");
            return (Criteria) this;
        }

        public Criteria andRecycleLoanCntNotBetween(Integer value1, Integer value2) {
            addCriterion("recycle_loan_cnt not between", value1, value2, "recycleLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOldContractNumIsNull() {
            addCriterion("old_contract_num is null");
            return (Criteria) this;
        }

        public Criteria andOldContractNumIsNotNull() {
            addCriterion("old_contract_num is not null");
            return (Criteria) this;
        }

        public Criteria andOldContractNumEqualTo(String value) {
            addCriterion("old_contract_num =", value, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumNotEqualTo(String value) {
            addCriterion("old_contract_num <>", value, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumGreaterThan(String value) {
            addCriterion("old_contract_num >", value, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumGreaterThanOrEqualTo(String value) {
            addCriterion("old_contract_num >=", value, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumLessThan(String value) {
            addCriterion("old_contract_num <", value, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumLessThanOrEqualTo(String value) {
            addCriterion("old_contract_num <=", value, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumLike(String value) {
            addCriterion("old_contract_num like", value, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumNotLike(String value) {
            addCriterion("old_contract_num not like", value, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumIn(List<String> values) {
            addCriterion("old_contract_num in", values, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumNotIn(List<String> values) {
            addCriterion("old_contract_num not in", values, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumBetween(String value1, String value2) {
            addCriterion("old_contract_num between", value1, value2, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andOldContractNumNotBetween(String value1, String value2) {
            addCriterion("old_contract_num not between", value1, value2, "oldContractNum");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIsNull() {
            addCriterion("settle_amount is null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIsNotNull() {
            addCriterion("settle_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountEqualTo(Integer value) {
            addCriterion("settle_amount =", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotEqualTo(Integer value) {
            addCriterion("settle_amount <>", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountGreaterThan(Integer value) {
            addCriterion("settle_amount >", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_amount >=", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLessThan(Integer value) {
            addCriterion("settle_amount <", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLessThanOrEqualTo(Integer value) {
            addCriterion("settle_amount <=", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIn(List<Integer> values) {
            addCriterion("settle_amount in", values, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotIn(List<Integer> values) {
            addCriterion("settle_amount not in", values, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountBetween(Integer value1, Integer value2) {
            addCriterion("settle_amount between", value1, value2, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_amount not between", value1, value2, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andNewContractNumIsNull() {
            addCriterion("new_contract_num is null");
            return (Criteria) this;
        }

        public Criteria andNewContractNumIsNotNull() {
            addCriterion("new_contract_num is not null");
            return (Criteria) this;
        }

        public Criteria andNewContractNumEqualTo(String value) {
            addCriterion("new_contract_num =", value, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumNotEqualTo(String value) {
            addCriterion("new_contract_num <>", value, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumGreaterThan(String value) {
            addCriterion("new_contract_num >", value, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumGreaterThanOrEqualTo(String value) {
            addCriterion("new_contract_num >=", value, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumLessThan(String value) {
            addCriterion("new_contract_num <", value, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumLessThanOrEqualTo(String value) {
            addCriterion("new_contract_num <=", value, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumLike(String value) {
            addCriterion("new_contract_num like", value, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumNotLike(String value) {
            addCriterion("new_contract_num not like", value, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumIn(List<String> values) {
            addCriterion("new_contract_num in", values, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumNotIn(List<String> values) {
            addCriterion("new_contract_num not in", values, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumBetween(String value1, String value2) {
            addCriterion("new_contract_num between", value1, value2, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andNewContractNumNotBetween(String value1, String value2) {
            addCriterion("new_contract_num not between", value1, value2, "newContractNum");
            return (Criteria) this;
        }

        public Criteria andIsShortenIsNull() {
            addCriterion("is_shorten is null");
            return (Criteria) this;
        }

        public Criteria andIsShortenIsNotNull() {
            addCriterion("is_shorten is not null");
            return (Criteria) this;
        }

        public Criteria andIsShortenEqualTo(String value) {
            addCriterion("is_shorten =", value, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenNotEqualTo(String value) {
            addCriterion("is_shorten <>", value, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenGreaterThan(String value) {
            addCriterion("is_shorten >", value, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenGreaterThanOrEqualTo(String value) {
            addCriterion("is_shorten >=", value, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenLessThan(String value) {
            addCriterion("is_shorten <", value, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenLessThanOrEqualTo(String value) {
            addCriterion("is_shorten <=", value, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenLike(String value) {
            addCriterion("is_shorten like", value, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenNotLike(String value) {
            addCriterion("is_shorten not like", value, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenIn(List<String> values) {
            addCriterion("is_shorten in", values, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenNotIn(List<String> values) {
            addCriterion("is_shorten not in", values, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenBetween(String value1, String value2) {
            addCriterion("is_shorten between", value1, value2, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsShortenNotBetween(String value1, String value2) {
            addCriterion("is_shorten not between", value1, value2, "isShorten");
            return (Criteria) this;
        }

        public Criteria andIsExtendIsNull() {
            addCriterion("is_extend is null");
            return (Criteria) this;
        }

        public Criteria andIsExtendIsNotNull() {
            addCriterion("is_extend is not null");
            return (Criteria) this;
        }

        public Criteria andIsExtendEqualTo(String value) {
            addCriterion("is_extend =", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendNotEqualTo(String value) {
            addCriterion("is_extend <>", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendGreaterThan(String value) {
            addCriterion("is_extend >", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendGreaterThanOrEqualTo(String value) {
            addCriterion("is_extend >=", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendLessThan(String value) {
            addCriterion("is_extend <", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendLessThanOrEqualTo(String value) {
            addCriterion("is_extend <=", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendLike(String value) {
            addCriterion("is_extend like", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendNotLike(String value) {
            addCriterion("is_extend not like", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendIn(List<String> values) {
            addCriterion("is_extend in", values, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendNotIn(List<String> values) {
            addCriterion("is_extend not in", values, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendBetween(String value1, String value2) {
            addCriterion("is_extend between", value1, value2, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendNotBetween(String value1, String value2) {
            addCriterion("is_extend not between", value1, value2, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceIsNull() {
            addCriterion("is_change_produce is null");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceIsNotNull() {
            addCriterion("is_change_produce is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceEqualTo(String value) {
            addCriterion("is_change_produce =", value, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceNotEqualTo(String value) {
            addCriterion("is_change_produce <>", value, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceGreaterThan(String value) {
            addCriterion("is_change_produce >", value, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceGreaterThanOrEqualTo(String value) {
            addCriterion("is_change_produce >=", value, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceLessThan(String value) {
            addCriterion("is_change_produce <", value, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceLessThanOrEqualTo(String value) {
            addCriterion("is_change_produce <=", value, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceLike(String value) {
            addCriterion("is_change_produce like", value, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceNotLike(String value) {
            addCriterion("is_change_produce not like", value, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceIn(List<String> values) {
            addCriterion("is_change_produce in", values, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceNotIn(List<String> values) {
            addCriterion("is_change_produce not in", values, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceBetween(String value1, String value2) {
            addCriterion("is_change_produce between", value1, value2, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsChangeProduceNotBetween(String value1, String value2) {
            addCriterion("is_change_produce not between", value1, value2, "isChangeProduce");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNull() {
            addCriterion("is_overdue is null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNotNull() {
            addCriterion("is_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueEqualTo(String value) {
            addCriterion("is_overdue =", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotEqualTo(String value) {
            addCriterion("is_overdue <>", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThan(String value) {
            addCriterion("is_overdue >", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("is_overdue >=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThan(String value) {
            addCriterion("is_overdue <", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThanOrEqualTo(String value) {
            addCriterion("is_overdue <=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLike(String value) {
            addCriterion("is_overdue like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotLike(String value) {
            addCriterion("is_overdue not like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIn(List<String> values) {
            addCriterion("is_overdue in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotIn(List<String> values) {
            addCriterion("is_overdue not in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueBetween(String value1, String value2) {
            addCriterion("is_overdue between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotBetween(String value1, String value2) {
            addCriterion("is_overdue not between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadIsNull() {
            addCriterion("is_pay_ahead is null");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadIsNotNull() {
            addCriterion("is_pay_ahead is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadEqualTo(String value) {
            addCriterion("is_pay_ahead =", value, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadNotEqualTo(String value) {
            addCriterion("is_pay_ahead <>", value, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadGreaterThan(String value) {
            addCriterion("is_pay_ahead >", value, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadGreaterThanOrEqualTo(String value) {
            addCriterion("is_pay_ahead >=", value, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadLessThan(String value) {
            addCriterion("is_pay_ahead <", value, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadLessThanOrEqualTo(String value) {
            addCriterion("is_pay_ahead <=", value, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadLike(String value) {
            addCriterion("is_pay_ahead like", value, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadNotLike(String value) {
            addCriterion("is_pay_ahead not like", value, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadIn(List<String> values) {
            addCriterion("is_pay_ahead in", values, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadNotIn(List<String> values) {
            addCriterion("is_pay_ahead not in", values, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadBetween(String value1, String value2) {
            addCriterion("is_pay_ahead between", value1, value2, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayAheadNotBetween(String value1, String value2) {
            addCriterion("is_pay_ahead not between", value1, value2, "isPayAhead");
            return (Criteria) this;
        }

        public Criteria andIsPayPartIsNull() {
            addCriterion("is_pay_part is null");
            return (Criteria) this;
        }

        public Criteria andIsPayPartIsNotNull() {
            addCriterion("is_pay_part is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayPartEqualTo(String value) {
            addCriterion("is_pay_part =", value, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartNotEqualTo(String value) {
            addCriterion("is_pay_part <>", value, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartGreaterThan(String value) {
            addCriterion("is_pay_part >", value, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartGreaterThanOrEqualTo(String value) {
            addCriterion("is_pay_part >=", value, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartLessThan(String value) {
            addCriterion("is_pay_part <", value, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartLessThanOrEqualTo(String value) {
            addCriterion("is_pay_part <=", value, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartLike(String value) {
            addCriterion("is_pay_part like", value, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartNotLike(String value) {
            addCriterion("is_pay_part not like", value, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartIn(List<String> values) {
            addCriterion("is_pay_part in", values, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartNotIn(List<String> values) {
            addCriterion("is_pay_part not in", values, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartBetween(String value1, String value2) {
            addCriterion("is_pay_part between", value1, value2, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andIsPayPartNotBetween(String value1, String value2) {
            addCriterion("is_pay_part not between", value1, value2, "isPayPart");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeSonIsNull() {
            addCriterion("purpose_son is null");
            return (Criteria) this;
        }

        public Criteria andPurposeSonIsNotNull() {
            addCriterion("purpose_son is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeSonEqualTo(String value) {
            addCriterion("purpose_son =", value, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonNotEqualTo(String value) {
            addCriterion("purpose_son <>", value, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonGreaterThan(String value) {
            addCriterion("purpose_son >", value, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonGreaterThanOrEqualTo(String value) {
            addCriterion("purpose_son >=", value, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonLessThan(String value) {
            addCriterion("purpose_son <", value, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonLessThanOrEqualTo(String value) {
            addCriterion("purpose_son <=", value, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonLike(String value) {
            addCriterion("purpose_son like", value, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonNotLike(String value) {
            addCriterion("purpose_son not like", value, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonIn(List<String> values) {
            addCriterion("purpose_son in", values, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonNotIn(List<String> values) {
            addCriterion("purpose_son not in", values, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonBetween(String value1, String value2) {
            addCriterion("purpose_son between", value1, value2, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeSonNotBetween(String value1, String value2) {
            addCriterion("purpose_son not between", value1, value2, "purposeSon");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailIsNull() {
            addCriterion("purpose_detail is null");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailIsNotNull() {
            addCriterion("purpose_detail is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailEqualTo(String value) {
            addCriterion("purpose_detail =", value, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailNotEqualTo(String value) {
            addCriterion("purpose_detail <>", value, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailGreaterThan(String value) {
            addCriterion("purpose_detail >", value, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailGreaterThanOrEqualTo(String value) {
            addCriterion("purpose_detail >=", value, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailLessThan(String value) {
            addCriterion("purpose_detail <", value, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailLessThanOrEqualTo(String value) {
            addCriterion("purpose_detail <=", value, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailLike(String value) {
            addCriterion("purpose_detail like", value, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailNotLike(String value) {
            addCriterion("purpose_detail not like", value, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailIn(List<String> values) {
            addCriterion("purpose_detail in", values, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailNotIn(List<String> values) {
            addCriterion("purpose_detail not in", values, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailBetween(String value1, String value2) {
            addCriterion("purpose_detail between", value1, value2, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andPurposeDetailNotBetween(String value1, String value2) {
            addCriterion("purpose_detail not between", value1, value2, "purposeDetail");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountIsNull() {
            addCriterion("is_div_account is null");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountIsNotNull() {
            addCriterion("is_div_account is not null");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountEqualTo(String value) {
            addCriterion("is_div_account =", value, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountNotEqualTo(String value) {
            addCriterion("is_div_account <>", value, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountGreaterThan(String value) {
            addCriterion("is_div_account >", value, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountGreaterThanOrEqualTo(String value) {
            addCriterion("is_div_account >=", value, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountLessThan(String value) {
            addCriterion("is_div_account <", value, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountLessThanOrEqualTo(String value) {
            addCriterion("is_div_account <=", value, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountLike(String value) {
            addCriterion("is_div_account like", value, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountNotLike(String value) {
            addCriterion("is_div_account not like", value, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountIn(List<String> values) {
            addCriterion("is_div_account in", values, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountNotIn(List<String> values) {
            addCriterion("is_div_account not in", values, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountBetween(String value1, String value2) {
            addCriterion("is_div_account between", value1, value2, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andIsDivAccountNotBetween(String value1, String value2) {
            addCriterion("is_div_account not between", value1, value2, "isDivAccount");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNull() {
            addCriterion("system_type is null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNotNull() {
            addCriterion("system_type is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeEqualTo(String value) {
            addCriterion("system_type =", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotEqualTo(String value) {
            addCriterion("system_type <>", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThan(String value) {
            addCriterion("system_type >", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("system_type >=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThan(String value) {
            addCriterion("system_type <", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThanOrEqualTo(String value) {
            addCriterion("system_type <=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLike(String value) {
            addCriterion("system_type like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotLike(String value) {
            addCriterion("system_type not like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIn(List<String> values) {
            addCriterion("system_type in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotIn(List<String> values) {
            addCriterion("system_type not in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeBetween(String value1, String value2) {
            addCriterion("system_type between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotBetween(String value1, String value2) {
            addCriterion("system_type not between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andHighRiskIsNull() {
            addCriterion("high_risk is null");
            return (Criteria) this;
        }

        public Criteria andHighRiskIsNotNull() {
            addCriterion("high_risk is not null");
            return (Criteria) this;
        }

        public Criteria andHighRiskEqualTo(String value) {
            addCriterion("high_risk =", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskNotEqualTo(String value) {
            addCriterion("high_risk <>", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskGreaterThan(String value) {
            addCriterion("high_risk >", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskGreaterThanOrEqualTo(String value) {
            addCriterion("high_risk >=", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskLessThan(String value) {
            addCriterion("high_risk <", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskLessThanOrEqualTo(String value) {
            addCriterion("high_risk <=", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskLike(String value) {
            addCriterion("high_risk like", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskNotLike(String value) {
            addCriterion("high_risk not like", value, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskIn(List<String> values) {
            addCriterion("high_risk in", values, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskNotIn(List<String> values) {
            addCriterion("high_risk not in", values, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskBetween(String value1, String value2) {
            addCriterion("high_risk between", value1, value2, "highRisk");
            return (Criteria) this;
        }

        public Criteria andHighRiskNotBetween(String value1, String value2) {
            addCriterion("high_risk not between", value1, value2, "highRisk");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutIsNull() {
            addCriterion("is_buyout is null");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutIsNotNull() {
            addCriterion("is_buyout is not null");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutEqualTo(String value) {
            addCriterion("is_buyout =", value, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutNotEqualTo(String value) {
            addCriterion("is_buyout <>", value, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutGreaterThan(String value) {
            addCriterion("is_buyout >", value, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutGreaterThanOrEqualTo(String value) {
            addCriterion("is_buyout >=", value, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutLessThan(String value) {
            addCriterion("is_buyout <", value, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutLessThanOrEqualTo(String value) {
            addCriterion("is_buyout <=", value, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutLike(String value) {
            addCriterion("is_buyout like", value, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutNotLike(String value) {
            addCriterion("is_buyout not like", value, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutIn(List<String> values) {
            addCriterion("is_buyout in", values, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutNotIn(List<String> values) {
            addCriterion("is_buyout not in", values, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutBetween(String value1, String value2) {
            addCriterion("is_buyout between", value1, value2, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andIsBuyoutNotBetween(String value1, String value2) {
            addCriterion("is_buyout not between", value1, value2, "isBuyout");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeIsNull() {
            addCriterion("fee_process_type is null");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeIsNotNull() {
            addCriterion("fee_process_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeEqualTo(String value) {
            addCriterion("fee_process_type =", value, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeNotEqualTo(String value) {
            addCriterion("fee_process_type <>", value, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeGreaterThan(String value) {
            addCriterion("fee_process_type >", value, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fee_process_type >=", value, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeLessThan(String value) {
            addCriterion("fee_process_type <", value, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeLessThanOrEqualTo(String value) {
            addCriterion("fee_process_type <=", value, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeLike(String value) {
            addCriterion("fee_process_type like", value, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeNotLike(String value) {
            addCriterion("fee_process_type not like", value, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeIn(List<String> values) {
            addCriterion("fee_process_type in", values, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeNotIn(List<String> values) {
            addCriterion("fee_process_type not in", values, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeBetween(String value1, String value2) {
            addCriterion("fee_process_type between", value1, value2, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andFeeProcessTypeNotBetween(String value1, String value2) {
            addCriterion("fee_process_type not between", value1, value2, "feeProcessType");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameIsNull() {
            addCriterion("student_corp_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameIsNotNull() {
            addCriterion("student_corp_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameEqualTo(String value) {
            addCriterion("student_corp_name =", value, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameNotEqualTo(String value) {
            addCriterion("student_corp_name <>", value, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameGreaterThan(String value) {
            addCriterion("student_corp_name >", value, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_corp_name >=", value, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameLessThan(String value) {
            addCriterion("student_corp_name <", value, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameLessThanOrEqualTo(String value) {
            addCriterion("student_corp_name <=", value, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameLike(String value) {
            addCriterion("student_corp_name like", value, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameNotLike(String value) {
            addCriterion("student_corp_name not like", value, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameIn(List<String> values) {
            addCriterion("student_corp_name in", values, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameNotIn(List<String> values) {
            addCriterion("student_corp_name not in", values, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameBetween(String value1, String value2) {
            addCriterion("student_corp_name between", value1, value2, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andStudentCorpNameNotBetween(String value1, String value2) {
            addCriterion("student_corp_name not between", value1, value2, "studentCorpName");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNull() {
            addCriterion("settle_date is null");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNotNull() {
            addCriterion("settle_date is not null");
            return (Criteria) this;
        }

        public Criteria andSettleDateEqualTo(String value) {
            addCriterion("settle_date =", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotEqualTo(String value) {
            addCriterion("settle_date <>", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThan(String value) {
            addCriterion("settle_date >", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThanOrEqualTo(String value) {
            addCriterion("settle_date >=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThan(String value) {
            addCriterion("settle_date <", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThanOrEqualTo(String value) {
            addCriterion("settle_date <=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLike(String value) {
            addCriterion("settle_date like", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotLike(String value) {
            addCriterion("settle_date not like", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateIn(List<String> values) {
            addCriterion("settle_date in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotIn(List<String> values) {
            addCriterion("settle_date not in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateBetween(String value1, String value2) {
            addCriterion("settle_date between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotBetween(String value1, String value2) {
            addCriterion("settle_date not between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andHabitTimeIsNull() {
            addCriterion("habit_time is null");
            return (Criteria) this;
        }

        public Criteria andHabitTimeIsNotNull() {
            addCriterion("habit_time is not null");
            return (Criteria) this;
        }

        public Criteria andHabitTimeEqualTo(String value) {
            addCriterion("habit_time =", value, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeNotEqualTo(String value) {
            addCriterion("habit_time <>", value, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeGreaterThan(String value) {
            addCriterion("habit_time >", value, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("habit_time >=", value, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeLessThan(String value) {
            addCriterion("habit_time <", value, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeLessThanOrEqualTo(String value) {
            addCriterion("habit_time <=", value, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeLike(String value) {
            addCriterion("habit_time like", value, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeNotLike(String value) {
            addCriterion("habit_time not like", value, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeIn(List<String> values) {
            addCriterion("habit_time in", values, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeNotIn(List<String> values) {
            addCriterion("habit_time not in", values, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeBetween(String value1, String value2) {
            addCriterion("habit_time between", value1, value2, "habitTime");
            return (Criteria) this;
        }

        public Criteria andHabitTimeNotBetween(String value1, String value2) {
            addCriterion("habit_time not between", value1, value2, "habitTime");
            return (Criteria) this;
        }

        public Criteria andRepaydayIsNull() {
            addCriterion("RepayDay is null");
            return (Criteria) this;
        }

        public Criteria andRepaydayIsNotNull() {
            addCriterion("RepayDay is not null");
            return (Criteria) this;
        }

        public Criteria andRepaydayEqualTo(String value) {
            addCriterion("RepayDay =", value, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayNotEqualTo(String value) {
            addCriterion("RepayDay <>", value, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayGreaterThan(String value) {
            addCriterion("RepayDay >", value, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayGreaterThanOrEqualTo(String value) {
            addCriterion("RepayDay >=", value, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayLessThan(String value) {
            addCriterion("RepayDay <", value, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayLessThanOrEqualTo(String value) {
            addCriterion("RepayDay <=", value, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayLike(String value) {
            addCriterion("RepayDay like", value, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayNotLike(String value) {
            addCriterion("RepayDay not like", value, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayIn(List<String> values) {
            addCriterion("RepayDay in", values, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayNotIn(List<String> values) {
            addCriterion("RepayDay not in", values, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayBetween(String value1, String value2) {
            addCriterion("RepayDay between", value1, value2, "repayday");
            return (Criteria) this;
        }

        public Criteria andRepaydayNotBetween(String value1, String value2) {
            addCriterion("RepayDay not between", value1, value2, "repayday");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_Id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_Id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(String value) {
            addCriterion("apply_Id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(String value) {
            addCriterion("apply_Id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(String value) {
            addCriterion("apply_Id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("apply_Id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(String value) {
            addCriterion("apply_Id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(String value) {
            addCriterion("apply_Id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLike(String value) {
            addCriterion("apply_Id like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotLike(String value) {
            addCriterion("apply_Id not like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<String> values) {
            addCriterion("apply_Id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<String> values) {
            addCriterion("apply_Id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(String value1, String value2) {
            addCriterion("apply_Id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(String value1, String value2) {
            addCriterion("apply_Id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdIsNull() {
            addCriterion("old_Apply_Id is null");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdIsNotNull() {
            addCriterion("old_Apply_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdEqualTo(String value) {
            addCriterion("old_Apply_Id =", value, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdNotEqualTo(String value) {
            addCriterion("old_Apply_Id <>", value, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdGreaterThan(String value) {
            addCriterion("old_Apply_Id >", value, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("old_Apply_Id >=", value, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdLessThan(String value) {
            addCriterion("old_Apply_Id <", value, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdLessThanOrEqualTo(String value) {
            addCriterion("old_Apply_Id <=", value, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdLike(String value) {
            addCriterion("old_Apply_Id like", value, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdNotLike(String value) {
            addCriterion("old_Apply_Id not like", value, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdIn(List<String> values) {
            addCriterion("old_Apply_Id in", values, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdNotIn(List<String> values) {
            addCriterion("old_Apply_Id not in", values, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdBetween(String value1, String value2) {
            addCriterion("old_Apply_Id between", value1, value2, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andOldApplyIdNotBetween(String value1, String value2) {
            addCriterion("old_Apply_Id not between", value1, value2, "oldApplyId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("dept_id like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("dept_id not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("UPDATER is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("UPDATER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("UPDATER =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("UPDATER <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("UPDATER >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("UPDATER <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("UPDATER <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("UPDATER like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("UPDATER not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("UPDATER in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("UPDATER not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("UPDATER between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("UPDATER not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIsNull() {
            addCriterion("UPDATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIsNotNull() {
            addCriterion("UPDATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeEqualTo(String value) {
            addCriterion("UPDATE_TYPE =", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotEqualTo(String value) {
            addCriterion("UPDATE_TYPE <>", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeGreaterThan(String value) {
            addCriterion("UPDATE_TYPE >", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TYPE >=", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeLessThan(String value) {
            addCriterion("UPDATE_TYPE <", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TYPE <=", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeLike(String value) {
            addCriterion("UPDATE_TYPE like", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotLike(String value) {
            addCriterion("UPDATE_TYPE not like", value, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeIn(List<String> values) {
            addCriterion("UPDATE_TYPE in", values, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotIn(List<String> values) {
            addCriterion("UPDATE_TYPE not in", values, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeBetween(String value1, String value2) {
            addCriterion("UPDATE_TYPE between", value1, value2, "updateType");
            return (Criteria) this;
        }

        public Criteria andUpdateTypeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TYPE not between", value1, value2, "updateType");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountIsNull() {
            addCriterion("FRONT_CHARGE_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountIsNotNull() {
            addCriterion("FRONT_CHARGE_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountEqualTo(Integer value) {
            addCriterion("FRONT_CHARGE_DISCOUNT =", value, "frontChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountNotEqualTo(Integer value) {
            addCriterion("FRONT_CHARGE_DISCOUNT <>", value, "frontChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountGreaterThan(Integer value) {
            addCriterion("FRONT_CHARGE_DISCOUNT >", value, "frontChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FRONT_CHARGE_DISCOUNT >=", value, "frontChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountLessThan(Integer value) {
            addCriterion("FRONT_CHARGE_DISCOUNT <", value, "frontChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("FRONT_CHARGE_DISCOUNT <=", value, "frontChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountIn(List<Integer> values) {
            addCriterion("FRONT_CHARGE_DISCOUNT in", values, "frontChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountNotIn(List<Integer> values) {
            addCriterion("FRONT_CHARGE_DISCOUNT not in", values, "frontChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountBetween(Integer value1, Integer value2) {
            addCriterion("FRONT_CHARGE_DISCOUNT between", value1, value2, "frontChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andFrontChargeDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("FRONT_CHARGE_DISCOUNT not between", value1, value2, "frontChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andMonthMRateIsNull() {
            addCriterion("MONTH_M_RATE is null");
            return (Criteria) this;
        }

        public Criteria andMonthMRateIsNotNull() {
            addCriterion("MONTH_M_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andMonthMRateEqualTo(Integer value) {
            addCriterion("MONTH_M_RATE =", value, "monthMRate");
            return (Criteria) this;
        }

        public Criteria andMonthMRateNotEqualTo(Integer value) {
            addCriterion("MONTH_M_RATE <>", value, "monthMRate");
            return (Criteria) this;
        }

        public Criteria andMonthMRateGreaterThan(Integer value) {
            addCriterion("MONTH_M_RATE >", value, "monthMRate");
            return (Criteria) this;
        }

        public Criteria andMonthMRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONTH_M_RATE >=", value, "monthMRate");
            return (Criteria) this;
        }

        public Criteria andMonthMRateLessThan(Integer value) {
            addCriterion("MONTH_M_RATE <", value, "monthMRate");
            return (Criteria) this;
        }

        public Criteria andMonthMRateLessThanOrEqualTo(Integer value) {
            addCriterion("MONTH_M_RATE <=", value, "monthMRate");
            return (Criteria) this;
        }

        public Criteria andMonthMRateIn(List<Integer> values) {
            addCriterion("MONTH_M_RATE in", values, "monthMRate");
            return (Criteria) this;
        }

        public Criteria andMonthMRateNotIn(List<Integer> values) {
            addCriterion("MONTH_M_RATE not in", values, "monthMRate");
            return (Criteria) this;
        }

        public Criteria andMonthMRateBetween(Integer value1, Integer value2) {
            addCriterion("MONTH_M_RATE between", value1, value2, "monthMRate");
            return (Criteria) this;
        }

        public Criteria andMonthMRateNotBetween(Integer value1, Integer value2) {
            addCriterion("MONTH_M_RATE not between", value1, value2, "monthMRate");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateIsNull() {
            addCriterion("HANDLE_CHARGE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateIsNotNull() {
            addCriterion("HANDLE_CHARGE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateEqualTo(Integer value) {
            addCriterion("HANDLE_CHARGE_RATE =", value, "handleChargeRate");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateNotEqualTo(Integer value) {
            addCriterion("HANDLE_CHARGE_RATE <>", value, "handleChargeRate");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateGreaterThan(Integer value) {
            addCriterion("HANDLE_CHARGE_RATE >", value, "handleChargeRate");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("HANDLE_CHARGE_RATE >=", value, "handleChargeRate");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateLessThan(Integer value) {
            addCriterion("HANDLE_CHARGE_RATE <", value, "handleChargeRate");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateLessThanOrEqualTo(Integer value) {
            addCriterion("HANDLE_CHARGE_RATE <=", value, "handleChargeRate");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateIn(List<Integer> values) {
            addCriterion("HANDLE_CHARGE_RATE in", values, "handleChargeRate");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateNotIn(List<Integer> values) {
            addCriterion("HANDLE_CHARGE_RATE not in", values, "handleChargeRate");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateBetween(Integer value1, Integer value2) {
            addCriterion("HANDLE_CHARGE_RATE between", value1, value2, "handleChargeRate");
            return (Criteria) this;
        }

        public Criteria andHandleChargeRateNotBetween(Integer value1, Integer value2) {
            addCriterion("HANDLE_CHARGE_RATE not between", value1, value2, "handleChargeRate");
            return (Criteria) this;
        }

        public Criteria andLoanTimesIsNull() {
            addCriterion("LOAN_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andLoanTimesIsNotNull() {
            addCriterion("LOAN_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTimesEqualTo(Integer value) {
            addCriterion("LOAN_TIMES =", value, "loanTimes");
            return (Criteria) this;
        }

        public Criteria andLoanTimesNotEqualTo(Integer value) {
            addCriterion("LOAN_TIMES <>", value, "loanTimes");
            return (Criteria) this;
        }

        public Criteria andLoanTimesGreaterThan(Integer value) {
            addCriterion("LOAN_TIMES >", value, "loanTimes");
            return (Criteria) this;
        }

        public Criteria andLoanTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOAN_TIMES >=", value, "loanTimes");
            return (Criteria) this;
        }

        public Criteria andLoanTimesLessThan(Integer value) {
            addCriterion("LOAN_TIMES <", value, "loanTimes");
            return (Criteria) this;
        }

        public Criteria andLoanTimesLessThanOrEqualTo(Integer value) {
            addCriterion("LOAN_TIMES <=", value, "loanTimes");
            return (Criteria) this;
        }

        public Criteria andLoanTimesIn(List<Integer> values) {
            addCriterion("LOAN_TIMES in", values, "loanTimes");
            return (Criteria) this;
        }

        public Criteria andLoanTimesNotIn(List<Integer> values) {
            addCriterion("LOAN_TIMES not in", values, "loanTimes");
            return (Criteria) this;
        }

        public Criteria andLoanTimesBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_TIMES between", value1, value2, "loanTimes");
            return (Criteria) this;
        }

        public Criteria andLoanTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_TIMES not between", value1, value2, "loanTimes");
            return (Criteria) this;
        }

        public Criteria andPawnIsNull() {
            addCriterion("PAWN is null");
            return (Criteria) this;
        }

        public Criteria andPawnIsNotNull() {
            addCriterion("PAWN is not null");
            return (Criteria) this;
        }

        public Criteria andPawnEqualTo(String value) {
            addCriterion("PAWN =", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnNotEqualTo(String value) {
            addCriterion("PAWN <>", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnGreaterThan(String value) {
            addCriterion("PAWN >", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnGreaterThanOrEqualTo(String value) {
            addCriterion("PAWN >=", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnLessThan(String value) {
            addCriterion("PAWN <", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnLessThanOrEqualTo(String value) {
            addCriterion("PAWN <=", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnLike(String value) {
            addCriterion("PAWN like", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnNotLike(String value) {
            addCriterion("PAWN not like", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnIn(List<String> values) {
            addCriterion("PAWN in", values, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnNotIn(List<String> values) {
            addCriterion("PAWN not in", values, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnBetween(String value1, String value2) {
            addCriterion("PAWN between", value1, value2, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnNotBetween(String value1, String value2) {
            addCriterion("PAWN not between", value1, value2, "pawn");
            return (Criteria) this;
        }

        public Criteria andHandleChargeIsNull() {
            addCriterion("HANDLE_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andHandleChargeIsNotNull() {
            addCriterion("HANDLE_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andHandleChargeEqualTo(Integer value) {
            addCriterion("HANDLE_CHARGE =", value, "handleCharge");
            return (Criteria) this;
        }

        public Criteria andHandleChargeNotEqualTo(Integer value) {
            addCriterion("HANDLE_CHARGE <>", value, "handleCharge");
            return (Criteria) this;
        }

        public Criteria andHandleChargeGreaterThan(Integer value) {
            addCriterion("HANDLE_CHARGE >", value, "handleCharge");
            return (Criteria) this;
        }

        public Criteria andHandleChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("HANDLE_CHARGE >=", value, "handleCharge");
            return (Criteria) this;
        }

        public Criteria andHandleChargeLessThan(Integer value) {
            addCriterion("HANDLE_CHARGE <", value, "handleCharge");
            return (Criteria) this;
        }

        public Criteria andHandleChargeLessThanOrEqualTo(Integer value) {
            addCriterion("HANDLE_CHARGE <=", value, "handleCharge");
            return (Criteria) this;
        }

        public Criteria andHandleChargeIn(List<Integer> values) {
            addCriterion("HANDLE_CHARGE in", values, "handleCharge");
            return (Criteria) this;
        }

        public Criteria andHandleChargeNotIn(List<Integer> values) {
            addCriterion("HANDLE_CHARGE not in", values, "handleCharge");
            return (Criteria) this;
        }

        public Criteria andHandleChargeBetween(Integer value1, Integer value2) {
            addCriterion("HANDLE_CHARGE between", value1, value2, "handleCharge");
            return (Criteria) this;
        }

        public Criteria andHandleChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("HANDLE_CHARGE not between", value1, value2, "handleCharge");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountIsNull() {
            addCriterion("MONTH_CHARGE_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountIsNotNull() {
            addCriterion("MONTH_CHARGE_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountEqualTo(Integer value) {
            addCriterion("MONTH_CHARGE_DISCOUNT =", value, "monthChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountNotEqualTo(Integer value) {
            addCriterion("MONTH_CHARGE_DISCOUNT <>", value, "monthChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountGreaterThan(Integer value) {
            addCriterion("MONTH_CHARGE_DISCOUNT >", value, "monthChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONTH_CHARGE_DISCOUNT >=", value, "monthChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountLessThan(Integer value) {
            addCriterion("MONTH_CHARGE_DISCOUNT <", value, "monthChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("MONTH_CHARGE_DISCOUNT <=", value, "monthChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountIn(List<Integer> values) {
            addCriterion("MONTH_CHARGE_DISCOUNT in", values, "monthChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountNotIn(List<Integer> values) {
            addCriterion("MONTH_CHARGE_DISCOUNT not in", values, "monthChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountBetween(Integer value1, Integer value2) {
            addCriterion("MONTH_CHARGE_DISCOUNT between", value1, value2, "monthChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andMonthChargeDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("MONTH_CHARGE_DISCOUNT not between", value1, value2, "monthChargeDiscount");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeIsNull() {
            addCriterion("GUARANTEE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeIsNotNull() {
            addCriterion("GUARANTEE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeEqualTo(Integer value) {
            addCriterion("GUARANTEE_FEE =", value, "guaranteeFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeNotEqualTo(Integer value) {
            addCriterion("GUARANTEE_FEE <>", value, "guaranteeFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeGreaterThan(Integer value) {
            addCriterion("GUARANTEE_FEE >", value, "guaranteeFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GUARANTEE_FEE >=", value, "guaranteeFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeLessThan(Integer value) {
            addCriterion("GUARANTEE_FEE <", value, "guaranteeFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeLessThanOrEqualTo(Integer value) {
            addCriterion("GUARANTEE_FEE <=", value, "guaranteeFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeIn(List<Integer> values) {
            addCriterion("GUARANTEE_FEE in", values, "guaranteeFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeNotIn(List<Integer> values) {
            addCriterion("GUARANTEE_FEE not in", values, "guaranteeFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeBetween(Integer value1, Integer value2) {
            addCriterion("GUARANTEE_FEE between", value1, value2, "guaranteeFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("GUARANTEE_FEE not between", value1, value2, "guaranteeFee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyIsNull() {
            addCriterion("GUARANTEE_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyIsNotNull() {
            addCriterion("GUARANTEE_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyEqualTo(String value) {
            addCriterion("GUARANTEE_COMPANY =", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyNotEqualTo(String value) {
            addCriterion("GUARANTEE_COMPANY <>", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyGreaterThan(String value) {
            addCriterion("GUARANTEE_COMPANY >", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEE_COMPANY >=", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyLessThan(String value) {
            addCriterion("GUARANTEE_COMPANY <", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEE_COMPANY <=", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyLike(String value) {
            addCriterion("GUARANTEE_COMPANY like", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyNotLike(String value) {
            addCriterion("GUARANTEE_COMPANY not like", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyIn(List<String> values) {
            addCriterion("GUARANTEE_COMPANY in", values, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyNotIn(List<String> values) {
            addCriterion("GUARANTEE_COMPANY not in", values, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyBetween(String value1, String value2) {
            addCriterion("GUARANTEE_COMPANY between", value1, value2, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyNotBetween(String value1, String value2) {
            addCriterion("GUARANTEE_COMPANY not between", value1, value2, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andDef1IsNull() {
            addCriterion("def1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("def1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(String value) {
            addCriterion("def1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(String value) {
            addCriterion("def1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(String value) {
            addCriterion("def1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(String value) {
            addCriterion("def1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(String value) {
            addCriterion("def1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(String value) {
            addCriterion("def1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Like(String value) {
            addCriterion("def1 like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotLike(String value) {
            addCriterion("def1 not like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<String> values) {
            addCriterion("def1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<String> values) {
            addCriterion("def1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(String value1, String value2) {
            addCriterion("def1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(String value1, String value2) {
            addCriterion("def1 not between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("def2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("def2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(String value) {
            addCriterion("def2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(String value) {
            addCriterion("def2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(String value) {
            addCriterion("def2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(String value) {
            addCriterion("def2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(String value) {
            addCriterion("def2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(String value) {
            addCriterion("def2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Like(String value) {
            addCriterion("def2 like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotLike(String value) {
            addCriterion("def2 not like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<String> values) {
            addCriterion("def2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<String> values) {
            addCriterion("def2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(String value1, String value2) {
            addCriterion("def2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(String value1, String value2) {
            addCriterion("def2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("def3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("def3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("def3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("def3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("def3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("def3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("def3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("def3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("def3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("def3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("def3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("def3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("def3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("def3 not between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef4IsNull() {
            addCriterion("def4 is null");
            return (Criteria) this;
        }

        public Criteria andDef4IsNotNull() {
            addCriterion("def4 is not null");
            return (Criteria) this;
        }

        public Criteria andDef4EqualTo(String value) {
            addCriterion("def4 =", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotEqualTo(String value) {
            addCriterion("def4 <>", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThan(String value) {
            addCriterion("def4 >", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThanOrEqualTo(String value) {
            addCriterion("def4 >=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThan(String value) {
            addCriterion("def4 <", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThanOrEqualTo(String value) {
            addCriterion("def4 <=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Like(String value) {
            addCriterion("def4 like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotLike(String value) {
            addCriterion("def4 not like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4In(List<String> values) {
            addCriterion("def4 in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotIn(List<String> values) {
            addCriterion("def4 not in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Between(String value1, String value2) {
            addCriterion("def4 between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotBetween(String value1, String value2) {
            addCriterion("def4 not between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef5IsNull() {
            addCriterion("def5 is null");
            return (Criteria) this;
        }

        public Criteria andDef5IsNotNull() {
            addCriterion("def5 is not null");
            return (Criteria) this;
        }

        public Criteria andDef5EqualTo(String value) {
            addCriterion("def5 =", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotEqualTo(String value) {
            addCriterion("def5 <>", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThan(String value) {
            addCriterion("def5 >", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThanOrEqualTo(String value) {
            addCriterion("def5 >=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThan(String value) {
            addCriterion("def5 <", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThanOrEqualTo(String value) {
            addCriterion("def5 <=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Like(String value) {
            addCriterion("def5 like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotLike(String value) {
            addCriterion("def5 not like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5In(List<String> values) {
            addCriterion("def5 in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotIn(List<String> values) {
            addCriterion("def5 not in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Between(String value1, String value2) {
            addCriterion("def5 between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotBetween(String value1, String value2) {
            addCriterion("def5 not between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef6IsNull() {
            addCriterion("def6 is null");
            return (Criteria) this;
        }

        public Criteria andDef6IsNotNull() {
            addCriterion("def6 is not null");
            return (Criteria) this;
        }

        public Criteria andDef6EqualTo(String value) {
            addCriterion("def6 =", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotEqualTo(String value) {
            addCriterion("def6 <>", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6GreaterThan(String value) {
            addCriterion("def6 >", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6GreaterThanOrEqualTo(String value) {
            addCriterion("def6 >=", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6LessThan(String value) {
            addCriterion("def6 <", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6LessThanOrEqualTo(String value) {
            addCriterion("def6 <=", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6Like(String value) {
            addCriterion("def6 like", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotLike(String value) {
            addCriterion("def6 not like", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6In(List<String> values) {
            addCriterion("def6 in", values, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotIn(List<String> values) {
            addCriterion("def6 not in", values, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6Between(String value1, String value2) {
            addCriterion("def6 between", value1, value2, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotBetween(String value1, String value2) {
            addCriterion("def6 not between", value1, value2, "def6");
            return (Criteria) this;
        }

        public Criteria andDef7IsNull() {
            addCriterion("def7 is null");
            return (Criteria) this;
        }

        public Criteria andDef7IsNotNull() {
            addCriterion("def7 is not null");
            return (Criteria) this;
        }

        public Criteria andDef7EqualTo(String value) {
            addCriterion("def7 =", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotEqualTo(String value) {
            addCriterion("def7 <>", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7GreaterThan(String value) {
            addCriterion("def7 >", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7GreaterThanOrEqualTo(String value) {
            addCriterion("def7 >=", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7LessThan(String value) {
            addCriterion("def7 <", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7LessThanOrEqualTo(String value) {
            addCriterion("def7 <=", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7Like(String value) {
            addCriterion("def7 like", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotLike(String value) {
            addCriterion("def7 not like", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7In(List<String> values) {
            addCriterion("def7 in", values, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotIn(List<String> values) {
            addCriterion("def7 not in", values, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7Between(String value1, String value2) {
            addCriterion("def7 between", value1, value2, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotBetween(String value1, String value2) {
            addCriterion("def7 not between", value1, value2, "def7");
            return (Criteria) this;
        }

        public Criteria andDef8IsNull() {
            addCriterion("def8 is null");
            return (Criteria) this;
        }

        public Criteria andDef8IsNotNull() {
            addCriterion("def8 is not null");
            return (Criteria) this;
        }

        public Criteria andDef8EqualTo(String value) {
            addCriterion("def8 =", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotEqualTo(String value) {
            addCriterion("def8 <>", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8GreaterThan(String value) {
            addCriterion("def8 >", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8GreaterThanOrEqualTo(String value) {
            addCriterion("def8 >=", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8LessThan(String value) {
            addCriterion("def8 <", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8LessThanOrEqualTo(String value) {
            addCriterion("def8 <=", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8Like(String value) {
            addCriterion("def8 like", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotLike(String value) {
            addCriterion("def8 not like", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8In(List<String> values) {
            addCriterion("def8 in", values, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotIn(List<String> values) {
            addCriterion("def8 not in", values, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8Between(String value1, String value2) {
            addCriterion("def8 between", value1, value2, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotBetween(String value1, String value2) {
            addCriterion("def8 not between", value1, value2, "def8");
            return (Criteria) this;
        }

        public Criteria andDef9IsNull() {
            addCriterion("def9 is null");
            return (Criteria) this;
        }

        public Criteria andDef9IsNotNull() {
            addCriterion("def9 is not null");
            return (Criteria) this;
        }

        public Criteria andDef9EqualTo(String value) {
            addCriterion("def9 =", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotEqualTo(String value) {
            addCriterion("def9 <>", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9GreaterThan(String value) {
            addCriterion("def9 >", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9GreaterThanOrEqualTo(String value) {
            addCriterion("def9 >=", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9LessThan(String value) {
            addCriterion("def9 <", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9LessThanOrEqualTo(String value) {
            addCriterion("def9 <=", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9Like(String value) {
            addCriterion("def9 like", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotLike(String value) {
            addCriterion("def9 not like", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9In(List<String> values) {
            addCriterion("def9 in", values, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotIn(List<String> values) {
            addCriterion("def9 not in", values, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9Between(String value1, String value2) {
            addCriterion("def9 between", value1, value2, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotBetween(String value1, String value2) {
            addCriterion("def9 not between", value1, value2, "def9");
            return (Criteria) this;
        }

        public Criteria andDef10IsNull() {
            addCriterion("def10 is null");
            return (Criteria) this;
        }

        public Criteria andDef10IsNotNull() {
            addCriterion("def10 is not null");
            return (Criteria) this;
        }

        public Criteria andDef10EqualTo(String value) {
            addCriterion("def10 =", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotEqualTo(String value) {
            addCriterion("def10 <>", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10GreaterThan(String value) {
            addCriterion("def10 >", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10GreaterThanOrEqualTo(String value) {
            addCriterion("def10 >=", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10LessThan(String value) {
            addCriterion("def10 <", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10LessThanOrEqualTo(String value) {
            addCriterion("def10 <=", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10Like(String value) {
            addCriterion("def10 like", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotLike(String value) {
            addCriterion("def10 not like", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10In(List<String> values) {
            addCriterion("def10 in", values, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotIn(List<String> values) {
            addCriterion("def10 not in", values, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10Between(String value1, String value2) {
            addCriterion("def10 between", value1, value2, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotBetween(String value1, String value2) {
            addCriterion("def10 not between", value1, value2, "def10");
            return (Criteria) this;
        }
    }

    /**
     * 描述:nplm_contract_attribute表的实体类
     * @version
     * @author:  zhangzhanbao
     * @创建时间: 2018-09-17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * nplm_contract_attribute 2018-09-17
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}