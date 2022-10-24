package comparator1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.*;

public class EmployeeExecuter {

	public static void main(String[] args) throws EmployeeNotFoundException {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the no of employee");
		Employee[] emp=new Employee[4];
		System.out.println("Enter Id, Name, Salary, and SkillSet seperated by ,");
		
		
			for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee(sc.nextInt(),sc.next(),sc.nextFloat(),sc.next().split(","));
		}

			
			IEmpService service=new EmpServiceImpl();
			service.addEmployee(Arrays.asList(emp));
			service.getAllEmployee().forEach(item->System.out.println(item));
			
			
			  List list =service.getAllEmployee().stream().map((item)->{return item.getBasicsal()>=3000?item:""; }).collect(Collectors.toList());
			  list.forEach((item)->System.out.println(item));
			 
			System.out.println("*******************************************************");
			
			System.out.println("Enter EmpId to Delete");
			service.deleteEmployee(sc.nextInt());
			
			System.out.println("*******************************************************");
			
			System.out.println("Enter EmpID to Update");
			service.updateEmployee(sc.nextInt(),sc.nextFloat());
			
			System.out.println("*******************************************************");
			
			System.out.println("Print all Employee skills");
			
			service.getEmployeeSkills().forEach((id,skills)->System.out.println(id+",\t"+skills));
			
			System.out.println("*******************************************************");
		
		     System.out.println("Enter empID of Employee");
		     System.out.println(service.getanEmployee(sc.nextInt()));
	}

}
