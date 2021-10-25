package com.InheritanceExample;

public class Employee extends HumanBeing
{
   private int id;
   private double salary;
  
   public void setId(int id) 
   {
		this.id = id;
	}
public int getId()
{
	return id;
}

public void setSalary(double salary)
{
	this.salary = salary;
}
public double getSalary() 
{
	return salary;
}

}
