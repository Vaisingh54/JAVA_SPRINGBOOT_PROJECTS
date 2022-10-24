package Exception2;

import java.util.Scanner;

import javax.naming.NamingException;

public class NameCheck 
{

	
	 public static void main(String[] args) {

	      Name nn = new Name();
	      Scanner sc = new Scanner(System.in);
	      try {
	         int i=0;

	         while(i==0){
	            System.out.print("Enter your name: ");
	            String fullname = sc.nextLine();
	            nn.printName(fullname);
	            
	         
	         } 
	      }
	      catch(NamingException e){
	         System.out.println("invalid name");
	      }
	   }

 }

