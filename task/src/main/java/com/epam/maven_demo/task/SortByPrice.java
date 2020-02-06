package com.epam.maven_demo.task;
import java.util.Comparator;
public class SortByPrice implements Comparator<Sweets>
{

	public int compare(Sweets o1, Sweets o2){
		// TODO Auto-generated method stub
		return o1.price-o2.price;
	}

}
