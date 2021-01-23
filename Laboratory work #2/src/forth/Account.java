package forth;

public class Account {
	protected double balance;
	protected int accNumber;
	
	public Account() {}

	public Account(int acc) {
		balance = 0.0;
		accNumber = acc;
	}

	public void deposit(double sum) {
		balance += sum;
	}

	public boolean checkForWithdraw(double sum) {
		if ((balance - sum) < 0) { 
			System.out.println("Insufficient funds");
			return false;
		}
		else 
			return true;
	}

	public void withdraw(double sum) {
		if (checkForWithdraw(sum)) 
			balance -= sum;		
	}

	public double getBalance() {
		return balance;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void transfer(double amount, Account other) {
		if (checkForWithdraw(amount)) { 
			balance -= amount;
			other.balance += amount;
		}
	}

	public String toString() {
		return "Account number " + accNumber + ", current balance " + balance;
	}

	public final void print() {
		System.out.println(this.toString());
	}
}
