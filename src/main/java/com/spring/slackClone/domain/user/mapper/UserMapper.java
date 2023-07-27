package com.spring.slackClone.domain.user.mapper;

import com.spring.slackClone.domain.user.domain.User;
import com.spring.slackClone.domain.user.entity.UserEntity;

public class UserMapper {

  public static User toDomain(UserEntity entity) {
    User user = new User();
    user.setId(entity.getId());
    user.setName(entity.getName());
    user.setEmail(entity.getEmail());
    return user;
  }

  public static UserEntity toEntity(User user) {
    UserEntity entity = new UserEntity();
    entity.setId(user.getId());
    entity.setName(user.getName());
    entity.setEmail(user.getEmail());
    return entity;
  }

}
