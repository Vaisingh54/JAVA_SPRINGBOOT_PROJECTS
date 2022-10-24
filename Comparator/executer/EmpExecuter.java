package com.cg.assignment2.executer;

import java.util.Arrays;
import java.util.Scanner;

import com.cg.assignment2.bean.Employee;
import com.cg.assignment2.exception.EmployeeNotFoundException;
import com.cg.assignment2.service.EmpServiceImpl;
import com.cg.assignment2.service.IEmpService;

public class EmpExecuter {

	public static void main(String[] args) throws EmployeeNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of employees");
		System.out.println("Enter id name,salary and skills seperated by ,");
		Employee emp[]=new Employee[sc.nextInt()];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee(sc.nextInt(), sc.next(),sc.nextFloat(),sc.next().split(","));
		}
		
		IEmpService service=new EmpServiceImpl();
		service.addEmployees(Arrays.asList(emp));
		service.getAllEmployees().forEach(item->System.out.println(item));
		
		System.out.println("**************************************************");
		System.out.println("Enter empid to delete");
		service.deleteEmployee(sc.nextInt());
		System.out.println("***************************************************");
		System.out.println("Enter empid and salary to Edit");
		service.updateEmployee(sc.nextInt(), sc.nextFloat());
		System.out.println("***************************************************");
		System.out.println("Print all employees skills");
		service.getEmpSkills().forEach((id,skills)->System.out.println(id+"\t"+skills));
		System.out.println("***************************************************");
		System.out.println("Enter empId of searchable emp");
		System.out.println(service.getanEmployee(sc.nextInt()));

	}

}
