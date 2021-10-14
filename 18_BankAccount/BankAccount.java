public class BankAccount {
	//instance variables
	String private accountName, accountPassword;
	int private pin, accountId;
	long private accountBalance;
	
	public void setAccountName(String newName) {
		accountName = newName;
	}
	
	public void setPassword(String newPassword) {
		accountPassword = newPassword;
	}
	
	public void setPin(int newPin) {
		pin = newPin;
	}
	
	public void deposit(long value) {
		accountBalance += value;
	}
	
	public void withdraw(long value) {
		accountBalance -= value;
	}
	
	public void accountInfo() {
		System.out.println("Account information of " + accountName + "'s account:");
		System.out.println("Balance: " + accountBalance);
		System.out.println("Pin Number: " + pin);
		System.out.println("Password: " + accountPassword);
		System.out.println("Account ID: " + accountId);
	}
}
