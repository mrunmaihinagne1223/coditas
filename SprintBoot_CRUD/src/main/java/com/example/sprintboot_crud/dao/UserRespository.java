package com.example.sprintboot_crud.dao;

import com.example.sprintboot_crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



public interface UserRespository extends CrudRepository<User, Integer> {





}
