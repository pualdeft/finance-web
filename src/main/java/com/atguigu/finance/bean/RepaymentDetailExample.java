package com.atguigu.finance.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepaymentDetailExample {
    /**
     * nplm_repayment_detail
     */
    protected String orderByClause;

    /**
     * nplm_repayment_detail
     */
    protected boolean distinct;

    /**
     * nplm_repayment_detail
     */
    protected List<Criteria> oredCriteria;

    public RepaymentDetailExample() {
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
     * nplm_repayment_detail 2018-09-17
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdIsNull() {
            addCriterion("REPAYMENT_PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdIsNotNull() {
            addCriterion("REPAYMENT_PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdEqualTo(Integer value) {
            addCriterion("REPAYMENT_PLAN_ID =", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdNotEqualTo(Integer value) {
            addCriterion("REPAYMENT_PLAN_ID <>", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdGreaterThan(Integer value) {
            addCriterion("REPAYMENT_PLAN_ID >", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAYMENT_PLAN_ID >=", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdLessThan(Integer value) {
            addCriterion("REPAYMENT_PLAN_ID <", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("REPAYMENT_PLAN_ID <=", value, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdIn(List<Integer> values) {
            addCriterion("REPAYMENT_PLAN_ID in", values, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdNotIn(List<Integer> values) {
            addCriterion("REPAYMENT_PLAN_ID not in", values, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("REPAYMENT_PLAN_ID between", value1, value2, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAYMENT_PLAN_ID not between", value1, value2, "repaymentPlanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdIsNull() {
            addCriterion("REPAYMENT_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdIsNotNull() {
            addCriterion("REPAYMENT_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdEqualTo(Integer value) {
            addCriterion("REPAYMENT_RECORD_ID =", value, "repaymentRecordId");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdNotEqualTo(Integer value) {
            addCriterion("REPAYMENT_RECORD_ID <>", value, "repaymentRecordId");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdGreaterThan(Integer value) {
            addCriterion("REPAYMENT_RECORD_ID >", value, "repaymentRecordId");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAYMENT_RECORD_ID >=", value, "repaymentRecordId");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdLessThan(Integer value) {
            addCriterion("REPAYMENT_RECORD_ID <", value, "repaymentRecordId");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("REPAYMENT_RECORD_ID <=", value, "repaymentRecordId");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdIn(List<Integer> values) {
            addCriterion("REPAYMENT_RECORD_ID in", values, "repaymentRecordId");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdNotIn(List<Integer> values) {
            addCriterion("REPAYMENT_RECORD_ID not in", values, "repaymentRecordId");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("REPAYMENT_RECORD_ID between", value1, value2, "repaymentRecordId");
            return (Criteria) this;
        }

        public Criteria andRepaymentRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAYMENT_RECORD_ID not between", value1, value2, "repaymentRecordId");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdIsNull() {
            addCriterion("BUSINESS_REQUEST_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdIsNotNull() {
            addCriterion("BUSINESS_REQUEST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdEqualTo(Integer value) {
            addCriterion("BUSINESS_REQUEST_ID =", value, "businessRequestId");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdNotEqualTo(Integer value) {
            addCriterion("BUSINESS_REQUEST_ID <>", value, "businessRequestId");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdGreaterThan(Integer value) {
            addCriterion("BUSINESS_REQUEST_ID >", value, "businessRequestId");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_REQUEST_ID >=", value, "businessRequestId");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdLessThan(Integer value) {
            addCriterion("BUSINESS_REQUEST_ID <", value, "businessRequestId");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_REQUEST_ID <=", value, "businessRequestId");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdIn(List<Integer> values) {
            addCriterion("BUSINESS_REQUEST_ID in", values, "businessRequestId");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdNotIn(List<Integer> values) {
            addCriterion("BUSINESS_REQUEST_ID not in", values, "businessRequestId");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_REQUEST_ID between", value1, value2, "businessRequestId");
            return (Criteria) this;
        }

        public Criteria andBusinessRequestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_REQUEST_ID not between", value1, value2, "businessRequestId");
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

        public Criteria andRepaymentDateIsNull() {
            addCriterion("REPAYMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNotNull() {
            addCriterion("REPAYMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("REPAYMENT_DATE =", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REPAYMENT_DATE <>", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("REPAYMENT_DATE >", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REPAYMENT_DATE >=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("REPAYMENT_DATE <", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REPAYMENT_DATE <=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("REPAYMENT_DATE in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REPAYMENT_DATE not in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REPAYMENT_DATE between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REPAYMENT_DATE not between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andInstalmentIsNull() {
            addCriterion("INSTALMENT is null");
            return (Criteria) this;
        }

        public Criteria andInstalmentIsNotNull() {
            addCriterion("INSTALMENT is not null");
            return (Criteria) this;
        }

        public Criteria andInstalmentEqualTo(Integer value) {
            addCriterion("INSTALMENT =", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentNotEqualTo(Integer value) {
            addCriterion("INSTALMENT <>", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentGreaterThan(Integer value) {
            addCriterion("INSTALMENT >", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("INSTALMENT >=", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentLessThan(Integer value) {
            addCriterion("INSTALMENT <", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentLessThanOrEqualTo(Integer value) {
            addCriterion("INSTALMENT <=", value, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentIn(List<Integer> values) {
            addCriterion("INSTALMENT in", values, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentNotIn(List<Integer> values) {
            addCriterion("INSTALMENT not in", values, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentBetween(Integer value1, Integer value2) {
            addCriterion("INSTALMENT between", value1, value2, "instalment");
            return (Criteria) this;
        }

        public Criteria andInstalmentNotBetween(Integer value1, Integer value2) {
            addCriterion("INSTALMENT not between", value1, value2, "instalment");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalIsNull() {
            addCriterion("SHOULD_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalIsNotNull() {
            addCriterion("SHOULD_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalEqualTo(Integer value) {
            addCriterion("SHOULD_CAPITAL =", value, "shouldCapital");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalNotEqualTo(Integer value) {
            addCriterion("SHOULD_CAPITAL <>", value, "shouldCapital");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalGreaterThan(Integer value) {
            addCriterion("SHOULD_CAPITAL >", value, "shouldCapital");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_CAPITAL >=", value, "shouldCapital");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalLessThan(Integer value) {
            addCriterion("SHOULD_CAPITAL <", value, "shouldCapital");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_CAPITAL <=", value, "shouldCapital");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalIn(List<Integer> values) {
            addCriterion("SHOULD_CAPITAL in", values, "shouldCapital");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalNotIn(List<Integer> values) {
            addCriterion("SHOULD_CAPITAL not in", values, "shouldCapital");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_CAPITAL between", value1, value2, "shouldCapital");
            return (Criteria) this;
        }

        public Criteria andShouldCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_CAPITAL not between", value1, value2, "shouldCapital");
            return (Criteria) this;
        }

        public Criteria andShouldInterestIsNull() {
            addCriterion("SHOULD_INTEREST is null");
            return (Criteria) this;
        }

        public Criteria andShouldInterestIsNotNull() {
            addCriterion("SHOULD_INTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andShouldInterestEqualTo(Integer value) {
            addCriterion("SHOULD_INTEREST =", value, "shouldInterest");
            return (Criteria) this;
        }

        public Criteria andShouldInterestNotEqualTo(Integer value) {
            addCriterion("SHOULD_INTEREST <>", value, "shouldInterest");
            return (Criteria) this;
        }

        public Criteria andShouldInterestGreaterThan(Integer value) {
            addCriterion("SHOULD_INTEREST >", value, "shouldInterest");
            return (Criteria) this;
        }

        public Criteria andShouldInterestGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_INTEREST >=", value, "shouldInterest");
            return (Criteria) this;
        }

        public Criteria andShouldInterestLessThan(Integer value) {
            addCriterion("SHOULD_INTEREST <", value, "shouldInterest");
            return (Criteria) this;
        }

        public Criteria andShouldInterestLessThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_INTEREST <=", value, "shouldInterest");
            return (Criteria) this;
        }

        public Criteria andShouldInterestIn(List<Integer> values) {
            addCriterion("SHOULD_INTEREST in", values, "shouldInterest");
            return (Criteria) this;
        }

        public Criteria andShouldInterestNotIn(List<Integer> values) {
            addCriterion("SHOULD_INTEREST not in", values, "shouldInterest");
            return (Criteria) this;
        }

        public Criteria andShouldInterestBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_INTEREST between", value1, value2, "shouldInterest");
            return (Criteria) this;
        }

        public Criteria andShouldInterestNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_INTEREST not between", value1, value2, "shouldInterest");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeIsNull() {
            addCriterion("SHOULD_INST_FEE is null");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeIsNotNull() {
            addCriterion("SHOULD_INST_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeEqualTo(Integer value) {
            addCriterion("SHOULD_INST_FEE =", value, "shouldInstFee");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeNotEqualTo(Integer value) {
            addCriterion("SHOULD_INST_FEE <>", value, "shouldInstFee");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeGreaterThan(Integer value) {
            addCriterion("SHOULD_INST_FEE >", value, "shouldInstFee");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_INST_FEE >=", value, "shouldInstFee");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeLessThan(Integer value) {
            addCriterion("SHOULD_INST_FEE <", value, "shouldInstFee");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeLessThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_INST_FEE <=", value, "shouldInstFee");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeIn(List<Integer> values) {
            addCriterion("SHOULD_INST_FEE in", values, "shouldInstFee");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeNotIn(List<Integer> values) {
            addCriterion("SHOULD_INST_FEE not in", values, "shouldInstFee");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_INST_FEE between", value1, value2, "shouldInstFee");
            return (Criteria) this;
        }

        public Criteria andShouldInstFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_INST_FEE not between", value1, value2, "shouldInstFee");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceIsNull() {
            addCriterion("SHOULD_AMERCE is null");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceIsNotNull() {
            addCriterion("SHOULD_AMERCE is not null");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceEqualTo(Integer value) {
            addCriterion("SHOULD_AMERCE =", value, "shouldAmerce");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceNotEqualTo(Integer value) {
            addCriterion("SHOULD_AMERCE <>", value, "shouldAmerce");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceGreaterThan(Integer value) {
            addCriterion("SHOULD_AMERCE >", value, "shouldAmerce");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_AMERCE >=", value, "shouldAmerce");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceLessThan(Integer value) {
            addCriterion("SHOULD_AMERCE <", value, "shouldAmerce");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceLessThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_AMERCE <=", value, "shouldAmerce");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceIn(List<Integer> values) {
            addCriterion("SHOULD_AMERCE in", values, "shouldAmerce");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceNotIn(List<Integer> values) {
            addCriterion("SHOULD_AMERCE not in", values, "shouldAmerce");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_AMERCE between", value1, value2, "shouldAmerce");
            return (Criteria) this;
        }

        public Criteria andShouldAmerceNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_AMERCE not between", value1, value2, "shouldAmerce");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitIsNull() {
            addCriterion("SHOULD_FORFEIT is null");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitIsNotNull() {
            addCriterion("SHOULD_FORFEIT is not null");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitEqualTo(Integer value) {
            addCriterion("SHOULD_FORFEIT =", value, "shouldForfeit");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitNotEqualTo(Integer value) {
            addCriterion("SHOULD_FORFEIT <>", value, "shouldForfeit");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitGreaterThan(Integer value) {
            addCriterion("SHOULD_FORFEIT >", value, "shouldForfeit");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_FORFEIT >=", value, "shouldForfeit");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitLessThan(Integer value) {
            addCriterion("SHOULD_FORFEIT <", value, "shouldForfeit");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitLessThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_FORFEIT <=", value, "shouldForfeit");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitIn(List<Integer> values) {
            addCriterion("SHOULD_FORFEIT in", values, "shouldForfeit");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitNotIn(List<Integer> values) {
            addCriterion("SHOULD_FORFEIT not in", values, "shouldForfeit");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_FORFEIT between", value1, value2, "shouldForfeit");
            return (Criteria) this;
        }

        public Criteria andShouldForfeitNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_FORFEIT not between", value1, value2, "shouldForfeit");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyIsNull() {
            addCriterion("should_penalty is null");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyIsNotNull() {
            addCriterion("should_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyEqualTo(Integer value) {
            addCriterion("should_penalty =", value, "shouldPenalty");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyNotEqualTo(Integer value) {
            addCriterion("should_penalty <>", value, "shouldPenalty");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyGreaterThan(Integer value) {
            addCriterion("should_penalty >", value, "shouldPenalty");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyGreaterThanOrEqualTo(Integer value) {
            addCriterion("should_penalty >=", value, "shouldPenalty");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyLessThan(Integer value) {
            addCriterion("should_penalty <", value, "shouldPenalty");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyLessThanOrEqualTo(Integer value) {
            addCriterion("should_penalty <=", value, "shouldPenalty");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyIn(List<Integer> values) {
            addCriterion("should_penalty in", values, "shouldPenalty");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyNotIn(List<Integer> values) {
            addCriterion("should_penalty not in", values, "shouldPenalty");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyBetween(Integer value1, Integer value2) {
            addCriterion("should_penalty between", value1, value2, "shouldPenalty");
            return (Criteria) this;
        }

        public Criteria andShouldPenaltyNotBetween(Integer value1, Integer value2) {
            addCriterion("should_penalty not between", value1, value2, "shouldPenalty");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeIsNull() {
            addCriterion("should_change_fee is null");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeIsNotNull() {
            addCriterion("should_change_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeEqualTo(Integer value) {
            addCriterion("should_change_fee =", value, "shouldChangeFee");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeNotEqualTo(Integer value) {
            addCriterion("should_change_fee <>", value, "shouldChangeFee");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeGreaterThan(Integer value) {
            addCriterion("should_change_fee >", value, "shouldChangeFee");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("should_change_fee >=", value, "shouldChangeFee");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeLessThan(Integer value) {
            addCriterion("should_change_fee <", value, "shouldChangeFee");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeLessThanOrEqualTo(Integer value) {
            addCriterion("should_change_fee <=", value, "shouldChangeFee");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeIn(List<Integer> values) {
            addCriterion("should_change_fee in", values, "shouldChangeFee");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeNotIn(List<Integer> values) {
            addCriterion("should_change_fee not in", values, "shouldChangeFee");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeBetween(Integer value1, Integer value2) {
            addCriterion("should_change_fee between", value1, value2, "shouldChangeFee");
            return (Criteria) this;
        }

        public Criteria andShouldChangeFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("should_change_fee not between", value1, value2, "shouldChangeFee");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeIsNull() {
            addCriterion("SHOULD_OTHER_FEE is null");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeIsNotNull() {
            addCriterion("SHOULD_OTHER_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeEqualTo(Integer value) {
            addCriterion("SHOULD_OTHER_FEE =", value, "shouldOtherFee");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeNotEqualTo(Integer value) {
            addCriterion("SHOULD_OTHER_FEE <>", value, "shouldOtherFee");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeGreaterThan(Integer value) {
            addCriterion("SHOULD_OTHER_FEE >", value, "shouldOtherFee");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_OTHER_FEE >=", value, "shouldOtherFee");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeLessThan(Integer value) {
            addCriterion("SHOULD_OTHER_FEE <", value, "shouldOtherFee");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeLessThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_OTHER_FEE <=", value, "shouldOtherFee");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeIn(List<Integer> values) {
            addCriterion("SHOULD_OTHER_FEE in", values, "shouldOtherFee");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeNotIn(List<Integer> values) {
            addCriterion("SHOULD_OTHER_FEE not in", values, "shouldOtherFee");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_OTHER_FEE between", value1, value2, "shouldOtherFee");
            return (Criteria) this;
        }

        public Criteria andShouldOtherFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_OTHER_FEE not between", value1, value2, "shouldOtherFee");
            return (Criteria) this;
        }

        public Criteria andShouldAmountIsNull() {
            addCriterion("SHOULD_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andShouldAmountIsNotNull() {
            addCriterion("SHOULD_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andShouldAmountEqualTo(Integer value) {
            addCriterion("SHOULD_AMOUNT =", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountNotEqualTo(Integer value) {
            addCriterion("SHOULD_AMOUNT <>", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountGreaterThan(Integer value) {
            addCriterion("SHOULD_AMOUNT >", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_AMOUNT >=", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountLessThan(Integer value) {
            addCriterion("SHOULD_AMOUNT <", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountLessThanOrEqualTo(Integer value) {
            addCriterion("SHOULD_AMOUNT <=", value, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountIn(List<Integer> values) {
            addCriterion("SHOULD_AMOUNT in", values, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountNotIn(List<Integer> values) {
            addCriterion("SHOULD_AMOUNT not in", values, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_AMOUNT between", value1, value2, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andShouldAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOULD_AMOUNT not between", value1, value2, "shouldAmount");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalIsNull() {
            addCriterion("INDEED_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalIsNotNull() {
            addCriterion("INDEED_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalEqualTo(Integer value) {
            addCriterion("INDEED_CAPITAL =", value, "indeedCapital");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalNotEqualTo(Integer value) {
            addCriterion("INDEED_CAPITAL <>", value, "indeedCapital");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalGreaterThan(Integer value) {
            addCriterion("INDEED_CAPITAL >", value, "indeedCapital");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("INDEED_CAPITAL >=", value, "indeedCapital");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalLessThan(Integer value) {
            addCriterion("INDEED_CAPITAL <", value, "indeedCapital");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("INDEED_CAPITAL <=", value, "indeedCapital");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalIn(List<Integer> values) {
            addCriterion("INDEED_CAPITAL in", values, "indeedCapital");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalNotIn(List<Integer> values) {
            addCriterion("INDEED_CAPITAL not in", values, "indeedCapital");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_CAPITAL between", value1, value2, "indeedCapital");
            return (Criteria) this;
        }

        public Criteria andIndeedCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_CAPITAL not between", value1, value2, "indeedCapital");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestIsNull() {
            addCriterion("INDEED_INTEREST is null");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestIsNotNull() {
            addCriterion("INDEED_INTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestEqualTo(Integer value) {
            addCriterion("INDEED_INTEREST =", value, "indeedInterest");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestNotEqualTo(Integer value) {
            addCriterion("INDEED_INTEREST <>", value, "indeedInterest");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestGreaterThan(Integer value) {
            addCriterion("INDEED_INTEREST >", value, "indeedInterest");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestGreaterThanOrEqualTo(Integer value) {
            addCriterion("INDEED_INTEREST >=", value, "indeedInterest");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestLessThan(Integer value) {
            addCriterion("INDEED_INTEREST <", value, "indeedInterest");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestLessThanOrEqualTo(Integer value) {
            addCriterion("INDEED_INTEREST <=", value, "indeedInterest");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestIn(List<Integer> values) {
            addCriterion("INDEED_INTEREST in", values, "indeedInterest");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestNotIn(List<Integer> values) {
            addCriterion("INDEED_INTEREST not in", values, "indeedInterest");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_INTEREST between", value1, value2, "indeedInterest");
            return (Criteria) this;
        }

        public Criteria andIndeedInterestNotBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_INTEREST not between", value1, value2, "indeedInterest");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeIsNull() {
            addCriterion("INDEED_INST_FEE is null");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeIsNotNull() {
            addCriterion("INDEED_INST_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeEqualTo(Integer value) {
            addCriterion("INDEED_INST_FEE =", value, "indeedInstFee");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeNotEqualTo(Integer value) {
            addCriterion("INDEED_INST_FEE <>", value, "indeedInstFee");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeGreaterThan(Integer value) {
            addCriterion("INDEED_INST_FEE >", value, "indeedInstFee");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("INDEED_INST_FEE >=", value, "indeedInstFee");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeLessThan(Integer value) {
            addCriterion("INDEED_INST_FEE <", value, "indeedInstFee");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeLessThanOrEqualTo(Integer value) {
            addCriterion("INDEED_INST_FEE <=", value, "indeedInstFee");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeIn(List<Integer> values) {
            addCriterion("INDEED_INST_FEE in", values, "indeedInstFee");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeNotIn(List<Integer> values) {
            addCriterion("INDEED_INST_FEE not in", values, "indeedInstFee");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_INST_FEE between", value1, value2, "indeedInstFee");
            return (Criteria) this;
        }

        public Criteria andIndeedInstFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_INST_FEE not between", value1, value2, "indeedInstFee");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceIsNull() {
            addCriterion("INDEED_AMERCE is null");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceIsNotNull() {
            addCriterion("INDEED_AMERCE is not null");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceEqualTo(Integer value) {
            addCriterion("INDEED_AMERCE =", value, "indeedAmerce");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceNotEqualTo(Integer value) {
            addCriterion("INDEED_AMERCE <>", value, "indeedAmerce");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceGreaterThan(Integer value) {
            addCriterion("INDEED_AMERCE >", value, "indeedAmerce");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceGreaterThanOrEqualTo(Integer value) {
            addCriterion("INDEED_AMERCE >=", value, "indeedAmerce");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceLessThan(Integer value) {
            addCriterion("INDEED_AMERCE <", value, "indeedAmerce");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceLessThanOrEqualTo(Integer value) {
            addCriterion("INDEED_AMERCE <=", value, "indeedAmerce");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceIn(List<Integer> values) {
            addCriterion("INDEED_AMERCE in", values, "indeedAmerce");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceNotIn(List<Integer> values) {
            addCriterion("INDEED_AMERCE not in", values, "indeedAmerce");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_AMERCE between", value1, value2, "indeedAmerce");
            return (Criteria) this;
        }

        public Criteria andIndeedAmerceNotBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_AMERCE not between", value1, value2, "indeedAmerce");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitIsNull() {
            addCriterion("INDEED_FORFEIT is null");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitIsNotNull() {
            addCriterion("INDEED_FORFEIT is not null");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitEqualTo(Integer value) {
            addCriterion("INDEED_FORFEIT =", value, "indeedForfeit");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitNotEqualTo(Integer value) {
            addCriterion("INDEED_FORFEIT <>", value, "indeedForfeit");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitGreaterThan(Integer value) {
            addCriterion("INDEED_FORFEIT >", value, "indeedForfeit");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitGreaterThanOrEqualTo(Integer value) {
            addCriterion("INDEED_FORFEIT >=", value, "indeedForfeit");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitLessThan(Integer value) {
            addCriterion("INDEED_FORFEIT <", value, "indeedForfeit");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitLessThanOrEqualTo(Integer value) {
            addCriterion("INDEED_FORFEIT <=", value, "indeedForfeit");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitIn(List<Integer> values) {
            addCriterion("INDEED_FORFEIT in", values, "indeedForfeit");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitNotIn(List<Integer> values) {
            addCriterion("INDEED_FORFEIT not in", values, "indeedForfeit");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_FORFEIT between", value1, value2, "indeedForfeit");
            return (Criteria) this;
        }

        public Criteria andIndeedForfeitNotBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_FORFEIT not between", value1, value2, "indeedForfeit");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyIsNull() {
            addCriterion("indeed_penalty is null");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyIsNotNull() {
            addCriterion("indeed_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyEqualTo(Integer value) {
            addCriterion("indeed_penalty =", value, "indeedPenalty");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyNotEqualTo(Integer value) {
            addCriterion("indeed_penalty <>", value, "indeedPenalty");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyGreaterThan(Integer value) {
            addCriterion("indeed_penalty >", value, "indeedPenalty");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyGreaterThanOrEqualTo(Integer value) {
            addCriterion("indeed_penalty >=", value, "indeedPenalty");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyLessThan(Integer value) {
            addCriterion("indeed_penalty <", value, "indeedPenalty");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyLessThanOrEqualTo(Integer value) {
            addCriterion("indeed_penalty <=", value, "indeedPenalty");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyIn(List<Integer> values) {
            addCriterion("indeed_penalty in", values, "indeedPenalty");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyNotIn(List<Integer> values) {
            addCriterion("indeed_penalty not in", values, "indeedPenalty");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyBetween(Integer value1, Integer value2) {
            addCriterion("indeed_penalty between", value1, value2, "indeedPenalty");
            return (Criteria) this;
        }

        public Criteria andIndeedPenaltyNotBetween(Integer value1, Integer value2) {
            addCriterion("indeed_penalty not between", value1, value2, "indeedPenalty");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeIsNull() {
            addCriterion("indeed_change_fee is null");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeIsNotNull() {
            addCriterion("indeed_change_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeEqualTo(Integer value) {
            addCriterion("indeed_change_fee =", value, "indeedChangeFee");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeNotEqualTo(Integer value) {
            addCriterion("indeed_change_fee <>", value, "indeedChangeFee");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeGreaterThan(Integer value) {
            addCriterion("indeed_change_fee >", value, "indeedChangeFee");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("indeed_change_fee >=", value, "indeedChangeFee");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeLessThan(Integer value) {
            addCriterion("indeed_change_fee <", value, "indeedChangeFee");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeLessThanOrEqualTo(Integer value) {
            addCriterion("indeed_change_fee <=", value, "indeedChangeFee");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeIn(List<Integer> values) {
            addCriterion("indeed_change_fee in", values, "indeedChangeFee");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeNotIn(List<Integer> values) {
            addCriterion("indeed_change_fee not in", values, "indeedChangeFee");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeBetween(Integer value1, Integer value2) {
            addCriterion("indeed_change_fee between", value1, value2, "indeedChangeFee");
            return (Criteria) this;
        }

        public Criteria andIndeedChangeFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("indeed_change_fee not between", value1, value2, "indeedChangeFee");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeIsNull() {
            addCriterion("indeed_OTHER_FEE is null");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeIsNotNull() {
            addCriterion("indeed_OTHER_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeEqualTo(Integer value) {
            addCriterion("indeed_OTHER_FEE =", value, "indeedOtherFee");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeNotEqualTo(Integer value) {
            addCriterion("indeed_OTHER_FEE <>", value, "indeedOtherFee");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeGreaterThan(Integer value) {
            addCriterion("indeed_OTHER_FEE >", value, "indeedOtherFee");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("indeed_OTHER_FEE >=", value, "indeedOtherFee");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeLessThan(Integer value) {
            addCriterion("indeed_OTHER_FEE <", value, "indeedOtherFee");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeLessThanOrEqualTo(Integer value) {
            addCriterion("indeed_OTHER_FEE <=", value, "indeedOtherFee");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeIn(List<Integer> values) {
            addCriterion("indeed_OTHER_FEE in", values, "indeedOtherFee");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeNotIn(List<Integer> values) {
            addCriterion("indeed_OTHER_FEE not in", values, "indeedOtherFee");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeBetween(Integer value1, Integer value2) {
            addCriterion("indeed_OTHER_FEE between", value1, value2, "indeedOtherFee");
            return (Criteria) this;
        }

        public Criteria andIndeedOtherFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("indeed_OTHER_FEE not between", value1, value2, "indeedOtherFee");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountIsNull() {
            addCriterion("INDEED_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountIsNotNull() {
            addCriterion("INDEED_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountEqualTo(Integer value) {
            addCriterion("INDEED_AMOUNT =", value, "indeedAmount");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountNotEqualTo(Integer value) {
            addCriterion("INDEED_AMOUNT <>", value, "indeedAmount");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountGreaterThan(Integer value) {
            addCriterion("INDEED_AMOUNT >", value, "indeedAmount");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("INDEED_AMOUNT >=", value, "indeedAmount");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountLessThan(Integer value) {
            addCriterion("INDEED_AMOUNT <", value, "indeedAmount");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountLessThanOrEqualTo(Integer value) {
            addCriterion("INDEED_AMOUNT <=", value, "indeedAmount");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountIn(List<Integer> values) {
            addCriterion("INDEED_AMOUNT in", values, "indeedAmount");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountNotIn(List<Integer> values) {
            addCriterion("INDEED_AMOUNT not in", values, "indeedAmount");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_AMOUNT between", value1, value2, "indeedAmount");
            return (Criteria) this;
        }

        public Criteria andIndeedAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("INDEED_AMOUNT not between", value1, value2, "indeedAmount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalIsNull() {
            addCriterion("reduce_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalIsNotNull() {
            addCriterion("reduce_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalEqualTo(Integer value) {
            addCriterion("reduce_CAPITAL =", value, "reduceCapital");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalNotEqualTo(Integer value) {
            addCriterion("reduce_CAPITAL <>", value, "reduceCapital");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalGreaterThan(Integer value) {
            addCriterion("reduce_CAPITAL >", value, "reduceCapital");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce_CAPITAL >=", value, "reduceCapital");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalLessThan(Integer value) {
            addCriterion("reduce_CAPITAL <", value, "reduceCapital");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("reduce_CAPITAL <=", value, "reduceCapital");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalIn(List<Integer> values) {
            addCriterion("reduce_CAPITAL in", values, "reduceCapital");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalNotIn(List<Integer> values) {
            addCriterion("reduce_CAPITAL not in", values, "reduceCapital");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalBetween(Integer value1, Integer value2) {
            addCriterion("reduce_CAPITAL between", value1, value2, "reduceCapital");
            return (Criteria) this;
        }

        public Criteria andReduceCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce_CAPITAL not between", value1, value2, "reduceCapital");
            return (Criteria) this;
        }

        public Criteria andReduceInterestIsNull() {
            addCriterion("reduce_INTEREST is null");
            return (Criteria) this;
        }

        public Criteria andReduceInterestIsNotNull() {
            addCriterion("reduce_INTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andReduceInterestEqualTo(Integer value) {
            addCriterion("reduce_INTEREST =", value, "reduceInterest");
            return (Criteria) this;
        }

        public Criteria andReduceInterestNotEqualTo(Integer value) {
            addCriterion("reduce_INTEREST <>", value, "reduceInterest");
            return (Criteria) this;
        }

        public Criteria andReduceInterestGreaterThan(Integer value) {
            addCriterion("reduce_INTEREST >", value, "reduceInterest");
            return (Criteria) this;
        }

        public Criteria andReduceInterestGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce_INTEREST >=", value, "reduceInterest");
            return (Criteria) this;
        }

        public Criteria andReduceInterestLessThan(Integer value) {
            addCriterion("reduce_INTEREST <", value, "reduceInterest");
            return (Criteria) this;
        }

        public Criteria andReduceInterestLessThanOrEqualTo(Integer value) {
            addCriterion("reduce_INTEREST <=", value, "reduceInterest");
            return (Criteria) this;
        }

        public Criteria andReduceInterestIn(List<Integer> values) {
            addCriterion("reduce_INTEREST in", values, "reduceInterest");
            return (Criteria) this;
        }

        public Criteria andReduceInterestNotIn(List<Integer> values) {
            addCriterion("reduce_INTEREST not in", values, "reduceInterest");
            return (Criteria) this;
        }

        public Criteria andReduceInterestBetween(Integer value1, Integer value2) {
            addCriterion("reduce_INTEREST between", value1, value2, "reduceInterest");
            return (Criteria) this;
        }

        public Criteria andReduceInterestNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce_INTEREST not between", value1, value2, "reduceInterest");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceIsNull() {
            addCriterion("reduce_AMERCE is null");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceIsNotNull() {
            addCriterion("reduce_AMERCE is not null");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceEqualTo(Integer value) {
            addCriterion("reduce_AMERCE =", value, "reduceAmerce");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceNotEqualTo(Integer value) {
            addCriterion("reduce_AMERCE <>", value, "reduceAmerce");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceGreaterThan(Integer value) {
            addCriterion("reduce_AMERCE >", value, "reduceAmerce");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce_AMERCE >=", value, "reduceAmerce");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceLessThan(Integer value) {
            addCriterion("reduce_AMERCE <", value, "reduceAmerce");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceLessThanOrEqualTo(Integer value) {
            addCriterion("reduce_AMERCE <=", value, "reduceAmerce");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceIn(List<Integer> values) {
            addCriterion("reduce_AMERCE in", values, "reduceAmerce");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceNotIn(List<Integer> values) {
            addCriterion("reduce_AMERCE not in", values, "reduceAmerce");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceBetween(Integer value1, Integer value2) {
            addCriterion("reduce_AMERCE between", value1, value2, "reduceAmerce");
            return (Criteria) this;
        }

        public Criteria andReduceAmerceNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce_AMERCE not between", value1, value2, "reduceAmerce");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitIsNull() {
            addCriterion("reduce_FORFEIT is null");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitIsNotNull() {
            addCriterion("reduce_FORFEIT is not null");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitEqualTo(Integer value) {
            addCriterion("reduce_FORFEIT =", value, "reduceForfeit");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitNotEqualTo(Integer value) {
            addCriterion("reduce_FORFEIT <>", value, "reduceForfeit");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitGreaterThan(Integer value) {
            addCriterion("reduce_FORFEIT >", value, "reduceForfeit");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce_FORFEIT >=", value, "reduceForfeit");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitLessThan(Integer value) {
            addCriterion("reduce_FORFEIT <", value, "reduceForfeit");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitLessThanOrEqualTo(Integer value) {
            addCriterion("reduce_FORFEIT <=", value, "reduceForfeit");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitIn(List<Integer> values) {
            addCriterion("reduce_FORFEIT in", values, "reduceForfeit");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitNotIn(List<Integer> values) {
            addCriterion("reduce_FORFEIT not in", values, "reduceForfeit");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitBetween(Integer value1, Integer value2) {
            addCriterion("reduce_FORFEIT between", value1, value2, "reduceForfeit");
            return (Criteria) this;
        }

        public Criteria andReduceForfeitNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce_FORFEIT not between", value1, value2, "reduceForfeit");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyIsNull() {
            addCriterion("reduce_penalty is null");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyIsNotNull() {
            addCriterion("reduce_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyEqualTo(Integer value) {
            addCriterion("reduce_penalty =", value, "reducePenalty");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyNotEqualTo(Integer value) {
            addCriterion("reduce_penalty <>", value, "reducePenalty");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyGreaterThan(Integer value) {
            addCriterion("reduce_penalty >", value, "reducePenalty");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce_penalty >=", value, "reducePenalty");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyLessThan(Integer value) {
            addCriterion("reduce_penalty <", value, "reducePenalty");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyLessThanOrEqualTo(Integer value) {
            addCriterion("reduce_penalty <=", value, "reducePenalty");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyIn(List<Integer> values) {
            addCriterion("reduce_penalty in", values, "reducePenalty");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyNotIn(List<Integer> values) {
            addCriterion("reduce_penalty not in", values, "reducePenalty");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyBetween(Integer value1, Integer value2) {
            addCriterion("reduce_penalty between", value1, value2, "reducePenalty");
            return (Criteria) this;
        }

        public Criteria andReducePenaltyNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce_penalty not between", value1, value2, "reducePenalty");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeIsNull() {
            addCriterion("reduce_INST_FEE is null");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeIsNotNull() {
            addCriterion("reduce_INST_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeEqualTo(Integer value) {
            addCriterion("reduce_INST_FEE =", value, "reduceInstFee");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeNotEqualTo(Integer value) {
            addCriterion("reduce_INST_FEE <>", value, "reduceInstFee");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeGreaterThan(Integer value) {
            addCriterion("reduce_INST_FEE >", value, "reduceInstFee");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce_INST_FEE >=", value, "reduceInstFee");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeLessThan(Integer value) {
            addCriterion("reduce_INST_FEE <", value, "reduceInstFee");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeLessThanOrEqualTo(Integer value) {
            addCriterion("reduce_INST_FEE <=", value, "reduceInstFee");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeIn(List<Integer> values) {
            addCriterion("reduce_INST_FEE in", values, "reduceInstFee");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeNotIn(List<Integer> values) {
            addCriterion("reduce_INST_FEE not in", values, "reduceInstFee");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeBetween(Integer value1, Integer value2) {
            addCriterion("reduce_INST_FEE between", value1, value2, "reduceInstFee");
            return (Criteria) this;
        }

        public Criteria andReduceInstFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce_INST_FEE not between", value1, value2, "reduceInstFee");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeIsNull() {
            addCriterion("reduce_PRE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeIsNotNull() {
            addCriterion("reduce_PRE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeEqualTo(Integer value) {
            addCriterion("reduce_PRE_FEE =", value, "reducePreFee");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeNotEqualTo(Integer value) {
            addCriterion("reduce_PRE_FEE <>", value, "reducePreFee");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeGreaterThan(Integer value) {
            addCriterion("reduce_PRE_FEE >", value, "reducePreFee");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce_PRE_FEE >=", value, "reducePreFee");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeLessThan(Integer value) {
            addCriterion("reduce_PRE_FEE <", value, "reducePreFee");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeLessThanOrEqualTo(Integer value) {
            addCriterion("reduce_PRE_FEE <=", value, "reducePreFee");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeIn(List<Integer> values) {
            addCriterion("reduce_PRE_FEE in", values, "reducePreFee");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeNotIn(List<Integer> values) {
            addCriterion("reduce_PRE_FEE not in", values, "reducePreFee");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeBetween(Integer value1, Integer value2) {
            addCriterion("reduce_PRE_FEE between", value1, value2, "reducePreFee");
            return (Criteria) this;
        }

        public Criteria andReducePreFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce_PRE_FEE not between", value1, value2, "reducePreFee");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeIsNull() {
            addCriterion("reduce_OTHER_FEE is null");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeIsNotNull() {
            addCriterion("reduce_OTHER_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeEqualTo(Integer value) {
            addCriterion("reduce_OTHER_FEE =", value, "reduceOtherFee");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeNotEqualTo(Integer value) {
            addCriterion("reduce_OTHER_FEE <>", value, "reduceOtherFee");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeGreaterThan(Integer value) {
            addCriterion("reduce_OTHER_FEE >", value, "reduceOtherFee");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce_OTHER_FEE >=", value, "reduceOtherFee");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeLessThan(Integer value) {
            addCriterion("reduce_OTHER_FEE <", value, "reduceOtherFee");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeLessThanOrEqualTo(Integer value) {
            addCriterion("reduce_OTHER_FEE <=", value, "reduceOtherFee");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeIn(List<Integer> values) {
            addCriterion("reduce_OTHER_FEE in", values, "reduceOtherFee");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeNotIn(List<Integer> values) {
            addCriterion("reduce_OTHER_FEE not in", values, "reduceOtherFee");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeBetween(Integer value1, Integer value2) {
            addCriterion("reduce_OTHER_FEE between", value1, value2, "reduceOtherFee");
            return (Criteria) this;
        }

        public Criteria andReduceOtherFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce_OTHER_FEE not between", value1, value2, "reduceOtherFee");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeIsNull() {
            addCriterion("data_create_type is null");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeIsNotNull() {
            addCriterion("data_create_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeEqualTo(String value) {
            addCriterion("data_create_type =", value, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeNotEqualTo(String value) {
            addCriterion("data_create_type <>", value, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeGreaterThan(String value) {
            addCriterion("data_create_type >", value, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_create_type >=", value, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeLessThan(String value) {
            addCriterion("data_create_type <", value, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeLessThanOrEqualTo(String value) {
            addCriterion("data_create_type <=", value, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeLike(String value) {
            addCriterion("data_create_type like", value, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeNotLike(String value) {
            addCriterion("data_create_type not like", value, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeIn(List<String> values) {
            addCriterion("data_create_type in", values, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeNotIn(List<String> values) {
            addCriterion("data_create_type not in", values, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeBetween(String value1, String value2) {
            addCriterion("data_create_type between", value1, value2, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andDataCreateTypeNotBetween(String value1, String value2) {
            addCriterion("data_create_type not between", value1, value2, "dataCreateType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeIsNull() {
            addCriterion("SPECIAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeIsNotNull() {
            addCriterion("SPECIAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeEqualTo(String value) {
            addCriterion("SPECIAL_CODE =", value, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeNotEqualTo(String value) {
            addCriterion("SPECIAL_CODE <>", value, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeGreaterThan(String value) {
            addCriterion("SPECIAL_CODE >", value, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIAL_CODE >=", value, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeLessThan(String value) {
            addCriterion("SPECIAL_CODE <", value, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeLessThanOrEqualTo(String value) {
            addCriterion("SPECIAL_CODE <=", value, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeLike(String value) {
            addCriterion("SPECIAL_CODE like", value, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeNotLike(String value) {
            addCriterion("SPECIAL_CODE not like", value, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeIn(List<String> values) {
            addCriterion("SPECIAL_CODE in", values, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeNotIn(List<String> values) {
            addCriterion("SPECIAL_CODE not in", values, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeBetween(String value1, String value2) {
            addCriterion("SPECIAL_CODE between", value1, value2, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSpecialCodeNotBetween(String value1, String value2) {
            addCriterion("SPECIAL_CODE not between", value1, value2, "specialCode");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT not between", value1, value2, "sort");
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
    }

    /**
     * 描述:nplm_repayment_detail表的实体类
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
     * nplm_repayment_detail 2018-09-17
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