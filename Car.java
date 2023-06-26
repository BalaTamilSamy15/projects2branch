package com.onesoft.day12;

public class Car {
	private String brand;
	private int price;
	private int model;
	private String colour;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Car(String brand, int price, int model, String colour) {
		
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.colour = colour;
	}
	@Override
	public String toString() {
		return " Car brand="+price+","
	+ brand + ", price=" + price + ", model=" + model + ", colour=" + colour ;
	}
	
	

}
