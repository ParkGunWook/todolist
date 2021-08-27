package com.company.todolist.controller;

import com.company.todolist.domain.Todo;
import com.company.todolist.service.TodoService;
import com.company.todolist.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "투두리스트를 관리하는 API입니다.")
@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final UserService userService;
    private final TodoService todoService;

    public TodoController(UserService userService, TodoService todoService) {
        this.userService = userService;
        this.todoService = todoService;
    }

    @GetMapping("/{name}")
    public List<Todo> getTodos(@PathVariable String name) {
        return todoService.getTodos(userService.selectUser(name));
    }

    @PostMapping("/{name}")
    public Todo updateTodo(@PathVariable String name, @RequestBody Todo todo) {
        return todoService.addTodo(userService.selectUser(name), todo);
    }
}
