package in.co.OOP;

public class ConsBpracTice {

	private String bankName;
	private String accountType;
	private String number;
	private double balance;
	private String address;

	public String getBankName() {
		return bankName;
	}

	public String getAccountType() {
		return accountType;

	}

	public String getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;

	}

	public String getAddress() {
		return address;
	}

	public ConsBpracTice(String bankName, String accountType, String number, double balance, String address) {
		this.bankName = bankName;
		this.accountType = accountType;
		this.number = number;
		this.balance = balance;
		this.address = address;
	}

	public ConsBpracTice() {
		super();
		System.out.println("This is default constructor");
	}

}
