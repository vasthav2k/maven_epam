package com.epam.maven_demo.task;

public abstract class Sweets
{
	int weight,price;
	String name;
	
	
	public Sweets(int weight, int price, String name) {
		super();
		this.weight = weight;
		this.price = price;
		this.name = name;
	}


	public abstract String getVariety();
	
}
