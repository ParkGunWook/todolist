package com.company.todolist.repository;

import com.company.todolist.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserJpaRepositoryTest {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Test
    public void UserReadTest() {
        userJpaRepository.findAll().forEach(System.out::println);
    }

    @Test
    public void UserInsertTest() {
        User user = new User();
        user.setName("황지훈");
        user.setEmail("jihuhwang@naver.com");
        user.setPassword("1234");
        userJpaRepository.save(user);
        System.out.println(userJpaRepository.findByName("황지훈").orElse(null));
    }

    @Test
    public void UserDeleteTest() {
        userJpaRepository.delete(userJpaRepository.findByName("gpark").orElse(null));
        System.out.println(userJpaRepository.count());
    }

    @Test
    public void UserDeleteTestByName() {
        userJpaRepository.deleteByName("gpark");
        System.out.println(userJpaRepository.count());
    }
}