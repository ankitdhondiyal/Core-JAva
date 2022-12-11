package in.co.OOP;

public class TestShapeInheri {

	public static void main(String[] args) {

		CircleEx c = new CircleEx();
		RectangleEx r = new RectangleEx();
		TriangleEx t = new TriangleEx();
		SquareEx sq= new SquareEx();

		c.setColor("Red");
		String color = c.getColor();
		System.out.println("Color of shapes id " + color);
		// Parent class can keep reference of child class

		ShapeInheri s = new CircleEx();
		

		c.area();
		
		System.out.println("Radius of circle " + c.getRadius());
		System.out.println("Area of circle is" + c.area());

		r.setLength(12);
		r.setWidth(10);

		double Ar1 = r.area();
		System.out.println("Length of rectangle is " + r.getLength());
		System.out.println("Width of rectangle is " + r.getWidth());
		System.out.println("Area is " + Ar1);
	
		
		t.setBase(6);
		t.setHeight(2);
		double Ar2 = t.area();

		System.out.println("Base of Triangle is "+ t.getBase());
		System.out.println("Height of Triangle is "+ t.getHeight());
		System.out.println("Area of Triangle is " + Ar2);

		double TotalAr = t.area()*Ar1*Ar2;
		System.out.println(TotalAr);
		
		sq.setColor("Red");
		sq.setSide(2);
		
		int X= sq.area();
		
		System.out.println(sq.getColor());
		System.out.println(sq.getSide());
		System.out.println(X);
	}
	
}
