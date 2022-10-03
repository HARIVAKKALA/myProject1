package com.java.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.mapping.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
