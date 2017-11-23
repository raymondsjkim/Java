
public abstract class Shape {
	String shapeName;
	
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	
	abstract double area();
	
	public String toString() {
		return shapeName;
	}
}
