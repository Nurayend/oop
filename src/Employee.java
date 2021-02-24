
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Objects;

/** 
 * Class Employee subclass of User and with fields <b>salary</b>, <b>messages</b>.
 * @version 14.0.2.0
 * @since 2020-07-14
*/

public abstract class Employee extends User implements Comparable, Serializable, DoSession {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4781370751425493577L;
	protected double salary;
	Console console;

    /** 
     * This constructor is used to create a new object
     * @see Employee#Employee(String, String, String)
     * @see Employee#Employee(String, String, String, String)
     * @see Employee#Employee(String, String, String, String, double)
     */
    
    public Employee() {}
    
    /** 
     * This constructor is used to create a new object with specific values
     * @param name the name of employee
     * @param login the login of employee
     * @param password the password of employee
     * @see Employee#Employee()
     */

    public Employee(String name, String login, String password){
        super(name, login, password);
    }
    
    /** 
     * This constructor is used to create a new object with specific values
     * @param name the name of employee
     * @param login the login of employee
     * @param password the password of employee
     * @param id the id of employee
     * @see Employee#Employee()
     */
    
    public Employee(String name, String login, String password, String id) {
        super(name, login, password, id);
    }
    
    /** 
     * This constructor is used to create a new object with specific values
     * @param name the name of employee
     * @param login the login of employee
     * @param password the password of employee
     * @param id the id of employee
     * @param salary the salary of employee which he receive
     * @see Employee#Employee()
     */

    public Employee(String name, String login, String password, String id, double salary) {
        super(name, login, password, id);
        this.salary = salary;
    }
    
    /**
     *The method which returns the salary, as double. {@link Employee#salary}
     * @return the employees' salary
     * @see Employee#Employee()
     * @see Employee#Employee(String, String, String)
     * @see Employee#Employee(String, String, String, String)
     * @see Employee#Employee(String, String, String, String, double)
     */

    public double getSalary() {
        return salary;
    }
    
     /**
     * This method is used for determining the salary of employee {@link Employee#salary}
     * @param salary - the salary of employee which he receive
     * @see Employee#Employee()
     * @see Employee#Employee(String, String, String)
     * @see Employee#Employee(String, String, String, String)
     * @see Employee#Employee(String, String, String, String, double)
     */

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    /**
    * @return a hash code value for this object.
    */
    public int hashCode() {
        return Objects.hash(salary);
    }

    @Override
    /**
     * Indicates whether some other object is "equal to" this one. 
     * @param o the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0;
    }

    @Override
    /**
     * @return a string representation of the object
     */
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", salary=" + salary +
                "} " + super.toString();
    }

    @Override
    /**
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this objectis less than, equal to, or greater than the specified object.
     */
    public int compareTo(Object o) {
        Employee e = (Employee)o;

        if(salary > e.salary) return 1;
        if(salary == e.salary) return 0;
        return -1;
    }

    /**
     * This method is used to print name and password
     * @exception IOException On input error
     * @see Employee#Employee()
     * @see Employee#Employee(String, String, String)
     * @see Employee#Employee(String, String, String, String)
     * @see Employee#Employee(String, String, String, String, double)
     * @see Employee#Employee()
     */
    public void login() throws IOException {
    	
        System.out.println("Welcome!");
        System.out.println("Enter name: ");
        name = console.read();
        System.out.println("Enter password: ");
        password = console.read();
    }
 
    public void session(){}
}
