package com.learningJava;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of subjects and total marks--->");
		int sub=sc.nextInt();
		int total=sc.nextInt();
		
		int sum=0;
		System.out.println("Enter marks in subjects--->");
		for(int i=0;i<sub;i++)
		{
			
			 sum=sum+sc.nextInt();
		}
		
		
		int per=(sum*100)/total;
		
		System.out.print("Percentage obtained is--->"+per);
	}

}
