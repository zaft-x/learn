package zaft.learn.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zaft.learn.springbootjdbc.domain.User;
import zaft.learn.springbootjdbc.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user/save")
    public boolean save(@RequestBody User user){
        return userRepository.save(user);
    }
}