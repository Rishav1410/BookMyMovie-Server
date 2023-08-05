package com.movieapp.movieapp.Data.Domain;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie extends BaseEntity {
	
	
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

	
	@Column(length = 20, nullable = false)
	private String name;

	@Column(length = 100, nullable = false)
	private String description;
	
	@Column(nullable = false)
	private LocalDate releaseDate;
	
	@Column(nullable = false)
	private String director;
	
	@Column(nullable = false)
	private short runningTimeInMins;

	public short getRunningTimeInMins() {
		return runningTimeInMins;
	}

	public void setRunningTimeInMins(short runningTimeInMins) {
		this.runningTimeInMins = runningTimeInMins;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

}
