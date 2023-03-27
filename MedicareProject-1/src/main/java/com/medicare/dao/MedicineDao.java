package com.medicare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.medicare.pojo.Medicine;
import com.medicare.repo.MedicineRepo;


@Service
public class MedicineDao {

	
	@Autowired
	MedicineRepo repo;
	
	
	public Medicine addMed(Medicine c)
	{
		return repo.save(c);
	}
	
	public List<Medicine> getAllMedicine()
	{
		return repo.findAll();
		
	}
	
	public Medicine getMedicine(int id) {
		
		
		return  repo.getMedicine(id);
	}
	
	public List<Medicine> getAllMedicineByName(String name)
	{
		return repo.getMedicine(name);
		
	}
	
    public List<Medicine> getAllAsc(){
		
		return repo.findAll(Sort.by(Sort.Direction.ASC, "price"));
	}
    
    public List<Medicine> getAllDesc(){
		
		return repo.findAll(Sort.by(Sort.Direction.DESC, "price"));
	}
	
	
	public List<Medicine> deleteMed(int id)
	{
		
		repo.deleteById(id);;
		return repo.findAll();
	}
}
