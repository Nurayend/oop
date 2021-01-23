package first;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana banana = new Banana();
		banana.setCalories(40);
		banana.setType("banana");
		System.out.println(banana.toString());
		banana.eat();
		
		Apple apple = new Apple();
		apple.eat();
		apple.ripe();
	}

}
