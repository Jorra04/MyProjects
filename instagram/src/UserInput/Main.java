package UserInput;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		//Get the name.
		String name = input.nextLine();
		System.out.println("Enter your age");
		//Get the age
		int age = input.nextInt();
		//print out Name and Age
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
