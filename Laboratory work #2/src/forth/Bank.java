package forth;

import java.util.Vector;

public class Bank {
	protected Vector<Account> accounts;
	
	{
		accounts = new Vector<Account>();
	}
	
	public void create(Account acc) {
		accounts.add(acc);
	}
	
	public void refuse(Account acc) {
		accounts.remove(acc);
	}
	
	public void update() {
		
		for (Account acc: accounts) {
			//acc.deposit(200);
			if (acc instanceof SavingsAccount) {
				SavingsAccount s = (SavingsAccount) acc;
				s.addInterest();
			}
			
			else if (acc instanceof CheckingAccount) {
				CheckingAccount c = (CheckingAccount) acc;
				c.deductFee();
			}
			acc.print();
			
		}
		
	}
}
