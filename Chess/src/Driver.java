

import java.util.Scanner;

public class Driver {
	private static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("Welcome to Chess game. Are you (1)admin or (2)player? ");
		String ans = sc.nextLine();
		switch(ans) {
		case "1": 
			Admin a = new Admin(1, "admin");
			a.session();
		case "2":
			System.out.println("Please enter your id:");
			int id = sc.nextInt();
			System.out.println("Enter your password:");
			String pass = sc.nextLine();
			Player p = new Player(id, pass);
			p.session();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}
