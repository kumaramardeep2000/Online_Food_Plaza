package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
