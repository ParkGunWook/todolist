package com.company.todolist.service;

import com.company.todolist.domain.Todo;
import com.company.todolist.repository.TodoJpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class TodoServiceTest {

    @Autowired
    private TodoService todoService;

    @Autowired
    private UserService userService;

    @Autowired
    private TodoJpaRepository todoJpaRepository;

    @Test
    void getTodos() {
        todoService.getTodos(userService.selectUser("gpark")).forEach(System.out::println);
        todoService.getTodos(userService.selectUser("ekwon")).forEach(System.out::println);
        todoService.getTodos(userService.selectUser("sun-kim")).forEach(System.out::println);
    }

    @Test
    void addTodo() {
        Todo todo = new Todo();
        todo.setTitle("마실 나가기");
        todoService.addTodo(userService.selectUser("ekwon"), todo);
        todoService.getTodos(userService.selectUser("ekwon")).forEach(System.out::println);
    }

    @Test
    void deleteTodo() {
        todoService.deleteTodo(1L);
        todoService.deleteTodo(3L);
        todoService.deleteTodo(5L);
        todoJpaRepository.findAll().forEach(System.out::println);
    }
}