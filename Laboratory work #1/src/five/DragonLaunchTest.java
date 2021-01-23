package five;

import java.util.Random;

public class DragonLaunchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragonLaunch d = new DragonLaunch();
		SmartDragon s = new SmartDragon();
		int cnt1 = 0;
		int cnt2 = 0;
		
		Person p = new Person("ab", Gender.BOY, 3);
		Person p1 = new Person("aba", Gender.GIRL, 4);
		Person p2 = new Person("abaa", Gender.GIRL, 2);
		Person p3 = new Person("abaaq", Gender.GIRL, 4);
		for(int i=2;i<8;i++) {
	        d.kidnap(p);
	        d.kidnap(p1);
	        d.kidnap(p2);
	        d.kidnap(p3);
	      }
	      Random run = new Random();
	      
	        int nxt = run.nextInt(100);
	        if (d.willDragonEatOrNot()) {
	        	cnt1++;
	        }
	        
	        if (s.willDragonEatOrNot()) {
	        	cnt2++;
	        }
	        double res1 = cnt1 * 100 / 4;
	        double res2 = cnt2 * 100 / 4;
	        System.out.println("For Dragon: " + res1);
	        System.out.println("For Smart Dragon: " + res2);
	    }
	}


