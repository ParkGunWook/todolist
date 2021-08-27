package com.company.todolist.repository;

import com.company.todolist.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TodoJpaRepository extends JpaRepository<Todo, Long> {

}
