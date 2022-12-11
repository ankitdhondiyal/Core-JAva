package in.co.OOP;

//Deep cloning uses two classes Customer & Cloneable.

public class Customer implements Cloneable {

	public String name = null;
	public BankAccount account = null;

	public Customer(String n) {
		name = n;
		account = new BankAccount(54000);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (BankAccount) account.clone();
		return c;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Customer c1 = new Customer("ABC");
		Customer c2 = (Customer) c1.clone();

		System.out.println(c2.name);
		System.out.println(c2.account.balance);

		c2.name = ("XYZ");
		c2.account.balance = 65000;

		// Original
		System.out.println(c1.name);
		System.out.println(c1.account.balance);

		// After Cloning
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
	}

}
