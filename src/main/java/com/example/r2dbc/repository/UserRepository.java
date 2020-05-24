package com.example.r2dbc.repository;

import com.example.r2dbc.domain.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;


public interface UserRepository extends R2dbcRepository<User, Long> {

    @Query("SELECT * FROM users u WHERE u.id = ? LIMIT 1")
    Mono<User> getUser(Long id);

}
