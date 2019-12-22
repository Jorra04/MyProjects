import java.util.Scanner;

public class PushIndicies2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements would you like in the array? ");
		int elements = input.nextInt();
		int value;
		int shiftFactor;
		int[] initArray = new int[elements];
		for(int i= 0; i< elements; i++) {
			System.out.println("Enter the value for element number " + (i+1));
			value = input.nextInt();
			initArray[i] = value;
		}
		System.out.println("By what factor would you like to shift elements? ");
		shiftFactor = input.nextInt();
		for(int i = 0; i < shiftFactor; i++) {
			int lastElem = initArray[initArray.length-1];
			for(int j = initArray.length; j > 0;j--) {
				if(j==1) {
					initArray[0] = lastElem;
				}
				else {
					initArray[j-1] = initArray[j-2];
				}
			}
		}
		System.out.print("{");
		for(int i = 0; i < initArray.length; i++) {
			if(i == initArray.length-1) {
				System.out.print(initArray[i]);
			}
			else {
				System.out.print(initArray[i] + ", ");
			}
		}
		System.out.print("}");
	}

}
