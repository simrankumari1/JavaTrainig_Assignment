package com.Association2;

public class Student
{
  private String name;
  private String city;
  private int rollNo;
  
public void setName(String name) {
	this.name = name;
}
public void setCity(String city) {
	this.city = city;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public void GetStudentDetails()
{
	System.out.println("STUDENT DETAILS");
	System.out.println("Name: "+name);
	System.out.println("City: "+city);
	System.out.println("RollNo: "+rollNo);
}
  
}
