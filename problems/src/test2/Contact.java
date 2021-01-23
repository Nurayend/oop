package test2;

import java.util.Objects;
import java.util.Vector;

public class Contact {
	private int id;
	private String name;
	private String email;
	private int phoneNumber;
	private Vector<Contact> v;
	
	{
		v = new Vector<Contact>();
	}
	
	public Contact() {}
	
	public Contact(int id, String name, String email, int phoneNumber) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void addContact(Contact c) {
		v.add(c);
	}
	
	public void deleteContact(Contact c) {
		v.remove(c);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contact))
			return false;
		
		Contact contact = (Contact) obj;
		return contact.id == id && contact.name.equals(name) && contact.email.equals(email) && contact.phoneNumber == phoneNumber;
	}
	
	public int hashCode() {
		return Objects.hash(id, name, email, phoneNumber);
	}
	
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", email: " + email + ", Phone Number: " + phoneNumber;
	}
	
	public void print() {
		for(Contact con: v) 
			System.out.println(con.toString());
	}
}
