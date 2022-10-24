package abstract1;

public abstract class Employee {
	
	private int empid;
	private String name;
	private float basicsal;
	
	
	public Employee() {
		super();
		
	}
	
	
	
	public Employee(int empid, String name, float basicsal) {
		super();
		this.empid = empid;
		this.name = name;
		this.basicsal = basicsal;
	}



	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBasicsal() {
		return basicsal;
	}
	public void setBasicsal(float basicsal) {
		this.basicsal = basicsal;
	}
	
	
	
	public void displayDetail()
	{
		
		System.out.println("Employee Id is--->"+empid);
		System.out.println("Employee name is--->"+name);
		System.out.println("Employee basic salary is--->"+basicsal);
	}
	
	
	
	public abstract float calSal();

}
