package com.chen.cn.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author Ll
 * @Date 2020/12/25 11:11
 */

@Component
public class MyRedisCache {

    public static final long EXPIREDTIME = 5;

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 带默认时间限制的redis缓存
     *
     * @param key
     * @param value
     */
    public void timeoutCache(String key, String value) {
        redisTemplate.opsForValue().set(key, value, EXPIREDTIME, TimeUnit.MINUTES);
    }

    /**
     * 带自定义时间限制的redis缓存
     * @param key
     * @param value
     * @param minutes
     */
    public void timeoutCache(String key, String value,long minutes) {
        redisTemplate.opsForValue().set(key, value, minutes, TimeUnit.MINUTES);
    }

    /**
     * 持久储存
     * @param key
     * @param value
     */
    public void lastingCache(String key, String value){
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 删除key
     * @param key
     */
    public void deleteKey(String key){
        redisTemplate.delete(key);
    }

    /**
     * 获取key
     * @param key
     * @return
     */
    public String getCache(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
