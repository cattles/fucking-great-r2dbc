package com.example.r2dbc.service;

import com.example.r2dbc.domain.User;
import com.example.r2dbc.repository.UserRepository;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.time.LocalDateTime;


@Service
public class UserService {

    @Resource
    UserRepository userRepository;

    private final DatabaseClient databaseClient;

    public UserService(DatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public Mono<User> find(Long id) {

        return userRepository.getUser(id);
    }

    public Mono<Void> delete(Long id) {
        User user = User.builder().id(id).build();
        return userRepository.delete(user);
    }

    public Mono<User> save(User user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }
}
