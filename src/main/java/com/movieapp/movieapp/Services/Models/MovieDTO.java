package com.movieapp.movieapp.Services.Models;

import java.time.LocalDate;

public class MovieDTO {
	
	private int id;
	private String name;
	private String description;
	private LocalDate releaseDate;
	private String director;
	private String runningTimeInMins;
	
	public String getRunningTimeInMins() {
		return runningTimeInMins;
	}
	public void setRunningTimeInMins(String runningTimeInMins) {
		this.runningTimeInMins = runningTimeInMins;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
