package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.demo.model.Admin;
import com.project.demo.service.AdminService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService as ;
	
	@GetMapping("/")
	public String getFrontPage() {
		
		return "index";
	}
	
	

	@GetMapping("/admin")
	public String getAdminPage(Model model) {
		model.addAttribute("admin", new Admin());
		return "admin";
	}

	@PostMapping("/admin")
	public String adminLogin(String email,String password, Model model) {
		Admin admin = as.getByEmail(email);
		if(admin!=null && password.equals(admin.getPassword())) {
			model.addAttribute("message", "Login Successfully");
			System.out.println("Login Successfully");
			return "/useradmin";
		}
		else {
			model.addAttribute("message", "please try again");
			System.out.println("please try again");
			return "redircect:/admin";
		}
		
	}
	
//	@GetMapping("/login")
//	public String getDashboardPage(Model model) {
//		model.addAttribute("admin", new Admin());
//		return "dashboard";
//	}

}
