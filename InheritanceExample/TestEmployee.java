package com.InheritanceExample;

import java.util.Scanner;

public class TestEmployee
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   Engineer e1=new Engineer();                                       //Employee e1=new Employee();   for single inheritance
	   
	   System.out.print("Enter the person name: ");
	   e1.setName(sc.nextLine());
	   
	   System.out.print("Enter the employee Designation: ");
	   e1.setDesignation(sc.nextLine());
	   
	   System.out.print("Enter the employee id: ");
	   e1.setId(sc.nextInt());
	   
	   System.out.print("enter the employee salary");
	   e1.setSalary(sc.nextDouble());
	   
	   System.out.println("DETAIL OF HUMAN BEING");
	   System.out.println("*********************************");
	   
	   System.out.println("Name of the employee: "+e1.getName());
	   System.out.println("Id of the employee: "+e1.getId());
	   System.out.println("Designation of the employee: "+e1.getDesignation());
	   System.out.println("Salary of the employee: "+e1.getSalary());	
   }
}
