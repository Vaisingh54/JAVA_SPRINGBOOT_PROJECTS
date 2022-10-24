package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndReverse {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		 System.out.print("Enter the no of object in array-->");
			
			int arr[]=new int[sc.nextInt()];
			
			
					
			System.out.print("Enter elements in array--->");
			
			for(int i=0;i<arr.length;i++)
			{
				
				arr[i]=sc.nextInt();
			}
			
		
		System.out.println();
		
		
		System.out.print(" Reversed array is--->");
        
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println();
		
		Arrays.sort(arr);
		
		
		System.out.print("Sorted array is----> ");
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
