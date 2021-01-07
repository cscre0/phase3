package com.chen.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CartItem extends BaseEntity {

    private Long cartId;

    private Long productId;

    private Integer productNum;

    private Double productMoney;

}