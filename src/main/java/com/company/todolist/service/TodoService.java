package com.company.todolist.service;

import com.company.todolist.domain.Todo;
import com.company.todolist.domain.User;
import com.company.todolist.repository.TodoJpaRepository;
import com.company.todolist.repository.UserJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final UserJpaRepository userJpaRepository;
    private final TodoJpaRepository todoJpaRepository;

    public TodoService(UserJpaRepository userJpaRepository, TodoJpaRepository todoJpaRepository) {
        this.userJpaRepository = userJpaRepository;
        this.todoJpaRepository = todoJpaRepository;
    }

    public List<Todo> getTodos(User user) {
        return user.getTodos();
    }

    public Todo addTodo(User user, Todo todo) {
        todo.setUser(user);
        return todoJpaRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoJpaRepository.deleteById(id);
    }

    public Todo getTodo(Long id) {
        return todoJpaRepository.findById(id).orElse(null);
    }
}
