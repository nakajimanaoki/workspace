package code14_04;

public class Main {

	public static void main(String[] args) {
		Bank b = new Bank();

		b.accountNumber = "4649";
		b.balance = 1592;
		System.out.println(b);

	Bank c = new Bank();
	c.accountNumber = " 4649";
	if (b.equals(c)) {
		System.out.println("同じ");
	}else {
		System.out.println("違う");
	}
}
}