package com.example.testTaskSpringApplication.project.repository;

import com.example.testTaskSpringApplication.project.entity.TodoEntity;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {

}
