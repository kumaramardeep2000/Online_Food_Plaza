package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.model.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

}
