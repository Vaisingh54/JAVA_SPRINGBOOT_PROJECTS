package com.learningJava;

import java.util.Scanner;

public class StudentPercentageCalculation {
	

	public static void main(String[] args) {
		
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of student");
		String name=sc.next();
		
		System.out.println("Enter no of subject");
		
		int sub[]= new int[sc.nextInt()];
		
		
		
		System.out.println("Enter Marks");
		
		for(int i=0;i<sub.length;i++)
		{
			sub[i]=sc.nextInt();
		}
		
		int total=sub.length*100;
		
		
		int temp=0;
		
		for(int i=0;i<sub.length;i++)
		{
			temp=temp+sub[i];
		}
		
		
		
		float per=(temp*100)/total;
		
		System.out.print(name+" percentage is--->"+per);

	}

}
