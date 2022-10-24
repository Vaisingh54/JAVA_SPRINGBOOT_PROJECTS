package Inheritance;

public class PermanentEmployee extends Employee
{
private String designation;
private float pf;
private float pt;
private float bonus;
private String projectCode;


public PermanentEmployee()
{
super();
// TODO Auto-generated constructor stub
}


public PermanentEmployee(int empid, float basicSal, String name)
{
super(empid, basicSal, name);
pf=0.01f*getBasicSal();
pt=200;
bonus=5*getBasicSal();
projectCode="HSBC";
designation="COn";
}


public String getDesignation() {
return designation;
}
public void setDesignation(String designation) {
this.designation = designation;
}
public float getPf() {
return pf;
}
public void setPf(float pf) {
this.pf = pf;
}
public float getPt() {
return pt;
}
public void setPt(float pt) {
this.pt = pt;
}
public float getBonus() {
return bonus;
}
public void setBonus(float bonus) {
this.bonus = bonus;
}
public String getProjectCode() {
return projectCode;
}
public void setProjectCode(String projectCode) {
this.projectCode = projectCode;
}

   public float calSalary()
  {
      return getBasicSal()-(pf+pt)+bonus;
  }


@Override
public String toString() {
	return "PermanentEmployee [designation=" + designation + ", pf=" + pf + ", pt=" + pt + ", bonus=" + bonus
			+ ", projectCode=" + projectCode + ", getEmpid()=" + getEmpid() + ", getBasicSal()=" + getBasicSal()
			+ ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
   




}