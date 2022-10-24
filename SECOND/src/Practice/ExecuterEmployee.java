package Practice;

import java.util.Scanner;

public class ExecuterEmployee 
{

	 public static void main(String[] args)
	 {
	Employee emp[]=new Employee[2];
	int count[];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Id , sal, & name");
	
	for(int i=0; i<emp.length ;i++)
	{
		int empid=sc.nextInt();
		int basicsal=sc.nextInt();
		String name=sc.next();
		emp[i]=new PermanentEmployee();
	}
	
	
	for(int i=0;i<emp.length;i++)
	{
		System.out.println(emp[i]);
	}
	

	 }
 
}