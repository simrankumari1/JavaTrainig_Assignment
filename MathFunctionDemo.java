import java.util.*;
public class MathFunctionDemo 
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the first no");
	 int no1=sc.nextInt();
	 System.out.println("Enter the second no");
	 int no2=sc.nextInt();
	 System.out.println("The minimum number among them is: "+Math.min(no1, no2));
	 System.out.println("The maximum number among them is: "+Math.max(no1, no2));
	 System.out.println("Power eg: "+Math.pow(no1, no2));
	 System.out.println("Enter the no to find squareroot");
	 int no3=sc.nextInt();
	 System.out.println("Square eg: "+Math.sqrt(no3));
 }
}
