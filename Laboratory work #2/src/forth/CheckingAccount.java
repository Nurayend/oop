package forth;

public class CheckingAccount extends Account{
	
	public static final int FREE_TRANSACTIONS = 2;
	public static final double FEE_FOR_TRANSACTIONS = 0.02;
	protected int counter;
	
	public CheckingAccount() {}

	public CheckingAccount(int acc) {
		super(acc);
		counter = 0;
	}
	
	public void deductFee() {
		if (counter > FREE_TRANSACTIONS) {
			balance -= (counter - FREE_TRANSACTIONS) * FEE_FOR_TRANSACTIONS;
			counter = FREE_TRANSACTIONS;
		}
	}
	
	public void deposit(double sum) {
		balance += sum;
		counter++;
	}

	public void withdraw(double sum) {
		if (checkForWithdraw(sum)) {
			super.withdraw(sum);
			counter++;
		}
	}

	public void transfer(double amount, Account other) {
		if (checkForWithdraw(amount)) {
			super.transfer(amount, other);
			counter++;
		}
	}
	
	public String toString() {
		return super.toString() + ", Counter: " + counter;
	}
	
}
