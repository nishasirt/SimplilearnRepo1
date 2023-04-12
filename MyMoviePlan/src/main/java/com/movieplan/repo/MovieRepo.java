package com.movieplan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movieplan.pojo.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer>{
	
	
        @Query("from Movie where mid=?1")
        Movie getMovieByid(int mid);
        
 
}
