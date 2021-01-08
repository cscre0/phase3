package com.chen.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Product extends BaseEntity{

    private String name;

    private Double price;

    private String img;

    private String desc;

}