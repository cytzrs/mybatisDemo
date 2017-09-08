package com.test.org.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QaRegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QaRegionExample() {
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

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(String value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(String value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(String value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(String value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLike(String value) {
            addCriterion("CREATOR_ID like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotLike(String value) {
            addCriterion("CREATOR_ID not like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<String> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<String> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(String value1, String value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(String value1, String value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andIsPublicIsNull() {
            addCriterion("IS_PUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andIsPublicIsNotNull() {
            addCriterion("IS_PUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublicEqualTo(Byte value) {
            addCriterion("IS_PUBLIC =", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotEqualTo(Byte value) {
            addCriterion("IS_PUBLIC <>", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicGreaterThan(Byte value) {
            addCriterion("IS_PUBLIC >", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_PUBLIC >=", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLessThan(Byte value) {
            addCriterion("IS_PUBLIC <", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLessThanOrEqualTo(Byte value) {
            addCriterion("IS_PUBLIC <=", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicIn(List<Byte> values) {
            addCriterion("IS_PUBLIC in", values, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotIn(List<Byte> values) {
            addCriterion("IS_PUBLIC not in", values, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicBetween(Byte value1, Byte value2) {
            addCriterion("IS_PUBLIC between", value1, value2, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_PUBLIC not between", value1, value2, "isPublic");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("IMAGE =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("IMAGE <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("IMAGE >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("IMAGE <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("IMAGE <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("IMAGE like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("IMAGE not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("IMAGE in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("IMAGE not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("IMAGE between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("IMAGE not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andAnserCountIsNull() {
            addCriterion("ANSER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAnserCountIsNotNull() {
            addCriterion("ANSER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAnserCountEqualTo(Integer value) {
            addCriterion("ANSER_COUNT =", value, "anserCount");
            return (Criteria) this;
        }

        public Criteria andAnserCountNotEqualTo(Integer value) {
            addCriterion("ANSER_COUNT <>", value, "anserCount");
            return (Criteria) this;
        }

        public Criteria andAnserCountGreaterThan(Integer value) {
            addCriterion("ANSER_COUNT >", value, "anserCount");
            return (Criteria) this;
        }

        public Criteria andAnserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ANSER_COUNT >=", value, "anserCount");
            return (Criteria) this;
        }

        public Criteria andAnserCountLessThan(Integer value) {
            addCriterion("ANSER_COUNT <", value, "anserCount");
            return (Criteria) this;
        }

        public Criteria andAnserCountLessThanOrEqualTo(Integer value) {
            addCriterion("ANSER_COUNT <=", value, "anserCount");
            return (Criteria) this;
        }

        public Criteria andAnserCountIn(List<Integer> values) {
            addCriterion("ANSER_COUNT in", values, "anserCount");
            return (Criteria) this;
        }

        public Criteria andAnserCountNotIn(List<Integer> values) {
            addCriterion("ANSER_COUNT not in", values, "anserCount");
            return (Criteria) this;
        }

        public Criteria andAnserCountBetween(Integer value1, Integer value2) {
            addCriterion("ANSER_COUNT between", value1, value2, "anserCount");
            return (Criteria) this;
        }

        public Criteria andAnserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ANSER_COUNT not between", value1, value2, "anserCount");
            return (Criteria) this;
        }

        public Criteria andInstroduceIsNull() {
            addCriterion("INSTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andInstroduceIsNotNull() {
            addCriterion("INSTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andInstroduceEqualTo(String value) {
            addCriterion("INSTRODUCE =", value, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceNotEqualTo(String value) {
            addCriterion("INSTRODUCE <>", value, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceGreaterThan(String value) {
            addCriterion("INSTRODUCE >", value, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceGreaterThanOrEqualTo(String value) {
            addCriterion("INSTRODUCE >=", value, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceLessThan(String value) {
            addCriterion("INSTRODUCE <", value, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceLessThanOrEqualTo(String value) {
            addCriterion("INSTRODUCE <=", value, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceLike(String value) {
            addCriterion("INSTRODUCE like", value, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceNotLike(String value) {
            addCriterion("INSTRODUCE not like", value, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceIn(List<String> values) {
            addCriterion("INSTRODUCE in", values, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceNotIn(List<String> values) {
            addCriterion("INSTRODUCE not in", values, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceBetween(String value1, String value2) {
            addCriterion("INSTRODUCE between", value1, value2, "instroduce");
            return (Criteria) this;
        }

        public Criteria andInstroduceNotBetween(String value1, String value2) {
            addCriterion("INSTRODUCE not between", value1, value2, "instroduce");
            return (Criteria) this;
        }

        public Criteria andIsAuditingIsNull() {
            addCriterion("IS_AUDITING is null");
            return (Criteria) this;
        }

        public Criteria andIsAuditingIsNotNull() {
            addCriterion("IS_AUDITING is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuditingEqualTo(String value) {
            addCriterion("IS_AUDITING =", value, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingNotEqualTo(String value) {
            addCriterion("IS_AUDITING <>", value, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingGreaterThan(String value) {
            addCriterion("IS_AUDITING >", value, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AUDITING >=", value, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingLessThan(String value) {
            addCriterion("IS_AUDITING <", value, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingLessThanOrEqualTo(String value) {
            addCriterion("IS_AUDITING <=", value, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingLike(String value) {
            addCriterion("IS_AUDITING like", value, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingNotLike(String value) {
            addCriterion("IS_AUDITING not like", value, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingIn(List<String> values) {
            addCriterion("IS_AUDITING in", values, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingNotIn(List<String> values) {
            addCriterion("IS_AUDITING not in", values, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingBetween(String value1, String value2) {
            addCriterion("IS_AUDITING between", value1, value2, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andIsAuditingNotBetween(String value1, String value2) {
            addCriterion("IS_AUDITING not between", value1, value2, "isAuditing");
            return (Criteria) this;
        }

        public Criteria andOrderTagsIsNull() {
            addCriterion("ORDER_TAGS is null");
            return (Criteria) this;
        }

        public Criteria andOrderTagsIsNotNull() {
            addCriterion("ORDER_TAGS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTagsEqualTo(String value) {
            addCriterion("ORDER_TAGS =", value, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsNotEqualTo(String value) {
            addCriterion("ORDER_TAGS <>", value, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsGreaterThan(String value) {
            addCriterion("ORDER_TAGS >", value, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TAGS >=", value, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsLessThan(String value) {
            addCriterion("ORDER_TAGS <", value, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TAGS <=", value, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsLike(String value) {
            addCriterion("ORDER_TAGS like", value, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsNotLike(String value) {
            addCriterion("ORDER_TAGS not like", value, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsIn(List<String> values) {
            addCriterion("ORDER_TAGS in", values, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsNotIn(List<String> values) {
            addCriterion("ORDER_TAGS not in", values, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsBetween(String value1, String value2) {
            addCriterion("ORDER_TAGS between", value1, value2, "orderTags");
            return (Criteria) this;
        }

        public Criteria andOrderTagsNotBetween(String value1, String value2) {
            addCriterion("ORDER_TAGS not between", value1, value2, "orderTags");
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

        public Criteria andAliveFlagIsNull() {
            addCriterion("ALIVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAliveFlagIsNotNull() {
            addCriterion("ALIVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAliveFlagEqualTo(String value) {
            addCriterion("ALIVE_FLAG =", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagNotEqualTo(String value) {
            addCriterion("ALIVE_FLAG <>", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagGreaterThan(String value) {
            addCriterion("ALIVE_FLAG >", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ALIVE_FLAG >=", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagLessThan(String value) {
            addCriterion("ALIVE_FLAG <", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagLessThanOrEqualTo(String value) {
            addCriterion("ALIVE_FLAG <=", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagLike(String value) {
            addCriterion("ALIVE_FLAG like", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagNotLike(String value) {
            addCriterion("ALIVE_FLAG not like", value, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagIn(List<String> values) {
            addCriterion("ALIVE_FLAG in", values, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagNotIn(List<String> values) {
            addCriterion("ALIVE_FLAG not in", values, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagBetween(String value1, String value2) {
            addCriterion("ALIVE_FLAG between", value1, value2, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andAliveFlagNotBetween(String value1, String value2) {
            addCriterion("ALIVE_FLAG not between", value1, value2, "aliveFlag");
            return (Criteria) this;
        }

        public Criteria andMarketIdIsNull() {
            addCriterion("MARKET_ID is null");
            return (Criteria) this;
        }

        public Criteria andMarketIdIsNotNull() {
            addCriterion("MARKET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMarketIdEqualTo(String value) {
            addCriterion("MARKET_ID =", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotEqualTo(String value) {
            addCriterion("MARKET_ID <>", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThan(String value) {
            addCriterion("MARKET_ID >", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThanOrEqualTo(String value) {
            addCriterion("MARKET_ID >=", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThan(String value) {
            addCriterion("MARKET_ID <", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThanOrEqualTo(String value) {
            addCriterion("MARKET_ID <=", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLike(String value) {
            addCriterion("MARKET_ID like", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotLike(String value) {
            addCriterion("MARKET_ID not like", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdIn(List<String> values) {
            addCriterion("MARKET_ID in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotIn(List<String> values) {
            addCriterion("MARKET_ID not in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdBetween(String value1, String value2) {
            addCriterion("MARKET_ID between", value1, value2, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotBetween(String value1, String value2) {
            addCriterion("MARKET_ID not between", value1, value2, "marketId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("EXT1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("EXT1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("EXT1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("EXT1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("EXT1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("EXT1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("EXT1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("EXT1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("EXT1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("EXT1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("EXT1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("EXT1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("EXT1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("EXT1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("EXT2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("EXT2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("EXT2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("EXT2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("EXT2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("EXT2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("EXT2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("EXT2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("EXT2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("EXT2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("EXT2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("EXT2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("EXT2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("EXT2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("EXT3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("EXT3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("EXT3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("EXT3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("EXT3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("EXT3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("EXT3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("EXT3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("EXT3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("EXT3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("EXT3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("EXT3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("EXT3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("EXT3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt4IsNull() {
            addCriterion("EXT4 is null");
            return (Criteria) this;
        }

        public Criteria andExt4IsNotNull() {
            addCriterion("EXT4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt4EqualTo(String value) {
            addCriterion("EXT4 =", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotEqualTo(String value) {
            addCriterion("EXT4 <>", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThan(String value) {
            addCriterion("EXT4 >", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThanOrEqualTo(String value) {
            addCriterion("EXT4 >=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThan(String value) {
            addCriterion("EXT4 <", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThanOrEqualTo(String value) {
            addCriterion("EXT4 <=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Like(String value) {
            addCriterion("EXT4 like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotLike(String value) {
            addCriterion("EXT4 not like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4In(List<String> values) {
            addCriterion("EXT4 in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotIn(List<String> values) {
            addCriterion("EXT4 not in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Between(String value1, String value2) {
            addCriterion("EXT4 between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotBetween(String value1, String value2) {
            addCriterion("EXT4 not between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt5IsNull() {
            addCriterion("EXT5 is null");
            return (Criteria) this;
        }

        public Criteria andExt5IsNotNull() {
            addCriterion("EXT5 is not null");
            return (Criteria) this;
        }

        public Criteria andExt5EqualTo(String value) {
            addCriterion("EXT5 =", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotEqualTo(String value) {
            addCriterion("EXT5 <>", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThan(String value) {
            addCriterion("EXT5 >", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThanOrEqualTo(String value) {
            addCriterion("EXT5 >=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThan(String value) {
            addCriterion("EXT5 <", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThanOrEqualTo(String value) {
            addCriterion("EXT5 <=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Like(String value) {
            addCriterion("EXT5 like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotLike(String value) {
            addCriterion("EXT5 not like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5In(List<String> values) {
            addCriterion("EXT5 in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotIn(List<String> values) {
            addCriterion("EXT5 not in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Between(String value1, String value2) {
            addCriterion("EXT5 between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotBetween(String value1, String value2) {
            addCriterion("EXT5 not between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt6IsNull() {
            addCriterion("EXT6 is null");
            return (Criteria) this;
        }

        public Criteria andExt6IsNotNull() {
            addCriterion("EXT6 is not null");
            return (Criteria) this;
        }

        public Criteria andExt6EqualTo(String value) {
            addCriterion("EXT6 =", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotEqualTo(String value) {
            addCriterion("EXT6 <>", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6GreaterThan(String value) {
            addCriterion("EXT6 >", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6GreaterThanOrEqualTo(String value) {
            addCriterion("EXT6 >=", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6LessThan(String value) {
            addCriterion("EXT6 <", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6LessThanOrEqualTo(String value) {
            addCriterion("EXT6 <=", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6Like(String value) {
            addCriterion("EXT6 like", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotLike(String value) {
            addCriterion("EXT6 not like", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6In(List<String> values) {
            addCriterion("EXT6 in", values, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotIn(List<String> values) {
            addCriterion("EXT6 not in", values, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6Between(String value1, String value2) {
            addCriterion("EXT6 between", value1, value2, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotBetween(String value1, String value2) {
            addCriterion("EXT6 not between", value1, value2, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt7IsNull() {
            addCriterion("EXT7 is null");
            return (Criteria) this;
        }

        public Criteria andExt7IsNotNull() {
            addCriterion("EXT7 is not null");
            return (Criteria) this;
        }

        public Criteria andExt7EqualTo(String value) {
            addCriterion("EXT7 =", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotEqualTo(String value) {
            addCriterion("EXT7 <>", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7GreaterThan(String value) {
            addCriterion("EXT7 >", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7GreaterThanOrEqualTo(String value) {
            addCriterion("EXT7 >=", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7LessThan(String value) {
            addCriterion("EXT7 <", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7LessThanOrEqualTo(String value) {
            addCriterion("EXT7 <=", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7Like(String value) {
            addCriterion("EXT7 like", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotLike(String value) {
            addCriterion("EXT7 not like", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7In(List<String> values) {
            addCriterion("EXT7 in", values, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotIn(List<String> values) {
            addCriterion("EXT7 not in", values, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7Between(String value1, String value2) {
            addCriterion("EXT7 between", value1, value2, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotBetween(String value1, String value2) {
            addCriterion("EXT7 not between", value1, value2, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt8IsNull() {
            addCriterion("EXT8 is null");
            return (Criteria) this;
        }

        public Criteria andExt8IsNotNull() {
            addCriterion("EXT8 is not null");
            return (Criteria) this;
        }

        public Criteria andExt8EqualTo(String value) {
            addCriterion("EXT8 =", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotEqualTo(String value) {
            addCriterion("EXT8 <>", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8GreaterThan(String value) {
            addCriterion("EXT8 >", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8GreaterThanOrEqualTo(String value) {
            addCriterion("EXT8 >=", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8LessThan(String value) {
            addCriterion("EXT8 <", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8LessThanOrEqualTo(String value) {
            addCriterion("EXT8 <=", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8Like(String value) {
            addCriterion("EXT8 like", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotLike(String value) {
            addCriterion("EXT8 not like", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8In(List<String> values) {
            addCriterion("EXT8 in", values, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotIn(List<String> values) {
            addCriterion("EXT8 not in", values, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8Between(String value1, String value2) {
            addCriterion("EXT8 between", value1, value2, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotBetween(String value1, String value2) {
            addCriterion("EXT8 not between", value1, value2, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt9IsNull() {
            addCriterion("EXT9 is null");
            return (Criteria) this;
        }

        public Criteria andExt9IsNotNull() {
            addCriterion("EXT9 is not null");
            return (Criteria) this;
        }

        public Criteria andExt9EqualTo(String value) {
            addCriterion("EXT9 =", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9NotEqualTo(String value) {
            addCriterion("EXT9 <>", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9GreaterThan(String value) {
            addCriterion("EXT9 >", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9GreaterThanOrEqualTo(String value) {
            addCriterion("EXT9 >=", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9LessThan(String value) {
            addCriterion("EXT9 <", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9LessThanOrEqualTo(String value) {
            addCriterion("EXT9 <=", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9Like(String value) {
            addCriterion("EXT9 like", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9NotLike(String value) {
            addCriterion("EXT9 not like", value, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9In(List<String> values) {
            addCriterion("EXT9 in", values, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9NotIn(List<String> values) {
            addCriterion("EXT9 not in", values, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9Between(String value1, String value2) {
            addCriterion("EXT9 between", value1, value2, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt9NotBetween(String value1, String value2) {
            addCriterion("EXT9 not between", value1, value2, "ext9");
            return (Criteria) this;
        }

        public Criteria andExt10IsNull() {
            addCriterion("EXT10 is null");
            return (Criteria) this;
        }

        public Criteria andExt10IsNotNull() {
            addCriterion("EXT10 is not null");
            return (Criteria) this;
        }

        public Criteria andExt10EqualTo(String value) {
            addCriterion("EXT10 =", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10NotEqualTo(String value) {
            addCriterion("EXT10 <>", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10GreaterThan(String value) {
            addCriterion("EXT10 >", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10GreaterThanOrEqualTo(String value) {
            addCriterion("EXT10 >=", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10LessThan(String value) {
            addCriterion("EXT10 <", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10LessThanOrEqualTo(String value) {
            addCriterion("EXT10 <=", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10Like(String value) {
            addCriterion("EXT10 like", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10NotLike(String value) {
            addCriterion("EXT10 not like", value, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10In(List<String> values) {
            addCriterion("EXT10 in", values, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10NotIn(List<String> values) {
            addCriterion("EXT10 not in", values, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10Between(String value1, String value2) {
            addCriterion("EXT10 between", value1, value2, "ext10");
            return (Criteria) this;
        }

        public Criteria andExt10NotBetween(String value1, String value2) {
            addCriterion("EXT10 not between", value1, value2, "ext10");
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