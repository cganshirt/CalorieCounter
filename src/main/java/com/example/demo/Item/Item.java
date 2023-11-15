package com.example.demo.Item;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")

public class Item {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "foodgroup")
    private String foodGroup;
    @Column(name = "calories")
    private Double calories;
    @Column(name = "fat")
    private Double fat;
    @Column(name = "protein")
    private Double protein;
    @Column(name = "carbohydrates")
    private Double carbohydrates;
    @Column(name = "sugars")
    private Double sugars;
    @Column(name = "fiber")
    private Double fiber;
    @Column(name = "netcarbs")
    private Double netcarbs;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFoodGroup() {
        return foodGroup;
    }

    public Double getCalories() {
        return calories;
    }

    public Double getFat() {
        return fat;
    }

    public Double getProtein() {
        return protein;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public Double getSugars() {
        return sugars;
    }

    public Double getFiber() {
        return fiber;
    }

    public Double getNetcarbs() {
        return netcarbs;
    }
}
