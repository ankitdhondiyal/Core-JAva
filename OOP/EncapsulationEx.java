package in.co.OOP;

//Bean class- private attributes and public getter/ setter methods

public class EncapsulationEx {

	private String fname;
	private String lname;
	private int id;
	private String address;
	private int number;
	private int Ano;

	public String getFname() {// Getting method -Return type
		return fname;
	}

	public void setFname(String fname) {// Setter method - parameter data.
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;

	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}
}