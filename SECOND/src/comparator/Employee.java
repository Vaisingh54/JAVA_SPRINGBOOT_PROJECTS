package comparator;

public class Employee {

	private int empId;
	private int empSal;
	private String empName;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empId, int empSal, String empName) {
		super();
		this.empId = empId;
		this.empSal = empSal;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	public void display(){
	      System.out.println("Employee Number: "+empId);
	      System.out.println("Employee Salary: "+empSal);
	      System.out.println("Employee Name: "+empName);
	      
	  }
	
}
