package second;

import java.util.Objects;

public class House extends Property{
	private int numberOfLevels;
	private double landArea;
	private String fenceType;

	public House() {}
	
	public House(String address, int year, int numberOfLevels, double landArea, String fenceType) {
		super(address, year);
		this.numberOfLevels = numberOfLevels;
		this.landArea = landArea;
		this.fenceType = fenceType;
	}
	
	public void setNumberOfLevels(int numberOfLevels) {
		this.numberOfLevels = numberOfLevels;
	}
	
	public int getNumberOfLevels() {
		return this.numberOfLevels;
	}
	
	public double getLandArea() {
		return landArea;
	}

	public void setLandArea(double landArea) {
		this.landArea = landArea;
	}
	
	public String getFenceType() {
		return fenceType;
	}

	public void setFenceType(String fenceType) {
		this.fenceType = fenceType;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof House))
			return false;
		
		House house = (House) obj;
		return house.numberOfLevels == numberOfLevels && house.landArea == landArea && house.fenceType.equals(fenceType);
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(numberOfLevels, landArea, fenceType);
	}
	
	public String toString() {
		return super.toString() + ", Number Of Levels: " + numberOfLevels + ", Land Area: " + landArea + ", Fence Type: " + fenceType;
	}
}
