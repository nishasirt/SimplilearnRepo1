package com.medicare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.pojo.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
