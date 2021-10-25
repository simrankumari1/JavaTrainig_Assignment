import java.util.*;
public class Practice6 
{
	public static void EvenOdd(int n)
	{
		if(n%2==0)
		{
			System.out.println("It is even no");
		}
		else
		{
			System.out.println("It is odd no");
		}
	}
	public static void PositiveNeg(int n)
	{
		if(n>0)
		{
			System.out.println("It is Positive no");
		}
		else if(n<0)
		{
			System.out.println("It is negative no");
		}
		else
		{
			System.out.println("the no is ZERO");
		}
	}
	public static void PrimeNot(int n)
	{
		int i,m=0,flag=0;
		
		m=n/2;
		  
	  	if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;     
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }
	}

	
  public static void main(String args[])
  {
	  System.out.println("Enter 1 for addition");
	  System.out.println("Enter 2 for Average");
	  System.out.println("Enter 3 for checking even/odd");
	  System.out.println("Enter 4 for checking positive/negative");
	  System.out.println("Enter 5 for checking prime or not");
	  System.out.println("Enter 6 for exiting");
	 boolean f=true;
	  while(f)
	  {
		  Scanner sc=new Scanner(System.in);	
		  int a,b;
		System.out.println("Eneter the option: ");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("Enter the two number for addition");
			 a=sc.nextInt();
			 b=sc.nextInt();
			System.out.println("The value is "+(a+b));
			break;
		case 2:
			System.out.println("Enter the two number for finding the Average");
			 a=sc.nextInt();
		     b=sc.nextInt();
			System.out.println("The value is "+(a+b)/2);
			break;
		case 3:
			System.out.println("Enter the number to check even/odd");
			a=sc.nextInt();
			EvenOdd(a);
			break;
		case 4:
			System.out.println("Enter the number to check positive/negative");
			a=sc.nextInt();
			PositiveNeg(a);
			break;
		case 5:
			System.out.println("Enter the number to check prime or not");
			a=sc.nextInt();
			PrimeNot(a);
			break;
		case 6:
			
			System.exit(0);
		default:
			System.out.println("INVALID OPTION");
			
		}
	  }
  }
}
