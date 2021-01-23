package first;

public class Tester {
	
	public static void feed(Animal a) {
		a.sound();
		if (a instanceof Cat) {
			Cat c = (Cat) a;
			c.findViskas();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat("cat", "meow");
		cat.findViskas();
		System.out.println(cat.toString());
		feed(cat);
		
		Dog d = new Dog();
		feed(d);
	}

}
