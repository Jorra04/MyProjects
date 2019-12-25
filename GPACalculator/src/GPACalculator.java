import java.text.DecimalFormat;
import java.util.*;

public class GPACalculator {
	private static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		boolean condition1 = true;
		List<List<String>> transcript = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the GPA calculator.");
		int counter = 1;
		while (condition1) {
			System.out.println("Please enter the grade achieved in class " + (counter) + ".");
			List<String> gpa = new ArrayList<>();
			String ans1 = input.nextLine().toUpperCase();
			gpa.add(ans1);
			System.out.println("Please enter the credit wieght.");
			String ans2 = input.nextLine();
			gpa.add(ans2);
			transcript.add(gpa);
			condition1 = false;

			boolean condition2 = true;
			System.out.println("is there another class you would like to add?");

			while (condition2) {
				String cond = input.nextLine();
				if (cond.equals("y") || cond.equals("Y") || cond.equals("yes") || cond.equals("Yes")) {
					condition2 = false;
					condition1 = true;
					counter++;
				} else if (cond.equals("n") || cond.equals("N") || cond.equals("no") || cond.equals("No")) {
					System.out.println("Here is the final output.");
					System.out.println(transcript.toString());
					System.out.println(gpaCalc(transcript));
					condition2 = false;
					condition1 = false;
				}
				else {
					System.out.println("That is an invalid entry. Try again.");
					condition2 = true;
				}
			}
		}
		input.close();
	}

	public static String gpaCalc(List<List<String>> myList) {
		if(myList.size() == 0) {
			throw new IllegalArgumentException();
		}
		double cumulative = 0;
		double totalDiv = 0;
		for (int i = 0; i < myList.size(); i++) {
			cumulative +=(GradeValue(myList.get(i).get(0)) * Integer.parseInt(myList.get(i).get(1)));
			totalDiv += Integer.parseInt(myList.get(i).get(1));
			
		}
		return df.format((cumulative/totalDiv));
	}

	public static int GradeValue(String stringRep) {
		if (stringRep.equals("A+") || stringRep.equals("9")|| stringRep.equals("9.0")) {
			return 9;
		} else if (stringRep.equals("A")|| stringRep.equals("8")|| stringRep.equals("8.0")) {
			return 8;
		} else if (stringRep.equals("B+")|| stringRep.equals("7")|| stringRep.equals("7.0")) {
			return 7;
		} else if (stringRep.equals("B")|| stringRep.equals("6")|| stringRep.equals("6.0")) {
			return 6;
		} else if (stringRep.equals("C+")|| stringRep.equals("5")|| stringRep.equals("5.0")) {
			return 5;
		} else if (stringRep.equals("C")|| stringRep.equals("4")|| stringRep.equals("4.0")) {
			return 4;
		} else if (stringRep.equals("D+")|| stringRep.equals("3")|| stringRep.equals("3.0")) {
			return 3;
		} else if (stringRep.equals("D")|| stringRep.equals("2")|| stringRep.equals("2.0")) {
			return 2;
		} else if (stringRep.equals("E")|| stringRep.equals("1")|| stringRep.equals("1.0")) {
			return 1;
		} else if (stringRep.equals("F")|| stringRep.equals("0")|| stringRep.equals("0.0")) {
			return 0;
		}
		return 0;

	}

}
