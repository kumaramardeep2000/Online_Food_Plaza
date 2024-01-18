package com.project.demo.service;

//import java.util.List;


import com.project.demo.model.Login;

public interface LoginService {
	Login findByEmail(String email);
	void saveUser(Login login);
//	public List<Login> getAllCustomer();
//	Login save2(String password);

}
