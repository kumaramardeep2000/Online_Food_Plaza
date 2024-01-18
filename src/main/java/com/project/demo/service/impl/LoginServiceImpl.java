package com.project.demo.service.impl;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.Login;
import com.project.demo.repository.LoginRepository;
import com.project.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository lr;

	@Override
	public Login findByEmail(String email) {
		
		return lr.findByEmail(email);
	}

	@Override
	public void saveUser(Login login) {
		this.lr.save(login);
		
	}

//	@Override
//	public List<Login> getAllCustomer() {
//		// TODO Auto-generated method stub
//		return lr.findAll();
//	}

	
	
	

}
