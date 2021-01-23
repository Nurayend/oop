package lab1;
import java.util.*;

public class third {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int points;
		points = scn.nextInt();
		if (points >= 95)
			System.out.print('A');
		else if (points >= 90)
			System.out.println("A-");
		else if (points >= 85)
			System.out.print("B+");
		else if (points >= 80)
			System.out.print("B");
		else if (points >= 75)
			System.out.print("B-");
		else if (points >= 70)
			System.out.print("C+");
		else if (points >= 65)
			System.out.print("C");
		else if (points >= 60)
			System.out.print("C-");
		else if (points >= 65)
			System.out.print("D+");
		else if (points >= 60)
			System.out.print("D");
		else if (points >= 55)
			System.out.print("D-");
		else if (points >= 50)
			System.out.print("E+");
		else if (points < 50)
			System.out.print("FX");
		scn.close();
		
	}
}
