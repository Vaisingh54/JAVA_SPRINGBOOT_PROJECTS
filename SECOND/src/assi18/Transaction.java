package assi18;

public class Transaction extends Loan{
	
	public Transaction(long accnID, String accName, double balance, String address, long loanID, String loanType,
			double loanAmount) {
		super(accnID, accName, balance, address, loanID, loanType, loanAmount);
	}




	public void depositeAmount(double depAmount)
	{
		setBalance(getBalance()+depAmount);
	}
	
	
	public void withdrawAmount(double witAmount)
	{
		
		if(getBalance()>witAmount)
		setBalance(getBalance()-witAmount);
		else
			System.out.println("Balance is low");
		}

	
	public void payLoan(double loAmount)
	{
		
		setLoanAmount(getLoanAmount()-loAmount);
	}
	
	
	public void showAccountDetails()
	{
		
	}
}

