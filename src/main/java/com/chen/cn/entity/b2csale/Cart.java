package com.chen.cn.entity.b2csale;

import com.chen.cn.entity.BaseEntity;
import lombok.Data;

@Data
public class Cart extends BaseEntity {

    private Long customerId;

    private Integer cartNum;

    private Double cartMoney;

}