package com.CollectionExamples.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListAssignmentMedian 
{
	public static int SumOfArray(ArrayList<Integer> list)
	{
		int sum=0;
		for(int i=0;i<list.size();i++)
		{
		  sum+=list.get(i);	
		}
		return sum;
	}
	public static double MeanOfArray(ArrayList<Integer> list,int sum)
	{
		double mean=(sum)/list.size();
		return mean;
	}
	public static int ModeOfArray(ArrayList<Integer> list)
	{
		int max=0;
		int mode=list.get(0);
	  for(int i=0;i<list.size();i++)
	  {
		  int count=0;
		  for(int j=i;j<list.size();j++)
		  {
			  if(list.get(i)==list.get(j))
			  {
				  count++;
			  }
		  }
		  if(max<=count)
		  {
			  max=count;
			 mode=list.get(i);
		  }
	  }
	  
	  return mode;
	}
	public static int MeadianOfArray(ArrayList<Integer> list)
	{
		int x;
		
		if((list.size()%2)!=0)
		{
		   x=Math.round(list.size()/2);
		  
		   return list.get(x);
		}
		else
		{
			x=list.size()/2;
			
			return list.get(x-1)+list.get(x);
		}
	}
	public static void main(String args[])
	{
	 ArrayList<Integer> list=new ArrayList<>();
	 list.add(4);
	 list.add(1);
	 list.add(8);
	 list.add(0);
	 list.add(5);
	list.add(8);
	 Collections.sort(list);
	 int sum=SumOfArray(list);
	 System.out.println("sum of arrayList is: "+sum);
	 
	 double mean=MeanOfArray(list,sum);
	 System.out.println("Mean of arrayList is: "+mean);
	 
	 int mode=ModeOfArray(list);
	 System.out.println("Mode of arrayList is: "+mode);
	 
	 int median=MeadianOfArray(list);
	 System.out.println("Median of arrayList is: "+median);
	}
	

}
