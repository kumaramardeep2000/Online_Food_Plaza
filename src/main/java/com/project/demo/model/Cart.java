package com.project.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cart_id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Login user;
	
	@ManyToOne
	@JoinColumn(name = "food_id")
	private Food food;
	private Integer quantity;
	private Double food_bill;
	public Cart() {
		super();

	}
	public Integer getCart_id() {
		return cart_id;
	}
	public void setCart_id(Integer cart_id) {
		this.cart_id = cart_id;
	}
	public Login getUser() {
		return user;
	}
	public void setUser(Login user) {
		this.user = user;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getFood_bill() {
		return food_bill;
	}
	public void setFood_bill(Double food_bill) {
		this.food_bill = food_bill;
	}
	
	
	
	
	
//	@Entity
//	@Table(name="cart")
//	public class Cart {
//		@Id
//		@GeneratedValue(strategy = GenerationType.AUTO)
//		@Column(name="cart_id")
//		private Integer cartId;
//		
//		@ManyToOne
//		@JoinColumn(name="user_id")
//		private Users users;
//		
//		@ManyToOne
//		@JoinColumn(name="book_id")
//		private Books books;
//		
//		@Column(name="book_qty")
//		private Integer bookQuantity;
//		
//		@Column(name="own_type")
//		private String ownType;
	

}
