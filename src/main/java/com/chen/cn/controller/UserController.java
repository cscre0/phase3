package com.chen.cn.controller;

import com.chen.cn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ll
 * @Date 2021/1/2 18:14
 */

@RestController
@RequestMapping("user")
public class UserController extends BaseController<User,Long>{

}
