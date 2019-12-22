import java.util.Scanner;

public class GetMultiplesOf2AndIndex {

	public static void main(String[] args) {
		/*
		 * Simply creating the array that will be manipulated later on.
		 */
		Scanner input  = new Scanner(System.in);
		System.out.println("How many items would you like to store?");
		int items = input.nextInt();
		int elem;
		int[] initArray = new int[items];
		for( int i = 0; i < items; i++) {
			System.out.println("What would you like to store in slot numer " + (i+1));
			elem = input.nextInt();
			initArray[i] = elem;
			
		}
		System.out.print("{");
		for( int i = 0; i < items; i++) {
			if(i == (items -1)) {
				System.out.print(initArray[i]);
			}
			else {
				System.out.print(initArray[i]+ ", ");
				
			}
		}
		System.out.println("}");
		int index;
		int occur = 0;
		int[] tempArray = new int[items];
		for(int i = 0; i < initArray.length; i++) {
			if((initArray[i]%2) == 0) {
				index = i;
				occur+=1;
				tempArray[i] = index;
			}
			
		}
		int[] finalArray = new int[occur];
		for(int i = 0; i < finalArray.length; i++) {
		}
		
		input.close();
	}

}
