package com.chen.cn.vo;

import com.chen.cn.entity.Product;
import lombok.Data;

/**
 * @Author Ll
 * @Date 2020/12/15 20:51
 */

@Data
public class ProductVo extends Product {

    private int pnum;

    private double pmoney;
}
