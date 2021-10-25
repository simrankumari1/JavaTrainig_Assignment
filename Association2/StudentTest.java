package com.Association2;

public class StudentTest 
{
public static void main(String args[])
{
	UnderGradStudent ug=new UnderGradStudent();
	ug.setName("Simran kumari");
	ug.setCity("Jamshedpur");
	ug.setYear(2017);
	ug.setRollNo(172125);
	ug.GetStudentDetails();
	System.out.println("Joining Year: "+ug.getYear());
	ug.getBranch();
	ug.getSociety();
}
}
