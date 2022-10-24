package Inheritance;

public class ExecuterEmployee 
{

	 public static void main(String[] args)
	 {
	PermanentEmployee pemp=new PermanentEmployee(1001,20000,"Rohan");
	pemp.setDesignation("Manager");
	System.out.println("Salary is -->"+pemp.calSalary());
	System.out.println(pemp);

	 }

}