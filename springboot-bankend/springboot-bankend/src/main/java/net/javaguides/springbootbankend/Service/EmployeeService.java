package net.javaguides.springbootbankend.Service;

import net.javaguides.springbootbankend.Model.Employee;
import net.javaguides.springbootbankend.exception.ResourceNotFoundException;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id) throws ResourceNotFoundException;
    Employee updateEmployee(Employee employee,int id) throws ResourceNotFoundException;

    void deleteEmployeeId( int id) throws ResourceNotFoundException;

}
