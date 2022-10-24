package com.cg.bean;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	private int empID;
	private String empName;
	
	@OneToMany(mappedBy = "employee")
	@Cascade(value = CascadeType.PERSIST)
	private Set<Certifications>certification=new HashSet<Certifications>();
	
	
	public void addCertifications(Certifications c)
	{
		certification.add(c);
		c.setEmployee(this);
	}

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

	public Set<Certifications> getCertification() {
		return certification;
	}

	public void setCertification(Set<Certifications> certification) {
		this.certification = certification;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empID, String empName, Set<Certifications> certification) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.certification = certification;
	}

	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", certification=" + certification + "]";
	}
	
	
	
	
	
	
	

}
