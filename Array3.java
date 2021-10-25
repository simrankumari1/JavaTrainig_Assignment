import java.util.*;
public class Array3
{
	public static int[] mergeArray(int arr[],int brr[])
	{
		int newarr[] = {0};
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
		     newarr[j]=arr[i];
		     j++;
		}
		for(int i=0;i<brr.length;i++)
		{
			newarr[j]=brr[i];
			j++;
		}
		Arrays.sort(newarr);
	return newarr;
	}
  public static void main()
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
	 int newarr[]= mergeArray(arr,brr);
	 for(int i=0;i<newarr.length;i++)
	 {
		 System.out.println(newarr[i]);
	 }
  }
}
