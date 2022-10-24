package assignment18;

import java.util.*;

import javax.security.auth.login.AccountNotFoundException;

import comparator1.Employee;
import comparator1.EmployeeNotFoundException;

public class DataUtil {
	
	
	
	
	ArrayList<Account>list=new ArrayList();
	
	public List<Account> getDetails()
	{
		return list;
		
	}
	
	
	
	public Optional<Account> showDetails(int accountid) throws AccountNotFoundException {
		
		Iterator<Account> it=list.iterator();
		Optional<Account> op=null;
		while(it.hasNext())
		{
			Account a=it.next();
			if(a.getAccountid()==accountid)
				op=Optional.ofNullable(a);
		}
		if(op.isEmpty())
		throw new AccountNotFoundException("Account with Account ID "+accountid+" Not found");
		else 
			return Optional.of(op.get());
		}
	
	
	
	
	public void getLoan()
	{
		System.out.println("You are eligible for loan");
		
	}
	
	public void showkLoanDetails( int loanid,String loanType,float loanAmount)
	{
		
		System.out.println("Your loan ID is"+loanid);
		System.out.println("Your loan Type is"+loanType);
		System.out.println("Your loan Amount is"+loanAmount);
	}
	






}

	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	