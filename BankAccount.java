package cs176;

public class BankAccount {
	
	
	public String accountName;
	public double accountBalance;

		
	public BankAccount (String name, double balance) {
		accountName = name;
		accountBalance = balance;
	}
		
	public double deposit(double deposited) {
		return accountBalance += deposited;
	}
	
	public double withdraw (double withdrew) {
		return accountBalance -= withdrew;
	}
	public double balance () {
		return accountBalance;
	}
		
		
}



