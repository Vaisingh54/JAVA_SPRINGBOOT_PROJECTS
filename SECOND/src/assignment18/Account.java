package assignment18;

import java.util.List;
import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import comparator1.Employee;
import comparator1.EmployeeNotFoundException;

public class Account {
	
	
	private i accountid;
	private String accountName;
	private String address;
	private float depositAmount;
	
	DataUtil dd=new DataUtil();
	
	
	
	    public Account(int accountid, String accountName, String address, float depositAmount) {
		super();
		this.accountid = accountid;
		this.accountName = accountName;
		this.address = address;
		this.depositAmount = depositAmount;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(float depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", accountName=" + accountName + ", address=" + address
				+ ", depositAmount=" + depositAmount + "]";
	}
	
	
public List getAllEmployee() {
		
		return dd.getDetails();
	}


public Optional getanEmployee(int accountid) throws AccountNotFoundException {
	
	return dd.showDetails(accountid);
}

	
	
	
	
	
	
	
	
	
    
	
	

}
