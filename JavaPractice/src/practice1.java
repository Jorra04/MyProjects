import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class practice1 {

	public static void main(String[] args) throws InterruptedException{
		boolean tf = true;
		
		int screenSize;
		double price;
		boolean hdr = false;
		String resolution;
		boolean internet;
		int grade = 0;
		int weightedGrade = 0;
		final int screenSizeFactor = 25;
		final int HDRFactor = 10;
		final int priceFactor = 30;
		final int resolutionFactor = 20;
		final int internetFactor = 15;
		
		
		
		Scanner input = new Scanner(System.in); 
		
		while(tf) {
			System.out.println("Welcome to the TV rating app.");
			TimeUnit.MILLISECONDS.sleep(700);
			
			System.out.println("what is the screen size of the television you're inquiring about?");
			
			screenSize = input.nextInt();
			input.nextLine();
			
			//screen size has a factor of 50.
			
			if(screenSize<20) {
				grade = 2;
			}
			if(screenSize > 20 && screenSize <= 43) {
				grade = 4;
			}
			if(screenSize > 43 && screenSize <=50) {
				grade = 6;
			}
			if(screenSize > 50 && screenSize <=60) {
				grade = 9;
			}
			if(screenSize > 60) {
				grade = 7;
			}
			
			weightedGrade += (grade * screenSizeFactor); 
			System.out.println(weightedGrade);
			
			
			TimeUnit.MILLISECONDS.sleep(700);
			System.out.println("What is the resolution of the TV you wish to purchase?");
			System.out.println("1. 8K");
			System.out.println("2. 4K");
			System.out.println("3. 1080p");
			System.out.println("4. 720p");
			
			grade = 0;
			
			resolution = input.nextLine();
			if(resolution.contentEquals("1")) {
				grade = 10;
			}
			if(resolution.contentEquals("2")) {
				grade = 8;
			}
			if(resolution.contentEquals("3")) {
				grade = 5;
			}
			if(resolution.contentEquals("4")) {
				grade = 2;
			}
			weightedGrade+= (grade * resolutionFactor);
			
			System.out.println(weightedGrade);
			
			System.out.println("Does this TV have HDR?");
			grade = 0;
			boolean c = true;
			while(c) {
				String ansHdr = input.nextLine();
				
				if(ansHdr.contentEquals("Y")||ansHdr.contentEquals("y")||ansHdr.contentEquals("yes")||ansHdr.contentEquals("Yes")) {
					c = false;
					hdr = true;
				}
				else if(ansHdr.contentEquals("N")||ansHdr.contentEquals("n")||ansHdr.contentEquals("no")||ansHdr.contentEquals("No")) {
					c = false;
					hdr = false;
				}
				else {
					c = true;
					
				}
			}
			if(hdr == true) {
				grade = 10;
			}
			else {
				grade = 0;
			}
			
			weightedGrade += (grade*HDRFactor);
			
			
			double finalgrade = weightedGrade/4;
			
			
			System.out.println(finalgrade);

			grade = 0;
			boolean b = true;
			while(b) {
				String ansInternet = input.nextLine();
				
				if(ansInternet.contentEquals("Y")||ansInternet.contentEquals("y")||ansInternet.contentEquals("yes")||ansInternet.contentEquals("Yes")) {
					b = false;
					internet = true;
				}
				else if(ansInternet.contentEquals("N")||ansInternet.contentEquals("n")||ansInternet.contentEquals("no")||ansInternet.contentEquals("No")) {
					b = false;
					internet = false;
				}
				else {
					b = true;
					
				}
			}
			
			boolean redo = true;
			while(redo) {
				System.out.println("Would you like to grade another Television?");
				String answer = input.nextLine();
				if(answer.contentEquals("Y")||answer.contentEquals("y")||answer.contentEquals("yes")||answer.contentEquals("Yes")) {
					redo = false;
					tf = true;
				}
				else if(answer.contentEquals("N")||answer.contentEquals("n")||answer.contentEquals("no")||answer.contentEquals("No")) {
					redo = false;
					tf = false;
					
				}
				else {
					redo = true;
				}
			}
			
			
		}
		
	}

}
