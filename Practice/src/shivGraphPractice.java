import java.util.Random;

public class shivGraphPractice {
	public static void main(String[] args) {
		Random rand  = new Random(); 
		for(int i = 0; i < 5; i++) { // can change this value so you can print as many
									// lines as you want.
			int x = rand.nextInt(10); //random number between 0 and 10. 
			/*
			 * if you wanted a double precision number,
			 * use double. i.e.
			 * double x = rand.nextDouble();
			 * but then you cant specify a range.
			 */
			System.out.println(x); //print 
		}
		
	}

}
