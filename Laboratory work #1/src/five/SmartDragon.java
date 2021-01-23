package five;

public class SmartDragon extends Launch{
	
	public void kidnap(Person p) {
		super.kidnap(p);
	}
	
	public boolean willDragonEatOrNot() {
		int cnt = 0;
		
		for (Person p: kidnapped) {
			
			if (p.getGpa() > 3.0)
				cnt++;
		}
		return(!(cnt > 0));		
	}
}
