

import enums.AccountStatus;

public class Account {
	
	private int id;
	private String password;
	private AccountStatus status;
	
	public Account() {}
	
	public Account (int id) {
		this.id = id;
	}
	
	public Account(int id, String passsword) { 
		this.id = id;
		this.password = password;
	}
	
	public Account(int id, String password, AccountStatus status) {
		this.id = id;
		this.password = password;
		this.status = status;
	}
	
	public boolean resetPassword() {
		//code		
		return false;
	}

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

}
