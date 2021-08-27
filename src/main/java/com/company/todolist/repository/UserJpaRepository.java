package com.company.todolist.repository;

import com.company.todolist.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<User, Long> {
    public Optional<User> findByName(String name);
    public void deleteByName(String name);
}
