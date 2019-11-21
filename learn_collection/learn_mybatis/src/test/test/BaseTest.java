package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName BaseTest
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/19 0019
 * @Version V1.0
 **/
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="classpath:Spring-config.xml")
public class BaseTest {
    private long startTime;

    @Before
    public void preHandler(){
        startTime = System.currentTimeMillis();
    }

    @After
    public void postHandler(){
        long time = System.currentTimeMillis()-startTime;
        System.err.println("耗时："+time/1000+"秒，"+time+"毫秒");
    }

    @Test
    public void initDatabase(){

    }
}
