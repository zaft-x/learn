package org.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName RedisServcie
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/19 0019
 * @Version V1.0
 **/
@Service("redisService")
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Transactional(rollbackFor = Exception.class)
    public void testRedisTransaction(){
        Long increment = redisTemplate.opsForValue().increment("6666", 1);
        System.out.println(increment);
    }
}
