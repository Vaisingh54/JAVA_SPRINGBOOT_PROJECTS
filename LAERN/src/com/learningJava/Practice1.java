package com.learningJava;




public class Practice1 {


	public static  void bool(int max)
	{  
		
		for(int i=0;i<max;i++)
		{
		
		if(i%3==0)  //%=remainder
		{
			System.out.println(i);
			
		}
		else
		{
			System.out.println("");
		}
		}
	}
		
		
		
	
	

	public static void main(String[] args) {
		
		
		 
		 int a = 7;   
		 int b = 8;
		 int c = 9;
		 char ss='o';
		 String string= "name";
		 float d=1.02f;
		 long e=69496658948499l;
		 
		 
		 
		 double w=255.5151;
		 
		 
		 System.out.println(ss);
		 System.out.println(string);
		 System.out.println(d);
		
		 
		 
	       int sum = a+ b+ c;
	       
	       
	       a=a/0;
		 
		 System.out.print("Sum of the number are---> " +sum);
		 
		 
		 
		 
		 bool(70);

		 
		 
	}


}

