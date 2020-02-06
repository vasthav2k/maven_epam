package com.epam.maven_demo.task;

public class Chocolates extends Sweets
{

	public Chocolates(int weight, int price, String name) {
		super(weight, price, name);
		// TODO Auto-generated constructor stub
	}
	
	public String getVariety()
	{
		return "Chocolate";
	}
}
