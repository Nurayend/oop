
import java.io.Serializable;
import java.util.HashSet;
/** 
 * Class Course with fields <b>name</b>, <b>id</b>, <b>teacher</b>, <b>students</b>, <b>prerequisites</b>, <b>courseFiles</b>, <b>creditsNumber</b>, <b>faculty</b>
 * @version 14.0.2.0
 * @since   2020-07-14
*/
public class Course implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -2058612440864525744L;
	private String name, id;
    private Teacher teacher;
    HashSet<Student> students;
    HashSet<Course> prerequisites;
    HashSet<CourseFile> courseFiles;
    int creditsNumber;
    Faculty faculty;
    /** 
     * This constructor is used to create a new object
     * @see Course#Course(String, String, int)
     */
    public Course(){}
    /** 
     * This constructor is used to create a new object with specific values
     * @param name- the name of course
     * @param id- the id of course
     * @param creditsNumber - the number of credits of course
     * @see Course#Course()
     */ 
    public Course(String name, String id, int creditNum){
        this.name = name;
        this.id = id;
        this.creditsNumber = creditNum;
    }
    /**
     * The method which returns the name of course, as String. {@link Course#name}
     * @return the name of course
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */  
    public String getName() {
        return name;
    }
    /**
     * This method is used for determining the name of course {@link Course#name}
     * @param name - the name of course
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */

    public void setName(String name) {
        this.name = name;
    }
    /**
     * The method which returns the id of course, as String. {@link Course#id}
     * @return the id of course
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */  
    public String getId() {
        return id;
    }
    /**
     * This method is used for determining the id of course {@link Course#id}
     * @param id - the id of course
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */

    public void setId(String id) {
        this.id = id;
    }
    /**
     * The method which returns the teacher of course {@link Course#teacher}
     * @return the teacher who will teach course
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */  
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    /**
     * The method which returns the list of students  {@link Course#students}
     * @return the list of students
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */  
    public HashSet<Student> getStudents() {
        return students;
    }
    /**
     * The method which add students for courses {@link Course#student}
     * @param student the student whose we add for course
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */  
    public void addStudent(Student student) {
        Driver.students.add(student);

    }
    /**
     * The method which returns the prerequisities of courses {@link Course#prerequisites}
     * @return the prerequisities for course
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */  
    public HashSet<Course> getPrerequisites() {
        return prerequisites;
    }
    /**
     * The method which add prerequisities for courses {@link Course#c}
     * @param c the course to which we add prerequisites
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */  
    public void addPrerequisite(Course c) {
        this.prerequisites.add(c);
    }
    /**
     * The method which returns the course files {@link Course#courseFiles}
     * @return the list of course files
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */  
    public HashSet<CourseFile> getCourseFiles() {
        return courseFiles;
    }
    /**
     * This method is used for determining the course files {@link Course#courseFile}
     * @param courseFiles - the list of courses files
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */
    public void setCourseFiles(HashSet<CourseFile> courseFiles) {
        this.courseFiles = courseFiles;
    }
    /**
     * The method which returns the number of creditis of course {@link Course#creditsNumber}
     * @return the number of creditis for course
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */ 
    public int getCreditsNumber() {
        return creditsNumber;
    }
    /**
     * This method is used for determining the number of credits {@link Course#creditsNumber}
     * @param  creditsNumber - the number of credits for course
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */
    public void setCreditsNumber(int creditsNumber) {
        this.creditsNumber = creditsNumber;
    }
    /**
     * The method which returns the faculty which kept in enum class {@link Course#courseFiles}
     * @return the faculty 
     * @see Course#Course()
     * @see Course#Course(String, String, int)
     */ 
    public Faculty getFaculty(){
        return faculty;
    }

    @Override
    /**
     * Indicates whether some other object is "equal to" this one. 
     * @param o the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Course c = (Course) o;
        return (name.equals(c.name) && id.equals(c.id) && teacher.equals(c.teacher)
                && students.equals(c.students) && prerequisites.equals(c.prerequisites) && courseFiles.equals(c.courseFiles));
    }


    @Override
    /**
     * @return a string representation of the object
     */
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                ", prerequisites=" + prerequisites +
                ", courseFiles=" + courseFiles +
                ", creditsNumber=" + creditsNumber +
                '}';
    }
}
