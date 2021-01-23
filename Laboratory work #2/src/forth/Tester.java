package forth;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		
		SavingsAccount a1 = new SavingsAccount(1, 0.3);
	    CheckingAccount a2 = new CheckingAccount(2);
	    a1.deposit(200);
	    a2.transfer(100, a1);
	    b.create(a1);
	    b.create(a2);
	    
	    b.update();
		
	}

}
