import com.EmployeeDetail.*;
import java.util.*;
public class EmployeeTest 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   Employee[] e=new Employee[3];
	   for(int i=0;i<e.length;i++)
	   {
		   e[i]=new Employee();
	   System.out.println("Enter the details of employee no"+(i+1));
	   System.out.print("Enter the  employee name: ");
	   e[i].setName(sc.nextLine());
	   sc.nextLine();
	   System.out.print("Enter the gender of employee: ");
	   e[i].setGender(sc.next());
	   
	   System.out.print("Enter the age of employee: ");
	   e[i].setAge(sc.nextInt());
	   
	   System.out.print("Enter the salary of employee: ");
	   e[i].setSalary(sc.nextDouble());
	   System.out.println("\n");
	   }
	   
	   System.out.println("EMPLOYEE DATA");
	   
	  
	   for(int i=0;i<e.length;i++)
	   {
		   System.out.println("**********************************************");
		   System.out.println("DETAILS OF EMPLOYEE NO"+(i+1));
		   
		
	   System.out.println("Name: "+e[i].getName());
	   System.out.println("Gender: "+e[i].getGender());
	   System.out.println("Age: "+e[i].getAge());
	   System.out.println("Salary: "+e[i].getSalary());
	   }
	   
   }
}
