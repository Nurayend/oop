package five;

public class DragonLaunch extends Launch{
	
	public void kidnap(Person p) {
		super.kidnap(p);
	}
	
	public boolean willDragonEatOrNot() {
		int cnt = 0;
		for (Person p: kidnapped) {
			
			if (cnt < 0)
				return true;
			
			if (p.gen == Gender.GIRL) 
				cnt--;
			else
				cnt++;
		}
		return(!(cnt == 0));		
	}

}
