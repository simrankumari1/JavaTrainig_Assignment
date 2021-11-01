package com.Practice;
import java.util.*;
public class FlowerDemo 
{
	public static void Display(String s,LinkedHashMap<String,String>asia,LinkedHashMap<String,String>europe,LinkedHashMap<String,String>africa)
	{
		System.out.println("COUNTRY"+"    "+"NATIONAL FLOWER");
		System.out.println("*******************************");
        if(s.equals("ASIA"))
        {
			for(String i:asia.keySet())
			{
				System.out.println(i+"    "+asia.get(i));
			}
        }
        else if(s.equals("EUROPE"))
  	  {
        	for(String i:europe.keySet())
			{
				System.out.println(i+"    "+europe.get(i));
			}
  	  }
  	  else if(s.equals("AFRICA"))
  	  {
  		  for(String i:africa.keySet())
			{
				System.out.println(i+"    "+africa.get(i));
			}
  	  }
  	  else
  	  {
  		  System.out.println("INVALID CONTINENT");
  	  }
        
	}
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  LinkedHashMap<String,String> asia=new LinkedHashMap<String,String>();
	  LinkedHashMap<String,String> europe=new LinkedHashMap<String,String>();
	  LinkedHashMap<String,String> africa=new LinkedHashMap<String,String>();
	  asia.put("INDIA","LOTUS");
	  asia.put("PAKISTAN","JASMINE");
	  asia.put("NEPAL","LALI GURANS");
	  
	  europe.put("GERMANY","CORN FLOWER");
	  europe.put("FRANCE","LILY");
	  europe.put("GREECE","ACANTHUS MOLLIS");
	  
	  africa.put("EGYPT","BLUE LOTUS");
	  africa.put("NIGERIA","YELLOW TRUMPET");
	  africa.put("KENYA","ORCHID");
	  
	  
	  System.out.println("ENTER THE CONTIENENT NAME ASIA,EUROPE OR AFRICA: ");
	  String s=(sc.next()).toUpperCase();
	  Display(s,asia,europe,africa);
	  
  }
}
