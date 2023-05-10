package com.example.product_mangementspringboot.controller;

import com.example.product_mangementspring.model.User;
import com.example.product_mangementspring.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/adduser")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> saveEmployee(@RequestBody User employee){
    return new ResponseEntity<User>(userService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<String> checklogin(@RequestBody User user){
        if(userService.checkUserExists(user)) {
            return ResponseEntity.ok("User present");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not found");
        }
    }




}
