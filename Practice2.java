import java.util.*;
public class Practice2
{
	public static void area(double r)
	{
		System.out.println("The area of a circle is"+(3.14*r*r));
	}
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("enter thr radius");
	     double r=sc.nextDouble();
	     area(r);
	 }
     
}
