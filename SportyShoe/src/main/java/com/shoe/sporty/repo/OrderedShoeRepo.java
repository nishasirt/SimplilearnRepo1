package com.shoe.sporty.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoe.sporty.pojo.OrderredShoe;

public interface OrderedShoeRepo extends JpaRepository<OrderredShoe, Integer>{

}
