package com.Practice;
import java.util.*;
public class EmployeeTest 
{
	private static void CalculateNetSalary(Employee[] e)
	{
		System.out.println("**********EMPLOYEE DATA************");
		for(int i=0;i<e.length;i++)
		{
			double total=0;
			total=(e[i].getBasicSalary()+e[i].getHRA()+e[i].getSA()+e[i].getTransportAllowance())-e[i].Tax;
			System.out.println("EMPLOYEE ID:"+e[i].getEmployeeId());
			System.out.println("Employee Name:"+e[i].getEmployeeName());
			System.out.println("NET SALARY:"+total);
		}
		
	}
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the no of employee details to be entered");
	 
	 Employee[] e=new Employee[sc.nextInt()];
	 
     for(int i=0;i<e.length;i++)
     {
    	 e[i]=new Employee();
    	 System.out.println("Enter the Employee Id");
    	 e[i].setEmployeeId(sc.nextInt());
    	 System.out.println("Enter the Employee Name");
    	 sc.nextLine();
    	 e[i].setEmployeeName(sc.nextLine());
    	 System.out.println("Enter the Basic Salary");
    	 e[i].setBasicSalary(sc.nextInt());
    	 if(e[i].getBasicSalary()<=10000)
    	 {
    		 e[i].setHRA(e[i].getBasicSalary()*(0.2));
    		 e[i].setSA(e[i].getBasicSalary()*(0.8));
    	 }
    	 else if(e[i].getBasicSalary()>10000&&e[i].getBasicSalary()<=20000)
    	 {
    		 e[i].setHRA(e[i].getBasicSalary()*(0.25));
    		 e[i].setSA(e[i].getBasicSalary()*(0.9));
    	 }
    	 else if(e[i].getBasicSalary()>=20000)
    	 {
    		 e[i].setHRA(e[i].getBasicSalary()*(0.3));
    		 e[i].setSA(e[i].getBasicSalary()*(0.95));
    	 }
    	 System.out.println("Enter the percentage of Transport Allowance:");
    	 e[i].setTransportAllowance((sc.nextInt()/100)*e[i].getBasicSalary());
    	 
     }
     CalculateNetSalary(e);
 }


}
