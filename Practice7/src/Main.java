
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

   public static void main(String[] args) {

       List<Student> students = new ArrayList<>();

       Student s1 = new Student("Nuray", 1, 17);
       Student s2 = new Student("Mina", 2, 18);
       Student s3 = new Student("Agata", 3, 19);

       students.add(s1);
       students.add(s2);
       students.add(s3);
       
       Comparator<Student> ageComprator = new AgeStudentComparator();
       Collections.sort(students, ageComprator);
       
       System.out.println(students);
   }
}
