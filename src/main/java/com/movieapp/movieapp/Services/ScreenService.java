package com.movieapp.movieapp.Services;

import com.movieapp.movieapp.Data.Domain.Screen;
import com.movieapp.movieapp.Services.Models.ScreenDTO;

public interface ScreenService {
	Screen createNewScreen(ScreenDTO screenDTO);

}
