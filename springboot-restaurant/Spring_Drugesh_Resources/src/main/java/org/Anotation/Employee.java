package org.Anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Employee {
    private String emp_name;
    @Autowired
    private Address address;

    public Employee() {
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(String emp_name, Address address) {
        this.emp_name = emp_name;
        this.address = address;
    }

    public void display(){
        System.out.println("Emp: "+address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_name='" + emp_name + '\'' +
                ", address=" + address +
                '}';
    }
}
