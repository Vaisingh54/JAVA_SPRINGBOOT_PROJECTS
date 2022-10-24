package com.cg.exception;

public class AccountServiceImpl implements AccountService{
	Account acc;
	AccountServiceImpl(Account acc)
	{
		this.acc=acc;
	}
	
	@Override
	public float withdraw(int amount) throws InsufficientBalanceException {
		if(acc.getBalance()<1000)
			throw new InsufficientBalanceException("Balance in ur account is less than 1000/- Rs");
		else if((acc.getBalance()-amount)<1000) {
			throw new InsufficientBalanceException("Balnce in ur account is not sufficient as withdrawal amt is "+amount+" and balance is "+acc.getBalance());
			
		}
		else 
			return (acc.getBalance()-amount);
		}

	@Override
	public float deposit(int amount) {
		return acc.getBalance()+amount;
	}

}
