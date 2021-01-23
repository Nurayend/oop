package first;

public abstract class Fruits {
	
	private String type;
	private double calories;
	
	public abstract void eat();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public String toString() {
		return "Fruits [type=" + type + ", calories=" + calories + "]";
	}

}
