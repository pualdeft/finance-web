package com.atguigu.finance.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverdueContractExample {
    /**
     * nplm_overdue_contract
     */
    protected String orderByClause;

    /**
     * nplm_overdue_contract
     */
    protected boolean distinct;

    /**
     * nplm_overdue_contract
     */
    protected List<Criteria> oredCriteria;

    public OverdueContractExample() {
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
     * nplm_overdue_contract 2018-09-17
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andLoanContractNumEqualTo(String value) {
            addCriterion("LOAN_CONTRACT_NUM =", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumNotEqualTo(String value) {
            addCriterion("LOAN_CONTRACT_NUM <>", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumGreaterThan(String value) {
            addCriterion("LOAN_CONTRACT_NUM >", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_CONTRACT_NUM >=", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumLessThan(String value) {
            addCriterion("LOAN_CONTRACT_NUM <", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumLessThanOrEqualTo(String value) {
            addCriterion("LOAN_CONTRACT_NUM <=", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumLike(String value) {
            addCriterion("LOAN_CONTRACT_NUM like", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumNotLike(String value) {
            addCriterion("LOAN_CONTRACT_NUM not like", value, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumIn(List<String> values) {
            addCriterion("LOAN_CONTRACT_NUM in", values, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumNotIn(List<String> values) {
            addCriterion("LOAN_CONTRACT_NUM not in", values, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumBetween(String value1, String value2) {
            addCriterion("LOAN_CONTRACT_NUM between", value1, value2, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andLoanContractNumNotBetween(String value1, String value2) {
            addCriterion("LOAN_CONTRACT_NUM not between", value1, value2, "loanContractNum");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusIsNull() {
            addCriterion("OVERDUE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusIsNotNull() {
            addCriterion("OVERDUE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusEqualTo(String value) {
            addCriterion("OVERDUE_STATUS =", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusNotEqualTo(String value) {
            addCriterion("OVERDUE_STATUS <>", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusGreaterThan(String value) {
            addCriterion("OVERDUE_STATUS >", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUE_STATUS >=", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusLessThan(String value) {
            addCriterion("OVERDUE_STATUS <", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusLessThanOrEqualTo(String value) {
            addCriterion("OVERDUE_STATUS <=", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusLike(String value) {
            addCriterion("OVERDUE_STATUS like", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusNotLike(String value) {
            addCriterion("OVERDUE_STATUS not like", value, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusIn(List<String> values) {
            addCriterion("OVERDUE_STATUS in", values, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusNotIn(List<String> values) {
            addCriterion("OVERDUE_STATUS not in", values, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusBetween(String value1, String value2) {
            addCriterion("OVERDUE_STATUS between", value1, value2, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusNotBetween(String value1, String value2) {
            addCriterion("OVERDUE_STATUS not between", value1, value2, "overdueStatus");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNull() {
            addCriterion("OVERDUE_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNotNull() {
            addCriterion("OVERDUE_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysEqualTo(Integer value) {
            addCriterion("OVERDUE_DAYS =", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotEqualTo(Integer value) {
            addCriterion("OVERDUE_DAYS <>", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThan(Integer value) {
            addCriterion("OVERDUE_DAYS >", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERDUE_DAYS >=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThan(Integer value) {
            addCriterion("OVERDUE_DAYS <", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("OVERDUE_DAYS <=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIn(List<Integer> values) {
            addCriterion("OVERDUE_DAYS in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotIn(List<Integer> values) {
            addCriterion("OVERDUE_DAYS not in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysBetween(Integer value1, Integer value2) {
            addCriterion("OVERDUE_DAYS between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERDUE_DAYS not between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntIsNull() {
            addCriterion("INSTALMENT_CNT is null");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntIsNotNull() {
            addCriterion("INSTALMENT_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntEqualTo(Integer value) {
            addCriterion("INSTALMENT_CNT =", value, "instalmentCnt");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntNotEqualTo(Integer value) {
            addCriterion("INSTALMENT_CNT <>", value, "instalmentCnt");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntGreaterThan(Integer value) {
            addCriterion("INSTALMENT_CNT >", value, "instalmentCnt");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("INSTALMENT_CNT >=", value, "instalmentCnt");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntLessThan(Integer value) {
            addCriterion("INSTALMENT_CNT <", value, "instalmentCnt");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntLessThanOrEqualTo(Integer value) {
            addCriterion("INSTALMENT_CNT <=", value, "instalmentCnt");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntIn(List<Integer> values) {
            addCriterion("INSTALMENT_CNT in", values, "instalmentCnt");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntNotIn(List<Integer> values) {
            addCriterion("INSTALMENT_CNT not in", values, "instalmentCnt");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntBetween(Integer value1, Integer value2) {
            addCriterion("INSTALMENT_CNT between", value1, value2, "instalmentCnt");
            return (Criteria) this;
        }

        public Criteria andInstalmentCntNotBetween(Integer value1, Integer value2) {
            addCriterion("INSTALMENT_CNT not between", value1, value2, "instalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllDaysIsNull() {
            addCriterion("ALL_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andAllDaysIsNotNull() {
            addCriterion("ALL_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andAllDaysEqualTo(Integer value) {
            addCriterion("ALL_DAYS =", value, "allDays");
            return (Criteria) this;
        }

        public Criteria andAllDaysNotEqualTo(Integer value) {
            addCriterion("ALL_DAYS <>", value, "allDays");
            return (Criteria) this;
        }

        public Criteria andAllDaysGreaterThan(Integer value) {
            addCriterion("ALL_DAYS >", value, "allDays");
            return (Criteria) this;
        }

        public Criteria andAllDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALL_DAYS >=", value, "allDays");
            return (Criteria) this;
        }

        public Criteria andAllDaysLessThan(Integer value) {
            addCriterion("ALL_DAYS <", value, "allDays");
            return (Criteria) this;
        }

        public Criteria andAllDaysLessThanOrEqualTo(Integer value) {
            addCriterion("ALL_DAYS <=", value, "allDays");
            return (Criteria) this;
        }

        public Criteria andAllDaysIn(List<Integer> values) {
            addCriterion("ALL_DAYS in", values, "allDays");
            return (Criteria) this;
        }

        public Criteria andAllDaysNotIn(List<Integer> values) {
            addCriterion("ALL_DAYS not in", values, "allDays");
            return (Criteria) this;
        }

        public Criteria andAllDaysBetween(Integer value1, Integer value2) {
            addCriterion("ALL_DAYS between", value1, value2, "allDays");
            return (Criteria) this;
        }

        public Criteria andAllDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("ALL_DAYS not between", value1, value2, "allDays");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntIsNull() {
            addCriterion("ALL_INSTALMENT_CNT is null");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntIsNotNull() {
            addCriterion("ALL_INSTALMENT_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntEqualTo(Integer value) {
            addCriterion("ALL_INSTALMENT_CNT =", value, "allInstalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntNotEqualTo(Integer value) {
            addCriterion("ALL_INSTALMENT_CNT <>", value, "allInstalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntGreaterThan(Integer value) {
            addCriterion("ALL_INSTALMENT_CNT >", value, "allInstalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALL_INSTALMENT_CNT >=", value, "allInstalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntLessThan(Integer value) {
            addCriterion("ALL_INSTALMENT_CNT <", value, "allInstalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntLessThanOrEqualTo(Integer value) {
            addCriterion("ALL_INSTALMENT_CNT <=", value, "allInstalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntIn(List<Integer> values) {
            addCriterion("ALL_INSTALMENT_CNT in", values, "allInstalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntNotIn(List<Integer> values) {
            addCriterion("ALL_INSTALMENT_CNT not in", values, "allInstalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntBetween(Integer value1, Integer value2) {
            addCriterion("ALL_INSTALMENT_CNT between", value1, value2, "allInstalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllInstalmentCntNotBetween(Integer value1, Integer value2) {
            addCriterion("ALL_INSTALMENT_CNT not between", value1, value2, "allInstalmentCnt");
            return (Criteria) this;
        }

        public Criteria andAllNumberIsNull() {
            addCriterion("ALL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAllNumberIsNotNull() {
            addCriterion("ALL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAllNumberEqualTo(Integer value) {
            addCriterion("ALL_NUMBER =", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberNotEqualTo(Integer value) {
            addCriterion("ALL_NUMBER <>", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberGreaterThan(Integer value) {
            addCriterion("ALL_NUMBER >", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALL_NUMBER >=", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberLessThan(Integer value) {
            addCriterion("ALL_NUMBER <", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ALL_NUMBER <=", value, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberIn(List<Integer> values) {
            addCriterion("ALL_NUMBER in", values, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberNotIn(List<Integer> values) {
            addCriterion("ALL_NUMBER not in", values, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberBetween(Integer value1, Integer value2) {
            addCriterion("ALL_NUMBER between", value1, value2, "allNumber");
            return (Criteria) this;
        }

        public Criteria andAllNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ALL_NUMBER not between", value1, value2, "allNumber");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestIsNull() {
            addCriterion("PRINCIPAL_INTEREST is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestIsNotNull() {
            addCriterion("PRINCIPAL_INTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestEqualTo(Integer value) {
            addCriterion("PRINCIPAL_INTEREST =", value, "principalInterest");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestNotEqualTo(Integer value) {
            addCriterion("PRINCIPAL_INTEREST <>", value, "principalInterest");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestGreaterThan(Integer value) {
            addCriterion("PRINCIPAL_INTEREST >", value, "principalInterest");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRINCIPAL_INTEREST >=", value, "principalInterest");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestLessThan(Integer value) {
            addCriterion("PRINCIPAL_INTEREST <", value, "principalInterest");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestLessThanOrEqualTo(Integer value) {
            addCriterion("PRINCIPAL_INTEREST <=", value, "principalInterest");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestIn(List<Integer> values) {
            addCriterion("PRINCIPAL_INTEREST in", values, "principalInterest");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestNotIn(List<Integer> values) {
            addCriterion("PRINCIPAL_INTEREST not in", values, "principalInterest");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestBetween(Integer value1, Integer value2) {
            addCriterion("PRINCIPAL_INTEREST between", value1, value2, "principalInterest");
            return (Criteria) this;
        }

        public Criteria andPrincipalInterestNotBetween(Integer value1, Integer value2) {
            addCriterion("PRINCIPAL_INTEREST not between", value1, value2, "principalInterest");
            return (Criteria) this;
        }

        public Criteria andAllForfeitIsNull() {
            addCriterion("ALL_FORFEIT is null");
            return (Criteria) this;
        }

        public Criteria andAllForfeitIsNotNull() {
            addCriterion("ALL_FORFEIT is not null");
            return (Criteria) this;
        }

        public Criteria andAllForfeitEqualTo(Integer value) {
            addCriterion("ALL_FORFEIT =", value, "allForfeit");
            return (Criteria) this;
        }

        public Criteria andAllForfeitNotEqualTo(Integer value) {
            addCriterion("ALL_FORFEIT <>", value, "allForfeit");
            return (Criteria) this;
        }

        public Criteria andAllForfeitGreaterThan(Integer value) {
            addCriterion("ALL_FORFEIT >", value, "allForfeit");
            return (Criteria) this;
        }

        public Criteria andAllForfeitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALL_FORFEIT >=", value, "allForfeit");
            return (Criteria) this;
        }

        public Criteria andAllForfeitLessThan(Integer value) {
            addCriterion("ALL_FORFEIT <", value, "allForfeit");
            return (Criteria) this;
        }

        public Criteria andAllForfeitLessThanOrEqualTo(Integer value) {
            addCriterion("ALL_FORFEIT <=", value, "allForfeit");
            return (Criteria) this;
        }

        public Criteria andAllForfeitIn(List<Integer> values) {
            addCriterion("ALL_FORFEIT in", values, "allForfeit");
            return (Criteria) this;
        }

        public Criteria andAllForfeitNotIn(List<Integer> values) {
            addCriterion("ALL_FORFEIT not in", values, "allForfeit");
            return (Criteria) this;
        }

        public Criteria andAllForfeitBetween(Integer value1, Integer value2) {
            addCriterion("ALL_FORFEIT between", value1, value2, "allForfeit");
            return (Criteria) this;
        }

        public Criteria andAllForfeitNotBetween(Integer value1, Integer value2) {
            addCriterion("ALL_FORFEIT not between", value1, value2, "allForfeit");
            return (Criteria) this;
        }

        public Criteria andAllAmerceIsNull() {
            addCriterion("ALL_AMERCE is null");
            return (Criteria) this;
        }

        public Criteria andAllAmerceIsNotNull() {
            addCriterion("ALL_AMERCE is not null");
            return (Criteria) this;
        }

        public Criteria andAllAmerceEqualTo(Integer value) {
            addCriterion("ALL_AMERCE =", value, "allAmerce");
            return (Criteria) this;
        }

        public Criteria andAllAmerceNotEqualTo(Integer value) {
            addCriterion("ALL_AMERCE <>", value, "allAmerce");
            return (Criteria) this;
        }

        public Criteria andAllAmerceGreaterThan(Integer value) {
            addCriterion("ALL_AMERCE >", value, "allAmerce");
            return (Criteria) this;
        }

        public Criteria andAllAmerceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALL_AMERCE >=", value, "allAmerce");
            return (Criteria) this;
        }

        public Criteria andAllAmerceLessThan(Integer value) {
            addCriterion("ALL_AMERCE <", value, "allAmerce");
            return (Criteria) this;
        }

        public Criteria andAllAmerceLessThanOrEqualTo(Integer value) {
            addCriterion("ALL_AMERCE <=", value, "allAmerce");
            return (Criteria) this;
        }

        public Criteria andAllAmerceIn(List<Integer> values) {
            addCriterion("ALL_AMERCE in", values, "allAmerce");
            return (Criteria) this;
        }

        public Criteria andAllAmerceNotIn(List<Integer> values) {
            addCriterion("ALL_AMERCE not in", values, "allAmerce");
            return (Criteria) this;
        }

        public Criteria andAllAmerceBetween(Integer value1, Integer value2) {
            addCriterion("ALL_AMERCE between", value1, value2, "allAmerce");
            return (Criteria) this;
        }

        public Criteria andAllAmerceNotBetween(Integer value1, Integer value2) {
            addCriterion("ALL_AMERCE not between", value1, value2, "allAmerce");
            return (Criteria) this;
        }

        public Criteria andAllShouldIsNull() {
            addCriterion("ALL_SHOULD is null");
            return (Criteria) this;
        }

        public Criteria andAllShouldIsNotNull() {
            addCriterion("ALL_SHOULD is not null");
            return (Criteria) this;
        }

        public Criteria andAllShouldEqualTo(Integer value) {
            addCriterion("ALL_SHOULD =", value, "allShould");
            return (Criteria) this;
        }

        public Criteria andAllShouldNotEqualTo(Integer value) {
            addCriterion("ALL_SHOULD <>", value, "allShould");
            return (Criteria) this;
        }

        public Criteria andAllShouldGreaterThan(Integer value) {
            addCriterion("ALL_SHOULD >", value, "allShould");
            return (Criteria) this;
        }

        public Criteria andAllShouldGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALL_SHOULD >=", value, "allShould");
            return (Criteria) this;
        }

        public Criteria andAllShouldLessThan(Integer value) {
            addCriterion("ALL_SHOULD <", value, "allShould");
            return (Criteria) this;
        }

        public Criteria andAllShouldLessThanOrEqualTo(Integer value) {
            addCriterion("ALL_SHOULD <=", value, "allShould");
            return (Criteria) this;
        }

        public Criteria andAllShouldIn(List<Integer> values) {
            addCriterion("ALL_SHOULD in", values, "allShould");
            return (Criteria) this;
        }

        public Criteria andAllShouldNotIn(List<Integer> values) {
            addCriterion("ALL_SHOULD not in", values, "allShould");
            return (Criteria) this;
        }

        public Criteria andAllShouldBetween(Integer value1, Integer value2) {
            addCriterion("ALL_SHOULD between", value1, value2, "allShould");
            return (Criteria) this;
        }

        public Criteria andAllShouldNotBetween(Integer value1, Integer value2) {
            addCriterion("ALL_SHOULD not between", value1, value2, "allShould");
            return (Criteria) this;
        }

        public Criteria andAllIndeedIsNull() {
            addCriterion("ALL_INDEED is null");
            return (Criteria) this;
        }

        public Criteria andAllIndeedIsNotNull() {
            addCriterion("ALL_INDEED is not null");
            return (Criteria) this;
        }

        public Criteria andAllIndeedEqualTo(Integer value) {
            addCriterion("ALL_INDEED =", value, "allIndeed");
            return (Criteria) this;
        }

        public Criteria andAllIndeedNotEqualTo(Integer value) {
            addCriterion("ALL_INDEED <>", value, "allIndeed");
            return (Criteria) this;
        }

        public Criteria andAllIndeedGreaterThan(Integer value) {
            addCriterion("ALL_INDEED >", value, "allIndeed");
            return (Criteria) this;
        }

        public Criteria andAllIndeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALL_INDEED >=", value, "allIndeed");
            return (Criteria) this;
        }

        public Criteria andAllIndeedLessThan(Integer value) {
            addCriterion("ALL_INDEED <", value, "allIndeed");
            return (Criteria) this;
        }

        public Criteria andAllIndeedLessThanOrEqualTo(Integer value) {
            addCriterion("ALL_INDEED <=", value, "allIndeed");
            return (Criteria) this;
        }

        public Criteria andAllIndeedIn(List<Integer> values) {
            addCriterion("ALL_INDEED in", values, "allIndeed");
            return (Criteria) this;
        }

        public Criteria andAllIndeedNotIn(List<Integer> values) {
            addCriterion("ALL_INDEED not in", values, "allIndeed");
            return (Criteria) this;
        }

        public Criteria andAllIndeedBetween(Integer value1, Integer value2) {
            addCriterion("ALL_INDEED between", value1, value2, "allIndeed");
            return (Criteria) this;
        }

        public Criteria andAllIndeedNotBetween(Integer value1, Integer value2) {
            addCriterion("ALL_INDEED not between", value1, value2, "allIndeed");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayIsNull() {
            addCriterion("CURRENT_REPAY is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayIsNotNull() {
            addCriterion("CURRENT_REPAY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayEqualTo(Integer value) {
            addCriterion("CURRENT_REPAY =", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayNotEqualTo(Integer value) {
            addCriterion("CURRENT_REPAY <>", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayGreaterThan(Integer value) {
            addCriterion("CURRENT_REPAY >", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayGreaterThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_REPAY >=", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayLessThan(Integer value) {
            addCriterion("CURRENT_REPAY <", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayLessThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_REPAY <=", value, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayIn(List<Integer> values) {
            addCriterion("CURRENT_REPAY in", values, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayNotIn(List<Integer> values) {
            addCriterion("CURRENT_REPAY not in", values, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_REPAY between", value1, value2, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andCurrentRepayNotBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_REPAY not between", value1, value2, "currentRepay");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountIsNull() {
            addCriterion("ALL_REPAYMENT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountIsNotNull() {
            addCriterion("ALL_REPAYMENT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountEqualTo(Integer value) {
            addCriterion("ALL_REPAYMENT_AMOUNT =", value, "allRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountNotEqualTo(Integer value) {
            addCriterion("ALL_REPAYMENT_AMOUNT <>", value, "allRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountGreaterThan(Integer value) {
            addCriterion("ALL_REPAYMENT_AMOUNT >", value, "allRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALL_REPAYMENT_AMOUNT >=", value, "allRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountLessThan(Integer value) {
            addCriterion("ALL_REPAYMENT_AMOUNT <", value, "allRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountLessThanOrEqualTo(Integer value) {
            addCriterion("ALL_REPAYMENT_AMOUNT <=", value, "allRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountIn(List<Integer> values) {
            addCriterion("ALL_REPAYMENT_AMOUNT in", values, "allRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountNotIn(List<Integer> values) {
            addCriterion("ALL_REPAYMENT_AMOUNT not in", values, "allRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountBetween(Integer value1, Integer value2) {
            addCriterion("ALL_REPAYMENT_AMOUNT between", value1, value2, "allRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andAllRepaymentAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("ALL_REPAYMENT_AMOUNT not between", value1, value2, "allRepaymentAmount");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNull() {
            addCriterion("FIRST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNotNull() {
            addCriterion("FIRST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDateEqualTo(String value) {
            addCriterion("FIRST_DATE =", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotEqualTo(String value) {
            addCriterion("FIRST_DATE <>", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThan(String value) {
            addCriterion("FIRST_DATE >", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_DATE >=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThan(String value) {
            addCriterion("FIRST_DATE <", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThanOrEqualTo(String value) {
            addCriterion("FIRST_DATE <=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLike(String value) {
            addCriterion("FIRST_DATE like", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotLike(String value) {
            addCriterion("FIRST_DATE not like", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateIn(List<String> values) {
            addCriterion("FIRST_DATE in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotIn(List<String> values) {
            addCriterion("FIRST_DATE not in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateBetween(String value1, String value2) {
            addCriterion("FIRST_DATE between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotBetween(String value1, String value2) {
            addCriterion("FIRST_DATE not between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("START_DATE like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("START_DATE not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateIsNull() {
            addCriterion("SERIAL_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateIsNotNull() {
            addCriterion("SERIAL_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateEqualTo(String value) {
            addCriterion("SERIAL_START_DATE =", value, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateNotEqualTo(String value) {
            addCriterion("SERIAL_START_DATE <>", value, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateGreaterThan(String value) {
            addCriterion("SERIAL_START_DATE >", value, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_START_DATE >=", value, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateLessThan(String value) {
            addCriterion("SERIAL_START_DATE <", value, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_START_DATE <=", value, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateLike(String value) {
            addCriterion("SERIAL_START_DATE like", value, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateNotLike(String value) {
            addCriterion("SERIAL_START_DATE not like", value, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateIn(List<String> values) {
            addCriterion("SERIAL_START_DATE in", values, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateNotIn(List<String> values) {
            addCriterion("SERIAL_START_DATE not in", values, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateBetween(String value1, String value2) {
            addCriterion("SERIAL_START_DATE between", value1, value2, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andSerialStartDateNotBetween(String value1, String value2) {
            addCriterion("SERIAL_START_DATE not between", value1, value2, "serialStartDate");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryIsNull() {
            addCriterion("OVERDUE_HISTORY is null");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryIsNotNull() {
            addCriterion("OVERDUE_HISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryEqualTo(String value) {
            addCriterion("OVERDUE_HISTORY =", value, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryNotEqualTo(String value) {
            addCriterion("OVERDUE_HISTORY <>", value, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryGreaterThan(String value) {
            addCriterion("OVERDUE_HISTORY >", value, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUE_HISTORY >=", value, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryLessThan(String value) {
            addCriterion("OVERDUE_HISTORY <", value, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryLessThanOrEqualTo(String value) {
            addCriterion("OVERDUE_HISTORY <=", value, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryLike(String value) {
            addCriterion("OVERDUE_HISTORY like", value, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryNotLike(String value) {
            addCriterion("OVERDUE_HISTORY not like", value, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryIn(List<String> values) {
            addCriterion("OVERDUE_HISTORY in", values, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryNotIn(List<String> values) {
            addCriterion("OVERDUE_HISTORY not in", values, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryBetween(String value1, String value2) {
            addCriterion("OVERDUE_HISTORY between", value1, value2, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andOverdueHistoryNotBetween(String value1, String value2) {
            addCriterion("OVERDUE_HISTORY not between", value1, value2, "overdueHistory");
            return (Criteria) this;
        }

        public Criteria andComputeDateIsNull() {
            addCriterion("COMPUTE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andComputeDateIsNotNull() {
            addCriterion("COMPUTE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andComputeDateEqualTo(String value) {
            addCriterion("COMPUTE_DATE =", value, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateNotEqualTo(String value) {
            addCriterion("COMPUTE_DATE <>", value, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateGreaterThan(String value) {
            addCriterion("COMPUTE_DATE >", value, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateGreaterThanOrEqualTo(String value) {
            addCriterion("COMPUTE_DATE >=", value, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateLessThan(String value) {
            addCriterion("COMPUTE_DATE <", value, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateLessThanOrEqualTo(String value) {
            addCriterion("COMPUTE_DATE <=", value, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateLike(String value) {
            addCriterion("COMPUTE_DATE like", value, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateNotLike(String value) {
            addCriterion("COMPUTE_DATE not like", value, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateIn(List<String> values) {
            addCriterion("COMPUTE_DATE in", values, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateNotIn(List<String> values) {
            addCriterion("COMPUTE_DATE not in", values, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateBetween(String value1, String value2) {
            addCriterion("COMPUTE_DATE between", value1, value2, "computeDate");
            return (Criteria) this;
        }

        public Criteria andComputeDateNotBetween(String value1, String value2) {
            addCriterion("COMPUTE_DATE not between", value1, value2, "computeDate");
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
     * 描述:nplm_overdue_contract表的实体类
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
     * nplm_overdue_contract 2018-09-17
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