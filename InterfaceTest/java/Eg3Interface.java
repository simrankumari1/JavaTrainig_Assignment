package com.InterfaceTest.java;

public interface Eg3Interface 
{
   void shape();
}
interface shape3d
{
	void Shape3D();
}
class TestShapes implements Eg3Interface,shape3d
{
	public void shape()
	{
		System.out.println("Circle");
	}
	public void Shape3D()
	{
		System.out.println("Robot");
	}
}
