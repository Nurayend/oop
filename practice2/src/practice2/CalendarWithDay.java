package practice2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarWithDay {
	private int y,m,d;
	private String date;
	private String weeks[] = {"Sun", "Mon" ,"Tue", "Wed" ,"Thu", "Fri", "Sat"};
	public CalendarWithDay(int y, int m, int d) {//Constructor
	    this.y = y;
	    this.m = m;
	    this.d = d;
	    this.date = ((new GregorianCalendar(y,m-1,1)).getTime()).toString();
	}
	public String toString() {
	    int first_day = 0, k = 1;
	    int last_day = (new GregorianCalendar(y,m,1)).getActualMaximum(Calendar.DATE);//Last day of month
	    for(int i = 0; i < 7; i++) {
	    	if(weeks[i].equals(date.substring(0,3))) {
	    		first_day = i;//Finding First day of month
	    		break;
	      	}
	    }
	    String solve = "";
	    for(int i = 0; i < 7; i++) {//Filling weeks like Sun Mon ...
	      solve+=weeks[i];
	      solve+=" ";
	    }
	    solve+="\n";
	    for(int i = 0; i < first_day; i++) {//Filling with space before first day
	      solve+="    ";
	    }
	    for(int i = first_day; i < 7; i++,k++) {//Starting with first day of month
	      if(k==this.d) solve+=spacePlus(String.valueOf(k) + "*");
	      else solve+=spacePlus(String.valueOf(k));
	      solve+=" ";
	    }
	    solve+="\n";
	    for(int i = 1; i < 5;i++) {//Filling with days
	      for(int j = 0; j < 7; j++, k++){
	        if(k==this.d) solve+=spacePlus(String.valueOf(k)+"*");//If day == k, then +* for string
	        else solve+=spacePlus(String.valueOf(k));
	        solve+=" ";
	        if(k>=last_day) break;
	      }
	      if(k >= last_day) break;//If more last day, just break
	      solve+="\n";
	    }
	    return solve;
	    
	    
	  }
	  public String spacePlus(String s) {
	    s = "  " + s;
	    return s.substring(s.length()-3);
	  }
}
