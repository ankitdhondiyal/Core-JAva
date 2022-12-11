package in.co.OOP;
//Bean class- private attributes and public getter/ setter methods

public class PersonBeanClass {

	private String name;
	private String date;
	private String address;
	private int age;

	// Setter method

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDATE(String date) {
		this.date = date;
	}

	public String getDATE() {
		return date;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;
	}

}