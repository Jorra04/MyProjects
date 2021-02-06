package SwitchStatements;

public class main {

	public static void main(String[] args) {
		int age = 5;
		switch(age) {
			case 18:
				System.out.println("You're 18");
				break;
			case 19:
				System.out.println("You're 19");
				break;
			case 20:
				System.out.println("You're 20");
				break;
			default:
				System.out.println("You're not 18, 19, or 20");
				break;
		}
	}

}
