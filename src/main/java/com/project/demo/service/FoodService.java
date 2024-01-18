package com.project.demo.service;

import java.util.List;

import com.project.demo.model.Food;

public interface FoodService {
	
	public void saveFood(Food food);
    public List<Food> getAllFood();
    // update customerById
    public Food updateFoodById(Integer fid);
    public void  deleteFoodById(Integer fid);
    public Food searchFoodById(Integer fid);
}


