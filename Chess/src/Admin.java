

import java.util.ArrayList;
import java.util.Scanner;

import enums.AccountStatus;

public class Admin extends Account{
	
	private ArrayList<Account> users = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	public Admin() {}
	
	public Admin(int id, String password) {
		super(id, password);
	}
	
	public void addUser(Account ac) {
		users.add(ac);
	}
	
	public boolean deleteUser(Account acc) {
		return users.remove(acc);
	}
	
	public void modify(int id) {
		int curr = -1;
		for (Account acc: users) {
			if (acc.getId() != id) {
				System.out.println("User not found!");
				return;
			}
			else curr = users.indexOf(acc);
		}
		System.out.println("What do you want to modify?");
		System.out.println("1. id");
		System.out.println("2. password");
		System.out.println("3. status");
		String ans = sc.nextLine();
		switch(ans) {
		case "1":
			System.out.println("Enter the new id: ");
			int newId = sc.nextInt();
			users.get(curr).setId(newId);
			break;
		case "2":
			System.out.println("Enter the new password: ");
			String newPass = sc.nextLine();
			users.get(curr).setPassword(newPass);
			break;
		case "3":
			System.out.println("Enter the new status: ");
			System.out.println("1.Active,\r\n" + 
					"	2. Closed,\r\n" + 
					"	3. Canceled,\r\n" + 
					"	4. Blacklisted,\r\n" + 
					"	5. None");
			String newStatus = sc.nextLine();
			AccountStatus accs = null;
			switch(newStatus) {
			case "1": accs = AccountStatus.Active; break;
			case "2": accs = AccountStatus.Blacklisted; break;
			case "3": accs = AccountStatus.Canceled; break;
			case "4": accs = AccountStatus.Closed; break;
			case "5": accs = AccountStatus.None; break;
			}
			users.get(curr).setStatus(accs);
		}
	}
	
	public boolean blockUser(int id) {
		int curr = -1;
		for (Account acc: users) {
			if (acc.getId() != id) {
				System.out.println("User not found!");
				return false;
			}
			else curr = users.indexOf(acc);
		}
		users.get(curr).setStatus(AccountStatus.Blacklisted);
		return true;
	}
	
	public void toAdd() { //1
		System.out.println("Enter id:");
		int curId = sc.nextInt();
		System.out.println("Enter password:");
		String curPas = sc.next();
		Account ac = new Account(curId, curPas);
		addUser(ac);
	}
	
	public void toDelete() { //2
		System.out.println("Enter the user id you want to delete:");
		int curId = sc.nextInt();
		Account ac = new Account(curId);
		deleteUser(ac);
	}
	
	public void toBlock() { //3
		System.out.println("Enter id:");
		int curId = sc.nextInt();
		blockUser(curId);
	}
	
	public void toModify() { //4
		System.out.println("Enter the user id you want to change:");
		int curId = sc.nextInt();
		modify(curId);
	}
	
	public void session() {
		System.out.println("You are logged as admin");
		System.out.println("Choose an option:");
		System.out.println("1. Add user");
		System.out.println("2. Delete user");
		System.out.println("3. Block User");
		System.out.println("4. Modify User");
		System.out.println("5. Exit");
		String ans = sc.nextLine();
		switch(ans) {
		case "1": 
			toAdd();
			break;
		case "2":
			toDelete();
			break;
		case "3":
			toBlock();
			break;
		case "4":
			toModify();
			break;
		case "5":
			return;
		}
	}

}
