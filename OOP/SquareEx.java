package in.co.OOP;

public class SquareEx extends ShapeInheri {

	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int area() {
		return side * side * side * side;
	}
}
