package in.co.OOP;

public class RectangleEx extends ShapeInheri {

	private double length;
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;

	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {
		return length * width;
	}
}
