package zaft.learn.springbootjdbc.webflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.RouteMatcher;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import zaft.learn.springbootjdbc.repository.UserRepository;

@Configuration
public class WebFluxConfiguration {


    /*@Bean
    public RouterFunction<ServerResponse> save(UserRepository repository){

        return //repository.save();
    }*/
}