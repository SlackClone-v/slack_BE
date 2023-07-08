package com.spring.instagramClone_BE.user.service;


import com.spring.instagramClone_BE.user.entity.User;
import com.spring.instagramClone_BE.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.management.Notification;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
