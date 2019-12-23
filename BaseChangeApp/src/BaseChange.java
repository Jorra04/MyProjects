import java.util.Scanner;

public class BaseChange {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		boolean tf = true;
		String Hex1 = "h";
		String bin = "b";
		String ans1 = "";
		String result;
		while(tf) {
			System.out.println("What is the base we are starting with today?");
			String ans = in.nextLine();
			if(ans.equals(Hex1) || ans.equals(Hex1.toUpperCase())) {
				result = transfer1(ans);
				 
				ans1 = in.nextLine();
			}
			else if(ans.equals(bin) || ans.equals(bin.toUpperCase())) {
				result = transfer2(ans);
				ans1 = in.nextLine();
			}
			else {
				System.out.println("Invalid input please try again");
				
			}
		}

	}
	
	public static String transfer1(String hex) {
		String result = "";
		for(int i = 0; i < hex.length(); i++) {
			result += 
		}
	}
	public static String transfer2(String bin) {
		for(int i = 0; i < bin.length(); i++) {
			
		}
	}
	public String toHex(int bin){
		if(bin == 0) {
			return "0";
		}
		if(bin == 1) {
			return "1";
		}
		if(bin == 2) {
			return "2";
		}
		if(bin == 3) {
			return "3";
		}
		if(bin == 4) {
			return "4";
		}
		if(bin == 5) {
			return "5";
		}
		if(bin == 6) {
			return "6";
		}
		if(bin == 7) {
			return "7";
		}
		if(bin == 8) {
			return "8";
		}
		if(bin == 8) {
			return "8";
		}
		if(bin == 9) {
			return "9";
		}
		if(bin == 10) {
			return "A";
		}
		if(bin == 11) {
			return "B";
		}
		if(bin == 12) {
			return "C";
		}
		if(bin == 13) {
			return "D";
		}
		if(bin == 14) {
			return "E";
		}
		if(bin == 15) {
			return "F";
		}
		else {
			return "NaN";
		}
	}
	public static int toDecFromHex(String hex) {
		int res = 0;
		for(int i = 0; i < hex.length(); i ++) {
			res += hex.charAt(i)
		}
	}

}
