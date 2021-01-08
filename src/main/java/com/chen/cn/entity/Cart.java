package com.chen.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Cart extends BaseEntity{

    private Long customerId;

    private Integer cartNum;

    private Double cartMoney;

}