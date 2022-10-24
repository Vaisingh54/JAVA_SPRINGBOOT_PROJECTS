package CollectionAssi1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DemoSet {
	
	
	
	LinkedHashSet <Character> set;
	
	Scanner sc=new Scanner(System.in);
	
	
	String str;
	
	
	
	
	
	public DemoSet(LinkedHashSet<Character> set) {
		super();
		this.set=set;
	}
	
	public void add()
	{
		
		System.out.println("Enter your String");
		 str=sc.nextLine();
	}
	
	public void print()
	{
		
		for(int i=0;i<str.length();i++)
		
		{
			
			set.add(str.charAt(i));
		}
		System.out.println(set.toString().replace(",",""));
		
		
    }
}
	
	
	
	
	


