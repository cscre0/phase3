package com.chen.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class DetailedOrder extends BaseEntity{

    private Long orderId;

    private Long customerId;

    private Long cartId;

    private Long checkId;

    private Date checkTime;

    private String checkMode;

    private String checkSuggestion;

}