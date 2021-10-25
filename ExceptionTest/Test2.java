package com.ExceptionTest;
import java.util.*;
public class Test2
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    try
    {
    	int arr[]=new int[5];
    	System.out.println("enter the elements of array");
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	System.out.println("Printing the elements");
    	for(int i=0;i<8;i++)
    	{
    		System.out.println(arr[i]);
    	}
    	 
    }
    catch(Exception e)
    {
    	try
    	{
    	System.out.println(e);
    	String s="abc";
        System.out.println(Integer.parseInt(s));
    	}
		     catch(Exception e1)
		     {
		    	System.out.println(e1);
		    	
		     }
    System.out.println(e);
    e.printStackTrace();
    }
   /* finally
    {
    	System.out.println("Program had run succesfully");
    }*/
}
}
