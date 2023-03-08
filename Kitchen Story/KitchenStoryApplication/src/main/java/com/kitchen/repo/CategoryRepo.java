package com.kitchen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kitchen.pojo.Category;

public interface CategoryRepo  extends JpaRepository<Category, Integer>{

}
