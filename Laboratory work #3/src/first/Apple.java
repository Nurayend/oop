package first;

public class Apple implements Eatable, IRipe{
	
	public void eat() {
		System.out.println("tasty apple");
	}
	
	public boolean cook() {
		return false;
	}
	
	public void ripe() {
		System.out.println("the apple is ripe");
	}
}
