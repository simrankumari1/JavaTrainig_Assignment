import java.util.*;
public class Array4
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	
	char arr[]=sc.next().toCharArray();
	
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	
  }
}
