package com.boostmytool.beststore2.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boostmytool.beststore2.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
    
}
