package com.spring.slackClone.domain.user.repository;

import com.spring.slackClone.domain.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
