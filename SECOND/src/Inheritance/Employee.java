package Inheritance;

public class Employee
{
   private int empid;
   private float basicSal;
    private String name;

  public Employee() 
  {
             super();
  }

  
  public Employee(int empid, float basicSal, String name)
  {
super();
this.empid = empid;
this.basicSal = basicSal;
this.name = name;
  }
  
  
public int getEmpid() {
return empid;
}
public void setEmpid(int empid) {
this.empid = empid;
}
public float getBasicSal() {
return basicSal;
}
public void setBasicSal(float basicSal) {
this.basicSal = basicSal;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
 

public float calSalary()
{
return basicSal;
}

}