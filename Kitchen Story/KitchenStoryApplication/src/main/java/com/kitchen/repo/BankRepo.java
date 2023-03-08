package com.kitchen.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kitchen.pojo.Bankaccount;

public interface BankRepo extends JpaRepository<Bankaccount, Integer>{

}
