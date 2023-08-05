package com.movieapp.movieapp.Services.Mappings;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.movieapp.movieapp.Data.Domain.Screen;
import com.movieapp.movieapp.Services.Models.ScreenDTO;

@Mapper(componentModel = "spring")
public interface ScreenMapper {
	
	@Mapping(source="number", target = "screenNumber")
	@Mapping(source="capacity", target = "screenCapacity")
	ScreenDTO convertToDTO(Screen screen);
	
	@Mapping(target = "id", ignore = true)
	@Mapping(source="screenNumber", target = "number")
	@Mapping(source="screenCapacity", target = "capacity")
	Screen convertToEntity(ScreenDTO screenDTO);

}
