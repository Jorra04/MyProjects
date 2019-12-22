import java.util.Scanner;

public class SortingArrayInc {

	public static void main(String[] args) {
		// creation of array that we will be manipulating later.
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements will you have in your array?");
		int arrayElements = input.nextInt();
		int[] newArray = new int[arrayElements];
		int element;
		for(int i =0; i < newArray.length;i++) {
			System.out.println("What will be stored in slot " + (i+1) + " ?");
			element = input.nextInt();
			newArray[i] = element;
			
		}
		System.out.print("{"); 
		for(int j =0; j < newArray.length; j++) {
			if(j == newArray.length -1 ) {
				System.out.print(newArray[j]);
				
			}
			else {
				System.out.print(newArray[j] + ", ");
			}
			
		}
		System.out.println("}");
		
		System.out.println("---------------------");
		/*
		*/
		
		
		
		/*
		 * portion of the code that will manipulate the array 
		 * and sort it in ascending order.
		 */
//		int[] sortedArray = new int[newArray.length];
		for(int k = 0; k < newArray.length; k++) {
		/*
		 * if we were to change the function to sort descending instead of ascending,
		 * we would change the if statement condition.
		 */
			for(int l = (k+1); l < newArray.length; l++) {
				if(newArray[k] > newArray[l]) {
					int temp = newArray[k];
					newArray[k] = newArray[l];
					newArray[l] = temp;
				}
			}
		}
		System.out.print("{"); 
		for(int j =0; j < newArray.length; j++) {
			if(j == newArray.length -1 ) {
				System.out.print(newArray[j]);
				
			}
			else {
				System.out.print(newArray[j] + ", ");
			}
			
		}
		System.out.println("}");
		input.close();
	}

}
