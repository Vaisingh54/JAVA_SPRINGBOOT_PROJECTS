package com.cg.bean;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	private int empID;
	private String empName;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}
	
	
	
	

}
