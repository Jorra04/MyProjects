import java.util.Scanner;

public class FindAndDeletingRepeatingValues {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("What is the size of the array you are creating?");
		int size = input.nextInt();
		int value;
		int[] initArr = new int[size];
		for(int i = 0;i < initArr.length; i++) {
			System.out.println("Enter value number " + (i+1));
			value = input.nextInt();
			initArr[i] = value;
			
		}
		
		for(int i = 0; i< initArr.length; i++) {
			for(int k = (i+1); k < initArr.length; k++) {
				if(initArr[i] == initArr[k]) {
					initArr[k] = 0;
					/*
					 * initArr[i] = 0;
					 * would include if the question asked to pop both values.
					 */
				}
			}
		}
		for(int i = 0; i< initArr.length;i++) {
			System.out.println(initArr[i]);
		}
		
		input.close();

	}

}
