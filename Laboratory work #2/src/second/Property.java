package second;

import java.util.Objects;

public class Property {
	private String address;
	private int year;
	
	public Property() {}
	
	public Property(String address, int year) {
		this.address = address;
		this.year = year;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Property))
			return false;
		
		Property property = (Property) obj;
		return property.year == year && property.address.equals(address);
	}
	
	public int hashCode() {
		return Objects.hash(address, year); 
	}
	
	public String toString() {
		return "Address: " + address + ", Year: " + year;
	}
}
