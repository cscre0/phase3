package com.chen.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Cart extends BaseEntity{

    private Long cartId;

    private Integer cartNum;

    private Double cartMoney;

}