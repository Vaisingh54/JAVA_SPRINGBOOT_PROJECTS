package optional23;

public class ExecuterUID {
	
	
	private String EID;
	private int empID;
	

	public ExecuterUID(String eID, int empID) {
		super();
		EID = eID;
		this.empID = empID;
	}

	public String getEID() {
		return EID;
	}

	public void setEID(String eID) {
		EID = eID;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	
	public static void main(String[] args) {
		ExecuterUID ex=new ExecuterUID("Vsingh23", 1234);
		AuthenticateUID at=(a,b)->{if (a==ex.getEID() && b==ex.getEmpID())
			return true;
			
		else
			return false;};
	
	System.out.println(	at.check("Vsingh21", 1234));

}}
