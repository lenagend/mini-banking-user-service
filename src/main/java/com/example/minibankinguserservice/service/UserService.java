package com.example.minibankinguserservice.service;

import com.example.minibankinguserservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.minibankinguserservice.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        // 사용자 생성 로직
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        // ID로 사용자 조회 로직
        return userRepository.findById(id).orElse(null);
    }


}
