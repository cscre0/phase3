package com.chen.cn.vo;

import com.chen.cn.entity.Cart;
import com.chen.cn.entity.CartItem;
import lombok.Data;

import java.util.List;

/**
 * @Author Ll
 * @Date 2020/12/15 20:39
 */

@Data
public class CartVo extends Cart {

    private List<ProductVo> productVos;

}
