package com.chen.cn.entity.b2csale;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Long value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Long value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Long value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Long value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Long value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Long> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Long> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Long value1, Long value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Long value1, Long value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIsNull() {
            addCriterion("order_payment is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIsNotNull() {
            addCriterion("order_payment is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentEqualTo(String value) {
            addCriterion("order_payment =", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentNotEqualTo(String value) {
            addCriterion("order_payment <>", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentGreaterThan(String value) {
            addCriterion("order_payment >", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("order_payment >=", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentLessThan(String value) {
            addCriterion("order_payment <", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentLessThanOrEqualTo(String value) {
            addCriterion("order_payment <=", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentLike(String value) {
            addCriterion("order_payment like", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentNotLike(String value) {
            addCriterion("order_payment not like", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIn(List<String> values) {
            addCriterion("order_payment in", values, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentNotIn(List<String> values) {
            addCriterion("order_payment not in", values, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentBetween(String value1, String value2) {
            addCriterion("order_payment between", value1, value2, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentNotBetween(String value1, String value2) {
            addCriterion("order_payment not between", value1, value2, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andOrderActionIsNull() {
            addCriterion("order_action is null");
            return (Criteria) this;
        }

        public Criteria andOrderActionIsNotNull() {
            addCriterion("order_action is not null");
            return (Criteria) this;
        }

        public Criteria andOrderActionEqualTo(String value) {
            addCriterion("order_action =", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotEqualTo(String value) {
            addCriterion("order_action <>", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionGreaterThan(String value) {
            addCriterion("order_action >", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionGreaterThanOrEqualTo(String value) {
            addCriterion("order_action >=", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionLessThan(String value) {
            addCriterion("order_action <", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionLessThanOrEqualTo(String value) {
            addCriterion("order_action <=", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionLike(String value) {
            addCriterion("order_action like", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotLike(String value) {
            addCriterion("order_action not like", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionIn(List<String> values) {
            addCriterion("order_action in", values, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotIn(List<String> values) {
            addCriterion("order_action not in", values, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionBetween(String value1, String value2) {
            addCriterion("order_action between", value1, value2, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotBetween(String value1, String value2) {
            addCriterion("order_action not between", value1, value2, "orderAction");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayIsNull() {
            addCriterion("delivery_way is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayIsNotNull() {
            addCriterion("delivery_way is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayEqualTo(String value) {
            addCriterion("delivery_way =", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayNotEqualTo(String value) {
            addCriterion("delivery_way <>", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayGreaterThan(String value) {
            addCriterion("delivery_way >", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_way >=", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayLessThan(String value) {
            addCriterion("delivery_way <", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayLessThanOrEqualTo(String value) {
            addCriterion("delivery_way <=", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayLike(String value) {
            addCriterion("delivery_way like", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayNotLike(String value) {
            addCriterion("delivery_way not like", value, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayIn(List<String> values) {
            addCriterion("delivery_way in", values, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayNotIn(List<String> values) {
            addCriterion("delivery_way not in", values, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayBetween(String value1, String value2) {
            addCriterion("delivery_way between", value1, value2, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andDeliveryWayNotBetween(String value1, String value2) {
            addCriterion("delivery_way not between", value1, value2, "deliveryWay");
            return (Criteria) this;
        }

        public Criteria andOrderModeIsNull() {
            addCriterion("order_mode is null");
            return (Criteria) this;
        }

        public Criteria andOrderModeIsNotNull() {
            addCriterion("order_mode is not null");
            return (Criteria) this;
        }

        public Criteria andOrderModeEqualTo(String value) {
            addCriterion("order_mode =", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeNotEqualTo(String value) {
            addCriterion("order_mode <>", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeGreaterThan(String value) {
            addCriterion("order_mode >", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeGreaterThanOrEqualTo(String value) {
            addCriterion("order_mode >=", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeLessThan(String value) {
            addCriterion("order_mode <", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeLessThanOrEqualTo(String value) {
            addCriterion("order_mode <=", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeLike(String value) {
            addCriterion("order_mode like", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeNotLike(String value) {
            addCriterion("order_mode not like", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeIn(List<String> values) {
            addCriterion("order_mode in", values, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeNotIn(List<String> values) {
            addCriterion("order_mode not in", values, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeBetween(String value1, String value2) {
            addCriterion("order_mode between", value1, value2, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeNotBetween(String value1, String value2) {
            addCriterion("order_mode not between", value1, value2, "orderMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeIsNull() {
            addCriterion("check_mode is null");
            return (Criteria) this;
        }

        public Criteria andCheckModeIsNotNull() {
            addCriterion("check_mode is not null");
            return (Criteria) this;
        }

        public Criteria andCheckModeEqualTo(String value) {
            addCriterion("check_mode =", value, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeNotEqualTo(String value) {
            addCriterion("check_mode <>", value, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeGreaterThan(String value) {
            addCriterion("check_mode >", value, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeGreaterThanOrEqualTo(String value) {
            addCriterion("check_mode >=", value, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeLessThan(String value) {
            addCriterion("check_mode <", value, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeLessThanOrEqualTo(String value) {
            addCriterion("check_mode <=", value, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeLike(String value) {
            addCriterion("check_mode like", value, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeNotLike(String value) {
            addCriterion("check_mode not like", value, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeIn(List<String> values) {
            addCriterion("check_mode in", values, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeNotIn(List<String> values) {
            addCriterion("check_mode not in", values, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeBetween(String value1, String value2) {
            addCriterion("check_mode between", value1, value2, "checkMode");
            return (Criteria) this;
        }

        public Criteria andCheckModeNotBetween(String value1, String value2) {
            addCriterion("check_mode not between", value1, value2, "checkMode");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Long value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Long value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Long value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Long value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Long value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Long> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Long> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Long value1, Long value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Long value1, Long value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyIsNull() {
            addCriterion("delivery_money is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyIsNotNull() {
            addCriterion("delivery_money is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyEqualTo(Double value) {
            addCriterion("delivery_money =", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyNotEqualTo(Double value) {
            addCriterion("delivery_money <>", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyGreaterThan(Double value) {
            addCriterion("delivery_money >", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("delivery_money >=", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyLessThan(Double value) {
            addCriterion("delivery_money <", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyLessThanOrEqualTo(Double value) {
            addCriterion("delivery_money <=", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyIn(List<Double> values) {
            addCriterion("delivery_money in", values, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyNotIn(List<Double> values) {
            addCriterion("delivery_money not in", values, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyBetween(Double value1, Double value2) {
            addCriterion("delivery_money between", value1, value2, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyNotBetween(Double value1, Double value2) {
            addCriterion("delivery_money not between", value1, value2, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNull() {
            addCriterion("delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNotNull() {
            addCriterion("delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressEqualTo(String value) {
            addCriterion("delivery_address =", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotEqualTo(String value) {
            addCriterion("delivery_address <>", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThan(String value) {
            addCriterion("delivery_address >", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_address >=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThan(String value) {
            addCriterion("delivery_address <", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("delivery_address <=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLike(String value) {
            addCriterion("delivery_address like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotLike(String value) {
            addCriterion("delivery_address not like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIn(List<String> values) {
            addCriterion("delivery_address in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotIn(List<String> values) {
            addCriterion("delivery_address not in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressBetween(String value1, String value2) {
            addCriterion("delivery_address between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("delivery_address not between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeIsNull() {
            addCriterion("refuse_time is null");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeIsNotNull() {
            addCriterion("refuse_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeEqualTo(Date value) {
            addCriterion("refuse_time =", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeNotEqualTo(Date value) {
            addCriterion("refuse_time <>", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeGreaterThan(Date value) {
            addCriterion("refuse_time >", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refuse_time >=", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeLessThan(Date value) {
            addCriterion("refuse_time <", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeLessThanOrEqualTo(Date value) {
            addCriterion("refuse_time <=", value, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeIn(List<Date> values) {
            addCriterion("refuse_time in", values, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeNotIn(List<Date> values) {
            addCriterion("refuse_time not in", values, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeBetween(Date value1, Date value2) {
            addCriterion("refuse_time between", value1, value2, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseTimeNotBetween(Date value1, Date value2) {
            addCriterion("refuse_time not between", value1, value2, "refuseTime");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIsNull() {
            addCriterion("refuse_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIsNotNull() {
            addCriterion("refuse_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonEqualTo(String value) {
            addCriterion("refuse_reason =", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotEqualTo(String value) {
            addCriterion("refuse_reason <>", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonGreaterThan(String value) {
            addCriterion("refuse_reason >", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("refuse_reason >=", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLessThan(String value) {
            addCriterion("refuse_reason <", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLessThanOrEqualTo(String value) {
            addCriterion("refuse_reason <=", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLike(String value) {
            addCriterion("refuse_reason like", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotLike(String value) {
            addCriterion("refuse_reason not like", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIn(List<String> values) {
            addCriterion("refuse_reason in", values, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotIn(List<String> values) {
            addCriterion("refuse_reason not in", values, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonBetween(String value1, String value2) {
            addCriterion("refuse_reason between", value1, value2, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotBetween(String value1, String value2) {
            addCriterion("refuse_reason not between", value1, value2, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andRemitterIsNull() {
            addCriterion("remitter is null");
            return (Criteria) this;
        }

        public Criteria andRemitterIsNotNull() {
            addCriterion("remitter is not null");
            return (Criteria) this;
        }

        public Criteria andRemitterEqualTo(String value) {
            addCriterion("remitter =", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotEqualTo(String value) {
            addCriterion("remitter <>", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterGreaterThan(String value) {
            addCriterion("remitter >", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterGreaterThanOrEqualTo(String value) {
            addCriterion("remitter >=", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterLessThan(String value) {
            addCriterion("remitter <", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterLessThanOrEqualTo(String value) {
            addCriterion("remitter <=", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterLike(String value) {
            addCriterion("remitter like", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotLike(String value) {
            addCriterion("remitter not like", value, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterIn(List<String> values) {
            addCriterion("remitter in", values, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotIn(List<String> values) {
            addCriterion("remitter not in", values, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterBetween(String value1, String value2) {
            addCriterion("remitter between", value1, value2, "remitter");
            return (Criteria) this;
        }

        public Criteria andRemitterNotBetween(String value1, String value2) {
            addCriterion("remitter not between", value1, value2, "remitter");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andCartNumIsNull() {
            addCriterion("cart_num is null");
            return (Criteria) this;
        }

        public Criteria andCartNumIsNotNull() {
            addCriterion("cart_num is not null");
            return (Criteria) this;
        }

        public Criteria andCartNumEqualTo(Integer value) {
            addCriterion("cart_num =", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumNotEqualTo(Integer value) {
            addCriterion("cart_num <>", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumGreaterThan(Integer value) {
            addCriterion("cart_num >", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_num >=", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumLessThan(Integer value) {
            addCriterion("cart_num <", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumLessThanOrEqualTo(Integer value) {
            addCriterion("cart_num <=", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumIn(List<Integer> values) {
            addCriterion("cart_num in", values, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumNotIn(List<Integer> values) {
            addCriterion("cart_num not in", values, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumBetween(Integer value1, Integer value2) {
            addCriterion("cart_num between", value1, value2, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_num not between", value1, value2, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartMoneyIsNull() {
            addCriterion("cart_money is null");
            return (Criteria) this;
        }

        public Criteria andCartMoneyIsNotNull() {
            addCriterion("cart_money is not null");
            return (Criteria) this;
        }

        public Criteria andCartMoneyEqualTo(Double value) {
            addCriterion("cart_money =", value, "cartMoney");
            return (Criteria) this;
        }

        public Criteria andCartMoneyNotEqualTo(Double value) {
            addCriterion("cart_money <>", value, "cartMoney");
            return (Criteria) this;
        }

        public Criteria andCartMoneyGreaterThan(Double value) {
            addCriterion("cart_money >", value, "cartMoney");
            return (Criteria) this;
        }

        public Criteria andCartMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cart_money >=", value, "cartMoney");
            return (Criteria) this;
        }

        public Criteria andCartMoneyLessThan(Double value) {
            addCriterion("cart_money <", value, "cartMoney");
            return (Criteria) this;
        }

        public Criteria andCartMoneyLessThanOrEqualTo(Double value) {
            addCriterion("cart_money <=", value, "cartMoney");
            return (Criteria) this;
        }

        public Criteria andCartMoneyIn(List<Double> values) {
            addCriterion("cart_money in", values, "cartMoney");
            return (Criteria) this;
        }

        public Criteria andCartMoneyNotIn(List<Double> values) {
            addCriterion("cart_money not in", values, "cartMoney");
            return (Criteria) this;
        }

        public Criteria andCartMoneyBetween(Double value1, Double value2) {
            addCriterion("cart_money between", value1, value2, "cartMoney");
            return (Criteria) this;
        }

        public Criteria andCartMoneyNotBetween(Double value1, Double value2) {
            addCriterion("cart_money not between", value1, value2, "cartMoney");
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

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
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

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
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