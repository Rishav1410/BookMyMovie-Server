package com.movieapp.movieapp.Services.Models;

public class ScreenDTO {
	
	private int id;
	private int screenNumber;
	private int screenCapacity;
	private boolean isImax;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScreenNumber() {
		return screenNumber;
	}
	public void setScreenNumber(int screenNumber) {
		this.screenNumber = screenNumber;
	}
	public int getScreenCapacity() {
		return screenCapacity;
	}
	public void setScreenCapacity(int screenCapacity) {
		this.screenCapacity = screenCapacity;
	}
	public boolean isImax() {
		return isImax;
	}
	public void setImax(boolean isImax) {
		this.isImax = isImax;
	}
	

}
