package net.javaguides.springbootrestaurant.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customer_id;
    private String customer_name;
    private String customer_email;
    private String password;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private List<Rating> ratings = new ArrayList<>();

    // Helper Methods
    public void addRating(Rating rating) {
        this.ratings.add(rating);
    }

    public Customer(Long customer_id, String customer_name, String customer_email, String password, List<Rating> ratings) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.password = password;
        this.ratings = ratings;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public void removeRating(Rating rating) {
        this.ratings.remove(rating);
    }
}
