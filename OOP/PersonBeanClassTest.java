package in.co.OOP;

public class PersonBeanClassTest {

	public static void main(String[] args) {

		PersonBeanClass pbc = new PersonBeanClass();

		pbc.setName("Ankit");
		pbc.setAddress("Indore");
		pbc.setDATE("01/12/2022");
		pbc.setAge(22);

		String name = pbc.getName();
		System.out.println(name);

		String address = pbc.getAddress();
		System.out.println(address);

		String date = pbc.getDATE();
		System.out.println(date);

		int age = pbc.getAge();
		System.out.println(age);
	}
}
