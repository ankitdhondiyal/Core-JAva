package in.co.OOP;

public class CircleEx extends ShapeInheri {

	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double area() {
		return 3.14*radius*radius;
	}
	
}
