
import java.io.BufferedReader;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Admin extends Employee implements DoSession, Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8211048931997418267L;
	public static String defaultLogin = "kbtu";
	public static String defaultPass = "kbtu";
    private Admin admin;
    Console console;

    private User user;
    private static final String PATH = "C:\\Users\\MI\\eclipse-workspace\\intranet\\src\\files\\";
    private static final String LOG = "log.txt";
    private static final String EXCEPT_IO = "umri";

    public Admin(){
        login = defaultLogin;
    	password = defaultPass;
    }

    public Admin(String name, String login, String password){
        super(name, login, password);
    	
    }

    public Admin(String name, String login, String password, String id, double salary) {
        super(name, login, password, id, salary);
    }

    public void addUser(String name, String newLogin, String password, Mode mode){
        switch (mode) {
            case STUDENT:
                addStudent(name, newLogin, password);
                break;
            case TEACHER:
                System.out.println("Enter rank: ");
                System.out.println("1. TUTOR");
                System.out.println("2. LECTOR");
                System.out.println("3. SENIOR LECTOR");
                System.out.println("4. ASSISTANT PROFESSOR");
                System.out.println("5. ASSOCIATE PROFESSOR");
                System.out.println("6. PROFESSOR");
                Rank rank;
                String res = console.read();
                switch (res) {
                case "1": rank = Rank.TUTOR; break;
                case "2": rank = Rank.LECTOR; break;
                case "3": rank = Rank.SENIOR_LECTOR; break;
                case "4": rank = Rank.ASSISTANT_PROFESSOR; break;
                case "5": rank = Rank.ASSOCIATE_PROFESSOR; break;
                case "6": rank = Rank.PROFESSOR; break;
                default:
                    System.out.println("Not valid option!");
                    rank = null;
                    break;
                }
                addTeacher(name, newLogin, password, rank);
                break;
            case MANAGER:
                addManager( name, newLogin, password);
                break;
            case EXECUTOR:
                addExecutor(name, newLogin, password);
                break;
        }
    }

    private void addExecutor(String name, String newLogin, String password) {
        Executor executor = new Executor(name, newLogin, password);

        if (!Driver.executors.contains(executor)) {
            Driver.executors.add(executor);
        }
        else {
            System.out.println(executor.getClass().toString().split(" ")[1] + " already exists!");
        }
    }

    private void addManager(String name, String newLogin, String password) {
        Manager manager = new Manager(name, newLogin, password);

        if (!Driver.managers.contains(manager)) {
            Driver.managers.add(manager);
        }
        else {
            System.out.println(manager.getClass().toString().split(" ")[1] + " already exists!");
        }
    }

    private void addTeacher( String name, String newLogin, String password, Rank rank) {
        Teacher teacher = new Teacher( name, newLogin, password, null, rank, new HashSet<Course>());

        if (!Driver.teachers.contains(teacher)) {
            Driver.teachers.add(teacher);
        }
        else {
            System.out.println(teacher.getClass().toString().split(" ")[1] + " already exists!");
        }
    }

    public void addStudent(String name, String newLogin, String password) {
        Student student = new Student( name, newLogin, password);

        if (!Driver.students.contains(student)) {
            Driver.students.add(student);
        }
        else {
            System.out.println(student.getClass().toString().split(" ")[1] + " already exists!");
        }
    }

    public void adminRemove() {
        System.out.println("Enter user`s login you want to delete");

        String login = console.read();

        if (admin.deleteUser(login)) {
            System.out.println("Success!");
        }
        else {
            System.out.println("User not found!");
        }
    }

    public boolean deleteUser(String login) {
        for (User u: Driver.students) {
            if (u.getLogin().equals(login)) {
                Driver.students.remove(u);

                return true;
            }
        }
        for (User u: Driver.managers) {
            if (u.getLogin().equals(login)) {
                Driver.managers.remove(u);

                return true;
            }
        }

        for (User u: Driver.executors) {
            if (u.getLogin().equals(login)) {
                Driver.executors.remove(u);

                return true;
            }
        }
        for (User u: Driver.teachers) {
            if (u.getLogin().equals(login)) {
                Driver.teachers.remove(u);

                return true;
            }
        }

        return false;
    }

    public void adminLogs() {
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

}
