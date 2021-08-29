package com.company.todolist.controller;

import com.company.todolist.domain.User;
import com.company.todolist.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "유저의 정보를 관리하는 API입니다.")
@RestController()
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<User> getUser(@PathVariable String name) {
        User user = userService.selectUser(name);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        } else {
            return ResponseEntity.ok(user);
        }
    }

    @PostMapping("/")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @GetMapping("/")
    public List<User> getUsers() {
        return userService.selectUsers();
    }
}
