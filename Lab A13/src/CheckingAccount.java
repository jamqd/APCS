/**
 * 
 * @author John Dang 
 * Period 3
 * 
 * Account to simulate checking account
 */
public class CheckingAccount {
	private double myBalance;
	private int myAccountNumber;

	/**
	 * No parameter constructor
	 */
	public CheckingAccount() {
		myBalance = 0.0;
		myAccountNumber = 0;
	}

	/**
	 * Parameterized constructor
	 * @param initialBalance - the initial balance of the checking account
	 * @param accNum - the account number of the account
	 */
	public CheckingAccount(double initialBalance, int accNum) {
		if (initialBalance < 0) {
			throw new IllegalArgumentException("Negative balance in account " + accNum);
		}
		myBalance = initialBalance;
		myAccountNumber = accNum;
	}

	/**
	 * Getter method for myBalance
	 * @return - the balance of the account
	 */
	public double getBalance() {
		return myBalance;
	}

	/**
	 * Method to deposit money
	 * @param amount - the amount to deposit
	 */
	public void deposit(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Negative amount deposited in account " + myAccountNumber);
		}
		myBalance += amount;
	}

	/**
	 * Method to withdraw money
	 * @param amount - the amount to withdraw
	 */
	public void withdraw(double amount) {
		if (amount > myBalance) {
			throw new IllegalArgumentException("Account " + myAccountNumber + " overdrawn");
		}
		myBalance -= amount;
	}
}
