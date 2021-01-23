package lab1;
import java.util.*;

public class bonus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int size;
	    size = input.nextInt(); 
	    int [] arr = new int [size];
	    //int cnt = 0;
	    
	    for (int i = 0; i < size; i++) 
	    	arr[i] = input.nextInt();
	  
	    for (int element : arr)
	    	System.out.print(element + " ");
	    
//	    for (int j = 0; j < size; j++) {
//	    	if (array[i] % 2 == 0) {
//	    		cnt++;
//	    	}
//	    }
	}
	
}
