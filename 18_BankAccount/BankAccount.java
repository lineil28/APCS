/* Frog Hats (Neil, Kevin, Marcus)
APCS
HW 18 - CPA-One
2021 10 14

DISCO:

QCC:

Team xxxxx’s Latest and Greatest Q2 Response:

Team xxxxx’s Latest and Greatest Q3 Response:

*/

public class BankAccount {
	//instance variables
	private String accountName, accountPassword;
	private int pin, accountId;
	private long accountBalance;

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
