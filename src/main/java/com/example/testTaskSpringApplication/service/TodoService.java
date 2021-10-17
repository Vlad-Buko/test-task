package com.example.testTaskSpringApplication.service;

import com.example.testTaskSpringApplication.entity.TodoEntity;
import com.example.testTaskSpringApplication.entity.UserEntity;
import com.example.testTaskSpringApplication.model.Todo;
import com.example.testTaskSpringApplication.repository.TodoRepo;
import com.example.testTaskSpringApplication.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;

    public Todo createTodo(TodoEntity todo, Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo complete(Long id) {
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }
}
