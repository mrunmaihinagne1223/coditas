package model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    private String produvt_name;

    private Date product_expdate;


    @ManyToMany(mappedBy = "productList")
    private List<Customer>customerList;

    public Product() {
    }

}
