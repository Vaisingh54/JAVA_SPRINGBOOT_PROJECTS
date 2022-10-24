package assi18;

public class Loan extends Account {

	public Loan(long accnID, String accName, double balance, String address) {
		super(accnID, accName, balance, address);
		// TODO Auto-generated constructor stub
	}
	
	private long loanID;
	private String loanType;
	private double loanAmount=0;
	
	
	public Loan(long accnID, String accName, double balance, String address, long loanID, String loanType,
			double loanAmount) {
		super(accnID, accName, balance, address);
		this.loanID = loanID;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
	}



	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getLoanID() {
		return loanID;
	}


	public void setLoanID(long loanID) {
		this.loanID = loanID;
	}


	public String getLoanType() {
		return loanType;
	}


	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}


	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	@Override
	public String toString() {
		return "Loan [loanID=" + loanID + ", loanType=" + loanType + ", loanAmount=" + loanAmount + "]";
	}
	
	public void  getLoan(long accID,double loAmount)
	{
		if(getAccnID()==accID)
		{
			System.out.println("Enter your loan ID"+loanID);
			System.out.println("Enter your loan type"+loanType);
			System.out.println("Enter your loan amount"+loAmount);
			setLoanAmount(getLoanAmount()+loAmount);
		}
		
		else
          System.out.println("You are not eligible");
		}
	
	public void showLoanDetails(long loID)
	{
		if(loanID==loID)
		{
		System.out.println("Your loan ID"+loanID);
		System.out.println("Your loan name"+loanType);
		System.out.println("Your loan balance"+loanAmount);
		}
		else
			System.out.println("ID not found");
	}
	

}
