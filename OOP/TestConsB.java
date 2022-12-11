package in.co.OOP;

public class TestConsB {

	public static void main(String[] args) {

		ConsBpracTice c2 = new ConsBpracTice("SBi", "Saving", "0000", 45555.5, "Bhopal");

		String BN = c2.getBankName();
		System.out.println(BN);

		String AcType = c2.getAccountType();
		System.out.println(AcType);

		String NO = c2.getNumber();
		System.out.println(NO);

		double Balance = c2.getBalance();
		System.out.println(Balance);
		
		String address=c2.getAddress();
		System.out.println(address);
	}
}
