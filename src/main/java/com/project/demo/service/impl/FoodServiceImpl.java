package com.project.demo.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.Food;
import com.project.demo.repository.FoodRepository;
import com.project.demo.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {
	@Autowired
	FoodRepository fr;

	@Override
	public void saveFood(Food food) {
		this.fr.save(food);
		
	}

	@Override
	public List<Food> getAllFood() {
		
		return fr.findAll();
	}

	@Override
	public Food updateFoodById(Integer fid) {
		Optional<Food> optional = fr.findById(fid);
		Food food = null;
		if (optional.isPresent()) {
			food = optional.get();
		} else {
			throw new RuntimeException("food not found =" + fid);
		}

		return food;
	}

	@Override
	public void deleteFoodById(Integer fid) {
		fr.deleteById(fid);

		
	}

	@Override
	public Food searchFoodById(Integer fid) {
		// TODO Auto-generated method stub
		return null;
	}

}
