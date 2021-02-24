import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Console { 
	 private final InputStreamReader input = new InputStreamReader(System.in); 
	 private final BufferedReader reader = new BufferedReader(input); 
	  
	 private final OutputStreamWriter output = new OutputStreamWriter(System.out); 
	 private final BufferedWriter writer = new BufferedWriter(output); 
	 
	
	 public String read() { 
	  String input = ""; 
	     try { 
	      input = reader.readLine(); 
	     } catch (IOException e) { 
	   e.printStackTrace(); 
	  } 
	      
	     return input; 
	 } 
	 
	 public int readInt() { 
	  int input = 0; 
	     try { 
	      input = Integer.parseInt(reader.readLine()); 
	     } catch (IOException e) { 
	   e.printStackTrace(); 
	  } 
	      
	     return input; 
	 } 
	 
	    public void closeStreams() { 
	     try { 
	   reader.close(); 
	   writer.close(); 
	  } catch (IOException e) { 
	   e.printStackTrace(); 
	  } 
	    } 
}