package com.cg.assignment2.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.cg.assignment2.bean.Employee;
import com.cg.assignment2.datautil.EmpDataUtil;
import com.cg.assignment2.exception.EmployeeNotFoundException;

public class EmpServiceImpl implements IEmpService {
	EmpDataUtil emp=new EmpDataUtil();
	@Override
	public List<Employee> getAllEmployees() {
		
		return emp.getAllEmployees();
	}

	@Override
	public Optional<Employee> getanEmployee(int empid) throws EmployeeNotFoundException {
		
		return emp.getanEmployee(empid);
	}

	@Override
	public void deleteEmployee(int empid) {
		emp.deleteEmployee(empid);

	}

	@Override
	public void updateEmployee(int empid, float salary) {
		emp.updateEmployee(empid, salary);

	}

	@Override
	public Map<Integer, Set> getEmpSkills() {
		// TODO Auto-generated method stub
		return emp.getEmpSkills();
	}

	@Override
	public void addEmployees(List<Employee> list) {
		emp.addEmployees(list);
		
	}

}
