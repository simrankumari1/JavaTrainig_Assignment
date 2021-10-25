package com.Association2;

public class UnderGradStudent extends Student
{
  private int year;

public int getYear()
{
	return year;
}

public void setYear(int year)
{
	this.year = year;
}
public void getBranch()
{
	Branch b1=new Branch();
	b1.StudiesBranch();
}
public void getSociety()
{
	Society s1=new Society();
	s1.collegeSociety();
}

  
}
