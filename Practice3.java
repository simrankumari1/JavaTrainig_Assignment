import java.util.*;
public class Practice3 
{
	public static double SimpInt(double p,int r,int t)
	{
		double total=(p*r*t)/100;
		return total;
	}
	public static void main(String args[])
	{
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter thr Principal value");
	     double p=sc.nextDouble();
	     System.out.println("enter the rate");
	     int r=sc.nextInt();
	     System.out.println("enter the Time");
	     int t=sc.nextInt();
	     System.out.println("the simple interest is"+SimpInt(p,r,t));
	    
	}
}
