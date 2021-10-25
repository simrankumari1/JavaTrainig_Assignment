import java.util.*;
public class Practice1
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	
public static void main(String args[])
{
     Scanner sc = new Scanner(System.in);
     System.out.println("enter thr no1");
     int no1=sc.nextInt();
     System.out.println("enter the no2");
     int no2=sc.nextInt();
     
     System.out.println("Addition of two number is:"+(add(no1,no2)));
     System.out.println("Subtraction of two number is"+sub(no1,no2));
     System.out.println("Multiplication of two number is"+mul(no1,no2));
     System.out.println("Division of two number is"+div(no1,no2));
    		 ;	
}
}
