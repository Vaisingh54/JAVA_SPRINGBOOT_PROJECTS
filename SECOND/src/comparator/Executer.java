package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Executer {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Employee number");
		
		Employee[] emp=new Employee[sc.nextInt()];
		
		System.out.println("Enter Employee details");
		    
		
		  for(int i=0;i<emp.length;i++) { emp[i]=new
		  Employee(sc.nextInt(),sc.nextInt(),sc.next()); }
		 
		/*
		 * System.out.println("Values of array:"); for (int i=0; i < emp.length; i++) {
		 * 
		 * Employee e=emp[i]; e.display();
		 * 
		 * }
		 */
		  
                  ArrayList<Employee> al=new ArrayList<>();
                  
                  for(int i=0;i<emp.length;i++)
                  {
                	  
                	  al.add(emp[i]);
                  }
        
                  
                  Collections.sort(al, new IDComparator());
                  
                  for(Employee e:al)
                  {
                  e.display();
                  }
		    
	
	}}
	
		
		
		
		
		
		
		
		
		
		
		
		
	
