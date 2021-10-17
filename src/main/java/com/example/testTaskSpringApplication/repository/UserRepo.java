package com.example.testTaskSpringApplication.repository;

import com.example.testTaskSpringApplication.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);

// Page<UserEntity> findAll(Pageable pageable);
}
