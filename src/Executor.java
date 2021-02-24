

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Executor extends Employee implements Serializable, DoSession {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8463075191377677838L;
	static public ArrayList<Order> doneOrders = new ArrayList<>();
    Console console;
    
    public Executor(){
    }

    public Executor(String name, String login, String password){
        super(name, login, password);
    }
    public Executor(String name, String login, String password, String id, double salary) {
        super(name, login, password, id, salary);
    }

    public void acceptOrder(Order order){
    	doneOrders.add(order);
        Driver.allOrders.remove(order);
        order.setStatus(Status.ACCEPTED);
    }

    public String rejectOrder(Order order){
        order.setStatus(Status.REJECTED);
        return this.getLogin();
    }

    public void receiveOrders(){
    	Driver.loadOrders();
    	System.out.println("Enter the order number you want to accept/reject: ");
    	int n = console.readInt();
    	Order o = Driver.allOrders.get(n-1);
    	System.out.println("1. Accept");
    	System.out.println("2. Reject");
    	String ans = console.read();
    	switch(ans) {
    	case  "1":
    		acceptOrder(o);
    		break;
    	case "2":
    		rejectOrder(o);
    		break;
    	}
    }
    
    public void viewNewOrders(){
    	
        int i = 1;
        for(Order order : Driver.allOrders){
        	if (!this.getLogin().equals(rejectOrder(order))) {
        		System.out.println(i + ". " + order);
        		i++;
        	}
        }
    }

    public void viewDoneOrders(){
        int i = 1;
        for(Order order : doneOrders){
            System.out.println(i + ". " + order);
            i++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Executor executor = (Executor) o;
        return Objects.equals(doneOrders, executor.doneOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doneOrders);
    }

    public void session() {

        System.out.println("Executor logged in!");
        while (true) {

            System.out.println("Choose option: ");
            System.out.println("1. View new orders");
            System.out.println("2. View done orders");
            System.out.println("3. Receive order");

            String ans = console.read();
            if (ans.equals("exit")) break;
            switch (ans) {
            case "1":
            	viewNewOrders();
            	break;
            case "2":
            	viewDoneOrders();
            	break;
            case "3":
            	receiveOrders();
            	break;
            default:
            	System.out.println("Command index is out of range!");
            }
        }
    }
}
