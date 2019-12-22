import java.util.Scanner;

public class PushIndicies {

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
		
		System.out.println("By how many positions would you like to shift the array?");
		shiftFactor = input.nextInt();
		for(int i =0; i < shiftFactor;i++) {
			int lastElem = initArray[initArray.length-1];
			
			for(int x = initArray.length; x>0;x--) {
				if(x ==1) {
					initArray[0] = lastElem;
				}
				else {
					initArray[x-1] = initArray[x-2];
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
		input.close();
		
	}

}
