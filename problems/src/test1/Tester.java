package test1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BussinesAccount b = new BussinesAccount(1, "asd", "10.10.1999", "IT", 170);
		PersonalAccount p = new PersonalAccount(1, "ert", "12.12.1990", "Football", "alone");
		System.out.println(b.toString());
		System.out.println(p.toString());
	}

}
