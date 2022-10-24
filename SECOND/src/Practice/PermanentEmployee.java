package Practice;

public class PermanentEmployee extends Employee {
	
	
	private String type;
	private float pf;
	private float pt;
	private float allowance;
	
	
	
	
	
       
	  public PermanentEmployee(String type, float pf, float pt, float allowance) {
		super();
		this.type = type;
		this.pf = pf;
		this.pt = pt;
		this.allowance = allowance;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
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


	public float getAllowance() {
		return allowance;
	}


	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}


	public PermanentEmployee()
	  {
		  super();
	  }


	public PermanentEmployee(int empid, String name, float basicsal) {
		super(empid, name, basicsal);
		type="Permanent";
		pf=0.01f*getBasicsal();
		pt=25*getBasicsal();
		allowance=5*getBasicsal();
	}


	
	@Override
	public float calSal() {
		
		return getBasicsal()-(pf+pt)+allowance;
		
		}


	@Override
	public String toString() {
		return "PermanentEmployee [type=" + type + ", pf=" + pf + ", pt=" + pt + ", allowance=" + allowance + "]";
	}


	
	



	
}
