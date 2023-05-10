package com.example.product_mangementspringboot.impl;

import com.example.product_mangementspring.exception.ResourceNotFoundException;
import com.example.product_mangementspring.model.User;
import com.example.product_mangementspring.repository.UserRepository;
import com.example.product_mangementspring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User saveEmployee(User employee) {
        return userRepository.save(employee);
    }

    @Override
    public List<User> getAllEmployees() {
        return null;
    }

    @Override
    public User getEmployeeById(Integer id) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public User updateEmployee(User employee, int id) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public void deleteEmployeeId(int id) throws ResourceNotFoundException {

    }

    @Override
    public boolean checkUserExists(User user) {
        return userRepository.existsByUsernameAndPassword(user.getUserName(),
                user.getUserPassword());
    }

}
