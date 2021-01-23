package second;
import java.util.*;

public class Tester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> people = new HashSet<Person>();
		Person p1 = new Person("Asem", "Turkistan");
		Person p2 = new Person("Asem", "Turkistan");
		people.add(p1);
		people.add(p2);
		System.out.println(people);
		
		HashSet<Student> students = new HashSet<Student>();
		Student s1 = new Student("Zhanel", "Almaty", "IT", 2, 3);
		Student s2 = new Student("Zhanel", "Almaty", "IT", 2, 3);
		students.add(s1);
		students.add(s2);
		System.out.println(students);
		
		HashSet<Staff> staffs = new HashSet<Staff>();
		Staff st1 = new Staff("Farida", "Uralsk", "IT", 2000);
		Staff st2 = new Staff("Farida", "Uralsk", "IT", 2000);
		staffs.add(st1);
		staffs.add(st2);
		System.out.println(staffs);
	}

}
