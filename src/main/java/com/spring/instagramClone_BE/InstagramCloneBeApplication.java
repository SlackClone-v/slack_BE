package com.spring.instagramClone_BE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//TODO 후에지우고 build.gradle 에 h2->mysql
public class InstagramCloneBeApplication {

    public static void main(String[] args)  {
        SpringApplication.run(InstagramCloneBeApplication.class, args);
    }

}
