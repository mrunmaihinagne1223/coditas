package com.example.sprintboot_crud;

import com.example.sprintboot_crud.dao.UserRespository;
import com.example.sprintboot_crud.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprintBootCrudApplication {

    public static void main(String[] args) {

        ApplicationContext ac=SpringApplication.run(SprintBootCrudApplication.class, args);
        UserRespository userRepository=ac.getBean(UserRespository.class);
        User user = new User();
        user.setUserName("mrunmai");

         userRepository.save(user);
        System.out.println("Done");


    }


    }


