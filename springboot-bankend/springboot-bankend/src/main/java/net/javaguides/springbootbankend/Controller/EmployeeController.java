package net.javaguides.springbootbankend.Controller;

import net.javaguides.springbootbankend.Model.Employee;
import net.javaguides.springbootbankend.Service.EmployeeService;
import net.javaguides.springbootbankend.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //build create employee REST API
    @PostMapping()
    public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    //build get All employee REST API
    @GetMapping
    public List<Employee> getAllEmployees(){
       return employeeService.getAllEmployees();
    }


    //build get  employee by id REST API /1
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int employeeId) throws ResourceNotFoundException {
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
    }


    //build update employee by id REST API /2
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int employeeId, @RequestBody Employee employee) throws ResourceNotFoundException {
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,employeeId),HttpStatus.OK);
    }


    //build delete employee by id REST API /3
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") int employeeId) throws ResourceNotFoundException {
        employeeService.deleteEmployeeId(employeeId);

        return new ResponseEntity<String>("Employee deleted successfully",HttpStatus.OK);
    }


}
