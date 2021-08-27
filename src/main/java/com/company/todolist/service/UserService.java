package com.company.todolist.service;

import com.company.todolist.domain.User;
import com.company.todolist.repository.UserJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserJpaRepository userJpaRepository;

    public UserService(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    public User updateUser(User user) {
        return userJpaRepository.save(user);
    }

    public User selectUser(String name) {
        return userJpaRepository.findByName(name).orElse(null);
    }

    public void deleteUser(String name) {
        userJpaRepository.deleteByName(name);
    }
}
