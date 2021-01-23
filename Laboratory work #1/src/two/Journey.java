package two;

enum Continent{
	AMERICA,
	EUROPE,
	ASIA,
	AUSTRALIA,
	AFRICA
}

public class Journey {
	Continent continent;
	final String travel = "Airplane";
	static String motive; //Discovery and exploration
	String geographicType;
	int numberOfDays;
	
	static {
		System.out.println("Hey Travelers, welcome to the best travel sites list!");
	}
	
	{
		System.out.println("Select a country to travel");
	}
	
	public Journey(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	
	public void setType(String geographicType) {
		this.geographicType = geographicType;
	}
	
	public Journey(int numberOfDays, String geographicType) { 
		this(numberOfDays);
		setType(geographicType);
	}
	
	public int getTime() {
		return numberOfDays;
	}
	
}
