package com.cg.exception;



public class ExecuterException {

	public static void main(String[] args) {
	Account acc=new Account();
	acc.setBalance(5000);
	AccountService accountService=new AccountServiceImpl(acc);
	try {
		float balance=accountService.withdraw(4500);
		acc.setBalance(balance);
		System.out.println("Remaining balance is "+acc.getBalance());
	} catch (InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
