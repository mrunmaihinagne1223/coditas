package net.javaguides.springbootrestaurant.Repository;

import net.javaguides.springbootrestaurant.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRespository extends JpaRepository<Customer , Long> {


}
