package com.medicare.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.medicare.pojo.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine, Integer>{
	
	@Query("from Medicine m where m.mid=?1")
	 Medicine getMedicine(int id);
	
	@Query("from Medicine m where m.mname=?1")
	List<Medicine>  getMedicine(String mname);
	
   

}
