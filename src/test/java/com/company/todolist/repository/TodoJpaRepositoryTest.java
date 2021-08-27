package com.company.todolist.repository;

import com.company.todolist.domain.Todo;
import com.company.todolist.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class TodoJpaRepositoryTest {

    @Autowired
    private TodoJpaRepository todoJpaRepository;

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Test
    public void todoAddReadTest() {
        User user = userJpaRepository.findByName("gpark").orElse(null);

        Todo todo = new Todo();
        todo.setTitle("장보기");
        todo.setUser(user);
        todoJpaRepository.save(todo);

        Todo todo1 = new Todo();
        todo1.setTitle("깃허브 책 보기");
        todo1.setUser(user);
        todoJpaRepository.save(todo1);
        
        Todo todo2 = new Todo();
        todo2.setTitle("api 공부하기");
        todo2.setUser(user);
        todoJpaRepository.save(todo2);

        System.out.println("On User Aspect : " + userJpaRepository.findByName("gpark").orElseThrow(RuntimeException::new).getTodos());

        todoJpaRepository.findAll().forEach(System.out::println);
    }

    @Test
    public void deleteTest() {
        Todo todo = todoJpaRepository.findById(1L).orElse(null);
        todoJpaRepository.deleteById(1L);
        todoJpaRepository.findAll().forEach(System.out::println);
    }
}