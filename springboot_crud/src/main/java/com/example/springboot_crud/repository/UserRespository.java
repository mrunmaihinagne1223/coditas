package com.example.springboot_crud.repository;

import com.example.springboot_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRespository extends CrudRepository<User, Long> {

}
