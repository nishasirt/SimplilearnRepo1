package com.medicare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.pojo.Cart;

public interface CaetRepo extends JpaRepository<Cart, Integer> {

}
