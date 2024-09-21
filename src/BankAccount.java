package Explorer;

public class BankAccount {
	private String owner;
	private int balance;
	private int minBalance;

	/**
	 * @param balance Amount of money in the account, can be negative
	 * @param balance Must be >= minBalance
	 */
	public BankAccount(String owner, int balance, int minBalance) {
		this.owner = owner;
		this.balance = balance;
		this.minBalance = minBalance;
	}

	public int getBalance() {
		return balance;
	}

	public int getminBalance() {
		return minBalance;
	}

	public void setBalance(int a) {
		if (minBalance <= a) {
			balance = a;
		}
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public boolean withdraw(int amount) {
		if (balance - amount < minBalance)
			return false;
		balance = balance - amount;
		return true;
	}

	/**
	 * @return true on success
	 */
	public boolean transfer(BankAccount target, int amount) {
		if (withdraw(amount) == false)
			return false;
		target.deposit(amount);
		return true;
	}

	public String str() {
		String st = "balance of " + owner + ": " + balance;
		return st;
	}
}
