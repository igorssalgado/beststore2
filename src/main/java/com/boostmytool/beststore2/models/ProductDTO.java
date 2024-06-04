package com.boostmytool.beststore2.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;

public class ProductDTO {
    
 

    @NotEmpty(message = "Name is required")
    private String name;
    
    @NotEmpty(message = "brand is required")
    private String brand;
    
    @NotEmpty(message = "category is required")
    private String category;
    
    @Min(0)
    private String price;

    @Size(min = 10, message = "at least 10 characters")
    @Size(max = 2000, message = "max 2000 characters")
    private String description;

    private MultipartFile imageFile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }

    

}