package javaClassPractice;

public class ClientTester {

	public static void main(String[] args) {
		Client bill = new Client("Bill");
		Client Steve = new Client("Steve");
		
		Account acc1 = new Account();
		Account acc2 = new Account();
		
		bill.addAccount(acc1);
		Steve.addAccount(acc2);
	}

}
