package first;

public class Sphere extends Figure{
	private Double radius;
	
	public Sphere() {}
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double volume() {
		return 4/3 * Math.PI * Math.pow(this.radius, 3);
	}
	
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(this.radius, 2);
	}
	
	public String toString() {
		return "Volume of sphere = " + this.volume() + ", Area of sphere = " + this.surfaceArea(); 
	}
}
