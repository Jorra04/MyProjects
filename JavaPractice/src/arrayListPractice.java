import java.util.ArrayList;
import java.util.Scanner;

public class arrayListPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		boolean tf = true;
		
		ArrayList<String> str = new ArrayList<>();
		while(tf) {
			System.out.println("Please enter an element.");
			String elem = input.nextLine();
			str.add(elem);
			
			boolean tf2 = true;
			
			while(tf2) {
				System.out.println("Would you like to append another element to the list?");
				String ans = input.nextLine();
				if(ans.contentEquals("Yes")||ans.contentEquals("yes")) {
					tf = true;
					tf2 = false;
				}
				else if(ans.contentEquals("No")||ans.contentEquals("no")) {
					tf = false;
					tf2 = false;
				}
				else {
					System.out.println("Not a valid input. Please try again.");
					tf2 = true;
				}
			}
			
		}
		
		System.out.println("The final result of your list is...");
		System.out.println(str);
		
		 
		
		
		input.close();

	}

}
