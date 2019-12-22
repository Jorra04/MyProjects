import java.util.Scanner;

public class FindRepeatingValues {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("What is the size of the array you are creating?");
		int size = input.nextInt();
		int value;
		int[] initArr = new int[size];
		boolean result = false;
		for(int i = 0;i < initArr.length; i++) {
			System.out.println("Enter value number " + (i+1));
			value = input.nextInt();
			initArr[i] = value;
			
		}
		
		for(int i = 0; i< initArr.length; i++) {
			for(int k = (i+1); k < initArr.length; k++) {
				result = result || (initArr[i] == initArr[k]);
			}
		}
		
		System.out.println(result);
		
		input.close();

	}

}
