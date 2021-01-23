package second;

import java.util.Objects;

public class Staff extends Person{
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public boolean equals(Object obj) {
	    if(obj == this)
	      return true;
	    if(!(obj instanceof Staff)) {  
	      return false;
	    }
	    Staff staff = (Staff) obj;
	    return staff.pay == pay && staff.school.equals(school);
	  }
	  
	  public int hashCode() {
	    return super.hashCode() + Objects.hash(school, pay);
	  }
	
	public String toString() {
		return super.toString() + ", school: " + school + ", pay: " + pay;
	}
}
