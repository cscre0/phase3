package com.chen.cn.entity.b2csale;

import com.chen.cn.entity.BaseEntity;
import lombok.Data;

@Data
public class Product extends BaseEntity {

    private String name;

    private Double price;

    private String img;

    private String desc;

}