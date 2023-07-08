package com.spring.instagramClone_BE.user.controller;

import com.spring.instagramClone_BE.user.entity.User;
import com.spring.instagramClone_BE.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    public List<User> findAllUsers() {
        return userService.findAll();
    }
}
