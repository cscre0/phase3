package com.chen.cn.entity.b2csale;

import com.chen.cn.entity.BaseEntity;
import lombok.Data;

@Data
public class CartItem extends BaseEntity {

    private Long cartId;

    private Long productId;

    private Integer productNum;

    private Double productMoney;

}