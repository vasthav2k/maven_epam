package com.epam.maven_demo.task;
import java.util.*;
public class Gift
{
	LinkedList <Sweets> sweets;

	public Gift(LinkedList<Sweets> sweets) {
		super();
		this.sweets = sweets;
	}
	
	public Integer weightsSum()
	{
		Integer sum=0;
		for(Sweets s:sweets)
		{
			sum+=s.weight;
		}
		return sum;
	}
	
	public void sortBasedOnKey(String sortKey)
	{
		if(sortKey.compareTo("name")==0)
			Collections.sort(sweets,new SortByName());
		else if(sortKey.compareTo("weight")==0)
			Collections.sort(sweets,new SortByWeight());
		else
			Collections.sort(sweets,new SortByPrice());
	}
	
}
