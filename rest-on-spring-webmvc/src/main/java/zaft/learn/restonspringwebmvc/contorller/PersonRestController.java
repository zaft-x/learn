package zaft.learn.restonspringwebmvc.contorller;

import javafx.scene.media.Media;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping(value = "/json/to/properties",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = "application/properties+person"
    )
    public Person jsonToProperties(@RequestBody Person person){

        return person;
    }
    @PostMapping(value = "/properties/to/json",
            consumes = "application/properties+person",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Person propertiesToJson(@RequestBody Person person){

        return person;
    }
}
