package fifth;

public class Chocolate implements Comparable{
	
	  private int weight;
	  private String name;
	  
	  public Chocolate(int weight, String name) {
	    super();
	    this.weight = weight;
	    this.name = name;
	  }
	  
	  public int getWeight() {
	    return weight;
	  }
	  
	  public void setWeight(int weight) {
	    this.weight = weight;
	  }
	  
	  public String getName() {
	    return name;
	  }
	  
	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  public String toString() {
	    return "Chocolate: " +  this.name + ", weight: " + this.weight + " gr";
	  }
	  
	  public int compareTo(Object o) {
	    Chocolate c = (Chocolate) o;
	    if(this.getWeight() > c.getWeight())
	      return 1;
	    else if(this.getWeight() < c.getWeight())
	      return -1;
	    else  return 0;
	  }
}