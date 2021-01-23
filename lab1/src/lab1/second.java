package lab1;
import java.util.*;

public class second {
	public static void main(String[] args) {
		double a, area, perimeter, diagonal;
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		area = a * a;
		perimeter = 4 * a;
		diagonal = a * a + a * a;
		diagonal = Math.sqrt(diagonal);
		System.out.println("The area of sqaure is: " + area);
		System.out.println("The perimeter of square is: " + perimeter);
		System.out.println("The diagonal of square is: " + diagonal);
		scn.close();
	}
}
