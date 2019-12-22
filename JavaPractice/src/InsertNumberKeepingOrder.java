import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class InsertNumberKeepingOrder {
// interesting using the sleep timer.
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		boolean tf = true;
		while(tf == true) {
			System.out.println("What is the size of your array");
			int size = input.nextInt();
			input.nextLine();
			int value;
			int[] initArr = new int[size];
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
			for(int j = 0; j < initArr.length; j++) {
				for(int i =(j+1); i< initArr.length;i++) {
					if(initArr[j] > initArr[i]) {
						int temp = initArr[j];
						initArr[j] = initArr[i];
						initArr[i] = temp;
					}
				}
			}
			System.out.println("Okay! thank you for your inputs. Give me a second "
					+ "to process these numbers!");
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Thank you so much for waiting! Your organized numbers are as follow...");	
			System.out.print("{");
			for(int i = 0; i < initArr.length;i++) {
				if(i == initArr.length-1) {
					System.out.print(initArr[i]);
				}
				else {
					System.out.print(initArr[i]+", ");
				}		
			}
			System.out.println("}");
			System.out.println("what number would you like to insert into the exisiting array? ");
			int inserted = input.nextInt();
			input.nextLine();	
			int occur = 0;
			for(int i =0; i <initArr.length;i++) {
				if(inserted > initArr[i]) {
					occur++;
				}
			}
			//System.out.println(occur);		
			int[] result = new int[initArr.length+1];
			for(int i = 0; i < occur;i++) {
				result[i] = initArr[i];
			}
			result[occur] = inserted;
			
			for(int i = occur+1;i<result.length;i++) {
				result[i] = initArr[i-1];
			}		
			/*
			 * printing the new array with the added value in the correct position.
			 */
			System.out.println("Alright! we're almost there. Just a few more seconds while i piece together"
					+ "your final array!");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Okay! the modified array is as follows...");
			System.out.print("{");
			for(int i =0; i < result.length; i++) {
				if(i == result.length-1) {
					System.out.print(result[i]);
				}
				else {
					System.out.print(result[i]+ ", ");
				}
				
			}
			System.out.println("}");
			
			TimeUnit.SECONDS.sleep(3);
			System.out.println("Phew, now that we're done with that array, we could totally process"
					+ " an infinite amount more for you! ");
			
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