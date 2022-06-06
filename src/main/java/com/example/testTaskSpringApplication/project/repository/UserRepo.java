package com.example.testTaskSpringApplication.project.repository;

import com.example.testTaskSpringApplication.project.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);

// Page<UserEntity> findAll(Pageable pageable);
}
