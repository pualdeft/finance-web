package com.atguigu.finance.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowerInfoExample {
    /**
     * nplm_borrower_info
     */
    protected String orderByClause;

    /**
     * nplm_borrower_info
     */
    protected boolean distinct;

    /**
     * nplm_borrower_info
     */
    protected List<Criteria> oredCriteria;

    public BorrowerInfoExample() {
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
     * nplm_borrower_info 2018-09-17
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

        public Criteria andApplyClientIdIsNull() {
            addCriterion("APPLY_CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdIsNotNull() {
            addCriterion("APPLY_CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdEqualTo(Integer value) {
            addCriterion("APPLY_CLIENT_ID =", value, "applyClientId");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdNotEqualTo(Integer value) {
            addCriterion("APPLY_CLIENT_ID <>", value, "applyClientId");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdGreaterThan(Integer value) {
            addCriterion("APPLY_CLIENT_ID >", value, "applyClientId");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPLY_CLIENT_ID >=", value, "applyClientId");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdLessThan(Integer value) {
            addCriterion("APPLY_CLIENT_ID <", value, "applyClientId");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("APPLY_CLIENT_ID <=", value, "applyClientId");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdIn(List<Integer> values) {
            addCriterion("APPLY_CLIENT_ID in", values, "applyClientId");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdNotIn(List<Integer> values) {
            addCriterion("APPLY_CLIENT_ID not in", values, "applyClientId");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdBetween(Integer value1, Integer value2) {
            addCriterion("APPLY_CLIENT_ID between", value1, value2, "applyClientId");
            return (Criteria) this;
        }

        public Criteria andApplyClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("APPLY_CLIENT_ID not between", value1, value2, "applyClientId");
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

        public Criteria andEcifIdEqualTo(Integer value) {
            addCriterion("ECIF_ID =", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdNotEqualTo(Integer value) {
            addCriterion("ECIF_ID <>", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdGreaterThan(Integer value) {
            addCriterion("ECIF_ID >", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECIF_ID >=", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdLessThan(Integer value) {
            addCriterion("ECIF_ID <", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdLessThanOrEqualTo(Integer value) {
            addCriterion("ECIF_ID <=", value, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdIn(List<Integer> values) {
            addCriterion("ECIF_ID in", values, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdNotIn(List<Integer> values) {
            addCriterion("ECIF_ID not in", values, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdBetween(Integer value1, Integer value2) {
            addCriterion("ECIF_ID between", value1, value2, "ecifId");
            return (Criteria) this;
        }

        public Criteria andEcifIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ECIF_ID not between", value1, value2, "ecifId");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("CLIENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("CLIENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("CLIENT_NAME =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("CLIENT_NAME <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("CLIENT_NAME >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_NAME >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("CLIENT_NAME <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_NAME <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("CLIENT_NAME like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("CLIENT_NAME not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("CLIENT_NAME in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("CLIENT_NAME not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("CLIENT_NAME between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("CLIENT_NAME not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andOldNameIsNull() {
            addCriterion("OLD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOldNameIsNotNull() {
            addCriterion("OLD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOldNameEqualTo(String value) {
            addCriterion("OLD_NAME =", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotEqualTo(String value) {
            addCriterion("OLD_NAME <>", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameGreaterThan(String value) {
            addCriterion("OLD_NAME >", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_NAME >=", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLessThan(String value) {
            addCriterion("OLD_NAME <", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLessThanOrEqualTo(String value) {
            addCriterion("OLD_NAME <=", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLike(String value) {
            addCriterion("OLD_NAME like", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotLike(String value) {
            addCriterion("OLD_NAME not like", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameIn(List<String> values) {
            addCriterion("OLD_NAME in", values, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotIn(List<String> values) {
            addCriterion("OLD_NAME not in", values, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameBetween(String value1, String value2) {
            addCriterion("OLD_NAME between", value1, value2, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotBetween(String value1, String value2) {
            addCriterion("OLD_NAME not between", value1, value2, "oldName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andMaritalIsNull() {
            addCriterion("MARITAL is null");
            return (Criteria) this;
        }

        public Criteria andMaritalIsNotNull() {
            addCriterion("MARITAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalEqualTo(String value) {
            addCriterion("MARITAL =", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotEqualTo(String value) {
            addCriterion("MARITAL <>", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalGreaterThan(String value) {
            addCriterion("MARITAL >", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL >=", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLessThan(String value) {
            addCriterion("MARITAL <", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLessThanOrEqualTo(String value) {
            addCriterion("MARITAL <=", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLike(String value) {
            addCriterion("MARITAL like", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotLike(String value) {
            addCriterion("MARITAL not like", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalIn(List<String> values) {
            addCriterion("MARITAL in", values, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotIn(List<String> values) {
            addCriterion("MARITAL not in", values, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalBetween(String value1, String value2) {
            addCriterion("MARITAL between", value1, value2, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotBetween(String value1, String value2) {
            addCriterion("MARITAL not between", value1, value2, "marital");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenIsNull() {
            addCriterion("HAVE_CHILDREN is null");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenIsNotNull() {
            addCriterion("HAVE_CHILDREN is not null");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenEqualTo(Integer value) {
            addCriterion("HAVE_CHILDREN =", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenNotEqualTo(Integer value) {
            addCriterion("HAVE_CHILDREN <>", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenGreaterThan(Integer value) {
            addCriterion("HAVE_CHILDREN >", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenGreaterThanOrEqualTo(Integer value) {
            addCriterion("HAVE_CHILDREN >=", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenLessThan(Integer value) {
            addCriterion("HAVE_CHILDREN <", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenLessThanOrEqualTo(Integer value) {
            addCriterion("HAVE_CHILDREN <=", value, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenIn(List<Integer> values) {
            addCriterion("HAVE_CHILDREN in", values, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenNotIn(List<Integer> values) {
            addCriterion("HAVE_CHILDREN not in", values, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenBetween(Integer value1, Integer value2) {
            addCriterion("HAVE_CHILDREN between", value1, value2, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andHaveChildrenNotBetween(Integer value1, Integer value2) {
            addCriterion("HAVE_CHILDREN not between", value1, value2, "haveChildren");
            return (Criteria) this;
        }

        public Criteria andChildrenCountIsNull() {
            addCriterion("CHILDREN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andChildrenCountIsNotNull() {
            addCriterion("CHILDREN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChildrenCountEqualTo(Integer value) {
            addCriterion("CHILDREN_COUNT =", value, "childrenCount");
            return (Criteria) this;
        }

        public Criteria andChildrenCountNotEqualTo(Integer value) {
            addCriterion("CHILDREN_COUNT <>", value, "childrenCount");
            return (Criteria) this;
        }

        public Criteria andChildrenCountGreaterThan(Integer value) {
            addCriterion("CHILDREN_COUNT >", value, "childrenCount");
            return (Criteria) this;
        }

        public Criteria andChildrenCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHILDREN_COUNT >=", value, "childrenCount");
            return (Criteria) this;
        }

        public Criteria andChildrenCountLessThan(Integer value) {
            addCriterion("CHILDREN_COUNT <", value, "childrenCount");
            return (Criteria) this;
        }

        public Criteria andChildrenCountLessThanOrEqualTo(Integer value) {
            addCriterion("CHILDREN_COUNT <=", value, "childrenCount");
            return (Criteria) this;
        }

        public Criteria andChildrenCountIn(List<Integer> values) {
            addCriterion("CHILDREN_COUNT in", values, "childrenCount");
            return (Criteria) this;
        }

        public Criteria andChildrenCountNotIn(List<Integer> values) {
            addCriterion("CHILDREN_COUNT not in", values, "childrenCount");
            return (Criteria) this;
        }

        public Criteria andChildrenCountBetween(Integer value1, Integer value2) {
            addCriterion("CHILDREN_COUNT between", value1, value2, "childrenCount");
            return (Criteria) this;
        }

        public Criteria andChildrenCountNotBetween(Integer value1, Integer value2) {
            addCriterion("CHILDREN_COUNT not between", value1, value2, "childrenCount");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("NATIONALITY is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("NATIONALITY is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("NATIONALITY =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("NATIONALITY <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("NATIONALITY >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONALITY >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("NATIONALITY <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("NATIONALITY <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("NATIONALITY like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("NATIONALITY not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("NATIONALITY in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("NATIONALITY not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("NATIONALITY between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("NATIONALITY not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andHProvinceIsNull() {
            addCriterion("H_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andHProvinceIsNotNull() {
            addCriterion("H_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andHProvinceEqualTo(String value) {
            addCriterion("H_PROVINCE =", value, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceNotEqualTo(String value) {
            addCriterion("H_PROVINCE <>", value, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceGreaterThan(String value) {
            addCriterion("H_PROVINCE >", value, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("H_PROVINCE >=", value, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceLessThan(String value) {
            addCriterion("H_PROVINCE <", value, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceLessThanOrEqualTo(String value) {
            addCriterion("H_PROVINCE <=", value, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceLike(String value) {
            addCriterion("H_PROVINCE like", value, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceNotLike(String value) {
            addCriterion("H_PROVINCE not like", value, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceIn(List<String> values) {
            addCriterion("H_PROVINCE in", values, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceNotIn(List<String> values) {
            addCriterion("H_PROVINCE not in", values, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceBetween(String value1, String value2) {
            addCriterion("H_PROVINCE between", value1, value2, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHProvinceNotBetween(String value1, String value2) {
            addCriterion("H_PROVINCE not between", value1, value2, "hProvince");
            return (Criteria) this;
        }

        public Criteria andHCityIsNull() {
            addCriterion("H_CITY is null");
            return (Criteria) this;
        }

        public Criteria andHCityIsNotNull() {
            addCriterion("H_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andHCityEqualTo(String value) {
            addCriterion("H_CITY =", value, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityNotEqualTo(String value) {
            addCriterion("H_CITY <>", value, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityGreaterThan(String value) {
            addCriterion("H_CITY >", value, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityGreaterThanOrEqualTo(String value) {
            addCriterion("H_CITY >=", value, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityLessThan(String value) {
            addCriterion("H_CITY <", value, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityLessThanOrEqualTo(String value) {
            addCriterion("H_CITY <=", value, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityLike(String value) {
            addCriterion("H_CITY like", value, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityNotLike(String value) {
            addCriterion("H_CITY not like", value, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityIn(List<String> values) {
            addCriterion("H_CITY in", values, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityNotIn(List<String> values) {
            addCriterion("H_CITY not in", values, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityBetween(String value1, String value2) {
            addCriterion("H_CITY between", value1, value2, "hCity");
            return (Criteria) this;
        }

        public Criteria andHCityNotBetween(String value1, String value2) {
            addCriterion("H_CITY not between", value1, value2, "hCity");
            return (Criteria) this;
        }

        public Criteria andHDressIsNull() {
            addCriterion("H_DRESS is null");
            return (Criteria) this;
        }

        public Criteria andHDressIsNotNull() {
            addCriterion("H_DRESS is not null");
            return (Criteria) this;
        }

        public Criteria andHDressEqualTo(String value) {
            addCriterion("H_DRESS =", value, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressNotEqualTo(String value) {
            addCriterion("H_DRESS <>", value, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressGreaterThan(String value) {
            addCriterion("H_DRESS >", value, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressGreaterThanOrEqualTo(String value) {
            addCriterion("H_DRESS >=", value, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressLessThan(String value) {
            addCriterion("H_DRESS <", value, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressLessThanOrEqualTo(String value) {
            addCriterion("H_DRESS <=", value, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressLike(String value) {
            addCriterion("H_DRESS like", value, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressNotLike(String value) {
            addCriterion("H_DRESS not like", value, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressIn(List<String> values) {
            addCriterion("H_DRESS in", values, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressNotIn(List<String> values) {
            addCriterion("H_DRESS not in", values, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressBetween(String value1, String value2) {
            addCriterion("H_DRESS between", value1, value2, "hDress");
            return (Criteria) this;
        }

        public Criteria andHDressNotBetween(String value1, String value2) {
            addCriterion("H_DRESS not between", value1, value2, "hDress");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNull() {
            addCriterion("IDENTITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNotNull() {
            addCriterion("IDENTITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeEqualTo(String value) {
            addCriterion("IDENTITY_TYPE =", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotEqualTo(String value) {
            addCriterion("IDENTITY_TYPE <>", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThan(String value) {
            addCriterion("IDENTITY_TYPE >", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_TYPE >=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThan(String value) {
            addCriterion("IDENTITY_TYPE <", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_TYPE <=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLike(String value) {
            addCriterion("IDENTITY_TYPE like", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotLike(String value) {
            addCriterion("IDENTITY_TYPE not like", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIn(List<String> values) {
            addCriterion("IDENTITY_TYPE in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotIn(List<String> values) {
            addCriterion("IDENTITY_TYPE not in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeBetween(String value1, String value2) {
            addCriterion("IDENTITY_TYPE between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_TYPE not between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIsNull() {
            addCriterion("IDENTITY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIsNotNull() {
            addCriterion("IDENTITY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumEqualTo(String value) {
            addCriterion("IDENTITY_NUM =", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotEqualTo(String value) {
            addCriterion("IDENTITY_NUM <>", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumGreaterThan(String value) {
            addCriterion("IDENTITY_NUM >", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_NUM >=", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLessThan(String value) {
            addCriterion("IDENTITY_NUM <", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_NUM <=", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLike(String value) {
            addCriterion("IDENTITY_NUM like", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotLike(String value) {
            addCriterion("IDENTITY_NUM not like", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIn(List<String> values) {
            addCriterion("IDENTITY_NUM in", values, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotIn(List<String> values) {
            addCriterion("IDENTITY_NUM not in", values, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumBetween(String value1, String value2) {
            addCriterion("IDENTITY_NUM between", value1, value2, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_NUM not between", value1, value2, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateIsNull() {
            addCriterion("IDENTITY_VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateIsNotNull() {
            addCriterion("IDENTITY_VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateEqualTo(String value) {
            addCriterion("IDENTITY_VALID_DATE =", value, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateNotEqualTo(String value) {
            addCriterion("IDENTITY_VALID_DATE <>", value, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateGreaterThan(String value) {
            addCriterion("IDENTITY_VALID_DATE >", value, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_VALID_DATE >=", value, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateLessThan(String value) {
            addCriterion("IDENTITY_VALID_DATE <", value, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_VALID_DATE <=", value, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateLike(String value) {
            addCriterion("IDENTITY_VALID_DATE like", value, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateNotLike(String value) {
            addCriterion("IDENTITY_VALID_DATE not like", value, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateIn(List<String> values) {
            addCriterion("IDENTITY_VALID_DATE in", values, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateNotIn(List<String> values) {
            addCriterion("IDENTITY_VALID_DATE not in", values, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateBetween(String value1, String value2) {
            addCriterion("IDENTITY_VALID_DATE between", value1, value2, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andIdentityValidDateNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_VALID_DATE not between", value1, value2, "identityValidDate");
            return (Criteria) this;
        }

        public Criteria andHaveCarIsNull() {
            addCriterion("HAVE_CAR is null");
            return (Criteria) this;
        }

        public Criteria andHaveCarIsNotNull() {
            addCriterion("HAVE_CAR is not null");
            return (Criteria) this;
        }

        public Criteria andHaveCarEqualTo(String value) {
            addCriterion("HAVE_CAR =", value, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarNotEqualTo(String value) {
            addCriterion("HAVE_CAR <>", value, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarGreaterThan(String value) {
            addCriterion("HAVE_CAR >", value, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarGreaterThanOrEqualTo(String value) {
            addCriterion("HAVE_CAR >=", value, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarLessThan(String value) {
            addCriterion("HAVE_CAR <", value, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarLessThanOrEqualTo(String value) {
            addCriterion("HAVE_CAR <=", value, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarLike(String value) {
            addCriterion("HAVE_CAR like", value, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarNotLike(String value) {
            addCriterion("HAVE_CAR not like", value, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarIn(List<String> values) {
            addCriterion("HAVE_CAR in", values, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarNotIn(List<String> values) {
            addCriterion("HAVE_CAR not in", values, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarBetween(String value1, String value2) {
            addCriterion("HAVE_CAR between", value1, value2, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHaveCarNotBetween(String value1, String value2) {
            addCriterion("HAVE_CAR not between", value1, value2, "haveCar");
            return (Criteria) this;
        }

        public Criteria andHouseExplainIsNull() {
            addCriterion("HOUSE_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andHouseExplainIsNotNull() {
            addCriterion("HOUSE_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andHouseExplainEqualTo(String value) {
            addCriterion("HOUSE_EXPLAIN =", value, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainNotEqualTo(String value) {
            addCriterion("HOUSE_EXPLAIN <>", value, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainGreaterThan(String value) {
            addCriterion("HOUSE_EXPLAIN >", value, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSE_EXPLAIN >=", value, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainLessThan(String value) {
            addCriterion("HOUSE_EXPLAIN <", value, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainLessThanOrEqualTo(String value) {
            addCriterion("HOUSE_EXPLAIN <=", value, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainLike(String value) {
            addCriterion("HOUSE_EXPLAIN like", value, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainNotLike(String value) {
            addCriterion("HOUSE_EXPLAIN not like", value, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainIn(List<String> values) {
            addCriterion("HOUSE_EXPLAIN in", values, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainNotIn(List<String> values) {
            addCriterion("HOUSE_EXPLAIN not in", values, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainBetween(String value1, String value2) {
            addCriterion("HOUSE_EXPLAIN between", value1, value2, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andHouseExplainNotBetween(String value1, String value2) {
            addCriterion("HOUSE_EXPLAIN not between", value1, value2, "houseExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainIsNull() {
            addCriterion("RESIDE_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andResideExplainIsNotNull() {
            addCriterion("RESIDE_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andResideExplainEqualTo(String value) {
            addCriterion("RESIDE_EXPLAIN =", value, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainNotEqualTo(String value) {
            addCriterion("RESIDE_EXPLAIN <>", value, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainGreaterThan(String value) {
            addCriterion("RESIDE_EXPLAIN >", value, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDE_EXPLAIN >=", value, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainLessThan(String value) {
            addCriterion("RESIDE_EXPLAIN <", value, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainLessThanOrEqualTo(String value) {
            addCriterion("RESIDE_EXPLAIN <=", value, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainLike(String value) {
            addCriterion("RESIDE_EXPLAIN like", value, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainNotLike(String value) {
            addCriterion("RESIDE_EXPLAIN not like", value, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainIn(List<String> values) {
            addCriterion("RESIDE_EXPLAIN in", values, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainNotIn(List<String> values) {
            addCriterion("RESIDE_EXPLAIN not in", values, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainBetween(String value1, String value2) {
            addCriterion("RESIDE_EXPLAIN between", value1, value2, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideExplainNotBetween(String value1, String value2) {
            addCriterion("RESIDE_EXPLAIN not between", value1, value2, "resideExplain");
            return (Criteria) this;
        }

        public Criteria andResideYearIsNull() {
            addCriterion("RESIDE_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andResideYearIsNotNull() {
            addCriterion("RESIDE_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andResideYearEqualTo(String value) {
            addCriterion("RESIDE_YEAR =", value, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearNotEqualTo(String value) {
            addCriterion("RESIDE_YEAR <>", value, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearGreaterThan(String value) {
            addCriterion("RESIDE_YEAR >", value, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDE_YEAR >=", value, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearLessThan(String value) {
            addCriterion("RESIDE_YEAR <", value, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearLessThanOrEqualTo(String value) {
            addCriterion("RESIDE_YEAR <=", value, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearLike(String value) {
            addCriterion("RESIDE_YEAR like", value, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearNotLike(String value) {
            addCriterion("RESIDE_YEAR not like", value, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearIn(List<String> values) {
            addCriterion("RESIDE_YEAR in", values, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearNotIn(List<String> values) {
            addCriterion("RESIDE_YEAR not in", values, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearBetween(String value1, String value2) {
            addCriterion("RESIDE_YEAR between", value1, value2, "resideYear");
            return (Criteria) this;
        }

        public Criteria andResideYearNotBetween(String value1, String value2) {
            addCriterion("RESIDE_YEAR not between", value1, value2, "resideYear");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("DEGREE =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("DEGREE <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("DEGREE >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("DEGREE >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("DEGREE <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("DEGREE <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("DEGREE like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("DEGREE not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("DEGREE in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("DEGREE not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("DEGREE between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("DEGREE not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNull() {
            addCriterion("DIPLOMA is null");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNotNull() {
            addCriterion("DIPLOMA is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomaEqualTo(String value) {
            addCriterion("DIPLOMA =", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotEqualTo(String value) {
            addCriterion("DIPLOMA <>", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThan(String value) {
            addCriterion("DIPLOMA >", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThanOrEqualTo(String value) {
            addCriterion("DIPLOMA >=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThan(String value) {
            addCriterion("DIPLOMA <", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThanOrEqualTo(String value) {
            addCriterion("DIPLOMA <=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLike(String value) {
            addCriterion("DIPLOMA like", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotLike(String value) {
            addCriterion("DIPLOMA not like", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaIn(List<String> values) {
            addCriterion("DIPLOMA in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotIn(List<String> values) {
            addCriterion("DIPLOMA not in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaBetween(String value1, String value2) {
            addCriterion("DIPLOMA between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotBetween(String value1, String value2) {
            addCriterion("DIPLOMA not between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andYearIncomeIsNull() {
            addCriterion("YEAR_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andYearIncomeIsNotNull() {
            addCriterion("YEAR_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andYearIncomeEqualTo(Integer value) {
            addCriterion("YEAR_INCOME =", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeNotEqualTo(Integer value) {
            addCriterion("YEAR_INCOME <>", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeGreaterThan(Integer value) {
            addCriterion("YEAR_INCOME >", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("YEAR_INCOME >=", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeLessThan(Integer value) {
            addCriterion("YEAR_INCOME <", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("YEAR_INCOME <=", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeIn(List<Integer> values) {
            addCriterion("YEAR_INCOME in", values, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeNotIn(List<Integer> values) {
            addCriterion("YEAR_INCOME not in", values, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeBetween(Integer value1, Integer value2) {
            addCriterion("YEAR_INCOME between", value1, value2, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("YEAR_INCOME not between", value1, value2, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("INDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("INDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("INDUSTRY =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("INDUSTRY <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("INDUSTRY >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("INDUSTRY <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("INDUSTRY like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("INDUSTRY not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("INDUSTRY in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("INDUSTRY not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("INDUSTRY between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("COMPANY not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("COMPANY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("COMPANY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("COMPANY_TYPE =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("COMPANY_TYPE <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("COMPANY_TYPE >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_TYPE >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("COMPANY_TYPE <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_TYPE <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("COMPANY_TYPE like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("COMPANY_TYPE not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("COMPANY_TYPE in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("COMPANY_TYPE not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("COMPANY_TYPE between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("COMPANY_TYPE not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("WORK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("WORK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(Integer value) {
            addCriterion("WORK_TIME =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Integer value) {
            addCriterion("WORK_TIME <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Integer value) {
            addCriterion("WORK_TIME >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_TIME >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Integer value) {
            addCriterion("WORK_TIME <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_TIME <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Integer> values) {
            addCriterion("WORK_TIME in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Integer> values) {
            addCriterion("WORK_TIME not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Integer value1, Integer value2) {
            addCriterion("WORK_TIME between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_TIME not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitIsNull() {
            addCriterion("WORK_TIME_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitIsNotNull() {
            addCriterion("WORK_TIME_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitEqualTo(String value) {
            addCriterion("WORK_TIME_UNIT =", value, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitNotEqualTo(String value) {
            addCriterion("WORK_TIME_UNIT <>", value, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitGreaterThan(String value) {
            addCriterion("WORK_TIME_UNIT >", value, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TIME_UNIT >=", value, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitLessThan(String value) {
            addCriterion("WORK_TIME_UNIT <", value, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitLessThanOrEqualTo(String value) {
            addCriterion("WORK_TIME_UNIT <=", value, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitLike(String value) {
            addCriterion("WORK_TIME_UNIT like", value, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitNotLike(String value) {
            addCriterion("WORK_TIME_UNIT not like", value, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitIn(List<String> values) {
            addCriterion("WORK_TIME_UNIT in", values, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitNotIn(List<String> values) {
            addCriterion("WORK_TIME_UNIT not in", values, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitBetween(String value1, String value2) {
            addCriterion("WORK_TIME_UNIT between", value1, value2, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andWorkTimeUnitNotBetween(String value1, String value2) {
            addCriterion("WORK_TIME_UNIT not between", value1, value2, "workTimeUnit");
            return (Criteria) this;
        }

        public Criteria andClientAreaIsNull() {
            addCriterion("CLIENT_AREA is null");
            return (Criteria) this;
        }

        public Criteria andClientAreaIsNotNull() {
            addCriterion("CLIENT_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andClientAreaEqualTo(String value) {
            addCriterion("CLIENT_AREA =", value, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaNotEqualTo(String value) {
            addCriterion("CLIENT_AREA <>", value, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaGreaterThan(String value) {
            addCriterion("CLIENT_AREA >", value, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_AREA >=", value, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaLessThan(String value) {
            addCriterion("CLIENT_AREA <", value, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_AREA <=", value, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaLike(String value) {
            addCriterion("CLIENT_AREA like", value, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaNotLike(String value) {
            addCriterion("CLIENT_AREA not like", value, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaIn(List<String> values) {
            addCriterion("CLIENT_AREA in", values, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaNotIn(List<String> values) {
            addCriterion("CLIENT_AREA not in", values, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaBetween(String value1, String value2) {
            addCriterion("CLIENT_AREA between", value1, value2, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientAreaNotBetween(String value1, String value2) {
            addCriterion("CLIENT_AREA not between", value1, value2, "clientArea");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("CLIENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("CLIENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("CLIENT_TYPE =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("CLIENT_TYPE <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("CLIENT_TYPE >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_TYPE >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("CLIENT_TYPE <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_TYPE <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("CLIENT_TYPE like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("CLIENT_TYPE not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("CLIENT_TYPE in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("CLIENT_TYPE not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("CLIENT_TYPE between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("CLIENT_TYPE not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andFNationIsNull() {
            addCriterion("F_NATION is null");
            return (Criteria) this;
        }

        public Criteria andFNationIsNotNull() {
            addCriterion("F_NATION is not null");
            return (Criteria) this;
        }

        public Criteria andFNationEqualTo(String value) {
            addCriterion("F_NATION =", value, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationNotEqualTo(String value) {
            addCriterion("F_NATION <>", value, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationGreaterThan(String value) {
            addCriterion("F_NATION >", value, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationGreaterThanOrEqualTo(String value) {
            addCriterion("F_NATION >=", value, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationLessThan(String value) {
            addCriterion("F_NATION <", value, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationLessThanOrEqualTo(String value) {
            addCriterion("F_NATION <=", value, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationLike(String value) {
            addCriterion("F_NATION like", value, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationNotLike(String value) {
            addCriterion("F_NATION not like", value, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationIn(List<String> values) {
            addCriterion("F_NATION in", values, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationNotIn(List<String> values) {
            addCriterion("F_NATION not in", values, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationBetween(String value1, String value2) {
            addCriterion("F_NATION between", value1, value2, "fNation");
            return (Criteria) this;
        }

        public Criteria andFNationNotBetween(String value1, String value2) {
            addCriterion("F_NATION not between", value1, value2, "fNation");
            return (Criteria) this;
        }

        public Criteria andFProvinceIsNull() {
            addCriterion("F_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andFProvinceIsNotNull() {
            addCriterion("F_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andFProvinceEqualTo(String value) {
            addCriterion("F_PROVINCE =", value, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceNotEqualTo(String value) {
            addCriterion("F_PROVINCE <>", value, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceGreaterThan(String value) {
            addCriterion("F_PROVINCE >", value, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("F_PROVINCE >=", value, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceLessThan(String value) {
            addCriterion("F_PROVINCE <", value, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceLessThanOrEqualTo(String value) {
            addCriterion("F_PROVINCE <=", value, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceLike(String value) {
            addCriterion("F_PROVINCE like", value, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceNotLike(String value) {
            addCriterion("F_PROVINCE not like", value, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceIn(List<String> values) {
            addCriterion("F_PROVINCE in", values, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceNotIn(List<String> values) {
            addCriterion("F_PROVINCE not in", values, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceBetween(String value1, String value2) {
            addCriterion("F_PROVINCE between", value1, value2, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFProvinceNotBetween(String value1, String value2) {
            addCriterion("F_PROVINCE not between", value1, value2, "fProvince");
            return (Criteria) this;
        }

        public Criteria andFCityIsNull() {
            addCriterion("F_CITY is null");
            return (Criteria) this;
        }

        public Criteria andFCityIsNotNull() {
            addCriterion("F_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andFCityEqualTo(String value) {
            addCriterion("F_CITY =", value, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityNotEqualTo(String value) {
            addCriterion("F_CITY <>", value, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityGreaterThan(String value) {
            addCriterion("F_CITY >", value, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityGreaterThanOrEqualTo(String value) {
            addCriterion("F_CITY >=", value, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityLessThan(String value) {
            addCriterion("F_CITY <", value, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityLessThanOrEqualTo(String value) {
            addCriterion("F_CITY <=", value, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityLike(String value) {
            addCriterion("F_CITY like", value, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityNotLike(String value) {
            addCriterion("F_CITY not like", value, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityIn(List<String> values) {
            addCriterion("F_CITY in", values, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityNotIn(List<String> values) {
            addCriterion("F_CITY not in", values, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityBetween(String value1, String value2) {
            addCriterion("F_CITY between", value1, value2, "fCity");
            return (Criteria) this;
        }

        public Criteria andFCityNotBetween(String value1, String value2) {
            addCriterion("F_CITY not between", value1, value2, "fCity");
            return (Criteria) this;
        }

        public Criteria andFAreaIsNull() {
            addCriterion("F_AREA is null");
            return (Criteria) this;
        }

        public Criteria andFAreaIsNotNull() {
            addCriterion("F_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andFAreaEqualTo(String value) {
            addCriterion("F_AREA =", value, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaNotEqualTo(String value) {
            addCriterion("F_AREA <>", value, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaGreaterThan(String value) {
            addCriterion("F_AREA >", value, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaGreaterThanOrEqualTo(String value) {
            addCriterion("F_AREA >=", value, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaLessThan(String value) {
            addCriterion("F_AREA <", value, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaLessThanOrEqualTo(String value) {
            addCriterion("F_AREA <=", value, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaLike(String value) {
            addCriterion("F_AREA like", value, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaNotLike(String value) {
            addCriterion("F_AREA not like", value, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaIn(List<String> values) {
            addCriterion("F_AREA in", values, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaNotIn(List<String> values) {
            addCriterion("F_AREA not in", values, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaBetween(String value1, String value2) {
            addCriterion("F_AREA between", value1, value2, "fArea");
            return (Criteria) this;
        }

        public Criteria andFAreaNotBetween(String value1, String value2) {
            addCriterion("F_AREA not between", value1, value2, "fArea");
            return (Criteria) this;
        }

        public Criteria andFStreetIsNull() {
            addCriterion("F_STREET is null");
            return (Criteria) this;
        }

        public Criteria andFStreetIsNotNull() {
            addCriterion("F_STREET is not null");
            return (Criteria) this;
        }

        public Criteria andFStreetEqualTo(String value) {
            addCriterion("F_STREET =", value, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetNotEqualTo(String value) {
            addCriterion("F_STREET <>", value, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetGreaterThan(String value) {
            addCriterion("F_STREET >", value, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetGreaterThanOrEqualTo(String value) {
            addCriterion("F_STREET >=", value, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetLessThan(String value) {
            addCriterion("F_STREET <", value, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetLessThanOrEqualTo(String value) {
            addCriterion("F_STREET <=", value, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetLike(String value) {
            addCriterion("F_STREET like", value, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetNotLike(String value) {
            addCriterion("F_STREET not like", value, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetIn(List<String> values) {
            addCriterion("F_STREET in", values, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetNotIn(List<String> values) {
            addCriterion("F_STREET not in", values, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetBetween(String value1, String value2) {
            addCriterion("F_STREET between", value1, value2, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFStreetNotBetween(String value1, String value2) {
            addCriterion("F_STREET not between", value1, value2, "fStreet");
            return (Criteria) this;
        }

        public Criteria andFZipcodeIsNull() {
            addCriterion("F_ZIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andFZipcodeIsNotNull() {
            addCriterion("F_ZIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFZipcodeEqualTo(String value) {
            addCriterion("F_ZIPCODE =", value, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeNotEqualTo(String value) {
            addCriterion("F_ZIPCODE <>", value, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeGreaterThan(String value) {
            addCriterion("F_ZIPCODE >", value, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("F_ZIPCODE >=", value, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeLessThan(String value) {
            addCriterion("F_ZIPCODE <", value, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeLessThanOrEqualTo(String value) {
            addCriterion("F_ZIPCODE <=", value, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeLike(String value) {
            addCriterion("F_ZIPCODE like", value, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeNotLike(String value) {
            addCriterion("F_ZIPCODE not like", value, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeIn(List<String> values) {
            addCriterion("F_ZIPCODE in", values, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeNotIn(List<String> values) {
            addCriterion("F_ZIPCODE not in", values, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeBetween(String value1, String value2) {
            addCriterion("F_ZIPCODE between", value1, value2, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andFZipcodeNotBetween(String value1, String value2) {
            addCriterion("F_ZIPCODE not between", value1, value2, "fZipcode");
            return (Criteria) this;
        }

        public Criteria andCNationIsNull() {
            addCriterion("C_NATION is null");
            return (Criteria) this;
        }

        public Criteria andCNationIsNotNull() {
            addCriterion("C_NATION is not null");
            return (Criteria) this;
        }

        public Criteria andCNationEqualTo(String value) {
            addCriterion("C_NATION =", value, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationNotEqualTo(String value) {
            addCriterion("C_NATION <>", value, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationGreaterThan(String value) {
            addCriterion("C_NATION >", value, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationGreaterThanOrEqualTo(String value) {
            addCriterion("C_NATION >=", value, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationLessThan(String value) {
            addCriterion("C_NATION <", value, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationLessThanOrEqualTo(String value) {
            addCriterion("C_NATION <=", value, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationLike(String value) {
            addCriterion("C_NATION like", value, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationNotLike(String value) {
            addCriterion("C_NATION not like", value, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationIn(List<String> values) {
            addCriterion("C_NATION in", values, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationNotIn(List<String> values) {
            addCriterion("C_NATION not in", values, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationBetween(String value1, String value2) {
            addCriterion("C_NATION between", value1, value2, "cNation");
            return (Criteria) this;
        }

        public Criteria andCNationNotBetween(String value1, String value2) {
            addCriterion("C_NATION not between", value1, value2, "cNation");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNull() {
            addCriterion("C_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNotNull() {
            addCriterion("C_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andCProvinceEqualTo(String value) {
            addCriterion("C_PROVINCE =", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotEqualTo(String value) {
            addCriterion("C_PROVINCE <>", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThan(String value) {
            addCriterion("C_PROVINCE >", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("C_PROVINCE >=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThan(String value) {
            addCriterion("C_PROVINCE <", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThanOrEqualTo(String value) {
            addCriterion("C_PROVINCE <=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLike(String value) {
            addCriterion("C_PROVINCE like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotLike(String value) {
            addCriterion("C_PROVINCE not like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceIn(List<String> values) {
            addCriterion("C_PROVINCE in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotIn(List<String> values) {
            addCriterion("C_PROVINCE not in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceBetween(String value1, String value2) {
            addCriterion("C_PROVINCE between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotBetween(String value1, String value2) {
            addCriterion("C_PROVINCE not between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCCityIsNull() {
            addCriterion("C_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCCityIsNotNull() {
            addCriterion("C_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCCityEqualTo(String value) {
            addCriterion("C_CITY =", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotEqualTo(String value) {
            addCriterion("C_CITY <>", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThan(String value) {
            addCriterion("C_CITY >", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThanOrEqualTo(String value) {
            addCriterion("C_CITY >=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThan(String value) {
            addCriterion("C_CITY <", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThanOrEqualTo(String value) {
            addCriterion("C_CITY <=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLike(String value) {
            addCriterion("C_CITY like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotLike(String value) {
            addCriterion("C_CITY not like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityIn(List<String> values) {
            addCriterion("C_CITY in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotIn(List<String> values) {
            addCriterion("C_CITY not in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityBetween(String value1, String value2) {
            addCriterion("C_CITY between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotBetween(String value1, String value2) {
            addCriterion("C_CITY not between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCAreaIsNull() {
            addCriterion("C_AREA is null");
            return (Criteria) this;
        }

        public Criteria andCAreaIsNotNull() {
            addCriterion("C_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andCAreaEqualTo(String value) {
            addCriterion("C_AREA =", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotEqualTo(String value) {
            addCriterion("C_AREA <>", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaGreaterThan(String value) {
            addCriterion("C_AREA >", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaGreaterThanOrEqualTo(String value) {
            addCriterion("C_AREA >=", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaLessThan(String value) {
            addCriterion("C_AREA <", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaLessThanOrEqualTo(String value) {
            addCriterion("C_AREA <=", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaLike(String value) {
            addCriterion("C_AREA like", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotLike(String value) {
            addCriterion("C_AREA not like", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaIn(List<String> values) {
            addCriterion("C_AREA in", values, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotIn(List<String> values) {
            addCriterion("C_AREA not in", values, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaBetween(String value1, String value2) {
            addCriterion("C_AREA between", value1, value2, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotBetween(String value1, String value2) {
            addCriterion("C_AREA not between", value1, value2, "cArea");
            return (Criteria) this;
        }

        public Criteria andCStreetIsNull() {
            addCriterion("C_STREET is null");
            return (Criteria) this;
        }

        public Criteria andCStreetIsNotNull() {
            addCriterion("C_STREET is not null");
            return (Criteria) this;
        }

        public Criteria andCStreetEqualTo(String value) {
            addCriterion("C_STREET =", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetNotEqualTo(String value) {
            addCriterion("C_STREET <>", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetGreaterThan(String value) {
            addCriterion("C_STREET >", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetGreaterThanOrEqualTo(String value) {
            addCriterion("C_STREET >=", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetLessThan(String value) {
            addCriterion("C_STREET <", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetLessThanOrEqualTo(String value) {
            addCriterion("C_STREET <=", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetLike(String value) {
            addCriterion("C_STREET like", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetNotLike(String value) {
            addCriterion("C_STREET not like", value, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetIn(List<String> values) {
            addCriterion("C_STREET in", values, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetNotIn(List<String> values) {
            addCriterion("C_STREET not in", values, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetBetween(String value1, String value2) {
            addCriterion("C_STREET between", value1, value2, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCStreetNotBetween(String value1, String value2) {
            addCriterion("C_STREET not between", value1, value2, "cStreet");
            return (Criteria) this;
        }

        public Criteria andCZipcodeIsNull() {
            addCriterion("C_ZIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andCZipcodeIsNotNull() {
            addCriterion("C_ZIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCZipcodeEqualTo(String value) {
            addCriterion("C_ZIPCODE =", value, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeNotEqualTo(String value) {
            addCriterion("C_ZIPCODE <>", value, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeGreaterThan(String value) {
            addCriterion("C_ZIPCODE >", value, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_ZIPCODE >=", value, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeLessThan(String value) {
            addCriterion("C_ZIPCODE <", value, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeLessThanOrEqualTo(String value) {
            addCriterion("C_ZIPCODE <=", value, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeLike(String value) {
            addCriterion("C_ZIPCODE like", value, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeNotLike(String value) {
            addCriterion("C_ZIPCODE not like", value, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeIn(List<String> values) {
            addCriterion("C_ZIPCODE in", values, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeNotIn(List<String> values) {
            addCriterion("C_ZIPCODE not in", values, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeBetween(String value1, String value2) {
            addCriterion("C_ZIPCODE between", value1, value2, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andCZipcodeNotBetween(String value1, String value2) {
            addCriterion("C_ZIPCODE not between", value1, value2, "cZipcode");
            return (Criteria) this;
        }

        public Criteria andMobile1IsNull() {
            addCriterion("MOBILE1 is null");
            return (Criteria) this;
        }

        public Criteria andMobile1IsNotNull() {
            addCriterion("MOBILE1 is not null");
            return (Criteria) this;
        }

        public Criteria andMobile1EqualTo(String value) {
            addCriterion("MOBILE1 =", value, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1NotEqualTo(String value) {
            addCriterion("MOBILE1 <>", value, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1GreaterThan(String value) {
            addCriterion("MOBILE1 >", value, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1GreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE1 >=", value, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1LessThan(String value) {
            addCriterion("MOBILE1 <", value, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1LessThanOrEqualTo(String value) {
            addCriterion("MOBILE1 <=", value, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1Like(String value) {
            addCriterion("MOBILE1 like", value, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1NotLike(String value) {
            addCriterion("MOBILE1 not like", value, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1In(List<String> values) {
            addCriterion("MOBILE1 in", values, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1NotIn(List<String> values) {
            addCriterion("MOBILE1 not in", values, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1Between(String value1, String value2) {
            addCriterion("MOBILE1 between", value1, value2, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile1NotBetween(String value1, String value2) {
            addCriterion("MOBILE1 not between", value1, value2, "mobile1");
            return (Criteria) this;
        }

        public Criteria andMobile2IsNull() {
            addCriterion("MOBILE2 is null");
            return (Criteria) this;
        }

        public Criteria andMobile2IsNotNull() {
            addCriterion("MOBILE2 is not null");
            return (Criteria) this;
        }

        public Criteria andMobile2EqualTo(String value) {
            addCriterion("MOBILE2 =", value, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2NotEqualTo(String value) {
            addCriterion("MOBILE2 <>", value, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2GreaterThan(String value) {
            addCriterion("MOBILE2 >", value, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2GreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE2 >=", value, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2LessThan(String value) {
            addCriterion("MOBILE2 <", value, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2LessThanOrEqualTo(String value) {
            addCriterion("MOBILE2 <=", value, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2Like(String value) {
            addCriterion("MOBILE2 like", value, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2NotLike(String value) {
            addCriterion("MOBILE2 not like", value, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2In(List<String> values) {
            addCriterion("MOBILE2 in", values, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2NotIn(List<String> values) {
            addCriterion("MOBILE2 not in", values, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2Between(String value1, String value2) {
            addCriterion("MOBILE2 between", value1, value2, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile2NotBetween(String value1, String value2) {
            addCriterion("MOBILE2 not between", value1, value2, "mobile2");
            return (Criteria) this;
        }

        public Criteria andMobile3IsNull() {
            addCriterion("MOBILE3 is null");
            return (Criteria) this;
        }

        public Criteria andMobile3IsNotNull() {
            addCriterion("MOBILE3 is not null");
            return (Criteria) this;
        }

        public Criteria andMobile3EqualTo(String value) {
            addCriterion("MOBILE3 =", value, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3NotEqualTo(String value) {
            addCriterion("MOBILE3 <>", value, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3GreaterThan(String value) {
            addCriterion("MOBILE3 >", value, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3GreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE3 >=", value, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3LessThan(String value) {
            addCriterion("MOBILE3 <", value, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3LessThanOrEqualTo(String value) {
            addCriterion("MOBILE3 <=", value, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3Like(String value) {
            addCriterion("MOBILE3 like", value, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3NotLike(String value) {
            addCriterion("MOBILE3 not like", value, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3In(List<String> values) {
            addCriterion("MOBILE3 in", values, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3NotIn(List<String> values) {
            addCriterion("MOBILE3 not in", values, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3Between(String value1, String value2) {
            addCriterion("MOBILE3 between", value1, value2, "mobile3");
            return (Criteria) this;
        }

        public Criteria andMobile3NotBetween(String value1, String value2) {
            addCriterion("MOBILE3 not between", value1, value2, "mobile3");
            return (Criteria) this;
        }

        public Criteria andFTel1IsNull() {
            addCriterion("F_TEL1 is null");
            return (Criteria) this;
        }

        public Criteria andFTel1IsNotNull() {
            addCriterion("F_TEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andFTel1EqualTo(String value) {
            addCriterion("F_TEL1 =", value, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1NotEqualTo(String value) {
            addCriterion("F_TEL1 <>", value, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1GreaterThan(String value) {
            addCriterion("F_TEL1 >", value, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1GreaterThanOrEqualTo(String value) {
            addCriterion("F_TEL1 >=", value, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1LessThan(String value) {
            addCriterion("F_TEL1 <", value, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1LessThanOrEqualTo(String value) {
            addCriterion("F_TEL1 <=", value, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1Like(String value) {
            addCriterion("F_TEL1 like", value, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1NotLike(String value) {
            addCriterion("F_TEL1 not like", value, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1In(List<String> values) {
            addCriterion("F_TEL1 in", values, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1NotIn(List<String> values) {
            addCriterion("F_TEL1 not in", values, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1Between(String value1, String value2) {
            addCriterion("F_TEL1 between", value1, value2, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel1NotBetween(String value1, String value2) {
            addCriterion("F_TEL1 not between", value1, value2, "fTel1");
            return (Criteria) this;
        }

        public Criteria andFTel2IsNull() {
            addCriterion("F_TEL2 is null");
            return (Criteria) this;
        }

        public Criteria andFTel2IsNotNull() {
            addCriterion("F_TEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andFTel2EqualTo(String value) {
            addCriterion("F_TEL2 =", value, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2NotEqualTo(String value) {
            addCriterion("F_TEL2 <>", value, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2GreaterThan(String value) {
            addCriterion("F_TEL2 >", value, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2GreaterThanOrEqualTo(String value) {
            addCriterion("F_TEL2 >=", value, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2LessThan(String value) {
            addCriterion("F_TEL2 <", value, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2LessThanOrEqualTo(String value) {
            addCriterion("F_TEL2 <=", value, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2Like(String value) {
            addCriterion("F_TEL2 like", value, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2NotLike(String value) {
            addCriterion("F_TEL2 not like", value, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2In(List<String> values) {
            addCriterion("F_TEL2 in", values, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2NotIn(List<String> values) {
            addCriterion("F_TEL2 not in", values, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2Between(String value1, String value2) {
            addCriterion("F_TEL2 between", value1, value2, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel2NotBetween(String value1, String value2) {
            addCriterion("F_TEL2 not between", value1, value2, "fTel2");
            return (Criteria) this;
        }

        public Criteria andFTel3IsNull() {
            addCriterion("F_TEL3 is null");
            return (Criteria) this;
        }

        public Criteria andFTel3IsNotNull() {
            addCriterion("F_TEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andFTel3EqualTo(String value) {
            addCriterion("F_TEL3 =", value, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3NotEqualTo(String value) {
            addCriterion("F_TEL3 <>", value, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3GreaterThan(String value) {
            addCriterion("F_TEL3 >", value, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3GreaterThanOrEqualTo(String value) {
            addCriterion("F_TEL3 >=", value, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3LessThan(String value) {
            addCriterion("F_TEL3 <", value, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3LessThanOrEqualTo(String value) {
            addCriterion("F_TEL3 <=", value, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3Like(String value) {
            addCriterion("F_TEL3 like", value, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3NotLike(String value) {
            addCriterion("F_TEL3 not like", value, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3In(List<String> values) {
            addCriterion("F_TEL3 in", values, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3NotIn(List<String> values) {
            addCriterion("F_TEL3 not in", values, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3Between(String value1, String value2) {
            addCriterion("F_TEL3 between", value1, value2, "fTel3");
            return (Criteria) this;
        }

        public Criteria andFTel3NotBetween(String value1, String value2) {
            addCriterion("F_TEL3 not between", value1, value2, "fTel3");
            return (Criteria) this;
        }

        public Criteria andCTel1IsNull() {
            addCriterion("C_TEL1 is null");
            return (Criteria) this;
        }

        public Criteria andCTel1IsNotNull() {
            addCriterion("C_TEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andCTel1EqualTo(String value) {
            addCriterion("C_TEL1 =", value, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1NotEqualTo(String value) {
            addCriterion("C_TEL1 <>", value, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1GreaterThan(String value) {
            addCriterion("C_TEL1 >", value, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1GreaterThanOrEqualTo(String value) {
            addCriterion("C_TEL1 >=", value, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1LessThan(String value) {
            addCriterion("C_TEL1 <", value, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1LessThanOrEqualTo(String value) {
            addCriterion("C_TEL1 <=", value, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1Like(String value) {
            addCriterion("C_TEL1 like", value, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1NotLike(String value) {
            addCriterion("C_TEL1 not like", value, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1In(List<String> values) {
            addCriterion("C_TEL1 in", values, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1NotIn(List<String> values) {
            addCriterion("C_TEL1 not in", values, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1Between(String value1, String value2) {
            addCriterion("C_TEL1 between", value1, value2, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel1NotBetween(String value1, String value2) {
            addCriterion("C_TEL1 not between", value1, value2, "cTel1");
            return (Criteria) this;
        }

        public Criteria andCTel2IsNull() {
            addCriterion("C_TEL2 is null");
            return (Criteria) this;
        }

        public Criteria andCTel2IsNotNull() {
            addCriterion("C_TEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andCTel2EqualTo(String value) {
            addCriterion("C_TEL2 =", value, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2NotEqualTo(String value) {
            addCriterion("C_TEL2 <>", value, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2GreaterThan(String value) {
            addCriterion("C_TEL2 >", value, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2GreaterThanOrEqualTo(String value) {
            addCriterion("C_TEL2 >=", value, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2LessThan(String value) {
            addCriterion("C_TEL2 <", value, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2LessThanOrEqualTo(String value) {
            addCriterion("C_TEL2 <=", value, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2Like(String value) {
            addCriterion("C_TEL2 like", value, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2NotLike(String value) {
            addCriterion("C_TEL2 not like", value, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2In(List<String> values) {
            addCriterion("C_TEL2 in", values, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2NotIn(List<String> values) {
            addCriterion("C_TEL2 not in", values, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2Between(String value1, String value2) {
            addCriterion("C_TEL2 between", value1, value2, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel2NotBetween(String value1, String value2) {
            addCriterion("C_TEL2 not between", value1, value2, "cTel2");
            return (Criteria) this;
        }

        public Criteria andCTel3IsNull() {
            addCriterion("C_TEL3 is null");
            return (Criteria) this;
        }

        public Criteria andCTel3IsNotNull() {
            addCriterion("C_TEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andCTel3EqualTo(String value) {
            addCriterion("C_TEL3 =", value, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3NotEqualTo(String value) {
            addCriterion("C_TEL3 <>", value, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3GreaterThan(String value) {
            addCriterion("C_TEL3 >", value, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3GreaterThanOrEqualTo(String value) {
            addCriterion("C_TEL3 >=", value, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3LessThan(String value) {
            addCriterion("C_TEL3 <", value, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3LessThanOrEqualTo(String value) {
            addCriterion("C_TEL3 <=", value, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3Like(String value) {
            addCriterion("C_TEL3 like", value, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3NotLike(String value) {
            addCriterion("C_TEL3 not like", value, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3In(List<String> values) {
            addCriterion("C_TEL3 in", values, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3NotIn(List<String> values) {
            addCriterion("C_TEL3 not in", values, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3Between(String value1, String value2) {
            addCriterion("C_TEL3 between", value1, value2, "cTel3");
            return (Criteria) this;
        }

        public Criteria andCTel3NotBetween(String value1, String value2) {
            addCriterion("C_TEL3 not between", value1, value2, "cTel3");
            return (Criteria) this;
        }

        public Criteria andEmail1IsNull() {
            addCriterion("EMAIL1 is null");
            return (Criteria) this;
        }

        public Criteria andEmail1IsNotNull() {
            addCriterion("EMAIL1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmail1EqualTo(String value) {
            addCriterion("EMAIL1 =", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotEqualTo(String value) {
            addCriterion("EMAIL1 <>", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1GreaterThan(String value) {
            addCriterion("EMAIL1 >", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1GreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL1 >=", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1LessThan(String value) {
            addCriterion("EMAIL1 <", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1LessThanOrEqualTo(String value) {
            addCriterion("EMAIL1 <=", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1Like(String value) {
            addCriterion("EMAIL1 like", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotLike(String value) {
            addCriterion("EMAIL1 not like", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1In(List<String> values) {
            addCriterion("EMAIL1 in", values, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotIn(List<String> values) {
            addCriterion("EMAIL1 not in", values, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1Between(String value1, String value2) {
            addCriterion("EMAIL1 between", value1, value2, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotBetween(String value1, String value2) {
            addCriterion("EMAIL1 not between", value1, value2, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail2IsNull() {
            addCriterion("EMAIL2 is null");
            return (Criteria) this;
        }

        public Criteria andEmail2IsNotNull() {
            addCriterion("EMAIL2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmail2EqualTo(String value) {
            addCriterion("EMAIL2 =", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotEqualTo(String value) {
            addCriterion("EMAIL2 <>", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2GreaterThan(String value) {
            addCriterion("EMAIL2 >", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2GreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL2 >=", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2LessThan(String value) {
            addCriterion("EMAIL2 <", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2LessThanOrEqualTo(String value) {
            addCriterion("EMAIL2 <=", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2Like(String value) {
            addCriterion("EMAIL2 like", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotLike(String value) {
            addCriterion("EMAIL2 not like", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2In(List<String> values) {
            addCriterion("EMAIL2 in", values, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotIn(List<String> values) {
            addCriterion("EMAIL2 not in", values, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2Between(String value1, String value2) {
            addCriterion("EMAIL2 between", value1, value2, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotBetween(String value1, String value2) {
            addCriterion("EMAIL2 not between", value1, value2, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail3IsNull() {
            addCriterion("EMAIL3 is null");
            return (Criteria) this;
        }

        public Criteria andEmail3IsNotNull() {
            addCriterion("EMAIL3 is not null");
            return (Criteria) this;
        }

        public Criteria andEmail3EqualTo(String value) {
            addCriterion("EMAIL3 =", value, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3NotEqualTo(String value) {
            addCriterion("EMAIL3 <>", value, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3GreaterThan(String value) {
            addCriterion("EMAIL3 >", value, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3GreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL3 >=", value, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3LessThan(String value) {
            addCriterion("EMAIL3 <", value, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3LessThanOrEqualTo(String value) {
            addCriterion("EMAIL3 <=", value, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3Like(String value) {
            addCriterion("EMAIL3 like", value, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3NotLike(String value) {
            addCriterion("EMAIL3 not like", value, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3In(List<String> values) {
            addCriterion("EMAIL3 in", values, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3NotIn(List<String> values) {
            addCriterion("EMAIL3 not in", values, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3Between(String value1, String value2) {
            addCriterion("EMAIL3 between", value1, value2, "email3");
            return (Criteria) this;
        }

        public Criteria andEmail3NotBetween(String value1, String value2) {
            addCriterion("EMAIL3 not between", value1, value2, "email3");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNull() {
            addCriterion("CREDIT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNotNull() {
            addCriterion("CREDIT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountEqualTo(Integer value) {
            addCriterion("CREDIT_AMOUNT =", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotEqualTo(Integer value) {
            addCriterion("CREDIT_AMOUNT <>", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThan(Integer value) {
            addCriterion("CREDIT_AMOUNT >", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREDIT_AMOUNT >=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThan(Integer value) {
            addCriterion("CREDIT_AMOUNT <", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThanOrEqualTo(Integer value) {
            addCriterion("CREDIT_AMOUNT <=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIn(List<Integer> values) {
            addCriterion("CREDIT_AMOUNT in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotIn(List<Integer> values) {
            addCriterion("CREDIT_AMOUNT not in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountBetween(Integer value1, Integer value2) {
            addCriterion("CREDIT_AMOUNT between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("CREDIT_AMOUNT not between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityIsNull() {
            addCriterion("SOCIALl_SECURITY is null");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityIsNotNull() {
            addCriterion("SOCIALl_SECURITY is not null");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityEqualTo(String value) {
            addCriterion("SOCIALl_SECURITY =", value, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityNotEqualTo(String value) {
            addCriterion("SOCIALl_SECURITY <>", value, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityGreaterThan(String value) {
            addCriterion("SOCIALl_SECURITY >", value, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIALl_SECURITY >=", value, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityLessThan(String value) {
            addCriterion("SOCIALl_SECURITY <", value, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityLessThanOrEqualTo(String value) {
            addCriterion("SOCIALl_SECURITY <=", value, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityLike(String value) {
            addCriterion("SOCIALl_SECURITY like", value, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityNotLike(String value) {
            addCriterion("SOCIALl_SECURITY not like", value, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityIn(List<String> values) {
            addCriterion("SOCIALl_SECURITY in", values, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityNotIn(List<String> values) {
            addCriterion("SOCIALl_SECURITY not in", values, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityBetween(String value1, String value2) {
            addCriterion("SOCIALl_SECURITY between", value1, value2, "sociallSecurity");
            return (Criteria) this;
        }

        public Criteria andSociallSecurityNotBetween(String value1, String value2) {
            addCriterion("SOCIALl_SECURITY not between", value1, value2, "sociallSecurity");
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
     * 描述:nplm_borrower_info表的实体类
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
     * nplm_borrower_info 2018-09-17
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