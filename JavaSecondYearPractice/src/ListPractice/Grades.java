package ListPractice;
import java.util.*;

public class Grades {
	public static void main(String[] args) {
		Map<String, List<String>> transcript = new HashMap<>();
		List<String> grades = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		boolean tf = true;
		
		
		
		while(tf) {
			System.out.println("Please enter the student's name.");
			String name = input.nextLine();
			System.out.println("How many courses is the student currently taking?");
			int numCourses = input.nextInt();
			input.nextLine();
			
			for(int i = 0; i < numCourses; i++) {
				System.out.println("Enter the Grade for course number " + (i+1)+".");
				String grade = input.nextLine();
				grades.add(grade.toUpperCase());
			}
			transcript.put(name, grades);

			System.out.println(transcript.toString() + "\n");
			
			boolean tf2 = true;
			while(tf2) {
				System.out.println("Would you like to enter another person? (Y/N)");
				String ans1 = input.nextLine();
				if(ans1.equals("y") || ans1.equals("Y")) {
					tf = true;
					tf2 = false;
				}
				else if(ans1.equals("n") || ans1.equals("N")) {
					
					System.out.println("Have a nice day");
					tf = false;
					tf2 = false;
				}
				else {
					System.out.println("Invalid entry.");
					tf2 = true;
				}
			}
		}
		
		
		
		
		
		input.close();
	}
	

	
	
}
