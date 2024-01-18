package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.demo.model.Login;
import com.project.demo.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService ls;

	@GetMapping("/register")
	public String view() {

		return "registration";
	}

	@GetMapping("/login")
	public String dashboard(Login login) {

		return "dashboard";
	}

	@PostMapping("/register")
	public String saveUser(@ModelAttribute("loginData") Login login) {

		System.out.println("data"+login);
		ls.saveUser(login);

		return "redirect:/login";
	}

	@PostMapping("/login")
	public String userLogin(@RequestParam("email") String email, @RequestParam("password") String password) {

		Login dbUser = ls.findByEmail(email);

		// Check if the user exists
		if (dbUser == null) {
			return "User not found";
		}

		// Compare the passwords
		if (dbUser.getPassword().equals(password)) {
			return "userDashBoard";
		} else {
			return "dashboard";
		}
	}

//		@GetMapping("/login")
//		public String viewHomePage(Model model) {
//			model.addAttribute("listCustomer", ls.getAllCustomer());
//			return "viewuser";
//		}

}
