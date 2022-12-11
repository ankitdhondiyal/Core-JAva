package in.co.OOP;

public class TestConstA {

	public static void main(String[] args) {

		ConsA c1 = new ConsA("Ankit", "Dhondiyal", 20);

		// System.out.println(c1.getFname());

		String fname = c1.getFname();
		System.out.println(fname);

		String ln = c1.getLname();
		System.out.println(ln);

		int ID = c1.getId();
		System.out.println(ID);

	}
}
