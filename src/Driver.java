import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Driver {
    private User user = null;
    private HashSet<User> users;
    private static final String PATH = "src\\files\\";
    private static final String LOG = "log.txt";
    private ObjectOutputStream output;
    private ObjectInputStream input;

    public Student student;
    public Teacher teacher;
    public Manager manager;
    public Executor executor;
    public Admin admin;
    public Mode mode;

    Console console;
    public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    public static ArrayList<Manager> managers = new ArrayList<Manager>();
    public static ArrayList<Executor> executors = new ArrayList<Executor>();
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Order> allOrders = new ArrayList<Order>();
    public static ArrayList<Course> courses = new ArrayList<Course>();
    public static ArrayList<Message> messages = new ArrayList<Message>();
    
    private static final String EXCEPT_CLASS = "Class not found!";
    private static final String EXCEPT_FILE = "File not found!";
    private static final String EXCEPT_IO = "Input / Output exception!";
    private static final String DATE_PATTERN = "dd.MM.yy HH:mm";

    private static final String COURSES = PATH + "courses.out";
    private static final String TEACHERS = PATH + "teachers.out";
    private static final String STUDENTS = PATH + "students.out";
    private static final String MANAGERS = PATH + "managers.out";
    private static final String EXECUTORS = PATH + "executors.out";
    private static final String MESSAGES = PATH + "messages.out";
    private static final String ORDERS = PATH + "orders.out";


    public Driver(){
        loadData();
    }
    
    public void run() throws IOException{
        System.out.println(" Welcome to Intranet!\n Are you an admin or user?");

        String ans = console.read().toLowerCase();

        if (!(ans.equals("user") || ans.equals("admin"))) { 
        	System.out.println("Error");
        	return;
        }

        System.out.println("Enter your login: ");
        String login = console.read().toLowerCase();
        System.out.println("Enter your password: ");
        String password = console.read();
        try {
            switch (ans) {
                case "admin":
                    sessionAdmin(login, password);
                    break;
                case "user":
                    sessionUser(login, password);
                    break;
            }
        }
        catch(LoginNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidPasswordException e){
            System.out.println(e.getMessage());
        }

        saveData();
    }

    private void sessionUser(String login, String password)
    throws LoginNotFoundException, InvalidPasswordException{
    	loadData();
        ArrayList<User> list = new ArrayList<>();

        boolean found = false;

        list.addAll(teachers);
        list.addAll(students);
        list.addAll(managers);
        list.addAll(executors);

        for (User u: list) {
            if (u.getLogin().equals(login)){
                found = true;
                if(u.getPassword().equals(password)) {
                    user = u;

                    Driver.writeLog("User " + u.getLogin() + " logged in!");
                    u.session();

                    break;
                }
                else throw new InvalidPasswordException();
            }
        }
        if (!found) {
            throw new LoginNotFoundException();
        }

    }
    
    //admin 
    private void sessionAdmin(String login, String password)
    throws LoginNotFoundException, InvalidPasswordException{
        admin = new Admin();

        if (admin.getLogin().equals(login)){
            if(admin.getPassword().equals(password)) {
                String ans = "";

                Driver.writeLog("Admin logged in!");

                while (true) {
                    System.out.println("Choose the option: ");
                    System.out.println("1. Add new user");
                    System.out.println("2. Delete user");
                    System.out.println("3. Show log file");

                    ans = console.read();

                    switch (ans) {
                        case "1":
                            adminAdd();
                            break;
                        case "2":
                            adminRemove();
                            break;
                        case "3":
                            adminLogs();
                            break;
                        case "exit":
                            return;
                        default:
                            System.out.println("Command index is out of range!");
                            break;
                    }
                }
            }
            else{
                throw new InvalidPasswordException();
            }
        }
        else {
            throw new LoginNotFoundException();
        }
    }

    private void adminAdd() {
				
				    System.out.println("Whom you want to add?");
				    System.out.println("1. Student");
				    System.out.println("2. Teacher");
				    System.out.println("3. Manager");
				    System.out.println("4. Executor");

				    String ans = console.read();
				    Mode mode;
				    switch (ans) {
				        case "1":
				            mode = Mode.STUDENT;
				            break;
				        case "2":
				            mode = Mode.TEACHER;
				            break;
				        case "3":
				            mode = Mode.MANAGER;
				            break;
				        case "4":
				            mode = Mode.EXECUTOR;
				            break;
				        case "exit":
				            return;
				        default:
				            System.out.println("Invalid option!");
				            mode = null;
				    }

				    System.out.println("Enter name");

				    String name = console.read();

				    System.out.println("Enter login");

				    String login = console.read();

				    System.out.println("Enter password");
				    String password = console.read();

				    admin.addUser(name, login, password, mode);
    }

    private void adminRemove(){
        System.out.println("Enter user`s login you want to delete");

        String login = console.read();

        if (admin.deleteUser(login)) {
            System.out.println("Success!");
        }
        else {
            System.out.println("User not found!");
        }
    }

    private void adminLogs() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH + LOG));

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);

                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(EXCEPT_IO);
        }
    }

    //DESERIALIZATION
    private void loadData() {
        loadStudents();
        loadTeachers();
        loadExecutors();
        loadManagers();
    }

    private void loadStudents() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(STUDENTS));

            students = (ArrayList<Student>) ois.readObject();

            ois.close();

        }
        catch (ClassNotFoundException e) {
            //System.out.println(STUDENTS + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(STUDENTS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(STUDENTS + ": " + EXCEPT_IO);
        }
    }

    private void loadTeachers() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TEACHERS));

            teachers = (ArrayList<Teacher>) ois.readObject();

            ois.close();

        }
        catch (ClassNotFoundException e) {
            System.out.println(TEACHERS + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(TEACHERS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(TEACHERS + ": " + EXCEPT_IO);
        }
    }

    private void loadManagers() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(MANAGERS));

            managers = (ArrayList<Manager>) ois.readObject();

            ois.close();
        }
        catch (ClassNotFoundException e) {
            System.out.println(MANAGERS + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(MANAGERS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(MANAGERS + ": " + EXCEPT_IO);
        }
    }
    private void loadExecutors() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(EXECUTORS));

            executors = (ArrayList<Executor>) ois.readObject();

            ois.close();

        }
        catch (ClassNotFoundException e) {
            System.out.println(EXECUTORS + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(EXECUTORS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(EXECUTORS + ": " + EXCEPT_IO);
        }
    }

    //SERIALIZATION

    private static void saveData() {
        saveManagers();
        saveTeachers();
        saveStudents();
        saveExecutors();
        
    }

    private static void saveStudents() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(STUDENTS));

            oot.writeObject(students);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(STUDENTS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(STUDENTS + ": " + EXCEPT_IO);
        }
    }

    private static void saveTeachers() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(TEACHERS));

            oot.writeObject(teachers);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(TEACHERS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(TEACHERS + ": " + EXCEPT_IO);
            e.printStackTrace();
        }
    }

    private static void saveManagers() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(MANAGERS));

            oot.writeObject(managers);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(MANAGERS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(MANAGERS + ": " + EXCEPT_IO);
        }
    }
    private static void saveExecutors() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(EXECUTORS));

            oot.writeObject(executors);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(EXECUTORS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(EXECUTORS + ": " + EXCEPT_IO);
        }
    }

    public static void saveCourses(){
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(COURSES));

            oot.writeObject(courses);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(COURSES + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(COURSES + ": " + EXCEPT_IO);
        }
    }

    public static void loadCourses() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(COURSES));

            courses = (ArrayList<Course>) ois.readObject();

            ois.close();

        }
        catch (ClassNotFoundException e) {
            System.out.println(COURSES + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(COURSES + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(COURSES + ": " + EXCEPT_IO);
        }
    }
    
    public static void loadMessages() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(MESSAGES));

            messages = (ArrayList<Message>) ois.readObject();

            ois.close();

        }
        catch (ClassNotFoundException e) {
            System.out.println(MESSAGES + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(MESSAGES + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(MESSAGES + ": " + EXCEPT_IO);
        }
    }
    
    public static void loadOrders() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ORDERS));

            allOrders = (ArrayList<Order>) ois.readObject();

            ois.close();

        }
        catch (ClassNotFoundException e) {
            System.out.println(ORDERS + ": " + EXCEPT_CLASS);
        }
        catch (FileNotFoundException e) {
            System.out.println(ORDERS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(ORDERS + ": " + EXCEPT_IO);
        }
    }
    
    public static void saveMessages() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(MESSAGES));

            oot.writeObject(messages);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(MESSAGES + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(MESSAGES + ": " + EXCEPT_IO);
        }
    }
    
    public static void saveOrders() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(ORDERS));

            oot.writeObject(allOrders);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(ORDERS + ": " + EXCEPT_FILE);
        }
        catch (IOException e) {
            System.out.println(ORDERS + ": " + EXCEPT_IO);
        }
    }
    
    private static void writeLog(String msg) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(PATH + LOG, true));

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_PATTERN);

            bw.write(dtf.format(LocalDateTime.now())+ " - " + msg + "\n");

            bw.flush();
            bw.close();
        }
        catch (IOException e) {
            System.out.println(EXCEPT_IO);
        }
    }
}