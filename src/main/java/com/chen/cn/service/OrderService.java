package com.chen.cn.service;

import com.chen.cn.dto.SearchOrderDto;
import com.chen.cn.entity.b2csale.Order;
import com.chen.cn.vo.PageVo;

/**
 * @Author Ll
 * @Date 2021/1/6 11:41
 */


public interface OrderService extends BaseService<Order,Long>{
    /**
     * 分页条件查询
     *
     * @param searchOrderDto
     * @return
     */
    PageVo<Order> onSearch(SearchOrderDto searchOrderDto);

}
