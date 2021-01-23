package forth;

public class SavingsAccount extends Account{
	private double interestRate;

	public SavingsAccount(int account, double interestRate) {
		super(account);
		this.interestRate = interestRate;
	}

	public void addInterest() {
		balance += balance * interestRate;
	}
	
	public String toString() {
		return super.toString() + ", Interest Rate: " + interestRate;
	}
}
