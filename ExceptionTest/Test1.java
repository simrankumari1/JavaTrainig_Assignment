package com.ExceptionTest;
import java.util.*;
public class Test1 
{
public static void main(String args[])
{
   Scanner sc =new Scanner(System.in)	;
   try
   {
	   String x;
	   System.out.println("Enter the integer no");
	   x=sc.nextLine();
	   System.out.println(Integer.parseInt(x));
   }
   catch(Exception e)
   {
	   System.out.println(e);
   }
   /* finally
   {
   	System.out.println("Program had run succesfully");
   }*/
}
}
