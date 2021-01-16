package CodingQuizzes;

public class Quiz1 {
	public static void main(String[] args) {
		int i = 0;
		for(;;) {
			
			if(i %7 == 0 && i != 0) break;
			
			System.out.println(i);
			
			i+= 3;
		}
	}
}
