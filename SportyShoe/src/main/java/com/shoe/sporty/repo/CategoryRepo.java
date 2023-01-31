package com.shoe.sporty.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoe.sporty.pojo.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
