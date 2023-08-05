package com.movieapp.movieapp.Services.Mappings;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.movieapp.movieapp.Data.Domain.Movie;
import com.movieapp.movieapp.Services.Models.MovieDTO;

@Mapper(componentModel = "spring")
public interface MovieMapper {
	
	
	MovieDTO convertToDTO(Movie movie);
	
	@Mapping(target = "id", ignore = true)
	Movie convertToEntity(MovieDTO movieDTO);

}
