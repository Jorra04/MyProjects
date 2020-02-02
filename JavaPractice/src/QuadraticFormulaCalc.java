import java.util.Scanner;

public class QuadraticFormulaCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean tf = true;
		while(tf) {
			System.out.println("Enter the values of 'a' 'b' and 'c'. ");
			System.out.println("'a':");
			
			double a = input.nextDouble();
			input.nextLine();
			System.out.println("'b':");
			double b = input.nextDouble();
			input.nextLine();
			System.out.println("'c':");
			double c = input.nextDouble();
			input.nextLine();
			double disc = (Math.pow(b, 2))-(4*a*c);
			if(disc<0) {
				System.out.println("There are no real roots to this equation.");
				System.out.println("would you like to compute another equation? (Y/N)");
				String ans = input.nextLine();
				if(ans.equals("Y")||ans.equals("y")) {
					tf = true;
				}
				else {
					tf = false;
				}
			}
			else if(disc==0){
				double x1 = (-b+(Math.sqrt(disc)))/(2*a);
				double x2 = (-b-(Math.sqrt(disc)))/(2*a);
				System.out.println("there is one real root for this equation...");
				System.out.println(x1+", "+x2);
				System.out.println("would you like to compute another equation? (Y/N)");
				String ans = input.nextLine();
				if(ans.equals("Y")||ans.equals("y")) {
					tf = true;
				}
				else {
					tf = false;
				}
				
			}
			else {
				double x1 = (-b+(Math.sqrt(disc)))/(2*a);
				double x2 = (-b-(Math.sqrt(disc)))/(2*a);
				System.out.println("the intercepts with the values provided are...");
				System.out.println("would you like to compute another equation? (Y/N)");
				System.out.println(x1+", "+x2);
				String ans = input.nextLine();
				if(ans.equals("Y")||ans.equals("y")) {
					tf = true;
				}
				else {
					tf = false;
				}
				
			}
		}
		input.close();
	}

}
