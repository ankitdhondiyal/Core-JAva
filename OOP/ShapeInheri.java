package in.co.OOP;

public class ShapeInheri {

	private String color;
	private int bw;
	private int side;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBw() {
		return bw;
	}

	public void setBw(int bw) {
		this.bw = bw;
	}

	public int getside() {
		return side;

	}

	public void setside(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return color + " " + bw + " " + side;
	}

}
