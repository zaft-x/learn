package zaft.learn.springbootjdbc.webflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import zaft.learn.springbootjdbc.domain.User;
import zaft.learn.springbootjdbc.repository.UserRepository;

public class UserHandler {
    @Autowired
    private UserRepository userRepository;

    public Mono<ServerResponse> save(ServerRequest serverRequest){
        Mono<User> userMONO = serverRequest.bodyToMono(User.class);

        Mono<Boolean> booleanMono = userMONO.map(userRepository::save);
        return ServerResponse.ok().body(booleanMono, Boolean.class);
    }
}