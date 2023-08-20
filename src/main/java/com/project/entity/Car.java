package com.project.entity;


public class Car {
	
	private int noPlate;
	private int chasisNo;
	private String modelName;
	
	
	public Car(int noPlate, int chasisNo, String modelName) {
		super();
		this.noPlate = noPlate;
		this.chasisNo = chasisNo;
		this.modelName = modelName;
	}
	public int getNoPlate() {
		return noPlate;
	}
	public void setNoPlate(int noPlate) {
		this.noPlate = noPlate;
	}
	public int getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	

}
