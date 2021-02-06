package TernaryOperator;

public class main {

	public static void main(String[] args) {
//		//If-else Method. Verbose and unnecessary.
//		int number = 10;
//		boolean greaterThanFive;
//		if(number > 5) {
//			greaterThanFive = true;
//		}
//		else {
//			greaterThanFive = false;
//		}
//		
//		//Ternary Method: quick and easy!
//		int number1 = 4;
//		greaterThanFive = (number1 > 5) ? true : false;
//		
//		System.out.println(greaterThanFive);
		
		
		String myString = new String();
		myString =  (myString == null ) ? 
				("First") : ("Second"); 
		
		System.out.println(myString);

	}

}
