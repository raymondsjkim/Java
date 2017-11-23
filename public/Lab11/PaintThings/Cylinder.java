
public class Cylinder extends Shape {
	double radius, height;
	public Cylinder(double radius, double height) {
		super("Cylinder");
		this.radius = radius;
		this.height = height;
	}
	public double area() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	public String toString() {
	       return super.toString();
	}
}
