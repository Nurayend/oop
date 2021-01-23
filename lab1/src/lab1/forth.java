package lab1;
import java.util.*;

public class forth {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float a, b, c, d;
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		d = (b * b) - (4 * a * c);
		if (d < 0)
			System.out.print("Error. D is negative");
		else if (d == 0)
			System.out.print("The root of quadratic equation = " + (-b) / (2*a));
		else {
			System.out.print("The roots of quadratic equation are " + ((-b + Math.sqrt(d)) / (2*a)) + " and " + ((-b - Math.sqrt(d)) / (2*a)));
		}
		scn.close();
	}
}
