package com.dlm.xpjf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseholdInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseholdInfoExample() {
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

        public Criteria andHouseholdNameIsNull() {
            addCriterion("household_name is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameIsNotNull() {
            addCriterion("household_name is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameEqualTo(String value) {
            addCriterion("household_name =", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameNotEqualTo(String value) {
            addCriterion("household_name <>", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameGreaterThan(String value) {
            addCriterion("household_name >", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameGreaterThanOrEqualTo(String value) {
            addCriterion("household_name >=", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameLessThan(String value) {
            addCriterion("household_name <", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameLessThanOrEqualTo(String value) {
            addCriterion("household_name <=", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameLike(String value) {
            addCriterion("household_name like", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameNotLike(String value) {
            addCriterion("household_name not like", value, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameIn(List<String> values) {
            addCriterion("household_name in", values, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameNotIn(List<String> values) {
            addCriterion("household_name not in", values, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameBetween(String value1, String value2) {
            addCriterion("household_name between", value1, value2, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdNameNotBetween(String value1, String value2) {
            addCriterion("household_name not between", value1, value2, "householdName");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailIsNull() {
            addCriterion("household_detail is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailIsNotNull() {
            addCriterion("household_detail is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailEqualTo(String value) {
            addCriterion("household_detail =", value, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailNotEqualTo(String value) {
            addCriterion("household_detail <>", value, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailGreaterThan(String value) {
            addCriterion("household_detail >", value, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailGreaterThanOrEqualTo(String value) {
            addCriterion("household_detail >=", value, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailLessThan(String value) {
            addCriterion("household_detail <", value, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailLessThanOrEqualTo(String value) {
            addCriterion("household_detail <=", value, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailLike(String value) {
            addCriterion("household_detail like", value, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailNotLike(String value) {
            addCriterion("household_detail not like", value, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailIn(List<String> values) {
            addCriterion("household_detail in", values, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailNotIn(List<String> values) {
            addCriterion("household_detail not in", values, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailBetween(String value1, String value2) {
            addCriterion("household_detail between", value1, value2, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholdDetailNotBetween(String value1, String value2) {
            addCriterion("household_detail not between", value1, value2, "householdDetail");
            return (Criteria) this;
        }

        public Criteria andHeadIdIsNull() {
            addCriterion("head_id is null");
            return (Criteria) this;
        }

        public Criteria andHeadIdIsNotNull() {
            addCriterion("head_id is not null");
            return (Criteria) this;
        }

        public Criteria andHeadIdEqualTo(Integer value) {
            addCriterion("head_id =", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdNotEqualTo(Integer value) {
            addCriterion("head_id <>", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdGreaterThan(Integer value) {
            addCriterion("head_id >", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("head_id >=", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdLessThan(Integer value) {
            addCriterion("head_id <", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdLessThanOrEqualTo(Integer value) {
            addCriterion("head_id <=", value, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdIn(List<Integer> values) {
            addCriterion("head_id in", values, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdNotIn(List<Integer> values) {
            addCriterion("head_id not in", values, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdBetween(Integer value1, Integer value2) {
            addCriterion("head_id between", value1, value2, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("head_id not between", value1, value2, "headId");
            return (Criteria) this;
        }

        public Criteria andHeadNameIsNull() {
            addCriterion("head_name is null");
            return (Criteria) this;
        }

        public Criteria andHeadNameIsNotNull() {
            addCriterion("head_name is not null");
            return (Criteria) this;
        }

        public Criteria andHeadNameEqualTo(String value) {
            addCriterion("head_name =", value, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameNotEqualTo(String value) {
            addCriterion("head_name <>", value, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameGreaterThan(String value) {
            addCriterion("head_name >", value, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameGreaterThanOrEqualTo(String value) {
            addCriterion("head_name >=", value, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameLessThan(String value) {
            addCriterion("head_name <", value, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameLessThanOrEqualTo(String value) {
            addCriterion("head_name <=", value, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameLike(String value) {
            addCriterion("head_name like", value, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameNotLike(String value) {
            addCriterion("head_name not like", value, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameIn(List<String> values) {
            addCriterion("head_name in", values, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameNotIn(List<String> values) {
            addCriterion("head_name not in", values, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameBetween(String value1, String value2) {
            addCriterion("head_name between", value1, value2, "headName");
            return (Criteria) this;
        }

        public Criteria andHeadNameNotBetween(String value1, String value2) {
            addCriterion("head_name not between", value1, value2, "headName");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNull() {
            addCriterion("surname is null");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNotNull() {
            addCriterion("surname is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameEqualTo(String value) {
            addCriterion("surname =", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotEqualTo(String value) {
            addCriterion("surname <>", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThan(String value) {
            addCriterion("surname >", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThanOrEqualTo(String value) {
            addCriterion("surname >=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThan(String value) {
            addCriterion("surname <", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThanOrEqualTo(String value) {
            addCriterion("surname <=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLike(String value) {
            addCriterion("surname like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotLike(String value) {
            addCriterion("surname not like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameIn(List<String> values) {
            addCriterion("surname in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotIn(List<String> values) {
            addCriterion("surname not in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameBetween(String value1, String value2) {
            addCriterion("surname between", value1, value2, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotBetween(String value1, String value2) {
            addCriterion("surname not between", value1, value2, "surname");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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