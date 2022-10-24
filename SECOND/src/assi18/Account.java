package assi18;

import java.awt.List;
import java.util.*;

public class Account {
	
	
	Scanner sc=new Scanner(System.in);
	
	private long accnID;
	private String accName;
	private double balance;
   private String address;
	
   
        
	
	public Account() {
	super();
	// TODO Auto-generated constructor stub
}


	public Account(long accnID, String accName, double balance, String address) {
		super();
		this.accnID = accnID;
		this.accName = accName;
		this.balance = balance;
		
		this.address = address;
	}


	public long getAccnID() {
		return accnID;
	}


	public void setAccnID(long accnID) {
		this.accnID = accnID;
	}


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Account [accnID=" + accnID + ", accName=" + accName + ", balance=" + balance + ", address=" + address
				+ "]";
	}
	
	
	public void getdetails()
	{
		System.out.println("Enter account ID"+accnID);
		System.out.println("Enetr account name"+accName);
		System.out.println("Enter account balance"+balance);
		System.out.println("Enter address"+address);
		
	
	}
	
	public void showDetails(long accID )
	{
		if(accID==accnID) {
		System.out.println("Your account ID"+accnID);
		System.out.println("Your account name"+accName);
		System.out.println("YOur account balance"+balance);
		System.out.println("Your address"+address);
		}
		else 
			System.out.println("Account not found");
		}


	

	
	
	

}
