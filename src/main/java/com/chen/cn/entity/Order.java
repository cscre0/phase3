package com.chen.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order extends BaseEntity{

    private String orderType;

    private String orderPayment;

    private String businessType;

    private String orderAction;

    private String deliveryWay;

    private String orderMode;

    private String checkMode;

    private Long postId;

    private Double deliveryMoney;

    private String deliveryAddress;

    private Date refuseTime;

    private String refuseReason;

    private String description ;

    private Date deliveryTime;

}