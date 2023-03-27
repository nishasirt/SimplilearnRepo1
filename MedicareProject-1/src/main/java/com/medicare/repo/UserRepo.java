package com.medicare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.pojo.User;

public interface UserRepo  extends JpaRepository<User, String>{

}
