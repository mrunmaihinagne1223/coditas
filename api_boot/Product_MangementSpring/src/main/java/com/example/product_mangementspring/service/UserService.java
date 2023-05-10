package com.example.product_mangementspring.service;

import com.example.product_mangementspring.exception.ResourceNotFoundException;
import com.example.product_mangementspring.model.User;

import java.util.List;

public interface UserService {
    User saveEmployee(User employee);
    List<User> getAllEmployees();
    User getEmployeeById(Integer id) throws ResourceNotFoundException;
    User updateEmployee(User employee,int id) throws ResourceNotFoundException;

    void deleteEmployeeId( int id) throws ResourceNotFoundException;
    public boolean checkUserExists(User user);

}
