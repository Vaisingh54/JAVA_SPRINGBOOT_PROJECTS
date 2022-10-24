package Array;

import java.util.Arrays;

public class Integer 
{
	
	public static void main(String[] args)
	{
	int[] ar=new int[5];
	{
	
	
	for(int i=0;i<ar.length;i++)
{
	ar[i]=(int)(Math.random()*1000);
}
	
	Arrays.sort(ar);
	
	
	for(int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]);
	}
	
	
	System.out.println("Second smallest no is--->"+ar[1]);


}
}
}
