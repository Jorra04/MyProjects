package javaClassPractice;

public class Client {
	Account [] accounts;
	static int numberOfAccounts = 0;
	String name;
	Client(String name){
		
	}
	
	void addAccount(Account acc) {
		accounts[numberOfAccounts] = acc;
		numberOfAccounts ++;
	}
}
