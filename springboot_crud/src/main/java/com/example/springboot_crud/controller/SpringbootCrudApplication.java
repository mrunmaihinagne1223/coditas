package com.example.springboot_crud.controller;

import com.example.springboot_crud.repository.UserRespository;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCrudApplication {

    public static void main(String[] args) {

        ApplicationContext context = (ApplicationContext)
                SpringApplication.run(SpringbootCrudApplication.class, args);

     //UserRespository userRespository = context.getBean(UserRespository.class);
    }

}
