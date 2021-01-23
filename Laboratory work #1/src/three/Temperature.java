package three;

public class Temperature {
	private double value;
	private char scale;
	
	public Temperature() {
		this.value = 0;
		this.scale = 'C';
	}
	
	public Temperature(double value, char scale) {
		this.value = value;
		this.scale = scale;
	}

	public void setValue(double newValue) {
		value = newValue;
	}

	public void setScale(char newScale) {
		scale = newScale;
	}
	
	public void setBoth(double newValue, char newScale) {
		value = newValue;
		scale = newScale;
	}
	
	public String degreesC() {
		String temp = "";
		if (scale == 'C') 
			temp += value + "" + 'C';
		else 
			temp += 5 * (value - 32) / 9 + "" + 'C';
		
		return temp;
	}

	public String degreesF() {
		String temp = "";
		if (scale == 'F') 
			temp += value + "" + 'F';
		else 
			temp += (9 * (value / 5) + 32) + "" + 'C';
	
		return temp;
	}

	public char getScale() {
		return scale;
	}
	
	public String toString() {
		return value + "" + scale;
	}

}
