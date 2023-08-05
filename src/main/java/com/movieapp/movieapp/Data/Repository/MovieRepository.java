package com.movieapp.movieapp.Data.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movieapp.movieapp.Data.Domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	Movie getMovieByName(String name);
	
	List<Movie> getMoviesByDirector(String director);

}
