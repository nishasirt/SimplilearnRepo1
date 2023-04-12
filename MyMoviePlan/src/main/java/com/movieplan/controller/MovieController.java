package com.movieplan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieplan.dao.MovieDao;
import com.movieplan.pojo.Movie;
@CrossOrigin(origins = "*")
@RestController
public class MovieController {
	
	@Autowired
	MovieDao dao;
	
	
	@PostMapping("/addmovie")
	public String addMovie(@RequestBody   Movie m) {
		
		
		 dao.inserMovie(m);
		 
		 return "Movie Added Sucessfully";
		
	}
	
	@GetMapping("/getmovies")
	public List<Movie> getAllMovies()
	{
		
		
		
		return	dao.getMovies();
	}
	
	
	@DeleteMapping("/deletemovie/{id}")
	public List<Movie> deleteMovies( @PathVariable  int id)
	{
		
		
		
		return	dao.deleteMovie(id);
		
		
	}
}