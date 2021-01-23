package second;

import java.util.Objects;

public class Person {
	private String name;
	private String address;
	
	public Person() {}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;

		Person person = (Person) obj;

		return person.name.equals(name);
	}
	
	public int hashCode() {
		return Objects.hash(name);
	}
	
	public String toString() {
		return "Name: " + name + ", address: " + address;
	}
}
