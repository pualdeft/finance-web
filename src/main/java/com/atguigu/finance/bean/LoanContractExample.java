package com.atguigu.finance.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoanContractExample {
    /**
     * nplm_loan_contract
     */
    protected String orderByClause;

    /**
     * nplm_loan_contract
     */
    protected boolean distinct;

    /**
     * nplm_loan_contract
     */
    protected List<Criteria> oredCriteria;

    public LoanContractExample() {
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
     * nplm_loan_contract 2018-09-17
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
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

        public Criteria andBorrowerIdIsNull() {
            addCriterion("borrower_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdIsNotNull() {
            addCriterion("borrower_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdEqualTo(String value) {
            addCriterion("borrower_id =", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotEqualTo(String value) {
            addCriterion("borrower_id <>", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdGreaterThan(String value) {
            addCriterion("borrower_id >", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("borrower_id >=", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdLessThan(String value) {
            addCriterion("borrower_id <", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdLessThanOrEqualTo(String value) {
            addCriterion("borrower_id <=", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdLike(String value) {
            addCriterion("borrower_id like", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotLike(String value) {
            addCriterion("borrower_id not like", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdIn(List<String> values) {
            addCriterion("borrower_id in", values, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotIn(List<String> values) {
            addCriterion("borrower_id not in", values, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdBetween(String value1, String value2) {
            addCriterion("borrower_id between", value1, value2, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotBetween(String value1, String value2) {
            addCriterion("borrower_id not between", value1, value2, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andEcifIdIsNull() {
            addCriterion("ECIF_ID is null");
            return (Criteria) this;
        }

        public Criteria andEcifIdIsNotNull() {
            addCriterion("ECIF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEcifIdEqualTo(String value) {
            addCriterion("ECIF_ID =", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdNotEqualTo(String value) {
            addCriterion("ECIF_ID <>", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdGreaterThan(String value) {
            addCriterion("ECIF_ID >", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdGreaterThanOrEqualTo(String value) {
            addCriterion("ECIF_ID >=", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdLessThan(String value) {
            addCriterion("ECIF_ID <", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdLessThanOrEqualTo(String value) {
            addCriterion("ECIF_ID <=", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdLike(String value) {
            addCriterion("ECIF_ID like", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdNotLike(String value) {
            addCriterion("ECIF_ID not like", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdIn(List<String> values) {
            addCriterion("ECIF_ID in", values, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdNotIn(List<String> values) {
            addCriterion("ECIF_ID not in", values, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdBetween(String value1, String value2) {
            addCriterion("ECIF_ID between", value1, value2, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdNotBetween(String value1, String value2) {
            addCriterion("ECIF_ID not between", value1, value2, "ecifId");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeIsNull() {
            addCriterion("pro_CATEGORY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeIsNotNull() {
            addCriterion("pro_CATEGORY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeEqualTo(String value) {
            addCriterion("pro_CATEGORY_CODE =", value, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeNotEqualTo(String value) {
            addCriterion("pro_CATEGORY_CODE <>", value, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeGreaterThan(String value) {
            addCriterion("pro_CATEGORY_CODE >", value, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_CATEGORY_CODE >=", value, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeLessThan(String value) {
            addCriterion("pro_CATEGORY_CODE <", value, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("pro_CATEGORY_CODE <=", value, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeLike(String value) {
            addCriterion("pro_CATEGORY_CODE like", value, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeNotLike(String value) {
            addCriterion("pro_CATEGORY_CODE not like", value, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeIn(List<String> values) {
            addCriterion("pro_CATEGORY_CODE in", values, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeNotIn(List<String> values) {
            addCriterion("pro_CATEGORY_CODE not in", values, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeBetween(String value1, String value2) {
            addCriterion("pro_CATEGORY_CODE between", value1, value2, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("pro_CATEGORY_CODE not between", value1, value2, "proCategoryCode");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameIsNull() {
            addCriterion("pro_CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameIsNotNull() {
            addCriterion("pro_CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameEqualTo(String value) {
            addCriterion("pro_CATEGORY_NAME =", value, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameNotEqualTo(String value) {
            addCriterion("pro_CATEGORY_NAME <>", value, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameGreaterThan(String value) {
            addCriterion("pro_CATEGORY_NAME >", value, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_CATEGORY_NAME >=", value, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameLessThan(String value) {
            addCriterion("pro_CATEGORY_NAME <", value, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("pro_CATEGORY_NAME <=", value, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameLike(String value) {
            addCriterion("pro_CATEGORY_NAME like", value, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameNotLike(String value) {
            addCriterion("pro_CATEGORY_NAME not like", value, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameIn(List<String> values) {
            addCriterion("pro_CATEGORY_NAME in", values, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameNotIn(List<String> values) {
            addCriterion("pro_CATEGORY_NAME not in", values, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameBetween(String value1, String value2) {
            addCriterion("pro_CATEGORY_NAME between", value1, value2, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProCategoryNameNotBetween(String value1, String value2) {
            addCriterion("pro_CATEGORY_NAME not between", value1, value2, "proCategoryName");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdIsNull() {
            addCriterion("PRODUCT_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdIsNotNull() {
            addCriterion("PRODUCT_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdEqualTo(Integer value) {
            addCriterion("PRODUCT_INFO_ID =", value, "productInfoId");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_INFO_ID <>", value, "productInfoId");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_INFO_ID >", value, "productInfoId");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_INFO_ID >=", value, "productInfoId");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdLessThan(Integer value) {
            addCriterion("PRODUCT_INFO_ID <", value, "productInfoId");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_INFO_ID <=", value, "productInfoId");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdIn(List<Integer> values) {
            addCriterion("PRODUCT_INFO_ID in", values, "productInfoId");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_INFO_ID not in", values, "productInfoId");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_INFO_ID between", value1, value2, "productInfoId");
            return (Criteria) this;
        }

        public Criteria andProductInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_INFO_ID not between", value1, value2, "productInfoId");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsIsNull() {
            addCriterion("LOAN_INSTALMENTS is null");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsIsNotNull() {
            addCriterion("LOAN_INSTALMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsEqualTo(Integer value) {
            addCriterion("LOAN_INSTALMENTS =", value, "loanInstalments");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsNotEqualTo(Integer value) {
            addCriterion("LOAN_INSTALMENTS <>", value, "loanInstalments");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsGreaterThan(Integer value) {
            addCriterion("LOAN_INSTALMENTS >", value, "loanInstalments");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOAN_INSTALMENTS >=", value, "loanInstalments");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsLessThan(Integer value) {
            addCriterion("LOAN_INSTALMENTS <", value, "loanInstalments");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsLessThanOrEqualTo(Integer value) {
            addCriterion("LOAN_INSTALMENTS <=", value, "loanInstalments");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsIn(List<Integer> values) {
            addCriterion("LOAN_INSTALMENTS in", values, "loanInstalments");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsNotIn(List<Integer> values) {
            addCriterion("LOAN_INSTALMENTS not in", values, "loanInstalments");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_INSTALMENTS between", value1, value2, "loanInstalments");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentsNotBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_INSTALMENTS not between", value1, value2, "loanInstalments");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitIsNull() {
            addCriterion("LOAN_INSTALMENT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitIsNotNull() {
            addCriterion("LOAN_INSTALMENT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitEqualTo(String value) {
            addCriterion("LOAN_INSTALMENT_UNIT =", value, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitNotEqualTo(String value) {
            addCriterion("LOAN_INSTALMENT_UNIT <>", value, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitGreaterThan(String value) {
            addCriterion("LOAN_INSTALMENT_UNIT >", value, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_INSTALMENT_UNIT >=", value, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitLessThan(String value) {
            addCriterion("LOAN_INSTALMENT_UNIT <", value, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitLessThanOrEqualTo(String value) {
            addCriterion("LOAN_INSTALMENT_UNIT <=", value, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitLike(String value) {
            addCriterion("LOAN_INSTALMENT_UNIT like", value, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitNotLike(String value) {
            addCriterion("LOAN_INSTALMENT_UNIT not like", value, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitIn(List<String> values) {
            addCriterion("LOAN_INSTALMENT_UNIT in", values, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitNotIn(List<String> values) {
            addCriterion("LOAN_INSTALMENT_UNIT not in", values, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitBetween(String value1, String value2) {
            addCriterion("LOAN_INSTALMENT_UNIT between", value1, value2, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanInstalmentUnitNotBetween(String value1, String value2) {
            addCriterion("LOAN_INSTALMENT_UNIT not between", value1, value2, "loanInstalmentUnit");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("LOAN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("LOAN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(Integer value) {
            addCriterion("LOAN_AMOUNT =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(Integer value) {
            addCriterion("LOAN_AMOUNT <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(Integer value) {
            addCriterion("LOAN_AMOUNT >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOAN_AMOUNT >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(Integer value) {
            addCriterion("LOAN_AMOUNT <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(Integer value) {
            addCriterion("LOAN_AMOUNT <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<Integer> values) {
            addCriterion("LOAN_AMOUNT in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<Integer> values) {
            addCriterion("LOAN_AMOUNT not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_AMOUNT between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("LOAN_AMOUNT not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andPreFeeIsNull() {
            addCriterion("PRE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andPreFeeIsNotNull() {
            addCriterion("PRE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andPreFeeEqualTo(Integer value) {
            addCriterion("PRE_FEE =", value, "preFee");
            return (Criteria) this;
        }

        public Criteria andPreFeeNotEqualTo(Integer value) {
            addCriterion("PRE_FEE <>", value, "preFee");
            return (Criteria) this;
        }

        public Criteria andPreFeeGreaterThan(Integer value) {
            addCriterion("PRE_FEE >", value, "preFee");
            return (Criteria) this;
        }

        public Criteria andPreFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRE_FEE >=", value, "preFee");
            return (Criteria) this;
        }

        public Criteria andPreFeeLessThan(Integer value) {
            addCriterion("PRE_FEE <", value, "preFee");
            return (Criteria) this;
        }

        public Criteria andPreFeeLessThanOrEqualTo(Integer value) {
            addCriterion("PRE_FEE <=", value, "preFee");
            return (Criteria) this;
        }

        public Criteria andPreFeeIn(List<Integer> values) {
            addCriterion("PRE_FEE in", values, "preFee");
            return (Criteria) this;
        }

        public Criteria andPreFeeNotIn(List<Integer> values) {
            addCriterion("PRE_FEE not in", values, "preFee");
            return (Criteria) this;
        }

        public Criteria andPreFeeBetween(Integer value1, Integer value2) {
            addCriterion("PRE_FEE between", value1, value2, "preFee");
            return (Criteria) this;
        }

        public Criteria andPreFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("PRE_FEE not between", value1, value2, "preFee");
            return (Criteria) this;
        }

        public Criteria andPutAmountIsNull() {
            addCriterion("PUT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPutAmountIsNotNull() {
            addCriterion("PUT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPutAmountEqualTo(Integer value) {
            addCriterion("PUT_AMOUNT =", value, "putAmount");
            return (Criteria) this;
        }

        public Criteria andPutAmountNotEqualTo(Integer value) {
            addCriterion("PUT_AMOUNT <>", value, "putAmount");
            return (Criteria) this;
        }

        public Criteria andPutAmountGreaterThan(Integer value) {
            addCriterion("PUT_AMOUNT >", value, "putAmount");
            return (Criteria) this;
        }

        public Criteria andPutAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PUT_AMOUNT >=", value, "putAmount");
            return (Criteria) this;
        }

        public Criteria andPutAmountLessThan(Integer value) {
            addCriterion("PUT_AMOUNT <", value, "putAmount");
            return (Criteria) this;
        }

        public Criteria andPutAmountLessThanOrEqualTo(Integer value) {
            addCriterion("PUT_AMOUNT <=", value, "putAmount");
            return (Criteria) this;
        }

        public Criteria andPutAmountIn(List<Integer> values) {
            addCriterion("PUT_AMOUNT in", values, "putAmount");
            return (Criteria) this;
        }

        public Criteria andPutAmountNotIn(List<Integer> values) {
            addCriterion("PUT_AMOUNT not in", values, "putAmount");
            return (Criteria) this;
        }

        public Criteria andPutAmountBetween(Integer value1, Integer value2) {
            addCriterion("PUT_AMOUNT between", value1, value2, "putAmount");
            return (Criteria) this;
        }

        public Criteria andPutAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("PUT_AMOUNT not between", value1, value2, "putAmount");
            return (Criteria) this;
        }

        public Criteria andCreditTypeIsNull() {
            addCriterion("CREDIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCreditTypeIsNotNull() {
            addCriterion("CREDIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditTypeEqualTo(String value) {
            addCriterion("CREDIT_TYPE =", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeNotEqualTo(String value) {
            addCriterion("CREDIT_TYPE <>", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeGreaterThan(String value) {
            addCriterion("CREDIT_TYPE >", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_TYPE >=", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeLessThan(String value) {
            addCriterion("CREDIT_TYPE <", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_TYPE <=", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeLike(String value) {
            addCriterion("CREDIT_TYPE like", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeNotLike(String value) {
            addCriterion("CREDIT_TYPE not like", value, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeIn(List<String> values) {
            addCriterion("CREDIT_TYPE in", values, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeNotIn(List<String> values) {
            addCriterion("CREDIT_TYPE not in", values, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeBetween(String value1, String value2) {
            addCriterion("CREDIT_TYPE between", value1, value2, "creditType");
            return (Criteria) this;
        }

        public Criteria andCreditTypeNotBetween(String value1, String value2) {
            addCriterion("CREDIT_TYPE not between", value1, value2, "creditType");
            return (Criteria) this;
        }

        public Criteria andPayModIsNull() {
            addCriterion("PAY_MOD is null");
            return (Criteria) this;
        }

        public Criteria andPayModIsNotNull() {
            addCriterion("PAY_MOD is not null");
            return (Criteria) this;
        }

        public Criteria andPayModEqualTo(String value) {
            addCriterion("PAY_MOD =", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModNotEqualTo(String value) {
            addCriterion("PAY_MOD <>", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModGreaterThan(String value) {
            addCriterion("PAY_MOD >", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_MOD >=", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModLessThan(String value) {
            addCriterion("PAY_MOD <", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModLessThanOrEqualTo(String value) {
            addCriterion("PAY_MOD <=", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModLike(String value) {
            addCriterion("PAY_MOD like", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModNotLike(String value) {
            addCriterion("PAY_MOD not like", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModIn(List<String> values) {
            addCriterion("PAY_MOD in", values, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModNotIn(List<String> values) {
            addCriterion("PAY_MOD not in", values, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModBetween(String value1, String value2) {
            addCriterion("PAY_MOD between", value1, value2, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModNotBetween(String value1, String value2) {
            addCriterion("PAY_MOD not between", value1, value2, "payMod");
            return (Criteria) this;
        }

        public Criteria andRepayWayIsNull() {
            addCriterion("REPAY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andRepayWayIsNotNull() {
            addCriterion("REPAY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andRepayWayEqualTo(String value) {
            addCriterion("REPAY_WAY =", value, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayNotEqualTo(String value) {
            addCriterion("REPAY_WAY <>", value, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayGreaterThan(String value) {
            addCriterion("REPAY_WAY >", value, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_WAY >=", value, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayLessThan(String value) {
            addCriterion("REPAY_WAY <", value, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayLessThanOrEqualTo(String value) {
            addCriterion("REPAY_WAY <=", value, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayLike(String value) {
            addCriterion("REPAY_WAY like", value, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayNotLike(String value) {
            addCriterion("REPAY_WAY not like", value, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayIn(List<String> values) {
            addCriterion("REPAY_WAY in", values, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayNotIn(List<String> values) {
            addCriterion("REPAY_WAY not in", values, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayBetween(String value1, String value2) {
            addCriterion("REPAY_WAY between", value1, value2, "repayWay");
            return (Criteria) this;
        }

        public Criteria andRepayWayNotBetween(String value1, String value2) {
            addCriterion("REPAY_WAY not between", value1, value2, "repayWay");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNull() {
            addCriterion("LOAN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNotNull() {
            addCriterion("LOAN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeEqualTo(String value) {
            addCriterion("LOAN_TYPE =", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotEqualTo(String value) {
            addCriterion("LOAN_TYPE <>", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThan(String value) {
            addCriterion("LOAN_TYPE >", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_TYPE >=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThan(String value) {
            addCriterion("LOAN_TYPE <", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThanOrEqualTo(String value) {
            addCriterion("LOAN_TYPE <=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLike(String value) {
            addCriterion("LOAN_TYPE like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotLike(String value) {
            addCriterion("LOAN_TYPE not like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIn(List<String> values) {
            addCriterion("LOAN_TYPE in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotIn(List<String> values) {
            addCriterion("LOAN_TYPE not in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeBetween(String value1, String value2) {
            addCriterion("LOAN_TYPE between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotBetween(String value1, String value2) {
            addCriterion("LOAN_TYPE not between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdIsNull() {
            addCriterion("SALE_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdIsNotNull() {
            addCriterion("SALE_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdEqualTo(Integer value) {
            addCriterion("SALE_DEPARTMENT_ID =", value, "saleDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdNotEqualTo(Integer value) {
            addCriterion("SALE_DEPARTMENT_ID <>", value, "saleDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdGreaterThan(Integer value) {
            addCriterion("SALE_DEPARTMENT_ID >", value, "saleDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALE_DEPARTMENT_ID >=", value, "saleDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdLessThan(Integer value) {
            addCriterion("SALE_DEPARTMENT_ID <", value, "saleDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("SALE_DEPARTMENT_ID <=", value, "saleDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdIn(List<Integer> values) {
            addCriterion("SALE_DEPARTMENT_ID in", values, "saleDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdNotIn(List<Integer> values) {
            addCriterion("SALE_DEPARTMENT_ID not in", values, "saleDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("SALE_DEPARTMENT_ID between", value1, value2, "saleDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSaleDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SALE_DEPARTMENT_ID not between", value1, value2, "saleDepartmentId");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameIsNull() {
            addCriterion("REPAY_ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameIsNotNull() {
            addCriterion("REPAY_ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_NAME =", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameNotEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_NAME <>", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameGreaterThan(String value) {
            addCriterion("REPAY_ACCOUNT_NAME >", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_NAME >=", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameLessThan(String value) {
            addCriterion("REPAY_ACCOUNT_NAME <", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameLessThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_NAME <=", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameLike(String value) {
            addCriterion("REPAY_ACCOUNT_NAME like", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameNotLike(String value) {
            addCriterion("REPAY_ACCOUNT_NAME not like", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT_NAME in", values, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameNotIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT_NAME not in", values, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT_NAME between", value1, value2, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameNotBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT_NAME not between", value1, value2, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeIsNull() {
            addCriterion("REPAY_ACCT_IDEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeIsNotNull() {
            addCriterion("REPAY_ACCT_IDEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeEqualTo(String value) {
            addCriterion("REPAY_ACCT_IDEN_TYPE =", value, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeNotEqualTo(String value) {
            addCriterion("REPAY_ACCT_IDEN_TYPE <>", value, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeGreaterThan(String value) {
            addCriterion("REPAY_ACCT_IDEN_TYPE >", value, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCT_IDEN_TYPE >=", value, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeLessThan(String value) {
            addCriterion("REPAY_ACCT_IDEN_TYPE <", value, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeLessThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCT_IDEN_TYPE <=", value, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeLike(String value) {
            addCriterion("REPAY_ACCT_IDEN_TYPE like", value, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeNotLike(String value) {
            addCriterion("REPAY_ACCT_IDEN_TYPE not like", value, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeIn(List<String> values) {
            addCriterion("REPAY_ACCT_IDEN_TYPE in", values, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeNotIn(List<String> values) {
            addCriterion("REPAY_ACCT_IDEN_TYPE not in", values, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeBetween(String value1, String value2) {
            addCriterion("REPAY_ACCT_IDEN_TYPE between", value1, value2, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenTypeNotBetween(String value1, String value2) {
            addCriterion("REPAY_ACCT_IDEN_TYPE not between", value1, value2, "repayAcctIdenType");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumIsNull() {
            addCriterion("REPAY_ACCT_IDEN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumIsNotNull() {
            addCriterion("REPAY_ACCT_IDEN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumEqualTo(String value) {
            addCriterion("REPAY_ACCT_IDEN_NUM =", value, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumNotEqualTo(String value) {
            addCriterion("REPAY_ACCT_IDEN_NUM <>", value, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumGreaterThan(String value) {
            addCriterion("REPAY_ACCT_IDEN_NUM >", value, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCT_IDEN_NUM >=", value, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumLessThan(String value) {
            addCriterion("REPAY_ACCT_IDEN_NUM <", value, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumLessThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCT_IDEN_NUM <=", value, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumLike(String value) {
            addCriterion("REPAY_ACCT_IDEN_NUM like", value, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumNotLike(String value) {
            addCriterion("REPAY_ACCT_IDEN_NUM not like", value, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumIn(List<String> values) {
            addCriterion("REPAY_ACCT_IDEN_NUM in", values, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumNotIn(List<String> values) {
            addCriterion("REPAY_ACCT_IDEN_NUM not in", values, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumBetween(String value1, String value2) {
            addCriterion("REPAY_ACCT_IDEN_NUM between", value1, value2, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAcctIdenNumNotBetween(String value1, String value2) {
            addCriterion("REPAY_ACCT_IDEN_NUM not between", value1, value2, "repayAcctIdenNum");
            return (Criteria) this;
        }

        public Criteria andRepayAccountIsNull() {
            addCriterion("REPAY_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountIsNotNull() {
            addCriterion("REPAY_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT =", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNotEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT <>", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountGreaterThan(String value) {
            addCriterion("REPAY_ACCOUNT >", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT >=", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountLessThan(String value) {
            addCriterion("REPAY_ACCOUNT <", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountLessThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT <=", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountLike(String value) {
            addCriterion("REPAY_ACCOUNT like", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNotLike(String value) {
            addCriterion("REPAY_ACCOUNT not like", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT in", values, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNotIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT not in", values, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT between", value1, value2, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNotBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT not between", value1, value2, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeIsNull() {
            addCriterion("REPAY_ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeIsNotNull() {
            addCriterion("REPAY_ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_TYPE =", value, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeNotEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_TYPE <>", value, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeGreaterThan(String value) {
            addCriterion("REPAY_ACCOUNT_TYPE >", value, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_TYPE >=", value, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeLessThan(String value) {
            addCriterion("REPAY_ACCOUNT_TYPE <", value, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_TYPE <=", value, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeLike(String value) {
            addCriterion("REPAY_ACCOUNT_TYPE like", value, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeNotLike(String value) {
            addCriterion("REPAY_ACCOUNT_TYPE not like", value, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT_TYPE in", values, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeNotIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT_TYPE not in", values, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT_TYPE between", value1, value2, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountTypeNotBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT_TYPE not between", value1, value2, "repayAccountType");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidIsNull() {
            addCriterion("REPAY_ACCOUNT_BANKID is null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidIsNotNull() {
            addCriterion("REPAY_ACCOUNT_BANKID is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_BANKID =", value, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidNotEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_BANKID <>", value, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidGreaterThan(String value) {
            addCriterion("REPAY_ACCOUNT_BANKID >", value, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_BANKID >=", value, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidLessThan(String value) {
            addCriterion("REPAY_ACCOUNT_BANKID <", value, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidLessThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_BANKID <=", value, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidLike(String value) {
            addCriterion("REPAY_ACCOUNT_BANKID like", value, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidNotLike(String value) {
            addCriterion("REPAY_ACCOUNT_BANKID not like", value, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT_BANKID in", values, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidNotIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT_BANKID not in", values, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT_BANKID between", value1, value2, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankidNotBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT_BANKID not between", value1, value2, "repayAccountBankid");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoIsNull() {
            addCriterion("REPAY_ACT_BRANCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoIsNotNull() {
            addCriterion("REPAY_ACT_BRANCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoEqualTo(String value) {
            addCriterion("REPAY_ACT_BRANCH_NO =", value, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoNotEqualTo(String value) {
            addCriterion("REPAY_ACT_BRANCH_NO <>", value, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoGreaterThan(String value) {
            addCriterion("REPAY_ACT_BRANCH_NO >", value, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_ACT_BRANCH_NO >=", value, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoLessThan(String value) {
            addCriterion("REPAY_ACT_BRANCH_NO <", value, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoLessThanOrEqualTo(String value) {
            addCriterion("REPAY_ACT_BRANCH_NO <=", value, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoLike(String value) {
            addCriterion("REPAY_ACT_BRANCH_NO like", value, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoNotLike(String value) {
            addCriterion("REPAY_ACT_BRANCH_NO not like", value, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoIn(List<String> values) {
            addCriterion("REPAY_ACT_BRANCH_NO in", values, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoNotIn(List<String> values) {
            addCriterion("REPAY_ACT_BRANCH_NO not in", values, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoBetween(String value1, String value2) {
            addCriterion("REPAY_ACT_BRANCH_NO between", value1, value2, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayActBranchNoNotBetween(String value1, String value2) {
            addCriterion("REPAY_ACT_BRANCH_NO not between", value1, value2, "repayActBranchNo");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameIsNull() {
            addCriterion("REPAY_ACCOUNT_BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameIsNotNull() {
            addCriterion("REPAY_ACCOUNT_BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME =", value, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameNotEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME <>", value, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameGreaterThan(String value) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME >", value, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME >=", value, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameLessThan(String value) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME <", value, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameLessThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME <=", value, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameLike(String value) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME like", value, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameNotLike(String value) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME not like", value, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME in", values, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameNotIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME not in", values, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME between", value1, value2, "repayAccountBankName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBankNameNotBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT_BANK_NAME not between", value1, value2, "repayAccountBankName");
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

        public Criteria andRepayActProvinceIsNull() {
            addCriterion("REPAY_ACT_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceIsNotNull() {
            addCriterion("REPAY_ACT_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceEqualTo(String value) {
            addCriterion("REPAY_ACT_PROVINCE =", value, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceNotEqualTo(String value) {
            addCriterion("REPAY_ACT_PROVINCE <>", value, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceGreaterThan(String value) {
            addCriterion("REPAY_ACT_PROVINCE >", value, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_ACT_PROVINCE >=", value, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceLessThan(String value) {
            addCriterion("REPAY_ACT_PROVINCE <", value, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceLessThanOrEqualTo(String value) {
            addCriterion("REPAY_ACT_PROVINCE <=", value, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceLike(String value) {
            addCriterion("REPAY_ACT_PROVINCE like", value, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceNotLike(String value) {
            addCriterion("REPAY_ACT_PROVINCE not like", value, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceIn(List<String> values) {
            addCriterion("REPAY_ACT_PROVINCE in", values, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceNotIn(List<String> values) {
            addCriterion("REPAY_ACT_PROVINCE not in", values, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceBetween(String value1, String value2) {
            addCriterion("REPAY_ACT_PROVINCE between", value1, value2, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayActProvinceNotBetween(String value1, String value2) {
            addCriterion("REPAY_ACT_PROVINCE not between", value1, value2, "repayActProvince");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityIsNull() {
            addCriterion("REPAY_ACCOUNT_CITY is null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityIsNotNull() {
            addCriterion("REPAY_ACCOUNT_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_CITY =", value, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityNotEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_CITY <>", value, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityGreaterThan(String value) {
            addCriterion("REPAY_ACCOUNT_CITY >", value, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_CITY >=", value, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityLessThan(String value) {
            addCriterion("REPAY_ACCOUNT_CITY <", value, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityLessThanOrEqualTo(String value) {
            addCriterion("REPAY_ACCOUNT_CITY <=", value, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityLike(String value) {
            addCriterion("REPAY_ACCOUNT_CITY like", value, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityNotLike(String value) {
            addCriterion("REPAY_ACCOUNT_CITY not like", value, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT_CITY in", values, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityNotIn(List<String> values) {
            addCriterion("REPAY_ACCOUNT_CITY not in", values, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT_CITY between", value1, value2, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andRepayAccountCityNotBetween(String value1, String value2) {
            addCriterion("REPAY_ACCOUNT_CITY not between", value1, value2, "repayAccountCity");
            return (Criteria) this;
        }

        public Criteria andPosStatusIsNull() {
            addCriterion("POS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPosStatusIsNotNull() {
            addCriterion("POS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPosStatusEqualTo(String value) {
            addCriterion("POS_STATUS =", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotEqualTo(String value) {
            addCriterion("POS_STATUS <>", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusGreaterThan(String value) {
            addCriterion("POS_STATUS >", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusGreaterThanOrEqualTo(String value) {
            addCriterion("POS_STATUS >=", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusLessThan(String value) {
            addCriterion("POS_STATUS <", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusLessThanOrEqualTo(String value) {
            addCriterion("POS_STATUS <=", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusLike(String value) {
            addCriterion("POS_STATUS like", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotLike(String value) {
            addCriterion("POS_STATUS not like", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusIn(List<String> values) {
            addCriterion("POS_STATUS in", values, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotIn(List<String> values) {
            addCriterion("POS_STATUS not in", values, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusBetween(String value1, String value2) {
            addCriterion("POS_STATUS between", value1, value2, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotBetween(String value1, String value2) {
            addCriterion("POS_STATUS not between", value1, value2, "posStatus");
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

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andContractSourceIsNull() {
            addCriterion("CONTRACT_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andContractSourceIsNotNull() {
            addCriterion("CONTRACT_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andContractSourceEqualTo(String value) {
            addCriterion("CONTRACT_SOURCE =", value, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceNotEqualTo(String value) {
            addCriterion("CONTRACT_SOURCE <>", value, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceGreaterThan(String value) {
            addCriterion("CONTRACT_SOURCE >", value, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_SOURCE >=", value, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceLessThan(String value) {
            addCriterion("CONTRACT_SOURCE <", value, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_SOURCE <=", value, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceLike(String value) {
            addCriterion("CONTRACT_SOURCE like", value, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceNotLike(String value) {
            addCriterion("CONTRACT_SOURCE not like", value, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceIn(List<String> values) {
            addCriterion("CONTRACT_SOURCE in", values, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceNotIn(List<String> values) {
            addCriterion("CONTRACT_SOURCE not in", values, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceBetween(String value1, String value2) {
            addCriterion("CONTRACT_SOURCE between", value1, value2, "contractSource");
            return (Criteria) this;
        }

        public Criteria andContractSourceNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_SOURCE not between", value1, value2, "contractSource");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceIsNull() {
            addCriterion("REPAY_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceIsNotNull() {
            addCriterion("REPAY_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceEqualTo(Integer value) {
            addCriterion("REPAY_BALANCE =", value, "repayBalance");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceNotEqualTo(Integer value) {
            addCriterion("REPAY_BALANCE <>", value, "repayBalance");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceGreaterThan(Integer value) {
            addCriterion("REPAY_BALANCE >", value, "repayBalance");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAY_BALANCE >=", value, "repayBalance");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceLessThan(Integer value) {
            addCriterion("REPAY_BALANCE <", value, "repayBalance");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("REPAY_BALANCE <=", value, "repayBalance");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceIn(List<Integer> values) {
            addCriterion("REPAY_BALANCE in", values, "repayBalance");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceNotIn(List<Integer> values) {
            addCriterion("REPAY_BALANCE not in", values, "repayBalance");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceBetween(Integer value1, Integer value2) {
            addCriterion("REPAY_BALANCE between", value1, value2, "repayBalance");
            return (Criteria) this;
        }

        public Criteria andRepayBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAY_BALANCE not between", value1, value2, "repayBalance");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("CONTRACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("CONTRACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("CONTRACT_TYPE =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("CONTRACT_TYPE <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("CONTRACT_TYPE >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TYPE >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("CONTRACT_TYPE <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TYPE <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("CONTRACT_TYPE like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("CONTRACT_TYPE not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("CONTRACT_TYPE in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("CONTRACT_TYPE not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("CONTRACT_TYPE between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_TYPE not between", value1, value2, "contractType");
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

        public Criteria andCycleCreditIdIsNull() {
            addCriterion("CYCLE_CREDIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdIsNotNull() {
            addCriterion("CYCLE_CREDIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdEqualTo(String value) {
            addCriterion("CYCLE_CREDIT_ID =", value, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdNotEqualTo(String value) {
            addCriterion("CYCLE_CREDIT_ID <>", value, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdGreaterThan(String value) {
            addCriterion("CYCLE_CREDIT_ID >", value, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdGreaterThanOrEqualTo(String value) {
            addCriterion("CYCLE_CREDIT_ID >=", value, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdLessThan(String value) {
            addCriterion("CYCLE_CREDIT_ID <", value, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdLessThanOrEqualTo(String value) {
            addCriterion("CYCLE_CREDIT_ID <=", value, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdLike(String value) {
            addCriterion("CYCLE_CREDIT_ID like", value, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdNotLike(String value) {
            addCriterion("CYCLE_CREDIT_ID not like", value, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdIn(List<String> values) {
            addCriterion("CYCLE_CREDIT_ID in", values, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdNotIn(List<String> values) {
            addCriterion("CYCLE_CREDIT_ID not in", values, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdBetween(String value1, String value2) {
            addCriterion("CYCLE_CREDIT_ID between", value1, value2, "cycleCreditId");
            return (Criteria) this;
        }

        public Criteria andCycleCreditIdNotBetween(String value1, String value2) {
            addCriterion("CYCLE_CREDIT_ID not between", value1, value2, "cycleCreditId");
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
     * 描述:nplm_loan_contract表的实体类
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
     * nplm_loan_contract 2018-09-17
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