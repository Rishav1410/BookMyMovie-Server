package com.movieapp.movieapp.Data.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Screen extends BaseEntity {
	
	@Column(nullable = false)
	private int number;
	
	@Column(nullable = false)
	private int capacity;
	
	@Column(nullable = false)
	private boolean isImax;
	
	@ManyToOne()
	private Multiplex multiplex;
	
	public Multiplex getMultiplex() {
		return multiplex;
	}
	public void setMultiplex(Multiplex multiplex) {
		this.multiplex = multiplex;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isImax() {
		return isImax;
	}
	public void setImax(boolean isImax) {
		this.isImax = isImax;
	}
	

}
