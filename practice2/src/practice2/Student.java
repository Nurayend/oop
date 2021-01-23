package practice2;

public class Student {
	
	private String name;
	int yearOfStudy;
	private int id;
	static int cnt = 1;
	
	{
		id = cnt++;
	}
	
	public Student (String name) {
		this.name = name;
	}
	
	public Student (String name, int yearOfStudy) {
		this(name);
		this.yearOfStudy = yearOfStudy;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Student " + this.getName() + ", id: " + this.getId();
	}
	
}
