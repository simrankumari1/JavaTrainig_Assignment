package com.Practice;
import java.util.*;
public class EnjoyRide 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("How many adults:");
	  int adults=sc.nextInt();
	  
	  System.out.println("How many children:");
	  int children=sc.nextInt();
	  
	  System.out.println("Which ride");
	  String ride=sc.nextLine().toUpperCase();
	  sc.nextLine();
	  System.out.println("How manyy hours you want to take a ride");
	  int hour=sc.nextInt();
	  
	  LinkedHashMap<String,Integer>adult=new LinkedHashMap<String,Integer>();
	  adult.put("ALIBABA", 50);
	  adult.put("ALPINE SLIDE", 60);
	  adult.put("BUMPPER CARS", 45);
	  adult.put("BALOON RACE", 70);
	  
	  LinkedHashMap<String,Integer>child=new LinkedHashMap<String,Integer>();
	  child.put("ALIBABA", 40);
	  child.put("ALPINE SLIDE", 30);
	  child.put("BUMPPER CARS", 25);
	  child.put("BALOON RACE", 60);
	  int totalFare=0;
	  int adultFare = 0;
	  int childFare = 0;
	  int p=1;
	  int h=hour;
	  while(hour>0)
	  {
	  for(String i:adult.keySet())
	  {
		  if(i.contains(ride))
		  {
		      adultFare+=(p*adults*adult.get(i));
		      break;
		  }
	  }
	  for(String i:child.keySet())
	  {
		  if(i.contains(ride))
		  {
		      childFare+=(p*children*child.get(i));
		     break;      
		  }
	  }
	  p++;
	  hour--;
	  }
	  totalFare=adultFare+childFare;
	  System.out.println("Total hours of ride:"+h);
	  System.out.println("Total Fare of Adult Ride:"+"$ "+adultFare);
	  System.out.println("Total fare of children ride:"+"$ "+childFare);
	  System.out.println("Total fare of ride:"+"$ "+totalFare);
	  
      System.out.println("-----------------THANK YOU-----------------");	  
	  
	  
	  
	  
  }
}
