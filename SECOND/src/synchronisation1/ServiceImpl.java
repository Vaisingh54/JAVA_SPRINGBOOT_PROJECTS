package synchronisation1;

public class ServiceImpl extends Account {
	
	
	

	
	
	public void deposit(double depAmount) throws InterruptedException
	{
		synchronized (this) {
			setBalance(getBalance()+depAmount);
			System.out.println("deposited Amount"+depAmount);
			System.out.println("Available balance"+getBalance());
			Thread.sleep(1000);
			
		}
		
	}
	
	public  void withdraw(double witAmount) 
	{
		synchronized (this) {
			setBalance(getBalance()-witAmount);
			System.out.println("Withdraw amount"+witAmount);
			System.out.println("Available balance"+getBalance());
			
			
		}
		
	}

}
