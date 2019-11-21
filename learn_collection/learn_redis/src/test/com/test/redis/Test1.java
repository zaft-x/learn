package com.test.redis;

import org.junit.Test;
import org.learn.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/19 0019
 * @Version V1.0
 **/
public class Test1 extends BaseTest{
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisService redisService;
    @Test
    public void testRedisTransaction(){
        redisService.testRedisTransaction();
    }

    @Test
    public void test(){
        //Object o = redisTemplate.opsForValue().get("6666");
//        redisTemplate.opsForValue().set("t_1","123");
        Object o = redisTemplate.opsForValue().get("6666");
        System.out.println(o);
    }
}
