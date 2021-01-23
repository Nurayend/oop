package lab1;
import java.util.*;

public class sixth {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s;
		s = scn.nextLine();
		System.out.print(palind(s));
		scn.close();
		}
	
	private static boolean palind (String s) {
		int index = s.length();
		for (int i = 0; i < index / 2; i++) 
			if (s.charAt(i) != s.charAt(index - i - 1))
				return false;			
		return true;
	}
	
}
