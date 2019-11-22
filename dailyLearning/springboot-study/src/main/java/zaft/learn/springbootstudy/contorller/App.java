package zaft.learn.springbootstudy.contorller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName App
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/21 0021
 * @Version V1.0
 **/
@RestController
@SpringBootApplication
public class App {
    @RequestMapping("/")
    public String hello(){
        return "Hello world!";
    }
}
