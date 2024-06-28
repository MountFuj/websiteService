package com.zy.website.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtils {

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    /**
     * 设置key
     * @param key
     * @param value
     */
    public  void setKey(String key,Object value){
        redisTemplate.opsForValue().set(key,value);
    }
    /**
     * 获取key
     * @param key
     * @return
     */
    public Object getKey(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
