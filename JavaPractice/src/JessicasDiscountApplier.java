import java.util.Scanner;

public class JessicasDiscountApplier {

	public static void main(String[] args) {
		Boolean tf  = true;
		Scanner input = new Scanner(System.in);
		while(tf) {
			System.out.println("Enter the price of the item.");
			
			double item = input.nextDouble();
			double itemTax = item*1.13;
			input.nextLine();
			
			System.out.println("Your purchase with tax, before the applied discount would be "+ itemTax);
			
			double finalAmount = itemTax - (0.35*itemTax);
			
			System.out.println("the final amount after applicable 35% discount would be "+ finalAmount);
			
			Boolean redo = true;
			while(redo) {
				System.out.println("would you like to process another transaction? (Y/N)");
				String ans = input.nextLine();
				if(ans.contentEquals("Y")||ans.contentEquals("y")) {
					tf = true;
					redo = false;
				}
				else if(ans.contentEquals("N")||ans.contentEquals("n")){
					tf = false;
					System.out.println("Thank you, goodbye.");
					redo = false;
				}
				else {
					redo = true;
				}
			}
			
			
			
		}
		input.close();
	
		
		
		
	}

}
