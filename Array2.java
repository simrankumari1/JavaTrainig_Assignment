import java.util.*;
public class Array2
{
	public static int operationArray(int arr[],int brr[])
	{
	      int sum=0;
	      for(int i=0;i<arr.length;i++)
	      {
	    	  sum+=arr[i];
	      }
	      for(int i=0;i<brr.length;i++)
	      {
	    	  sum+=brr[i];
	      }
	      
	      return sum;
	}
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the size of Array 1 :");
		  int arr[]=new int[sc.nextInt()];
		  System.out.print("Enter the size of Array 2 :");
		  int brr[]=new int[sc.nextInt()];
		  System.out.println("Enter the elemnts of the Array 1 :");
		  for(int i=0;i<arr.length;i++)
		  {
			  arr[i]=sc.nextInt();
		  }
		  System.out.println("Enter the elemnts of the Array 2 :");
		  for(int i=0;i<brr.length;i++)
		  {
			  brr[i]=sc.nextInt();
		  }
         int sum= operationArray(arr,brr);
         System.out.println("The sum of two array elements is: "+sum);
   }
}
