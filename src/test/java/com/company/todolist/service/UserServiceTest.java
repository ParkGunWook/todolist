package com.company.todolist.service;

import com.company.todolist.domain.User;
import com.company.todolist.repository.UserJpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Test
    void updateUser() {
        User user = new User();
        user.setName("황지훈");
        user.setEmail("jihuhwang@naver.com");
        user.setPassword("");
        userService.updateUser(user);
        System.out.println(userJpaRepository.findByName("황지훈"));
    }

    @Test
    void selectUser() {
        System.out.println(userService.selectUser("gpark"));
    }

    @Test
    void deleteUser() {
        userService.deleteUser("ekwon");
        System.out.println(userJpaRepository.count());
    }
}