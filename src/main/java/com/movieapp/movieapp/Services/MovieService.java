package com.movieapp.movieapp.Services;

import java.util.List;

import com.movieapp.movieapp.Data.Domain.Movie;
import com.movieapp.movieapp.Services.Models.MovieDTO;

public interface MovieService {
	
	Movie createMovie(MovieDTO movieDTO);
	List<Movie> getAllMovies();
	Movie updateMovie(MovieDTO movieDTO);
	void deleteMovie(int id);
	MovieDTO getMovieByName(String name);
	List<MovieDTO> getAllMoviesOfDirector(String director);
	

}
