package assign29;

public class Bean {
	
	private long empId;
	private float empSal;
	private String empName;
	
	
	
	
	
	public Bean(long empId, float empSal, String empName) {
		super();
		this.empId = empId;
		this.empSal = empSal;
		this.empName = empName;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void display()
	{
		System.out.println("Employee Id is-->"+empId);
		System.out.println("Employee Name is---->"+empName);
		System.out.println("Employee Salary is--->"+empSal);
	}
	
	
	
	
	

}
