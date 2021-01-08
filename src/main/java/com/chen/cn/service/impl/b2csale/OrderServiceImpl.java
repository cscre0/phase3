package com.chen.cn.service.impl.b2csale;

import com.chen.cn.dto.SearchOrderDto;
import com.chen.cn.entity.b2csale.Order;
import com.chen.cn.entity.b2csale.OrderExample;
import com.chen.cn.mapper.OrderMapper;
import com.chen.cn.service.OrderService;
import com.chen.cn.service.impl.BaseServiceImpl;
import com.chen.cn.vo.PageVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Ll
 * @Date 2021/1/6 11:42
 */

@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<Order, Long> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public PageVo<Order> onSearch(SearchOrderDto searchOrderDto) {

        System.out.println("进入查询");

        //倒序查询设置条件
        OrderExample example1 = new OrderExample();
        example1.setOrderByClause("id desc");

        //条件拆分
        OrderExample.Criteria criteria1 = example1.createCriteria();
        OrderExample.Criteria criteria2 = example1.createCriteria();
        OrderExample.Criteria criteria3 = example1.createCriteria();
        OrderExample.Criteria criteria4 = example1.createCriteria();
        OrderExample.Criteria criteria5 = example1.createCriteria();
        OrderExample.Criteria criteria6 = example1.createCriteria();
        OrderExample.Criteria criteria7 = example1.createCriteria();

        example1.or(getCriteria(criteria1, searchOrderDto));
        example1.or(getCriteria(criteria2, searchOrderDto));
        example1.or(getCriteria(criteria3, searchOrderDto));
        example1.or(getCriteria(criteria4, searchOrderDto));
        example1.or(getCriteria(criteria5, searchOrderDto));
        example1.or(getCriteria(criteria6, searchOrderDto));
        example1.or(getCriteria(criteria7, searchOrderDto));

        System.out.println("example1: " + example1);

        List<Order> orders = orderMapper.selectByExample(example1);

        System.out.println("orders: " + orders.toString());

        //封装分页数据
        PageInfo pageInfo = new PageInfo<>(orders);
        long total = pageInfo.getTotal();
        PageVo<Order> pageVo = new PageVo<>();
        pageVo.setTotal(total);
        pageVo.setData(orders);

        return pageVo;
    }

    /*条件拆分*/
    public static OrderExample.Criteria getCriteria(OrderExample.Criteria criteria,
                                                    SearchOrderDto searchOrderDto) {
        if (!StringUtils.isEmpty(searchOrderDto.getId())) {
            criteria.andIdEqualTo(searchOrderDto.getId());
        }

        if (!StringUtils.isEmpty(searchOrderDto.getOrderType())) {
            criteria.andOrderTypeEqualTo(searchOrderDto.getOrderType());
        }

        if (!StringUtils.isEmpty(searchOrderDto.getOrderPayment())) {
            criteria.andOrderPaymentEqualTo(searchOrderDto.getOrderPayment());
        }

        if (!StringUtils.isEmpty(searchOrderDto.getBusinessType())) {
            criteria.andBusinessTypeEqualTo(searchOrderDto.getBusinessType());
        }

        if (!StringUtils.isEmpty(searchOrderDto.getDate1()) && !StringUtils.isEmpty(searchOrderDto.getDate2())) {
            criteria.andCreateTimeBetween(searchOrderDto.getDate1(), searchOrderDto.getDate2());
        }

        if (!StringUtils.isEmpty(searchOrderDto.getOrderAction())) {
            criteria.andOrderActionEqualTo(searchOrderDto.getOrderAction());
        }

        if (!StringUtils.isEmpty(searchOrderDto.getOrderMode())) {
            criteria.andOrderModeEqualTo(searchOrderDto.getOrderMode());
        }
        return criteria;
    }
}
