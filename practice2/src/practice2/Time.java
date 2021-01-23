package practice2;

public class Time implements Comparable{
	  public int hour, minute, second;
	  
	  public void setTime(int hour, int minute, int second) {
	    if (hour > 23 || minute > 60 || second > 59 || hour < 0 || minute < 0 || second < 0) {
	      System.out.println("Error");
	    } 
	    else {
	      this.hour = hour;
	      this.minute = minute;
	      this.second = second;
	    }

	  }

	  public Time(int hour, int minute, int second) {
	    setTime(hour, minute, second);
	  }

	  public String toUniversal() {
	    String temp = "";
	    if (hour < 10) {
	      temp += "0";
	      temp += Integer.toString(hour);
	      temp += ":";
	    } else {
	      temp += Integer.toString(hour);
	      temp += ":";
	    }
	    if (minute < 10) {
	      temp += "0";
	      temp += Integer.toString(minute);
	      temp += ":";
	    } else {
	      temp += Integer.toString(minute);
	      temp += ":";
	    }
	    if (second < 10) {
	      temp += "0";
	      temp += Integer.toString(second);
	    } 
	    else {
	      temp += Integer.toString(second);
	    }

	    return temp;
	  }

	  public String toStandard() {
	    String temp = "";
	    if (hour <= 12) {
	      if (hour < 10) {
	        temp += "0";
	        temp += Integer.toString(hour);
	        temp += ":";
	      } 
	      else {
	        temp += Integer.toString(hour);
	        temp += ":";
	      }
	      if (minute < 10) {
	        temp += "0";
	        temp += Integer.toString(minute);
	        temp += ":";
	      } 
	      else {
	        temp += Integer.toString(minute);
	        temp += ":";
	      }
	      if (second < 10) {
	        temp += "0";
	        temp += Integer.toString(second);
	        temp += " AM";
	      } else {
	        temp += Integer.toString(second);
	        temp += " AM";
	      }
	    } 
	    else {
	      int curr = 0;
	      curr = hour - 12;

	      if (curr < 10) {
	        temp += "0";
	        temp += Integer.toString(curr);
	        temp += ":";
	      } else {
	        temp += Integer.toString(curr);
	        temp += ":";
	      }
	      if (minute < 10) {
	        temp += "0";
	        temp += Integer.toString(minute);
	        temp += ":";
	      } else {
	        temp += Integer.toString(minute);
	        temp += ":";
	      }
	      if (second < 10) {
	        temp += "0";
	        temp += Integer.toString(second);
	        temp += " PM";
	      } else {
	        temp += Integer.toString(second);
	        temp += " PM";
	      }

	    }

	    return temp;
	  }

	  public static void addTime(Time t, Time t2) {
	    t.hour += t2.hour;
	    if (t.hour > 24)
	      t.hour -= 24;

	    t.minute += t2.minute;
	    if (t.minute > 60)
	      t.minute -= 60;

	    t.second += t2.second;
	    if (t.second > 60)
	      t.second -= 60;

	  }

	  public String toString() {
	    return toUniversal();
	  }

	  public int compareTo(Object obj) {
	    Time t = (Time) obj;
	    int thisTotal = this.hour * 3600 + this.minute * 60 + this.second;
	    int otherTotal = t.hour * 3600 + t.minute * 60 + t.second;
	    if (thisTotal > otherTotal)
	      return 1;
	    if (thisTotal < otherTotal)
	      return -1;
	    return 0;
	  }
}
