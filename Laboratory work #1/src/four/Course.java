package four;

import java.util.ArrayList;

public class Course {
	
	private String name;
	private String description;
	private int numberOfCredits;
	private ArrayList<Course> prerequisites;
	
	{
		prerequisites = new ArrayList<>();
	}
	
	public Course(String name, String description, int numberOfCredits) {
		this.name = name;
		this.description = description;
		this.numberOfCredits = numberOfCredits;
	}
	
	public String toString() {
		return this.name + " " + this.description;
	}
}
