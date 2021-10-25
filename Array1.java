import java.util.*;
public class Array1
{
	public static void operationArray(int arr[])
	{
		int sum=0;
		int mul=1;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			mul*=arr[i];
		}
		System.out.println("Addition of the array: "+sum);
		System.out.println("Multiplication of the array: "+mul);
	}
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the size of Array :");
	  int arr[]=new int[sc.nextInt()];
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  operationArray(arr);
  }
}
