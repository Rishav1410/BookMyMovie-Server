package com.movieapp.movieapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.movieapp.Data.Domain.Movie;
import com.movieapp.movieapp.Data.Repository.MovieRepository;
import com.movieapp.movieapp.Services.Mappings.MovieMapper;
import com.movieapp.movieapp.Services.Models.MovieDTO;

@Service
public class MovieServiceBean implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private MovieMapper mapper;

	public Movie createMovie(MovieDTO movieDTO) {

		Movie movie = mapper.convertToEntity(movieDTO);	
		return movieRepository.save(movie);
	}

	public List<Movie> getAllMovies() {

		return movieRepository.findAll();
	}

	public Movie updateMovie(MovieDTO movieDTO) {

		Movie movie = movieRepository.findById(movieDTO.getId()).orElseThrow();

		movie = mapper.convertToEntity(movieDTO);
		movie.setId(movieDTO.getId());
		return movieRepository.save(movie);
	}

	public void deleteMovie(int id) {
		movieRepository.deleteById(id);
	}
	
	public MovieDTO getMovieByName(String name) {
		
		return mapper.convertToDTO(movieRepository.getMovieByName(name));
	}
	
	public List<MovieDTO> getAllMoviesOfDirector(String director){
		
		return movieRepository.getMoviesByDirector(director)
				.stream()
				.map(m -> mapper.convertToDTO(m))
				.toList();
	}

}
