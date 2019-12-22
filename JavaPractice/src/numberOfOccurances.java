import java.util.Scanner;

public class numberOfOccurances {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements would you like in the array? ");
		int elements = input.nextInt();
		int value;
		int[] initArray = new int[elements];
		int count = 1;
		
		for(int i= 0; i< elements; i++) {
			System.out.println("Enter the value for element number " + (i+1));
			value = input.nextInt();
			initArray[i] = value;
		}
		if(initArray.length == 1) {
			count = 1;
			System.out.println(initArray[0] + "  " +count);
		}
		else {
			for(int i = 2; i < initArray.length; i++) {
				if(initArray[0] == initArray[i-1]) {
					count++;
				}
			}
			for(int i = count+1; i < initArray.length;i++) {
				int count2 = 1;
				if(initArray[i] == initArray[i-1]) {
					count2++;
					System.out.println( initArray[0]+ " " +count +"   "+ initArray[i] +"   " + count2);
				}
			}
		}
		
		
		input.close();

	}

}
