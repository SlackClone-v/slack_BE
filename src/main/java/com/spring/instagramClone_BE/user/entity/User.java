package com.spring.instagramClone_BE.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String Name;
    private String Email;
    private String Password;

}
