package com.atguigu.finance.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepaymentRecordExample {
    /**
     * nplm_repayment_record
     */
    protected String orderByClause;

    /**
     * nplm_repayment_record
     */
    protected boolean distinct;

    /**
     * nplm_repayment_record
     */
    protected List<Criteria> oredCriteria;

    public RepaymentRecordExample() {
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
     * nplm_repayment_record 2018-09-17
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

        public Criteria andOverdueAmountIsNull() {
            addCriterion("OVERDUE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIsNotNull() {
            addCriterion("OVERDUE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountEqualTo(Integer value) {
            addCriterion("OVERDUE_AMOUNT =", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotEqualTo(Integer value) {
            addCriterion("OVERDUE_AMOUNT <>", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountGreaterThan(Integer value) {
            addCriterion("OVERDUE_AMOUNT >", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERDUE_AMOUNT >=", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountLessThan(Integer value) {
            addCriterion("OVERDUE_AMOUNT <", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountLessThanOrEqualTo(Integer value) {
            addCriterion("OVERDUE_AMOUNT <=", value, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountIn(List<Integer> values) {
            addCriterion("OVERDUE_AMOUNT in", values, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotIn(List<Integer> values) {
            addCriterion("OVERDUE_AMOUNT not in", values, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountBetween(Integer value1, Integer value2) {
            addCriterion("OVERDUE_AMOUNT between", value1, value2, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERDUE_AMOUNT not between", value1, value2, "overdueAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIsNull() {
            addCriterion("REPAYMENT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIsNotNull() {
            addCriterion("REPAYMENT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountEqualTo(Integer value) {
            addCriterion("REPAYMENT_AMOUNT =", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotEqualTo(Integer value) {
            addCriterion("REPAYMENT_AMOUNT <>", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountGreaterThan(Integer value) {
            addCriterion("REPAYMENT_AMOUNT >", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAYMENT_AMOUNT >=", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountLessThan(Integer value) {
            addCriterion("REPAYMENT_AMOUNT <", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountLessThanOrEqualTo(Integer value) {
            addCriterion("REPAYMENT_AMOUNT <=", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIn(List<Integer> values) {
            addCriterion("REPAYMENT_AMOUNT in", values, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotIn(List<Integer> values) {
            addCriterion("REPAYMENT_AMOUNT not in", values, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountBetween(Integer value1, Integer value2) {
            addCriterion("REPAYMENT_AMOUNT between", value1, value2, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAYMENT_AMOUNT not between", value1, value2, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountIsNull() {
            addCriterion("SUCCESS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountIsNotNull() {
            addCriterion("SUCCESS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountEqualTo(Integer value) {
            addCriterion("SUCCESS_AMOUNT =", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountNotEqualTo(Integer value) {
            addCriterion("SUCCESS_AMOUNT <>", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountGreaterThan(Integer value) {
            addCriterion("SUCCESS_AMOUNT >", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUCCESS_AMOUNT >=", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountLessThan(Integer value) {
            addCriterion("SUCCESS_AMOUNT <", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountLessThanOrEqualTo(Integer value) {
            addCriterion("SUCCESS_AMOUNT <=", value, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountIn(List<Integer> values) {
            addCriterion("SUCCESS_AMOUNT in", values, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountNotIn(List<Integer> values) {
            addCriterion("SUCCESS_AMOUNT not in", values, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountBetween(Integer value1, Integer value2) {
            addCriterion("SUCCESS_AMOUNT between", value1, value2, "successAmount");
            return (Criteria) this;
        }

        public Criteria andSuccessAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("SUCCESS_AMOUNT not between", value1, value2, "successAmount");
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

        public Criteria andReserveTimeIsNull() {
            addCriterion("RESERVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReserveTimeIsNotNull() {
            addCriterion("RESERVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReserveTimeEqualTo(Date value) {
            addCriterion("RESERVE_TIME =", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeNotEqualTo(Date value) {
            addCriterion("RESERVE_TIME <>", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeGreaterThan(Date value) {
            addCriterion("RESERVE_TIME >", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RESERVE_TIME >=", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeLessThan(Date value) {
            addCriterion("RESERVE_TIME <", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeLessThanOrEqualTo(Date value) {
            addCriterion("RESERVE_TIME <=", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeIn(List<Date> values) {
            addCriterion("RESERVE_TIME in", values, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeNotIn(List<Date> values) {
            addCriterion("RESERVE_TIME not in", values, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeBetween(Date value1, Date value2) {
            addCriterion("RESERVE_TIME between", value1, value2, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeNotBetween(Date value1, Date value2) {
            addCriterion("RESERVE_TIME not between", value1, value2, "reserveTime");
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

        public Criteria andAccountNameIsNull() {
            addCriterion("ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("ACCOUNT_NAME =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("ACCOUNT_NAME >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("ACCOUNT_NAME <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("ACCOUNT_NAME like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("ACCOUNT_NAME not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("ACCOUNT_NAME in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("ACCOUNT_NAME not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeIsNull() {
            addCriterion("ACCT_IDEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeIsNotNull() {
            addCriterion("ACCT_IDEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeEqualTo(String value) {
            addCriterion("ACCT_IDEN_TYPE =", value, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeNotEqualTo(String value) {
            addCriterion("ACCT_IDEN_TYPE <>", value, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeGreaterThan(String value) {
            addCriterion("ACCT_IDEN_TYPE >", value, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_IDEN_TYPE >=", value, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeLessThan(String value) {
            addCriterion("ACCT_IDEN_TYPE <", value, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCT_IDEN_TYPE <=", value, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeLike(String value) {
            addCriterion("ACCT_IDEN_TYPE like", value, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeNotLike(String value) {
            addCriterion("ACCT_IDEN_TYPE not like", value, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeIn(List<String> values) {
            addCriterion("ACCT_IDEN_TYPE in", values, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeNotIn(List<String> values) {
            addCriterion("ACCT_IDEN_TYPE not in", values, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeBetween(String value1, String value2) {
            addCriterion("ACCT_IDEN_TYPE between", value1, value2, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenTypeNotBetween(String value1, String value2) {
            addCriterion("ACCT_IDEN_TYPE not between", value1, value2, "acctIdenType");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumIsNull() {
            addCriterion("ACCT_IDEN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumIsNotNull() {
            addCriterion("ACCT_IDEN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumEqualTo(String value) {
            addCriterion("ACCT_IDEN_NUM =", value, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumNotEqualTo(String value) {
            addCriterion("ACCT_IDEN_NUM <>", value, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumGreaterThan(String value) {
            addCriterion("ACCT_IDEN_NUM >", value, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_IDEN_NUM >=", value, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumLessThan(String value) {
            addCriterion("ACCT_IDEN_NUM <", value, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumLessThanOrEqualTo(String value) {
            addCriterion("ACCT_IDEN_NUM <=", value, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumLike(String value) {
            addCriterion("ACCT_IDEN_NUM like", value, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumNotLike(String value) {
            addCriterion("ACCT_IDEN_NUM not like", value, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumIn(List<String> values) {
            addCriterion("ACCT_IDEN_NUM in", values, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumNotIn(List<String> values) {
            addCriterion("ACCT_IDEN_NUM not in", values, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumBetween(String value1, String value2) {
            addCriterion("ACCT_IDEN_NUM between", value1, value2, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAcctIdenNumNotBetween(String value1, String value2) {
            addCriterion("ACCT_IDEN_NUM not between", value1, value2, "acctIdenNum");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("ACCOUNT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("ACCOUNT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("ACCOUNT_NO =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("ACCOUNT_NO <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("ACCOUNT_NO >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NO >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("ACCOUNT_NO <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NO <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("ACCOUNT_NO like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("ACCOUNT_NO not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("ACCOUNT_NO in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("ACCOUNT_NO not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NO between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NO not between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("ACCOUNT_TYPE >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("ACCOUNT_TYPE <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("ACCOUNT_TYPE like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("ACCOUNT_TYPE not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("ACCOUNT_TYPE in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("ACCOUNT_TYPE not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("ACCOUNT_TYPE between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_TYPE not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountBankidIsNull() {
            addCriterion("ACCOUNT_BANKID is null");
            return (Criteria) this;
        }

        public Criteria andAccountBankidIsNotNull() {
            addCriterion("ACCOUNT_BANKID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBankidEqualTo(String value) {
            addCriterion("ACCOUNT_BANKID =", value, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidNotEqualTo(String value) {
            addCriterion("ACCOUNT_BANKID <>", value, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidGreaterThan(String value) {
            addCriterion("ACCOUNT_BANKID >", value, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BANKID >=", value, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidLessThan(String value) {
            addCriterion("ACCOUNT_BANKID <", value, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BANKID <=", value, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidLike(String value) {
            addCriterion("ACCOUNT_BANKID like", value, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidNotLike(String value) {
            addCriterion("ACCOUNT_BANKID not like", value, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidIn(List<String> values) {
            addCriterion("ACCOUNT_BANKID in", values, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidNotIn(List<String> values) {
            addCriterion("ACCOUNT_BANKID not in", values, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BANKID between", value1, value2, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBankidNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BANKID not between", value1, value2, "accountBankid");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoIsNull() {
            addCriterion("ACCOUNT_BRANCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoIsNotNull() {
            addCriterion("ACCOUNT_BRANCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoEqualTo(String value) {
            addCriterion("ACCOUNT_BRANCH_NO =", value, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoNotEqualTo(String value) {
            addCriterion("ACCOUNT_BRANCH_NO <>", value, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoGreaterThan(String value) {
            addCriterion("ACCOUNT_BRANCH_NO >", value, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BRANCH_NO >=", value, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoLessThan(String value) {
            addCriterion("ACCOUNT_BRANCH_NO <", value, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BRANCH_NO <=", value, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoLike(String value) {
            addCriterion("ACCOUNT_BRANCH_NO like", value, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoNotLike(String value) {
            addCriterion("ACCOUNT_BRANCH_NO not like", value, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoIn(List<String> values) {
            addCriterion("ACCOUNT_BRANCH_NO in", values, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoNotIn(List<String> values) {
            addCriterion("ACCOUNT_BRANCH_NO not in", values, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BRANCH_NO between", value1, value2, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBranchNoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BRANCH_NO not between", value1, value2, "accountBranchNo");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameIsNull() {
            addCriterion("ACCOUNT_BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameIsNotNull() {
            addCriterion("ACCOUNT_BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameEqualTo(String value) {
            addCriterion("ACCOUNT_BANK_NAME =", value, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameNotEqualTo(String value) {
            addCriterion("ACCOUNT_BANK_NAME <>", value, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameGreaterThan(String value) {
            addCriterion("ACCOUNT_BANK_NAME >", value, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BANK_NAME >=", value, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameLessThan(String value) {
            addCriterion("ACCOUNT_BANK_NAME <", value, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BANK_NAME <=", value, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameLike(String value) {
            addCriterion("ACCOUNT_BANK_NAME like", value, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameNotLike(String value) {
            addCriterion("ACCOUNT_BANK_NAME not like", value, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameIn(List<String> values) {
            addCriterion("ACCOUNT_BANK_NAME in", values, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameNotIn(List<String> values) {
            addCriterion("ACCOUNT_BANK_NAME not in", values, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BANK_NAME between", value1, value2, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andAccountBankNameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BANK_NAME not between", value1, value2, "accountBankName");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateIsNull() {
            addCriterion("PUBLIC_PRIVATE is null");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateIsNotNull() {
            addCriterion("PUBLIC_PRIVATE is not null");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateEqualTo(String value) {
            addCriterion("PUBLIC_PRIVATE =", value, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateNotEqualTo(String value) {
            addCriterion("PUBLIC_PRIVATE <>", value, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateGreaterThan(String value) {
            addCriterion("PUBLIC_PRIVATE >", value, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_PRIVATE >=", value, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateLessThan(String value) {
            addCriterion("PUBLIC_PRIVATE <", value, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_PRIVATE <=", value, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateLike(String value) {
            addCriterion("PUBLIC_PRIVATE like", value, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateNotLike(String value) {
            addCriterion("PUBLIC_PRIVATE not like", value, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateIn(List<String> values) {
            addCriterion("PUBLIC_PRIVATE in", values, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateNotIn(List<String> values) {
            addCriterion("PUBLIC_PRIVATE not in", values, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateBetween(String value1, String value2) {
            addCriterion("PUBLIC_PRIVATE between", value1, value2, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_PRIVATE not between", value1, value2, "publicPrivate");
            return (Criteria) this;
        }

        public Criteria andActProvinceIsNull() {
            addCriterion("ACT_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andActProvinceIsNotNull() {
            addCriterion("ACT_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andActProvinceEqualTo(String value) {
            addCriterion("ACT_PROVINCE =", value, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceNotEqualTo(String value) {
            addCriterion("ACT_PROVINCE <>", value, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceGreaterThan(String value) {
            addCriterion("ACT_PROVINCE >", value, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_PROVINCE >=", value, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceLessThan(String value) {
            addCriterion("ACT_PROVINCE <", value, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceLessThanOrEqualTo(String value) {
            addCriterion("ACT_PROVINCE <=", value, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceLike(String value) {
            addCriterion("ACT_PROVINCE like", value, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceNotLike(String value) {
            addCriterion("ACT_PROVINCE not like", value, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceIn(List<String> values) {
            addCriterion("ACT_PROVINCE in", values, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceNotIn(List<String> values) {
            addCriterion("ACT_PROVINCE not in", values, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceBetween(String value1, String value2) {
            addCriterion("ACT_PROVINCE between", value1, value2, "actProvince");
            return (Criteria) this;
        }

        public Criteria andActProvinceNotBetween(String value1, String value2) {
            addCriterion("ACT_PROVINCE not between", value1, value2, "actProvince");
            return (Criteria) this;
        }

        public Criteria andAccountCityIsNull() {
            addCriterion("ACCOUNT_CITY is null");
            return (Criteria) this;
        }

        public Criteria andAccountCityIsNotNull() {
            addCriterion("ACCOUNT_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCityEqualTo(String value) {
            addCriterion("ACCOUNT_CITY =", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityNotEqualTo(String value) {
            addCriterion("ACCOUNT_CITY <>", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityGreaterThan(String value) {
            addCriterion("ACCOUNT_CITY >", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_CITY >=", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityLessThan(String value) {
            addCriterion("ACCOUNT_CITY <", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_CITY <=", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityLike(String value) {
            addCriterion("ACCOUNT_CITY like", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityNotLike(String value) {
            addCriterion("ACCOUNT_CITY not like", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityIn(List<String> values) {
            addCriterion("ACCOUNT_CITY in", values, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityNotIn(List<String> values) {
            addCriterion("ACCOUNT_CITY not in", values, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityBetween(String value1, String value2) {
            addCriterion("ACCOUNT_CITY between", value1, value2, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_CITY not between", value1, value2, "accountCity");
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
     * 描述:nplm_repayment_record表的实体类
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
     * nplm_repayment_record 2018-09-17
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