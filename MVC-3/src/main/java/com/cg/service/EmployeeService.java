package com.cg.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cg.bean.Employee;
@Service
public class EmployeeService {
	
	ArrayList<Employee>array=new ArrayList<>();
	
	
	public boolean addEmployee(int id,String name,int sal)
	{
		Employee emp=new Employee(id, name, sal);
		return array.add(emp);
	}

}
