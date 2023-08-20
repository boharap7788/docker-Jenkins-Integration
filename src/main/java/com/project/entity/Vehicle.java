package com.project.entity;

public class Vehicle {
	
	private int number;
	private String license;
	public Vehicle(int number, String license) {
		super();
		this.number = number;
		this.license = license;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	
	


}
