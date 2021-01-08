package com.chen.cn.dto;

import lombok.Data;

import java.util.Date;

/**
 * @Author Ll
 * @Date 2021/1/7 16:24
 */

@Data
public class SearchOrderDto {
    private Long id;

    private String orderType;

    private String orderPayment;

    private String businessType;

    private String orderAction;

    private String orderMode;

    private Date date1;

    private Date date2;
}
