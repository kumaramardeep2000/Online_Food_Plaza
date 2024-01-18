package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.demo.model.Food;
import com.project.demo.service.FoodService;


@Controller
public class FoodController {
	@Autowired
	private FoodService foodService;
	
	@GetMapping("/food")
	public String viewFoodIndex(Model model) {
		model.addAttribute("listFood", foodService.getAllFood());
		return "foodindex";
	}

//It will show form for new Food
	@GetMapping("/newFoodForm")
	public String showNewFoodForm(Model model) {
		// create model attribute to bind form data
		Food food = new Food();
		model.addAttribute("food", food);
		return "newfood";
	}

	@PostMapping("/saveFood")
	public String saveFood(@ModelAttribute("food") Food food) {
		// save food to data bases;
		foodService.saveFood(food);
		return "redirect:/food";
	}

	@GetMapping("/showFormUpdateFood/{fid}")
	public String showFormForUpdate(@PathVariable(value = "fid") Integer fid, Model model) {
		// get customer from service
		Food food = foodService.updateFoodById(fid);
		// set food as model attribute to pre-populate the module
		model.addAttribute("food", food);
		return "updatefood";

	}

	@GetMapping("/deleteFood/{fid}")
	public String deleteFood(@PathVariable(value = "fid") Integer fid, Model model) {
		this.foodService.deleteFoodById(fid);
		return "redirect:/food";

	}
}