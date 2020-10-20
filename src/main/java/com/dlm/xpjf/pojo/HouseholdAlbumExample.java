package com.dlm.xpjf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseholdAlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseholdAlbumExample() {
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

        public Criteria andAlbumTitleIsNull() {
            addCriterion("album_title is null");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleIsNotNull() {
            addCriterion("album_title is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleEqualTo(String value) {
            addCriterion("album_title =", value, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleNotEqualTo(String value) {
            addCriterion("album_title <>", value, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleGreaterThan(String value) {
            addCriterion("album_title >", value, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleGreaterThanOrEqualTo(String value) {
            addCriterion("album_title >=", value, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleLessThan(String value) {
            addCriterion("album_title <", value, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleLessThanOrEqualTo(String value) {
            addCriterion("album_title <=", value, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleLike(String value) {
            addCriterion("album_title like", value, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleNotLike(String value) {
            addCriterion("album_title not like", value, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleIn(List<String> values) {
            addCriterion("album_title in", values, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleNotIn(List<String> values) {
            addCriterion("album_title not in", values, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleBetween(String value1, String value2) {
            addCriterion("album_title between", value1, value2, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumTitleNotBetween(String value1, String value2) {
            addCriterion("album_title not between", value1, value2, "albumTitle");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionIsNull() {
            addCriterion("album_description is null");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionIsNotNull() {
            addCriterion("album_description is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionEqualTo(String value) {
            addCriterion("album_description =", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionNotEqualTo(String value) {
            addCriterion("album_description <>", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionGreaterThan(String value) {
            addCriterion("album_description >", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("album_description >=", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionLessThan(String value) {
            addCriterion("album_description <", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionLessThanOrEqualTo(String value) {
            addCriterion("album_description <=", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionLike(String value) {
            addCriterion("album_description like", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionNotLike(String value) {
            addCriterion("album_description not like", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionIn(List<String> values) {
            addCriterion("album_description in", values, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionNotIn(List<String> values) {
            addCriterion("album_description not in", values, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionBetween(String value1, String value2) {
            addCriterion("album_description between", value1, value2, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionNotBetween(String value1, String value2) {
            addCriterion("album_description not between", value1, value2, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverIsNull() {
            addCriterion("album_cover is null");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverIsNotNull() {
            addCriterion("album_cover is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverEqualTo(String value) {
            addCriterion("album_cover =", value, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverNotEqualTo(String value) {
            addCriterion("album_cover <>", value, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverGreaterThan(String value) {
            addCriterion("album_cover >", value, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverGreaterThanOrEqualTo(String value) {
            addCriterion("album_cover >=", value, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverLessThan(String value) {
            addCriterion("album_cover <", value, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverLessThanOrEqualTo(String value) {
            addCriterion("album_cover <=", value, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverLike(String value) {
            addCriterion("album_cover like", value, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverNotLike(String value) {
            addCriterion("album_cover not like", value, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverIn(List<String> values) {
            addCriterion("album_cover in", values, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverNotIn(List<String> values) {
            addCriterion("album_cover not in", values, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverBetween(String value1, String value2) {
            addCriterion("album_cover between", value1, value2, "albumCover");
            return (Criteria) this;
        }

        public Criteria andAlbumCoverNotBetween(String value1, String value2) {
            addCriterion("album_cover not between", value1, value2, "albumCover");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdIsNull() {
            addCriterion("household_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdIsNotNull() {
            addCriterion("household_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdEqualTo(Integer value) {
            addCriterion("household_id =", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdNotEqualTo(Integer value) {
            addCriterion("household_id <>", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdGreaterThan(Integer value) {
            addCriterion("household_id >", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("household_id >=", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdLessThan(Integer value) {
            addCriterion("household_id <", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdLessThanOrEqualTo(Integer value) {
            addCriterion("household_id <=", value, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdIn(List<Integer> values) {
            addCriterion("household_id in", values, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdNotIn(List<Integer> values) {
            addCriterion("household_id not in", values, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdBetween(Integer value1, Integer value2) {
            addCriterion("household_id between", value1, value2, "householdId");
            return (Criteria) this;
        }

        public Criteria andHouseholdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("household_id not between", value1, value2, "householdId");
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