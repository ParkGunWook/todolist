package com.company.todolist.controller;

import com.company.todolist.domain.User;
import com.company.todolist.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@Api(tags = "유저의 정보를 관리하는 API입니다.")
@RestController()
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable String name) {
        return userService.selectUser(name);
    }

    @PostMapping("/")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
