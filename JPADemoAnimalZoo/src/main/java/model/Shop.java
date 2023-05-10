package model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shop_id;

    private String shop_name;

    @OneToMany(mappedBy = "shop",cascade = CascadeType.ALL)
    private List<Customer>customerList;

    public Shop() {
    }
}
