package test1;

import java.util.Objects;

public abstract class User {
	private int id;
	private String login;
	private String dateOfReg;
	
	public User() {}
	
	public User(int id, String login, String dateOfReg) {
		this.id = id;
		this.login = login;
		this.dateOfReg = dateOfReg;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getDateOfReg() {
		return dateOfReg;
	}

	public void setDateOfReg(String dateOfReg) {
		this.dateOfReg = dateOfReg;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof User))
			return false;
		
		User user = (User) obj;
		return user.id == id && user.login.equals(login) && user.dateOfReg.equals(dateOfReg);
	}
	
	public int hashCode() {
		return Objects.hash(id, login, dateOfReg); 
	}
	
	public String toString() {
		return "Id: " + id + ", Login: " + login + ", Date Of Registration: " + dateOfReg;
	}
	
}
