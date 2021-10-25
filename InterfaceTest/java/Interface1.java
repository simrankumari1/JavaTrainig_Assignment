package com.InterfaceTest.java;

public interface Interface1 
{
    void draw();
    void color();
}
class TestInterface implements Interface1
{
	public void draw()
	{
		System.out.println("Drawing a circle");
	}
	public void color()
	{
	System.out.println("color is red1");	
	}
}
