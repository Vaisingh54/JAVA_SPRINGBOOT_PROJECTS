package Practice2;

import java.util.Scanner;

public class NonRep {
	
	
	Scanner sc =new Scanner(System.in);
	
	
	String str=sc.nextLine();
	
	int count=0;
	
	public void calculate()
	{
		
		
//		char[] ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			
			for(int j=str.length()-1;j>=0;j--)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					if(j==0)
					{
						count++;
					}
					else {
						i--;
					}
				}
				else {
					j++;
				}
			}
		}
		
		
		System.out.println(count);
	
		
		
	}

}
