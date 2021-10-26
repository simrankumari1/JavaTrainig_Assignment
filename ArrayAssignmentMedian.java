package com.CollectionExamples.ArrayList;
import java.util.*;
public class ArrayAssignmentMedian 
{
	public static int SumOfArray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		  sum+=arr[i];	
		}
		return sum;
	}
	public static double MeanOfArray(int arr[],int sum)
	{
		double mean=(sum)/arr.length;
		return mean;
	}
	public static int ModeOfArray(int arr[])
	{
		int max=0;
		int mode=arr[0];
	  for(int i=0;i<arr.length;i++)
	  {
		  int count=0;
		  for(int j=i;j<arr.length;j++)
		  {
			  if(arr[i]==arr[j])
			  {
				  count++;
			  }
		  }
		  if(max<=count)
		  {
			  max=count;
			 mode=arr[i];
		  }
	  }
	  
	  return mode;
	}
	public static int MedianOfArray(int arr[])
	{
		int x;
		Arrays.sort(arr);
		if((arr.length%2)!=0)
		{
		   x=Math.round(arr.length/2);
		   System.out.println(x);
		   return arr[x+1];
		}
		else
		{
			x=arr.length/2;
			System.out.println(x);
			return (arr[x-1]+arr[x]);
		}
	}
  public static void main(String args[])
  {
     //ArrayAssignmentClass c1=new ArrayAssignmentClass();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int arr[]=new int[sc.nextInt()];
     System.out.println("Enter array elemnts");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	int sum=SumOfArray(arr);
	double mean=MeanOfArray(arr,sum);
	int mode=ModeOfArray(arr);
	int median=MedianOfArray(arr);
	System.out.println("Sum of array: "+sum);
	System.out.println("Mean of array: "+mean);
	System.out.println("Mode of array: "+mode);
	System.out.println("Median of array: "+median);
  }
}
