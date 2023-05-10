package model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;

    private String customer_name;

    @ManyToOne()

    private Shop shop;

    @ManyToMany
    private List<Product>productList;

    public Customer() {

    }

    public Customer(String customer_name, Shop shop) {
        this.customer_name = customer_name;
        this.shop = shop;
    }
}
