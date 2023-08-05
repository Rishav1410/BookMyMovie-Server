package com.movieapp.movieapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.movieapp.movieapp.Data.Domain.Screen;
import com.movieapp.movieapp.Services.ScreenService;
import com.movieapp.movieapp.Services.Models.ScreenDTO;

@RestController
@RequestMapping("/api")
public class ScreenController {
	
	@Autowired
	ScreenService screenService;
	
	@PostMapping("/screen")
	public ResponseEntity<Screen> createScreen(@RequestBody ScreenDTO screenDTO){
		try{
			return new  ResponseEntity<Screen>(screenService.createNewScreen(screenDTO), HttpStatus.ACCEPTED);
		}
		catch(Exception e){
			return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
