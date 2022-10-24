package Exception;

import java.util.Scanner;

public class ExecuterException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Account acc=new Account();
		System.out.println("Enter balance in account");
		acc.setBalance(sc.nextFloat());
		AccountService accountService=new AccountServiceImpl(acc);
		try {
			
			System.out.println("Enter the withdrawal amount");
			float balance=accountService.withdraw(sc.nextInt());
			acc.setBalance(balance);
			System.out.println("Remaining balance is "+acc.getBalance());
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
