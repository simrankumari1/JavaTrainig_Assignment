package com.InterfaceTest.java;

public interface Eg4Interface 
{
  void Draw();
  static int SquareArea(int x)
  {
	  return x*x;
  }
 
}
class Sq implements Eg4Interface
{
	public void Draw()
	{
		System.out.println("Draw a square");
	}
	
}
