package in.co.OOP;

public class EncapulationExTest {

	public static void main(String[] args) {

		EncapsulationEx en = new EncapsulationEx();

		en.setFname("Ankit");
		en.setLname("Dhondiyal");
		en.setId(22);
		en.setAddress("Sehore");
		en.setNumber(9685);
		
		String fname = en.getFname();
		System.out.println(fname);

		String lname = en.getLname();
		System.out.println(lname);

		int id = en.getId();
		System.out.println(id);

		String address = en.getAddress();
		System.out.println(address);
		
		System.out.println(en.getNumber());
	}

}
