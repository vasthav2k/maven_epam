package com.epam.maven_demo.task;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        LinkedList <Sweets> sweets=new LinkedList <Sweets>();
        Scanner sc=new Scanner(System.in);
        sweets.add(new Sweets(20,20,"CandyBar")
        		{
        			public String getVariety()
        			{
        				return "Candy";
        			}
        		});
        
        sweets.add(new Sweets(10,25,"MilkyBar")
		{
			public String getVariety()
			{
				return "Candy";
			}
		});
        
        sweets.add(new Sweets(25,25,"ChocoBar")
		{
			public String getVariety()
			{
				return "Candy";
			}
		});
        
        sweets.add(new Sweets(20,30,"DiaryMilk")
        		{
        			public String getVariety()
        			{
        				return "Chocolate";
        			}
        		});
        
        sweets.add(new Sweets(30,20,"CaraMel")
		{
			public String getVariety()
			{
				return "Chocolate";
			}
		});
        
        sweets.add(new Sweets(25,35,"Lindt")
		{
			public String getVariety()
			{
				return "Chocolate";
			}
		});
        
        Gift newyear = new Gift(sweets);
        
        Integer tw = newyear.weightsSum();
        
        System.out.println("Total Weigths" + tw);
        
        newyear.sortBasedOnKey("weight");
        
        for(Sweets s: newyear.sweets) {
        	if(s.getVariety().equals("chocolate")) 
        		System.out.println(s.name);
        }
        
        int low,high;
        System.out.println("Enter lower and higher limit for cost of candies: ");
        low= sc.nextInt();
        high=sc.nextInt();
        
        for(Sweets s: newyear.sweets) {
        	if(s.getVariety().equals("Candy") && s.price>low && s.price<high) 
        		System.out.println(s.name);
        }
        
    }
}
