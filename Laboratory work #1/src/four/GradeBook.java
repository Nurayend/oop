package four;
import java.util.ArrayList;
import practice2.Student;

public class GradeBook {
	
	private Course course;
	private ArrayList<Student> students;
	private ArrayList<Integer> grades;
	private static int minBoundary[] = { 0, 50, 60, 70, 80, 90, 100 };
	private static int maxBoundary[] = { 49, 59, 69, 79, 89, 99, 100 };
	private int count[] = new int[7];
	private String st[] = new String[7];
	
	{
		students = new ArrayList<>();
		grades = new ArrayList<>();
	}
	
	public GradeBook(Course course) {
		this.course = course;
	}
	
	public ArrayList<Student> getStudents(){
		return students;
	}
	
	public void addStudents(Student student) {
		students.add(student);
	}
	
	public void createStudents() {
		String s = "ABC";
		for (int i = 0; i < s.length(); i++) {
			Student student = new Student(Character.toString(s.charAt(i)), 2);
			addStudents(student);
		}
	}
	
	public ArrayList<Integer> getGrade() {
		return grades;
	}
	
	public void addGrade(int input) {
		grades.add(input);
	}
	
	public String displayMessage() {
		return "Welcome to the grade book for " + course.toString() + "!" + "\nPlease, input grades for students: ";
	}
	
	public void displayGradeReport() {
		System.out.println(determineClassAverage());
		System.out.println(determineLowestGrade());
		System.out.println(determineHighestGrade());
		System.out.println(outputBarChart());
	}
	
	public String determineClassAverage() {
		int sum = 0;
		for (int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		double average = sum/grades.size();
		return "Class average: " + average + ". ";
	}
	
	public String determineLowestGrade() {
		int mini = 1000;
		int index = 0;
		for (int i = 0; i < grades.size(); i++) {
			if (mini > grades.get(i)) {
				mini = grades.get(i);
				index = i;
			}
		}
		String s = "Lowest grade is " + mini + "(" + students.get(index).toString() + "). ";
		return s;
	}
	
	public String determineHighestGrade() {
		int maxi = -1;
		int index = 0;
		for (int i = 0; i < grades.size(); i++) {
			if (maxi < grades.get(i)) {
				maxi = grades.get(i);
				index = i;
			}
		}
		String s = "Highest grade is " + maxi + "(" + students.get(index).toString() + ").";
		return s;
	}
	
	public String outputBarChart() {
		StringBuilder sb = new StringBuilder();
		sb.append("Grades distribution: ");
		printStar();
		countStar();
		for (int i = 0; i < minBoundary.length; i++) {
			if (i == minBoundary.length - 1) 
				sb.append(String.format("\n%d: %s", minBoundary[i], st[i]));
			else
				sb.append(String.format("\n%d-%d: %s", maxBoundary[i], minBoundary[i], st[i]));
		}
		return sb.toString();
	}
	
	public void countStar() {
		for (int i = 0; i < grades.size(); i++) {
			for (int j = minBoundary.length - 1; j >= 0; j--) {
				if (minBoundary[j] < grades.get(i)) {
					count[j]++;
					break;
				}
			}
		}
	}
	
	public void printStar() {
		countStar();
		String temp = "";
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < count[i]; j++) {
				temp += "*";
			}
			st[i] = temp;
			temp = "";
		}
	}
}
