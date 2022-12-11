package in.co.OOP;

public class ConsA {

	private String fname;
	private String lname;
	private int id;

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;

	}

	public int getId() {
		return id;
	}

	// Parameterized Constructor

	public ConsA(String fname, String lname, int id) {

		this.fname = fname;
		this.lname = lname;
		this.id = id;

	}
	
	//Default Constructor
	
	public ConsA() {
		super();
		System.out.println("This is default constructor");
	}

}
