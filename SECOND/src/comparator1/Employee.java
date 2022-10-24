package comparator1;

import java.util.*;

public class Employee {
	
	private int empid;
	private String name;
	private float basicsal;
	
	
	
	private Set skillset;
	


public Employee(int empid, String name, float basicsal, String[] skills) {
		super();
		this.empid = empid;
		this.name = name;
		this.basicsal = basicsal;
		skillset=new HashSet(Arrays.asList(skills));
	}
public int getEmpid() {
		return empid;
	}
public void setEmpid(int empid) {
		this.empid = empid;
	}

public float getBasicsal() {
		return basicsal;
	}

public void setBasicsal(float basicsal) {
		this.basicsal = basicsal;
	}
public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}

public Set getSkillset() {
		return skillset;
	}

public void setSkillset(Set skillset) {
		this.skillset = skillset;
	}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", basicsal=" + basicsal + ", skillset=" + skillset + "]";
}







   
	

	

}
