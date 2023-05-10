package net.javaguides.springbootrestaurant.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.javaguides.springbootrestaurant.Model.Rating;

import java.util.ArrayList;
import java.util.List;
@Entity
@NoArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurant_id;

    private String restaurant_name;

    private String location;

    private double cleanlinessRating;
    private double ambianceRating;
    private double hygieneRating;
    private double foodRating;

    @OneToMany(mappedBy = "restaurant",fetch = FetchType.LAZY)
    private List<Rating> ratings = new ArrayList<>();

    // Helper Methods
    public void addRating(Rating rating) {
        this.ratings.add(rating);
    }

    public Restaurant(Long restaurant_id, String restaurant_name, String location, double cleanlinessRating, double ambianceRating, double hygieneRating, double foodRating, List<Rating> ratings) {
        this.restaurant_id = restaurant_id;
        this.restaurant_name = restaurant_name;
        this.location = location;
        this.cleanlinessRating = cleanlinessRating;
        this.ambianceRating = ambianceRating;
        this.hygieneRating = hygieneRating;
        this.foodRating = foodRating;
        this.ratings = ratings;
    }

    public Long getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(Long restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getCleanlinessRating() {
        return cleanlinessRating;
    }

    public void setCleanlinessRating(double cleanlinessRating) {
        this.cleanlinessRating = cleanlinessRating;
    }

    public double getAmbianceRating() {
        return ambianceRating;
    }

    public void setAmbianceRating(double ambianceRating) {
        this.ambianceRating = ambianceRating;
    }

    public double getHygieneRating() {
        return hygieneRating;
    }

    public void setHygieneRating(double hygieneRating) {
        this.hygieneRating = hygieneRating;
    }

    public double getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(double foodRating) {
        this.foodRating = foodRating;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurant_id=" + restaurant_id +
                ", restaurant_name='" + restaurant_name + '\'' +
                ", location='" + location + '\'' +
                ", cleanlinessRating=" + cleanlinessRating +
                ", ambianceRating=" + ambianceRating +
                ", hygieneRating=" + hygieneRating +
                ", foodRating=" + foodRating +
                ", ratings=" + ratings +
                '}';
    }
}