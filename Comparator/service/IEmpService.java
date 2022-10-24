package com.cg.assignment2.service;

import java.util.*;

import com.cg.assignment2.bean.Employee;
import com.cg.assignment2.exception.EmployeeNotFoundException;

public interface IEmpService {
	
	public List<Employee> getAllEmployees();
	public Optional<Employee> getanEmployee(int empid) throws EmployeeNotFoundException;
	public void deleteEmployee(int empid);
	public void updateEmployee(int empid,float salary);
	public Map<Integer,Set> getEmpSkills();
	public void addEmployees(List<Employee>list);
	

}
