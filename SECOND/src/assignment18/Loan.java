package assignment18;

public class Loan extends Account{
	
	DataUtil dd=new DataUtil();
	
	public Loan(int accountid, String accountName, String address, float depositAmount) {
		super(accountid, accountName, address, depositAmount);
		// TODO Auto-generated constructor stub
	}


	public Loan(int accountid, String accountName, String address, float depositAmount, int loanid, String loanType,
			float loanAmount) {
		super(accountid, accountName, address, depositAmount);
		this.loanid = loanid;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
	}


	private int loanid;
	private String loanType;
	private float loanAmount;
	


	public int getLoanid() {
		return loanid;
	}


	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}


	public String getLoanType() {
		return loanType;
	}


	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}


	public float getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}


	@Override
	public String toString() {
		return "Loan [loanid=" + loanid + ", loanType=" + loanType + ", loanAmount=" + loanAmount + "]";
	}
	
	
	public void getLoan()
	{
		System.out.println("You are eligible for loan");
		
	}
	
	  
	
	public void showkLoanDetails( int loanid,String loanType,float loanAmount)
	{
		System.out.println("*****************************************************************************************");
		System.out.println("Your loan ID is"+loanid);
		System.out.println("Your loan Type is"+loanType);
		System.out.println("Your loan Amount is"+loanAmount);
	}
	
	
	
	
	
	

}
