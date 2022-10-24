package Exception3;

import java.util.Scanner;

import javax.naming.NamingException;
import javax.security.auth.login.AccountException;

public class SalaryCheck {

	public static void main(String[] args) {
		
		EmployeeException ep=new EmployeeException(0);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Salary Deposited");
		
		
	        
			 
			 try {
				ep.checkSal(sc.nextFloat());
			} catch (AccountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         
}
	}


