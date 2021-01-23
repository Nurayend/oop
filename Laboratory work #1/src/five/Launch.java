package five;

import java.util.Vector;

public abstract class Launch {
	
	public Vector<Person> kidnapped;
	
	public Launch() {
		kidnapped = new Vector<Person>();
	}
	
	public void kidnap(Person p) {
		kidnapped.add(p);
	}
	
	public abstract boolean willDragonEatOrNot();

}
