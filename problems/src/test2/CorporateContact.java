package test2;

import java.util.Objects;

public class CorporateContact extends Contact{
	private String company;
	
	public CorporateContact(int id, String name, String email, int phoneNumber, String company) {
		super(id, name, email, phoneNumber);
		this.company = company;
	}
	
	public boolean hadWork() {
		return false;
	}
	
	public boolean hadWork(int yearOfExperience) {
		return true;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CorporateContact))
			return false;
		
		CorporateContact contact = (CorporateContact) obj;
		return contact.equals(company);
	}
	
	public int hashCode() {
		return Objects.hash(company);
	}
	
	public String toString() {
		return super.toString() + ", Company: " + company;
	}
}
