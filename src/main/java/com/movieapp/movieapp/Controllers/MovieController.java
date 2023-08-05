package com.movieapp.movieapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieapp.movieapp.Data.Domain.Movie;
import com.movieapp.movieapp.Services.MovieService;
import com.movieapp.movieapp.Services.Models.MovieDTO;



@RestController
@RequestMapping("/api/Movie")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/movies")
	public ResponseEntity<List<Movie>> getAllMovies(){
		try{
			return new  ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/movie/{name}")
	public ResponseEntity<MovieDTO> getMovieByName(@PathVariable String name){
		try{
			return new  ResponseEntity<MovieDTO>(movieService.getMovieByName(name), HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/movies/{director}")
	public ResponseEntity<List<MovieDTO>> getAllMoviesByDirector(@PathVariable String director){
		try{
			return new  ResponseEntity<List<MovieDTO>>(movieService.getAllMoviesOfDirector(director), HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/movie")
	public ResponseEntity<Movie> addMovie(@RequestBody MovieDTO movie){
		try{
			return new ResponseEntity<Movie>(movieService.createMovie(movie), HttpStatus.ACCEPTED);
		}
		catch(Exception e){
			return new ResponseEntity(e.getMessage()+ e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/movie")
	public ResponseEntity<Movie> updateMovie(@RequestBody MovieDTO movie){
		try{
			return new ResponseEntity<Movie>(movieService.updateMovie(movie), HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/movie/{id}")
	public ResponseEntity deleteMovie(@PathVariable Integer id){
		try{
			movieService.deleteMovie(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		catch(Exception e){
			return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
