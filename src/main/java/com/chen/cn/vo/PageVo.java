package com.chen.cn.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author Ll
 * @Date 2020/12/30 21:46
 */

@Data
public class PageVo<T> {

    private long total;

    private List<T> data;

}
