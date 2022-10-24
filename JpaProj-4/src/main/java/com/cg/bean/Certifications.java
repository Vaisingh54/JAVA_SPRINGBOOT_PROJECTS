package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Certifications")
public class Certifications {
	
	@Id
	private int cerId;
	private String Certifications;
	
	@ManyToOne
	@JoinColumn(name = "empID")
	@Cascade(value = CascadeType.PERSIST)
	private Employee employee;

	public int getCerId() {
		return cerId;
	}

	public void setCerId(int cerId) {
		this.cerId = cerId;
	}

	public String getCertifications() {
		return Certifications;
	}

	public void setCertifications(String certifications) {
		Certifications = certifications;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Certifications() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certifications(int cerId, String certifications, Employee employee) {
		super();
		this.cerId = cerId;
		Certifications = certifications;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Certifications [cerId=" + cerId + ", Certifications=" + Certifications + ", employee=" + employee + "]";
	}
	
	
	

}
