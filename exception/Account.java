package EXCEPTION;
//bean class private variables,getters & setters,toString()
public class Account {
	private float balance;
	private float withdraw;
	private float deposit;
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public float getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", withdraw=" + withdraw + ", deposit=" + deposit + "]";
	}
	

}
