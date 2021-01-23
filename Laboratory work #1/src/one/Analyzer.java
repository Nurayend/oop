package one;
import java.util.*;

public class Analyzer {

	public static void main(String[] args) {
		
		Data data = new Data(); 
		String s;
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter number(Q to quit): \n");
			s = scn.nextLine();
			if (s.equals("Q"))
				break;
			else
				data.add(s);			
		}
		System.out.println("Average = " + data.getAverage());
		System.out.println("Maximum = " + data.getMaximum());
		scn.close();
	}
	
}
