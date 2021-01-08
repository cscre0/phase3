package com.chen.cn.entity.b2csale;

import com.chen.cn.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class Order extends BaseEntity {

    private Long cartId;

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

    private String description;

    private Date deliveryTime;

    private String remitter;

    private String receiver;

    private String phone;

    private String postcode;

    private Integer cartNum;

    private Double cartMoney;

}