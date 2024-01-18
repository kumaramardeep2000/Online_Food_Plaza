package com.project.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private Integer id;
	
	@Column(name="user_email")
	private String email;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_password")
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login(Integer id, String email, String name, String password) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public Login(String email, String name, String password) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public Login() {
		
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + "]";
	}
	
	

}
