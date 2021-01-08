package com.chen.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Customer extends BaseEntity{

    private String name;

    private String receiver;

    private String phone;

    private String email;

    private String postcode;

    private String address;

}