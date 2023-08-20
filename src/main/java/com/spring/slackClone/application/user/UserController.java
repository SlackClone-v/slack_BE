package com.spring.slackClone.application.user;

import com.spring.slackClone.domain.user.entity.UserEntity;
import com.spring.slackClone.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    public List<UserEntity> findAllUsers() {
        return userService.findAll();
    }
}
