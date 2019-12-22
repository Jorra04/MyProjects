import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class DeleteConsecutiveOccurringElements {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		boolean tf = true;
		while(tf == true) {
			System.out.println("What is the size of your array");
			int size = input.nextInt();
			input.nextLine();
			int value;
			int[] initArr = new int[size];
			/*
			 * Building array.
			 */
			for(int i = 0; i < initArr.length; i++) {
				if(i ==0) {
					System.out.println("Enter the "+ (i+1) +  "st element in the array.");
					value = input.nextInt();
					input.nextLine();
					initArr[i] = value;
					System.out.println("you have entered " + (i+1) + " numbers, you may enter " + (initArr.length -(i+1) + " more."));		
				}
				else if(i ==1) {
					System.out.println("Enter the "+ (i+1) +  "nd element in the array.");
					value = input.nextInt();
					initArr[i] = value;
					input.nextLine();
					System.out.println("you have entered " + (i+1) + " numbers, you may enter " + (initArr.length -(i+1) + " more."));
				}
				else if(i ==2) {
					System.out.println("Enter the "+ (i+1) +  "rd element in the array.");
					value = input.nextInt();
					input.nextLine();
					initArr[i] = value;
					System.out.println("you have entered " + (i+1) + " numbers, you may enter " + (initArr.length -(i+1) + " more."));
				}
				else {
					System.out.println("Enter the "+ (i+1) +  "th element in the array.");
					value = input.nextInt();
					input.nextLine();
					initArr[i] = value;
					System.out.println("you have entered " + (i+1) + " numbers, you may enter " + (initArr.length -(i+1) + " more."));
				}
			}
			TimeUnit.SECONDS.sleep(2);
			System.out.println("I have processed your request. As it stands, this is the array you would like"
					+ " me to manipulate.");
			TimeUnit.SECONDS.sleep(2);
			/*
			 * print out the array that the user entered.
			 * 
			 */
			System.out.print("{");
			for(int i = 0 ; i < initArr.length; i++) {
				if( i == initArr.length -1) {
					System.out.print(initArr[i]);
				}
				else {
					System.out.print(initArr[i]+ ", ");
				}
			}
			System.out.println("}");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Thank you for your patience, it'll just be a little longer until we can "
					+ "complete the task for you.");
			TimeUnit.SECONDS.sleep(2);
			/*
			 * manipulating array for purposes of question..
			 */
			int occur = 0;
			for(int i = initArr.length-1; i > 0 ;i--) {
				if(initArr[i] == initArr[i-1]) {
					initArr[i] = 0;
					occur++;
				}
			}
			int counter = 0;
			int[] result = new int[initArr.length-occur];
			for(int i = 0; i < initArr.length;i++) {
				if(initArr[i] != 0) {
					result[counter] = initArr[i];
					counter++;
				}
			}
			/*
			 * showing the user the final array.  
			 */
			System.out.println("We have successfully removed the consecutive duplicates from your"
					+ " array! you can see the results below!");
			TimeUnit.SECONDS.sleep(2);
			System.out.print("{");
			for(int i = 0; i < result.length;i++) {
				if(i == result.length-1) {
					System.out.print(result[i]);
				}
				else {
					System.out.print(result[i]+ ", ");
				}	
			} 
			System.out.println("}");	
			/*
			 * check to see if user wants to run the program once again.
			 */
			boolean tf2 = true;
			while(tf2 == true) {
				System.out.println("would you like to continue? (Yes/No)");
				String ans = input.nextLine();
				if((ans.equals("Yes") || (ans.equals("yes")))){
					tf = true;
					tf2 = false;
				}
				else if((ans.equals("No") || (ans.equals("no")))){
					tf = false;
					tf2 = false;
					System.out.println("Alright, thank you for using my brain power! \nGoodbye.");
				}
				else {
					System.out.println("Invalid token. Please try again.");
					tf2 = true;
				}
			}		
		}		
		input.close();
	}
}