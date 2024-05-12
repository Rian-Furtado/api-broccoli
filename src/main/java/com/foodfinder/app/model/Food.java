package com.foodfinder.app.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_food")

public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String region;
    private String description;
    private String imageUrl;

    public Food(){

    }

    public Food(Long id, String name, String region, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.description = description;
        this.imageUrl = imageUrl;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
