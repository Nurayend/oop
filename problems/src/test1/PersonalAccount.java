package test1;

import java.util.Objects;

public class PersonalAccount extends User{
	private String hobby;
	private String maritalStatus;
	
	public PersonalAccount(int id, String login, String dateOfReg, String hobby, String maritalStatus) {
		super(id, login, dateOfReg);
		this.hobby = hobby;
		this.maritalStatus = maritalStatus;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PersonalAccount))
			return false;
		
		PersonalAccount personalAccount = (PersonalAccount) obj;
		return personalAccount.hobby.equals(hobby) && personalAccount.maritalStatus.equals(maritalStatus);
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(hobby, maritalStatus);
	}

	public String toString() {
		return super.toString() + ", Hobby: " + hobby + ", Marital Status: " + maritalStatus;
	}
}
