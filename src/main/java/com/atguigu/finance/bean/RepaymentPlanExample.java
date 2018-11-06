package com.atguigu.finance.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepaymentPlanExample {
    /**
     * nplm_repayment_plan
     */
    protected String orderByClause;

    /**
     * nplm_repayment_plan
     */
    protected boolean distinct;

    /**
     * nplm_repayment_plan
     */
    protected List<Criteria> oredCriteria;

    public RepaymentPlanExample() {
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
     * nplm_repayment_plan 2018-09-17
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

        public Criteria andPreRepaymentDateIsNull() {
            addCriterion("PRE_REPAYMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateIsNotNull() {
            addCriterion("PRE_REPAYMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("PRE_REPAYMENT_DATE =", value, "preRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PRE_REPAYMENT_DATE <>", value, "preRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PRE_REPAYMENT_DATE >", value, "preRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRE_REPAYMENT_DATE >=", value, "preRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("PRE_REPAYMENT_DATE <", value, "preRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRE_REPAYMENT_DATE <=", value, "preRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("PRE_REPAYMENT_DATE in", values, "preRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PRE_REPAYMENT_DATE not in", values, "preRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRE_REPAYMENT_DATE between", value1, value2, "preRepaymentDate");
            return (Criteria) this;
        }

        public Criteria andPreRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRE_REPAYMENT_DATE not between", value1, value2, "preRepaymentDate");
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

        public Criteria andCapitalIsNull() {
            addCriterion("CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(Integer value) {
            addCriterion("CAPITAL =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(Integer value) {
            addCriterion("CAPITAL <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(Integer value) {
            addCriterion("CAPITAL >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAPITAL >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(Integer value) {
            addCriterion("CAPITAL <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("CAPITAL <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<Integer> values) {
            addCriterion("CAPITAL in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<Integer> values) {
            addCriterion("CAPITAL not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(Integer value1, Integer value2) {
            addCriterion("CAPITAL between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("CAPITAL not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("INTEREST is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("INTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(Integer value) {
            addCriterion("INTEREST =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(Integer value) {
            addCriterion("INTEREST <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(Integer value) {
            addCriterion("INTEREST >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(Integer value) {
            addCriterion("INTEREST >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(Integer value) {
            addCriterion("INTEREST <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(Integer value) {
            addCriterion("INTEREST <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<Integer> values) {
            addCriterion("INTEREST in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<Integer> values) {
            addCriterion("INTEREST not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(Integer value1, Integer value2) {
            addCriterion("INTEREST between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(Integer value1, Integer value2) {
            addCriterion("INTEREST not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeIsNull() {
            addCriterion("INSTALLMENT_FEE is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeIsNotNull() {
            addCriterion("INSTALLMENT_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeEqualTo(Integer value) {
            addCriterion("INSTALLMENT_FEE =", value, "installmentFee");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeNotEqualTo(Integer value) {
            addCriterion("INSTALLMENT_FEE <>", value, "installmentFee");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeGreaterThan(Integer value) {
            addCriterion("INSTALLMENT_FEE >", value, "installmentFee");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("INSTALLMENT_FEE >=", value, "installmentFee");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeLessThan(Integer value) {
            addCriterion("INSTALLMENT_FEE <", value, "installmentFee");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeLessThanOrEqualTo(Integer value) {
            addCriterion("INSTALLMENT_FEE <=", value, "installmentFee");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeIn(List<Integer> values) {
            addCriterion("INSTALLMENT_FEE in", values, "installmentFee");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeNotIn(List<Integer> values) {
            addCriterion("INSTALLMENT_FEE not in", values, "installmentFee");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBetween(Integer value1, Integer value2) {
            addCriterion("INSTALLMENT_FEE between", value1, value2, "installmentFee");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("INSTALLMENT_FEE not between", value1, value2, "installmentFee");
            return (Criteria) this;
        }

        public Criteria andAmerceIsNull() {
            addCriterion("AMERCE is null");
            return (Criteria) this;
        }

        public Criteria andAmerceIsNotNull() {
            addCriterion("AMERCE is not null");
            return (Criteria) this;
        }

        public Criteria andAmerceEqualTo(Integer value) {
            addCriterion("AMERCE =", value, "amerce");
            return (Criteria) this;
        }

        public Criteria andAmerceNotEqualTo(Integer value) {
            addCriterion("AMERCE <>", value, "amerce");
            return (Criteria) this;
        }

        public Criteria andAmerceGreaterThan(Integer value) {
            addCriterion("AMERCE >", value, "amerce");
            return (Criteria) this;
        }

        public Criteria andAmerceGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMERCE >=", value, "amerce");
            return (Criteria) this;
        }

        public Criteria andAmerceLessThan(Integer value) {
            addCriterion("AMERCE <", value, "amerce");
            return (Criteria) this;
        }

        public Criteria andAmerceLessThanOrEqualTo(Integer value) {
            addCriterion("AMERCE <=", value, "amerce");
            return (Criteria) this;
        }

        public Criteria andAmerceIn(List<Integer> values) {
            addCriterion("AMERCE in", values, "amerce");
            return (Criteria) this;
        }

        public Criteria andAmerceNotIn(List<Integer> values) {
            addCriterion("AMERCE not in", values, "amerce");
            return (Criteria) this;
        }

        public Criteria andAmerceBetween(Integer value1, Integer value2) {
            addCriterion("AMERCE between", value1, value2, "amerce");
            return (Criteria) this;
        }

        public Criteria andAmerceNotBetween(Integer value1, Integer value2) {
            addCriterion("AMERCE not between", value1, value2, "amerce");
            return (Criteria) this;
        }

        public Criteria andForfeitIsNull() {
            addCriterion("FORFEIT is null");
            return (Criteria) this;
        }

        public Criteria andForfeitIsNotNull() {
            addCriterion("FORFEIT is not null");
            return (Criteria) this;
        }

        public Criteria andForfeitEqualTo(Integer value) {
            addCriterion("FORFEIT =", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitNotEqualTo(Integer value) {
            addCriterion("FORFEIT <>", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitGreaterThan(Integer value) {
            addCriterion("FORFEIT >", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitGreaterThanOrEqualTo(Integer value) {
            addCriterion("FORFEIT >=", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitLessThan(Integer value) {
            addCriterion("FORFEIT <", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitLessThanOrEqualTo(Integer value) {
            addCriterion("FORFEIT <=", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitIn(List<Integer> values) {
            addCriterion("FORFEIT in", values, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitNotIn(List<Integer> values) {
            addCriterion("FORFEIT not in", values, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitBetween(Integer value1, Integer value2) {
            addCriterion("FORFEIT between", value1, value2, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitNotBetween(Integer value1, Integer value2) {
            addCriterion("FORFEIT not between", value1, value2, "forfeit");
            return (Criteria) this;
        }

        public Criteria andPenaltyIsNull() {
            addCriterion("PENALTY is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyIsNotNull() {
            addCriterion("PENALTY is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyEqualTo(Integer value) {
            addCriterion("PENALTY =", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyNotEqualTo(Integer value) {
            addCriterion("PENALTY <>", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyGreaterThan(Integer value) {
            addCriterion("PENALTY >", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PENALTY >=", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyLessThan(Integer value) {
            addCriterion("PENALTY <", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyLessThanOrEqualTo(Integer value) {
            addCriterion("PENALTY <=", value, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyIn(List<Integer> values) {
            addCriterion("PENALTY in", values, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyNotIn(List<Integer> values) {
            addCriterion("PENALTY not in", values, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyBetween(Integer value1, Integer value2) {
            addCriterion("PENALTY between", value1, value2, "penalty");
            return (Criteria) this;
        }

        public Criteria andPenaltyNotBetween(Integer value1, Integer value2) {
            addCriterion("PENALTY not between", value1, value2, "penalty");
            return (Criteria) this;
        }

        public Criteria andChangeFeeIsNull() {
            addCriterion("change_fee is null");
            return (Criteria) this;
        }

        public Criteria andChangeFeeIsNotNull() {
            addCriterion("change_fee is not null");
            return (Criteria) this;
        }

        public Criteria andChangeFeeEqualTo(Integer value) {
            addCriterion("change_fee =", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeNotEqualTo(Integer value) {
            addCriterion("change_fee <>", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeGreaterThan(Integer value) {
            addCriterion("change_fee >", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_fee >=", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeLessThan(Integer value) {
            addCriterion("change_fee <", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeLessThanOrEqualTo(Integer value) {
            addCriterion("change_fee <=", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeIn(List<Integer> values) {
            addCriterion("change_fee in", values, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeNotIn(List<Integer> values) {
            addCriterion("change_fee not in", values, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeBetween(Integer value1, Integer value2) {
            addCriterion("change_fee between", value1, value2, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("change_fee not between", value1, value2, "changeFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNull() {
            addCriterion("OTHER_FEE is null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNotNull() {
            addCriterion("OTHER_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeEqualTo(Integer value) {
            addCriterion("OTHER_FEE =", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotEqualTo(Integer value) {
            addCriterion("OTHER_FEE <>", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThan(Integer value) {
            addCriterion("OTHER_FEE >", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OTHER_FEE >=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThan(Integer value) {
            addCriterion("OTHER_FEE <", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThanOrEqualTo(Integer value) {
            addCriterion("OTHER_FEE <=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIn(List<Integer> values) {
            addCriterion("OTHER_FEE in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotIn(List<Integer> values) {
            addCriterion("OTHER_FEE not in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeBetween(Integer value1, Integer value2) {
            addCriterion("OTHER_FEE between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("OTHER_FEE not between", value1, value2, "otherFee");
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

        public Criteria andRemainCapitalIsNull() {
            addCriterion("REMAIN_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalIsNotNull() {
            addCriterion("REMAIN_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalEqualTo(Integer value) {
            addCriterion("REMAIN_CAPITAL =", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalNotEqualTo(Integer value) {
            addCriterion("REMAIN_CAPITAL <>", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalGreaterThan(Integer value) {
            addCriterion("REMAIN_CAPITAL >", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("REMAIN_CAPITAL >=", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalLessThan(Integer value) {
            addCriterion("REMAIN_CAPITAL <", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("REMAIN_CAPITAL <=", value, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalIn(List<Integer> values) {
            addCriterion("REMAIN_CAPITAL in", values, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalNotIn(List<Integer> values) {
            addCriterion("REMAIN_CAPITAL not in", values, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalBetween(Integer value1, Integer value2) {
            addCriterion("REMAIN_CAPITAL between", value1, value2, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andRemainCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("REMAIN_CAPITAL not between", value1, value2, "remainCapital");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalIsNull() {
            addCriterion("NPV_remain_capital is null");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalIsNotNull() {
            addCriterion("NPV_remain_capital is not null");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalEqualTo(Integer value) {
            addCriterion("NPV_remain_capital =", value, "npvRemainCapital");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalNotEqualTo(Integer value) {
            addCriterion("NPV_remain_capital <>", value, "npvRemainCapital");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalGreaterThan(Integer value) {
            addCriterion("NPV_remain_capital >", value, "npvRemainCapital");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("NPV_remain_capital >=", value, "npvRemainCapital");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalLessThan(Integer value) {
            addCriterion("NPV_remain_capital <", value, "npvRemainCapital");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("NPV_remain_capital <=", value, "npvRemainCapital");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalIn(List<Integer> values) {
            addCriterion("NPV_remain_capital in", values, "npvRemainCapital");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalNotIn(List<Integer> values) {
            addCriterion("NPV_remain_capital not in", values, "npvRemainCapital");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalBetween(Integer value1, Integer value2) {
            addCriterion("NPV_remain_capital between", value1, value2, "npvRemainCapital");
            return (Criteria) this;
        }

        public Criteria andNpvRemainCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("NPV_remain_capital not between", value1, value2, "npvRemainCapital");
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

        public Criteria andRepaymentStateIsNull() {
            addCriterion("REPAYMENT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateIsNotNull() {
            addCriterion("REPAYMENT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateEqualTo(String value) {
            addCriterion("REPAYMENT_STATE =", value, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateNotEqualTo(String value) {
            addCriterion("REPAYMENT_STATE <>", value, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateGreaterThan(String value) {
            addCriterion("REPAYMENT_STATE >", value, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENT_STATE >=", value, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateLessThan(String value) {
            addCriterion("REPAYMENT_STATE <", value, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENT_STATE <=", value, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateLike(String value) {
            addCriterion("REPAYMENT_STATE like", value, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateNotLike(String value) {
            addCriterion("REPAYMENT_STATE not like", value, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateIn(List<String> values) {
            addCriterion("REPAYMENT_STATE in", values, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateNotIn(List<String> values) {
            addCriterion("REPAYMENT_STATE not in", values, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateBetween(String value1, String value2) {
            addCriterion("REPAYMENT_STATE between", value1, value2, "repaymentState");
            return (Criteria) this;
        }

        public Criteria andRepaymentStateNotBetween(String value1, String value2) {
            addCriterion("REPAYMENT_STATE not between", value1, value2, "repaymentState");
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

        public Criteria andIsOperatingIsNull() {
            addCriterion("IS_OPERATING is null");
            return (Criteria) this;
        }

        public Criteria andIsOperatingIsNotNull() {
            addCriterion("IS_OPERATING is not null");
            return (Criteria) this;
        }

        public Criteria andIsOperatingEqualTo(String value) {
            addCriterion("IS_OPERATING =", value, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingNotEqualTo(String value) {
            addCriterion("IS_OPERATING <>", value, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingGreaterThan(String value) {
            addCriterion("IS_OPERATING >", value, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OPERATING >=", value, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingLessThan(String value) {
            addCriterion("IS_OPERATING <", value, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingLessThanOrEqualTo(String value) {
            addCriterion("IS_OPERATING <=", value, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingLike(String value) {
            addCriterion("IS_OPERATING like", value, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingNotLike(String value) {
            addCriterion("IS_OPERATING not like", value, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingIn(List<String> values) {
            addCriterion("IS_OPERATING in", values, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingNotIn(List<String> values) {
            addCriterion("IS_OPERATING not in", values, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingBetween(String value1, String value2) {
            addCriterion("IS_OPERATING between", value1, value2, "isOperating");
            return (Criteria) this;
        }

        public Criteria andIsOperatingNotBetween(String value1, String value2) {
            addCriterion("IS_OPERATING not between", value1, value2, "isOperating");
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
     * 描述:nplm_repayment_plan表的实体类
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
     * nplm_repayment_plan 2018-09-17
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