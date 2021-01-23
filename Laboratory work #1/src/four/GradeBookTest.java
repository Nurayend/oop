package four;
import java.util.Scanner;
import practice2.Student;

public class GradeBookTest {
	GradeBook gradeBook;
	
	public GradeBookTest(GradeBook gradeBook) {
		this.gradeBook = gradeBook;
	}
	
	public void grade() {
		Scanner scn = new Scanner(System.in);
		int grd = 0;
		System.out.println(gradeBook.displayMessage());
		for (Student s: gradeBook.getStudents()) {
			System.out.println("Student " + s.getName() + ": ");
			grd = scn.nextInt();
			gradeBook.addGrade(grd);
		}
		scn.close();
	}
	
	public static void main(String[] args) {
		GradeBook gradeBook = new GradeBook(new Course("CS101", "Object-oriented Programming and Design", 3));
		gradeBook.createStudents();
		GradeBookTest gradeBookTest = new GradeBookTest(gradeBook);
		gradeBookTest.grade();
		gradeBook.displayGradeReport();
	}
	
}

