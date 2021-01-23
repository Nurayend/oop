package first;

public class Cat extends Animal {
	private String voice;
	
	public Cat() {
		super();
		this.voice = "meow";
	}
	
	public void sound() {
		System.out.println("meow");
	}
	
	public Cat(String type, String voice) {
		super(type);
		this.voice = voice;
	}
	
	public void setVoice(String voice) {
		this.voice = voice;
	}
	
	public String getVoice() {
		return voice;
	}
	
	public boolean findViskas() {
		return true;
	}
	
	public String toString() {
		return super.toString() + " says " + voice;
	}
}
