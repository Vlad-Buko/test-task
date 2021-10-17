package com.example.testTaskSpringApplication.repository;

import com.example.testTaskSpringApplication.entity.TodoEntity;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {

}
