package com.springboot.respository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Product;

@Repository
public interface ProductRepo extends JpaRepositoryImplementation<Product, Integer> {

}
