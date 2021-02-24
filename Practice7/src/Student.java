
public class Student implements Comparable <Student>{
  
	  private String name;
	  private Integer id;
	  private Integer age;
	    
	  public Student() {}
	  
	  public Student(String name, int id, int age) {
	    this.name = name;
	    this.id = id;
	    this.age = age;
	  }
	  
	  public String getName(){
	      return name;
	  }
	  public int getId(){
	      return id;
	  }
	  
	  public int getAge(){
	      return age;
	  }
	  
	  public int compareTo(Student o) {
	    int res = this.name.compareTo(o.name);
	    if (res == 0) {
	      res = this.id.compareTo(o.id);
	    }
	    return res;
	  }
	  
	  public String toString() {
	        return "Name = " + name +", id = " + id + ", age = " + age + "\n" ;
	  }
}