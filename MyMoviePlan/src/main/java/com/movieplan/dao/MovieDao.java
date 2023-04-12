package com.movieplan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieplan.pojo.Movie;
import com.movieplan.repo.MovieRepo;


@Service
public class MovieDao {
	
	@Autowired
	MovieRepo repo;
	
	
	public Movie inserMovie(Movie m) {
		
		
		return repo.save(m);
	}
	
	
	public List<Movie> getMovies(){
		
		
		return repo.findAll();
	}
	
	
	public Movie getMovie(int id) {
		
		
		return repo.getMovieByid(id);
		
		
	}
	
	
	public  List<Movie> deleteMovie(int id){
		
		
		
		repo.deleteById(id);
		
		return  repo.findAll();
	}

}
