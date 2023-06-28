package com.spring.instagramClone_BE.user.repository;

import com.spring.instagramClone_BE.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
