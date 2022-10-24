package assignment15;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	
		String str="HELLO WORLD";
		
		System.out.println("Old String is--->"+str);
		
		Scanner sc=new Scanner(System.in);
		
		String newStr= new String(sc.next());
		
		
		newStr=str.replace("WORLD", newStr);
		
		System.out.print("New String is--->"+newStr);
		

	}

}
