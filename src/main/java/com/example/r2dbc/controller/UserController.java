package com.example.r2dbc.controller;

import com.example.r2dbc.domain.User;
import com.example.r2dbc.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * @date 2020-05-24
 * @author 稻草鸟人
 */
@RestController
@RequestMapping("/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    public Mono<User> getUser(@PathVariable("id") Long id) {
        Mono<User> userMono = userService.find(id);
        return userMono;
    }

    @PutMapping("/users/{id}")
    public Mono<User> update(@PathVariable("id") Long id, @RequestBody User user) {
        return this.userService.find(id)
                .map(u -> {
                    u.setFirstName(user.getFirstName());
                    u.setLastName(user.getLastName());
                    return u;
                })
                .flatMap(u -> save(u));
    }

    @DeleteMapping("/users/{id}")
    public Mono<Void> delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }


    @PostMapping("/users")
    public Mono<User> save(@RequestBody User user) {
        return userService.save(user);
    }

}
