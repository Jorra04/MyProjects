import java.util.Hashtable;
import java.util.Scanner;

public class HashtablePractice {

	public static void main(String[] args) {
		boolean tf = true;
		Scanner input = new Scanner(System.in);
		Hashtable<String,String> grades = new Hashtable<String,String>();
		while(tf) {
			System.out.println("What is the key for the table?");
			String key = input.nextLine();
			System.out.println("What is the value for the table?");
			String value = input.nextLine();
			grades.put(key, value);
			
			
			boolean tf2 = true;
			while(tf2) {
				System.out.println("Would you like to add to the list? (Y/N)");
				String ans = input.nextLine();
				
				if(ans.contentEquals("Y")||ans.contentEquals("y")) {
					tf2 = false;
					tf = true;
				}
				else if(ans.contentEquals("N")||ans.contentEquals("n")) {
					tf = false;
					tf2 = false;
				}
				else {
					System.out.println("Not a valid input. Try again.");
					tf2 = true;
				}
			}
			
		}
		
		System.out.println(grades);
		
		input.close();
		
	}

}
