package abstract1;

public class ContractEmployee extends Employee {
	
	private String type;
	private float incentive;
	private float OT;
	
	
	
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getIncentive() {
		return incentive;
	}


	public void setIncentive(float incentive) {
		this.incentive = incentive;
	}


	public float getOT() {
		return OT;
	}


	public void setOT(float oT) {
		OT = oT;
	}


	public ContractEmployee()
	{
		super();
	}
	
	
	public ContractEmployee(int empid, String name, float basicsal) {
		super(empid, name, basicsal);
		type="contract";
		incentive=5000;
		OT=2000;
	}
	
	@Override
	public float calSal() {
		
		return getBasicsal()+incentive+OT;
		
	}


	@Override
	public String toString() {
		return "ContractEmployee [type=" + type + ", incentive=" + incentive + ", OT=" + OT + "]";
	}


	
	
	


}
