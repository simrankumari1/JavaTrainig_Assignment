package com.ExceptionTest;

public class Test3 
{
	static void checkNo(int num) throws Exception
	{
		if(num>1)
		{
			System.out.println(num*num);
			System.out.println("no exception");
		}
		else
		{
			throw new Exception("Number is too small");
		}
	}
public static void main(String args[])
{
	try
	{
		checkNo(2);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
	
}
