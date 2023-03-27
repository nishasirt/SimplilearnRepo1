package com.medicare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.pojo.Ordered;

public interface OrderRepo extends JpaRepository<Ordered, Integer>{

}
