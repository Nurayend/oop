package first;

public abstract class Animal {
	private String type;
	private int age;
	
	abstract void sound();
	
	public Animal() {
		this.age = 1;
		this.type = "cat";
	}
	
	public Animal(String type) {
		this.type = type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return type;
	}
}
