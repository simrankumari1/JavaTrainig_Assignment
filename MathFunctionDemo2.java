import java.util.*;
public class MathFunctionDemo2 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the size of array");
	  int arr[]=new int[sc.nextInt()];
	  System.out.println("enter the elmenets of array");
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int min=arr[0];
	  int max=arr[0];
	  for(int i=0;i<arr.length;i++)
	  {
		  min=Math.min(min, arr[i]);
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  max=Math.max(max, arr[i]);
	  }
	  System.out.print("The minumum value in the array is:"+min+"\n");
	  System.out.print("The maximum value in the array is:"+max);
	  
  }
}
