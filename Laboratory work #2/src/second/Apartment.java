package second;

import java.util.Objects;

public class Apartment extends Property{
	private int floor;
	private boolean privatizedHostel;
	
	public Apartment() {}
	
	public Apartment(String address, int year, int floor, boolean privatizedHostel) {
		super(address, year);
		this.floor = floor;
		this.privatizedHostel = privatizedHostel; 
	}
	
	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public boolean isPrivatizedHostel() {
		return privatizedHostel;
	}

	public void setPrivatizedHostel(boolean privatizedHostel) {
		this.privatizedHostel = privatizedHostel;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Apartment))
			return false;
		
		Apartment apartment = (Apartment) obj;
		return apartment.floor == floor && apartment.privatizedHostel == privatizedHostel;
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(floor, privatizedHostel);
	}
	
	public String toString() { //overriding
		return super.toString() + ", Floor: " + floor + ", Privatized Hostel: " + privatizedHostel;
	}
}
