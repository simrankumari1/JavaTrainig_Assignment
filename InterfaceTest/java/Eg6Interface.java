package com.InterfaceTest.java;

public interface Eg6Interface
{
  void wheelType(int x);
}
interface MaxSpeed extends Eg6Interface
{
  void Speed(int y);
}
class Bike implements MaxSpeed
{
	public void wheelType(int x)
	{
		System.out.println("The no of wheel is: "+x);
	}
	public void Speed(int y)
	{
		System.out.println("The Maximum speed is: "+y);
	}
}