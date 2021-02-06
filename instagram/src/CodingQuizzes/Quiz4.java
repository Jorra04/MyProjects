package CodingQuizzes;
import java.util.*;
public class Quiz4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int loopRuns = input.nextLine().charAt(0);
		String finalValue = "";
		for(int i = 0; i < loopRuns; i ++) {
			finalValue = "Looped " + i + " Times";
		}
		System.out.println(finalValue);
	}
}
