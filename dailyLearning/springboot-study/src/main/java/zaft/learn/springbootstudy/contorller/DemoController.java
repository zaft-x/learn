package zaft.learn.springbootstudy.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zaft.learn.springbootstudy.bean.Demo;

/**
 * @ClassName DemoController
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/21 0021
 * @Version V1.0
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Angel");
        return demo;
    }
}
