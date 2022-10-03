package com.springboot.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mapping.entity.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Integer> {

}
