package com.spring.slackClone_BE.user.repository;

import com.spring.slackClone_BE.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
