package five;

public class Person {
	Gender gen;
	String name;
	double gpa;
	
	public Person(String name, Gender gen, double gpa) {
		this.name = name;
		this.gen = gen;
		this.gpa = gpa;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public String toString() {
		return this.name;
	}
	
}
