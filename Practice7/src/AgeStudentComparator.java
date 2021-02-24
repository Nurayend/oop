
import java.util.Comparator;

public class AgeStudentComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		 int diff = s1.getAge() - s2.getAge();
  
		 return diff;
  }

}
