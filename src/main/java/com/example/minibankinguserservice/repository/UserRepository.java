package com.example.minibankinguserservice.repository;

import com.example.minibankinguserservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

