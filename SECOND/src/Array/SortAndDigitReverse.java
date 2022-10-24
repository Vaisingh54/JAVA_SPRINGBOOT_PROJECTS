package Array;

import java.util.Scanner;
import java.util.Arrays;

public class SortAndDigitReverse {
	
	

	public static void main(String[] args)
	{
		
		
	int temp=0;
		
		
		
	Scanner sc=new Scanner(System.in);
		
		
	
		
    System.out.print("Enter the no of object in array-->");
	
	int ar[]=new int[sc.nextInt()];
	
	
			
	System.out.println("Enter elements in array--->");
	
	for(int i=0;i<ar.length;i++)
	{
		
		ar[i]=sc.nextInt();
	}
	
	
	
	for(int i=0;i<ar.length;i++)
	{
		while(ar[i]!=0)
		{
			temp=temp*10;
			
			temp=temp+ar[i]%10;
			
			ar[i]=ar[i]/10;
		}
		
		ar[i]=temp;
		temp=0;
	}
	
	
	
	Arrays.sort(ar);
	
	System.out.println("Reversed and sorted array is--->");
	
	for(int i=0;i<ar.length;i++)
	{
		
		System.out.print(ar[i]);
		System.out.print("  ");
	}
	

	
	
	}

}
