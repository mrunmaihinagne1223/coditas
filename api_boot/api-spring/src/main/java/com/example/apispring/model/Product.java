package com.example.apispring.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor

public class Product {
    @Id
    private Long productId;

    private String productName;

    public Product(Long productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}
