package first;

public class Cylinder extends Figure{
	private Double height;
	private Double radius;
	
	public Cylinder() {}
	
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double volume() {
		return Math.PI * Math.pow(this.radius, 2) * this.height;
	}
	
	public double surfaceArea() {
		return 2 * Math.PI * this.radius * (this.radius + this.height);
	}
	
	public String toString() {
		return "Volume of cylinder = " + this.volume() + ", Area of cylinder = " + this.surfaceArea();
	}
}
