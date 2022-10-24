package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;

@Controller
public class EmpController {
	@Autowired
	EmployeeService empService;
	
	@RequestMapping("addEmp")
	public String addEmp(@RequestParam int id,@RequestParam String name,@RequestParam int sal,ModelMap model)
	{
		if(empService.addEmployee(id, name, sal))
		{
			Employee emp=new Employee(id, name, sal);
			System.out.println(emp);
			model.addAttribute("emp",emp);
			return "Success";
		}
		else
		{
			return "Login";
		}
		
	}
	
	
	
}
