package Loops;

public class Loops {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int index = arr.length - 1;
		do {
			System.out.println(arr[index]);
			index++;
		} while(index < arr.length);

	}

}
