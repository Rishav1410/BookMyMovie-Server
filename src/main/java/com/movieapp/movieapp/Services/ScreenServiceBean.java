package com.movieapp.movieapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.movieapp.Data.Domain.Screen;
import com.movieapp.movieapp.Data.Repository.ScreenRepository;
import com.movieapp.movieapp.Services.Mappings.ScreenMapper;
import com.movieapp.movieapp.Services.Models.ScreenDTO;

@Service
public class ScreenServiceBean implements ScreenService {
	
	@Autowired
	private ScreenRepository screenRepository;
	
	@Autowired
	private ScreenMapper mapper;
	
	public Screen createNewScreen(ScreenDTO screenDTO) {
		return screenRepository.save(mapper.convertToEntity(screenDTO));
	}

}
