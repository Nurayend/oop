package second;
import java.util.Objects;

public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getFee() {
		return fee;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public boolean equals(Object obj) {
	    if(obj == this)
	      return true;
	    if(!(obj instanceof Student)) {  
	      return false;
	    }
	    Student student = (Student) obj;
	    return student.year == year && student.fee == fee && student.program.equals(program);
	  }
	  
	  public int hashCode() {
	    return super.hashCode() + Objects.hash(program, year, fee);
	  }
	
	public String toString() {
		return super.toString() + ", program: " + program + ", year: " + year + ", fee: " + fee;
	}
}
