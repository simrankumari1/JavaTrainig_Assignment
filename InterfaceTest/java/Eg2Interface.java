package com.InterfaceTest.java;

public interface Eg2Interface 
{
  float pi=3.14f;
  float computeCircle(float x,float y);
}
interface Square extends Eg2Interface
{
	float computeSquare(float x);
}
class TestInterface2 implements Square
{
	public  float computeCircle(float x,float y)
	{
		return (pi*x*y);
	}
	public  float computeSquare(float x)
	{
		return (x*x);
	}
	
}