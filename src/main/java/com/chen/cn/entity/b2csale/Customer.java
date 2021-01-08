package com.chen.cn.entity.b2csale;

import com.chen.cn.entity.BaseEntity;
import lombok.Data;

@Data
public class Customer extends BaseEntity {

    private String name;

    private String receiver;

    private String phone;

    private String email;

    private String postcode;

    private String address;

}