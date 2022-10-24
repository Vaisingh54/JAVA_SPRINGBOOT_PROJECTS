package Exception;

public interface AccountService {
	
	public float withdraw(int amount) throws InsufficientBalanceException;
	public float deposit(int amount);

}
