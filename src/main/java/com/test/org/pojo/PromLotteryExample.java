package com.test.org.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PromLotteryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromLotteryExample() {
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

        public Criteria andLotteryIdIsNull() {
            addCriterion("LOTTERY_ID is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNotNull() {
            addCriterion("LOTTERY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdEqualTo(String value) {
            addCriterion("LOTTERY_ID =", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotEqualTo(String value) {
            addCriterion("LOTTERY_ID <>", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThan(String value) {
            addCriterion("LOTTERY_ID >", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTERY_ID >=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThan(String value) {
            addCriterion("LOTTERY_ID <", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThanOrEqualTo(String value) {
            addCriterion("LOTTERY_ID <=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLike(String value) {
            addCriterion("LOTTERY_ID like", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotLike(String value) {
            addCriterion("LOTTERY_ID not like", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIn(List<String> values) {
            addCriterion("LOTTERY_ID in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotIn(List<String> values) {
            addCriterion("LOTTERY_ID not in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdBetween(String value1, String value2) {
            addCriterion("LOTTERY_ID between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotBetween(String value1, String value2) {
            addCriterion("LOTTERY_ID not between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andPromIdIsNull() {
            addCriterion("PROM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPromIdIsNotNull() {
            addCriterion("PROM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPromIdEqualTo(String value) {
            addCriterion("PROM_ID =", value, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdNotEqualTo(String value) {
            addCriterion("PROM_ID <>", value, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdGreaterThan(String value) {
            addCriterion("PROM_ID >", value, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROM_ID >=", value, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdLessThan(String value) {
            addCriterion("PROM_ID <", value, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdLessThanOrEqualTo(String value) {
            addCriterion("PROM_ID <=", value, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdLike(String value) {
            addCriterion("PROM_ID like", value, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdNotLike(String value) {
            addCriterion("PROM_ID not like", value, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdIn(List<String> values) {
            addCriterion("PROM_ID in", values, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdNotIn(List<String> values) {
            addCriterion("PROM_ID not in", values, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdBetween(String value1, String value2) {
            addCriterion("PROM_ID between", value1, value2, "promId");
            return (Criteria) this;
        }

        public Criteria andPromIdNotBetween(String value1, String value2) {
            addCriterion("PROM_ID not between", value1, value2, "promId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdIsNull() {
            addCriterion("LOTTERY_CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdIsNotNull() {
            addCriterion("LOTTERY_CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdEqualTo(String value) {
            addCriterion("LOTTERY_CREATE_ID =", value, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdNotEqualTo(String value) {
            addCriterion("LOTTERY_CREATE_ID <>", value, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdGreaterThan(String value) {
            addCriterion("LOTTERY_CREATE_ID >", value, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTERY_CREATE_ID >=", value, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdLessThan(String value) {
            addCriterion("LOTTERY_CREATE_ID <", value, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdLessThanOrEqualTo(String value) {
            addCriterion("LOTTERY_CREATE_ID <=", value, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdLike(String value) {
            addCriterion("LOTTERY_CREATE_ID like", value, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdNotLike(String value) {
            addCriterion("LOTTERY_CREATE_ID not like", value, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdIn(List<String> values) {
            addCriterion("LOTTERY_CREATE_ID in", values, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdNotIn(List<String> values) {
            addCriterion("LOTTERY_CREATE_ID not in", values, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdBetween(String value1, String value2) {
            addCriterion("LOTTERY_CREATE_ID between", value1, value2, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andLotteryCreateIdNotBetween(String value1, String value2) {
            addCriterion("LOTTERY_CREATE_ID not between", value1, value2, "lotteryCreateId");
            return (Criteria) this;
        }

        public Criteria andAwardCountIsNull() {
            addCriterion("AWARD_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAwardCountIsNotNull() {
            addCriterion("AWARD_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAwardCountEqualTo(String value) {
            addCriterion("AWARD_COUNT =", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountNotEqualTo(String value) {
            addCriterion("AWARD_COUNT <>", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountGreaterThan(String value) {
            addCriterion("AWARD_COUNT >", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountGreaterThanOrEqualTo(String value) {
            addCriterion("AWARD_COUNT >=", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountLessThan(String value) {
            addCriterion("AWARD_COUNT <", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountLessThanOrEqualTo(String value) {
            addCriterion("AWARD_COUNT <=", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountLike(String value) {
            addCriterion("AWARD_COUNT like", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountNotLike(String value) {
            addCriterion("AWARD_COUNT not like", value, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountIn(List<String> values) {
            addCriterion("AWARD_COUNT in", values, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountNotIn(List<String> values) {
            addCriterion("AWARD_COUNT not in", values, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountBetween(String value1, String value2) {
            addCriterion("AWARD_COUNT between", value1, value2, "awardCount");
            return (Criteria) this;
        }

        public Criteria andAwardCountNotBetween(String value1, String value2) {
            addCriterion("AWARD_COUNT not between", value1, value2, "awardCount");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitIsNull() {
            addCriterion("LOTTERY_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitIsNotNull() {
            addCriterion("LOTTERY_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitEqualTo(String value) {
            addCriterion("LOTTERY_LIMIT =", value, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitNotEqualTo(String value) {
            addCriterion("LOTTERY_LIMIT <>", value, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitGreaterThan(String value) {
            addCriterion("LOTTERY_LIMIT >", value, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitGreaterThanOrEqualTo(String value) {
            addCriterion("LOTTERY_LIMIT >=", value, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitLessThan(String value) {
            addCriterion("LOTTERY_LIMIT <", value, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitLessThanOrEqualTo(String value) {
            addCriterion("LOTTERY_LIMIT <=", value, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitLike(String value) {
            addCriterion("LOTTERY_LIMIT like", value, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitNotLike(String value) {
            addCriterion("LOTTERY_LIMIT not like", value, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitIn(List<String> values) {
            addCriterion("LOTTERY_LIMIT in", values, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitNotIn(List<String> values) {
            addCriterion("LOTTERY_LIMIT not in", values, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitBetween(String value1, String value2) {
            addCriterion("LOTTERY_LIMIT between", value1, value2, "lotteryLimit");
            return (Criteria) this;
        }

        public Criteria andLotteryLimitNotBetween(String value1, String value2) {
            addCriterion("LOTTERY_LIMIT not between", value1, value2, "lotteryLimit");
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