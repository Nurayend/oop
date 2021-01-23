package first;

public class Cube extends Figure{
	private Double a;
	
	public Cube() {}
	
	public Cube(double a) {
		this.a = a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public double getA() {
		return a;
	}
	
	public double volume() {
		return Math.pow(this.a, 3);
	}
	
	public double surfaceArea() {
		return 6 * Math.pow(this.a, 2);
	}
	
	public String toString() {
		return "Volume of cube = " + this.volume() + ", Area of cube = " + this.surfaceArea();
	}
	
}
