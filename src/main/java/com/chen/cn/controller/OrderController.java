package com.chen.cn.controller;

import com.chen.cn.dto.AxiosResult;
import com.chen.cn.dto.SearchOrderDto;
import com.chen.cn.entity.b2csale.Order;
import com.chen.cn.service.OrderService;
import com.chen.cn.vo.PageVo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Ll
 * @Date 2021/1/6 11:44
 */

@RestController
@RequestMapping("order")
public class OrderController extends BaseController<Order, Long> {

    @Autowired
    private OrderService orderService;

    @PostMapping("search")
    public AxiosResult<PageVo<Order>> onSearch(@RequestParam(defaultValue = "1") int currentPage,
                                               @RequestParam(defaultValue = "5") int pageSize,
                                               @RequestBody SearchOrderDto searchOrderDto) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Order> pageVo = orderService.onSearch(searchOrderDto);
        return AxiosResult.success(pageVo);
    }
}
