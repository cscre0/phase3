package com.chen.cn.service.impl;

import com.chen.cn.entity.User;
import com.chen.cn.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Ll
 * @Date 2021/1/2 17:17
 */

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User,Long> implements UserService {
}
