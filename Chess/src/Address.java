

public class Address {
	
	private String streetAddress;
	private String state;
	private String city;
	private String zipcode;
	private String country;
	
	public Address() {}
	
	public Address(String streetAddress, String state, String city, String zipcode, String country) {
		this.streetAddress = streetAddress;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", state=" + state + ", city=" + city + ", zipcode="
				+ zipcode + ", country=" + country + "]";
	}
	
	
}
