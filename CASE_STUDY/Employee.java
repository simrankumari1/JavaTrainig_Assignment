package com.Practice;
import java.util.*;
public class Employee 
{
   private int EmployeeId;
   private String EmployeeName;
   private int BasicSalary;
   private int TransportAllowance;
   int Tax=2500;
   private double SA;
   private double HRA;
public int getEmployeeId() {
	return EmployeeId;
}
public double getSA() {
	return SA;
}
public void setSA(double sA) {
	SA = sA;
}
public double getHRA() {
	return HRA;
}
public void setHRA(double hRA) {
	HRA = hRA;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public int getBasicSalary() {
	return BasicSalary;
}
public void setBasicSalary(int basicSalary) {
	BasicSalary = basicSalary;
}
public int getTransportAllowance() {
	return TransportAllowance;
}
public void setTransportAllowance(int transportAllowance) {
	TransportAllowance = transportAllowance;
}
   
   
}
