package com.cg.assignment2.datautil;

import java.util.*;

import com.cg.assignment2.bean.Employee;
import com.cg.assignment2.exception.EmployeeNotFoundException;

public class EmpDataUtil {
	
	ArrayList<Employee> list=new ArrayList();
	Map<Integer,Set> map=new HashMap<>();
	
	
	public List<Employee> getAllEmployees() {		
		return list;
	}
	
	public Optional<Employee> getanEmployee(int empid) throws EmployeeNotFoundException {
		Iterator<Employee> it=list.iterator();
		Optional<Employee>op=null;
		while(it.hasNext())
		{
			Employee e=it.next();
			if(e.getEmpid()==empid) {
				op=Optional.ofNullable(e);
			}
		}
		if(op.isEmpty())
		throw new EmployeeNotFoundException("Employee with empID "+empid+" not found!!");
		else
			return Optional.of(op.get());
	}
	
	public void deleteEmployee(int empid) {
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			if(e.getEmpid()==empid)
				it.remove();
		}

	}
	
	public void updateEmployee(int empid, float salary) {
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			if(e.getEmpid()==empid)
				e.setBasicsal(salary);
		}


	}
	
	public Map<Integer, Set> getEmpSkills() {
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			map.put(e.getEmpid(), e.getSkillset());
		}
		return map;
	}
	
	public void addEmployees(List<Employee> list) {
		this.list.addAll(list);
		
	}

	

}
