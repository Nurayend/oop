package test2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c = new Contact();
		CorporateContact c1 = new CorporateContact(1, "John", "asd", 12345, "BI");
		CorporateContact c2 = new CorporateContact(2, "Molly", "qwe", 12456, "BI");
		c.addContact(c1);
		c.addContact(c2);
		c.print();
	}

}
