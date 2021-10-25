package com.InterfaceTest.java;

public interface Eg5Interface 
{
   void majorSubject();
   void netQualified();
   
}
interface Teacher
{
	void department();
	void Salary();
	
}
class TA implements Eg5Interface,Teacher
{
	public void majorSubject()
	{
		System.out.println("Major subject is: computer");
	}
	public void netQualified()
	{
		System.out.println("Net qualificartion is: Grduation");
	}
	public void department()
	{
		System.out.println("Department of the teacher is: CSE");
	}
	public void Salary()
	{
		System.out.println("Salary: 245688");
	}
}

