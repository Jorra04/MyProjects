package CodingQuizzes;

public class Quiz3 {
	public static void main(String[] args) {
		int num = 15;
		String strRep = (num < 10) ? "Below 10" :
			(num > 10 && num < 20) ? "Between 10 and 20" :
				"Above 20";
		System.out.println(strRep);
	}
}
