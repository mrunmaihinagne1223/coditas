package net.javaguides.springbootbankend.Repository;

import net.javaguides.springbootbankend.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

}
