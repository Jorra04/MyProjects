package CommandLineArgs;

public class Main {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Please enter one or more "
					+ "Command Line Arguments");
		}
		else {
			System.out.println("Given arguments are...");
			for(String argument : args) {
				System.out.println(argument);
			}
		}
		
		
	}
}
