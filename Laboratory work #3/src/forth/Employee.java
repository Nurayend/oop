package forth;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable, Cloneable{
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	public Employee(String name, double salary, String insuranceNumber, Date hireDate) {
		super(name);
	    this.salary = salary;
	    this.insuranceNumber = insuranceNumber;
	    this.hireDate = hireDate;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
	    this.salary = salary;
	}
	
	public String getInsuranceNumber() {
	    return insuranceNumber;
	}
	
	public void setInsuranceNumber(String insuranceNumber) {
	    this.insuranceNumber = insuranceNumber;
	}
	  
	public Date getHireDate() {
	    return hireDate;
	}
	
	public void setHireDate(Date hireDate) {
	    this.hireDate = hireDate;
	}
	  
	public int hashCode() {
		  return super.hashCode() + Objects.hash(insuranceNumber, salary, hireDate);
	}


	public boolean equals(Object o) {
		if(!super.equals(o))
		      return false;
		    Employee e = (Employee) o;
		    return this.insuranceNumber.equals(e.insuranceNumber) && this.salary == e.salary && this.hireDate == e.hireDate;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Employee cl = (Employee) super.clone();
	    cl.hireDate = (Date) hireDate.clone();
	    return cl;
	}

	public String toString() {
	    return super.toString() + ",  Hire date: " + this.hireDate + ", Insurance number: " + this.insuranceNumber + ", Salary: " + this.salary;
	}
	
	public int compareTo(Object o) {
	    Employee other = (Employee) o;
	    if(this.getSalary() > other.getSalary())
	      return 1;
	    else if(this.getSalary() < other.getSalary())
	      return -1;
	    else  return 0;
	 }
	  
}