package net.javaguides.springbootbankend.Impl;

import net.javaguides.springbootbankend.Model.Employee;
import net.javaguides.springbootbankend.Repository.EmployeeRepository;
import net.javaguides.springbootbankend.Service.EmployeeService;
import net.javaguides.springbootbankend.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   private EmployeeRepository employeeRepository;


   public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) throws ResourceNotFoundException {
//        Optional<Employee> employee = employeeRepository.findById(id);
//        if (employee.isPresent()){
//            return employee.get();
//        }else {
//            throw new ResourceNotFoundException("Employee","Id",id);
//        }
        return employeeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Employee","Id", id));

    }

    @Override
    public Employee updateEmployee(Employee employee, int id) throws ResourceNotFoundException {
        Employee existingemployee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee", "id", id));
        existingemployee.setFirstName(employee.getFirstName());
        existingemployee.setLastName(employee.getLastName());
        existingemployee.setEmail(employee.getEmail());
        employeeRepository.save(existingemployee);
        return existingemployee;
    }

    @Override
    public void deleteEmployeeId(int id) throws ResourceNotFoundException {
        Employee existingemployee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee", "id", id));
        employeeRepository.deleteById(id);
    }
}
