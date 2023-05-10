package com.example.springboot_demoproject.dao;

import com.example.springboot_demoproject.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    public List<User> findByUname(String name);

    public List<User> findByUcity(String city);

    public List<User> findByUcityOrderByUname(String uname);

    @Query("select u from User u")
    public List<User> getAllUser();

    @Query("select u from User u where u.uname=:n and u.ucity=:c")
    public List<User> getUserbyCity(@Param("n") String uname, @Param("c") String ucity);

    @Query(value = "select * from User ", nativeQuery = true)
    public List<User> getAll();


    @Query("SELECT u FROM User u WHERE u.uname LIKE 'a%'")
    public List<User> getAllUsersByNameStartingWithA();
}
