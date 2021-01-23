package fifth;

import java.text.*;
import forth.Employee;
import practice2.Time;

public class Tester {

	public static void main(String[] args) throws ParseException {
    Chocolate [] c = new Chocolate [5]; 
    c[0] = new Chocolate(200, "Albeni");
    c[1] = new Chocolate(110, "M&Ms");
    c[2] = new Chocolate(120, "Alpen Gold");
    c[3] = new Chocolate(130, "Roshen");
    c[4] = new Chocolate(140, "Nestle");
    Sort.bubbleSort(c);
    for(int i = 0; i < c.length; i++) 
      System.out.println(c[i].toString());
    
    System.out.println("***Quick Sort:");
    
    Sort.quickSort(c);
    for(int i = 0; i < c.length; i++) 
      System.out.println(c[i].toString());
    
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    Employee [] employee = new Employee[3];
    employee[0] = new Employee("Castiel", 10, "123", date.parse("2002-08-04"));
    employee[1] = new Employee("Dean", 12, "456", date.parse("2015-03-14"));
    employee[2] = new Employee("Sam", 13, "168", date.parse("2020-11-06"));
    Sort.bubbleSort(employee);
    
    for(int i = 0; i < employee.length; i++) 
      System.out.println(employee[i].toString());
    
    Time[] time = new Time[2];
    time[0] = new Time(23, 05, 30);
    time[1] = new Time(12, 32, 01);
    Sort.quickSort(time);
    
    for(int i = 0; i < time.length; i++) 
    	System.out.println(time[i].toString());
 
	}
}
