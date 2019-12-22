import java.util.Scanner;

public class PracticeFromQuiz2 {

	public static void main(String[] args) {
		int[] ns = {3, 7, 5, 13};
		boolean someEven = false;
		for(int i = 0; i < ns.length || !someEven; i ++) {
		  someEven = someEven || (ns[i] % 2 == 0);
		}
		System.out.println("Some numbers are even numbers: " + someEven);


	}
}

