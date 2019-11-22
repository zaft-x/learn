package zaft.learn.restonspringwebmvc.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zaft.learn.restonspringwebmvc.domain.Person;

/**
 * @ClassName PersonRestController
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/22 0022
 * @Version V1.0
 **/
@RestController
public class PersonRestController {

    @GetMapping("/person")
    public Person person(){
        Person person = new Person();
        person.setId(1);
        person.setName("123");
        return person;
    }
}
