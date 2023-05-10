package net.javaguides.springbootrestaurant.Service;

import net.javaguides.springbootrestaurant.Model.Customer;

import java.util.List;

public interface CustomerService {
    Customer enterratingcustomer(Customer customer);
    List<Customer>getAllCustomer();

}
