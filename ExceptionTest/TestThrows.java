package com.ExceptionTest;

public class TestThrows
{
	static void Division(int a,int b) throws Exception
	{
	   int total=a/b;
	}
public static void main(String args[])
{
     try
     {
    	 Division(2,0);
     }
     catch(Exception e)
     {
    	 System.out.println(e);
     }
}
}
