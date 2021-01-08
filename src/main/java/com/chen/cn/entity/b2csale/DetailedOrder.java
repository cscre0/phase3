package com.chen.cn.entity.b2csale;

import com.chen.cn.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class DetailedOrder extends BaseEntity {

    private Long orderId;

    private Long checkId;

    private Date checkTime;

    private String checkMode;

    private String checkSuggestion;

    private Long productId;

    private Integer productNum;

    private Double productMoney;

}