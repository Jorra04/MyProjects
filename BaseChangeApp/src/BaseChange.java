import java.util.Scanner;
import java.lang.Math;

public class BaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean tf = true;
		String binary = "";
		String hexadecimal = "";
		String base1 = "";
		String base2 = "";
		while(tf) {
			System.out.println("What is the base change conversion you wish to start with?");
			System.out.println("1. Decimal");
			System.out.println("2. Binary");
			System.out.println("3. Hexadecimal");
			int ans1 = input.nextInt();
			if(ans1 ==1) {
				base1 = "Decimal";
			}
			if(ans1 ==2) {
				base1 = "Binary";
			}
			if(ans1 ==3) {
				base1 = "Hexadecimal";
			}
			System.out.println("Okay, what woukd you like to convert to from, " + base1 + " ?");
			System.out.println("1. Decimal");
			System.out.println("2. Binary");
			System.out.println("3. Hexadecimal");
			int ans2 = input.nextInt();
			if(ans2 ==1) {
				base2 = "Decimal";
			}
			if(ans2 ==2) {
				base2 = "Binary";
			}
			if(ans2 ==3) {
				base2 = "Hexadecimal";
			}

			if(base1.contentEquals(base2)) {
				System.out.println("no conversion necessary");
				break;
			}
			else {
				System.out.println("Okay, converting from " + base1+ " to "+ base2+".");
			}

			if(base1.contentEquals("Decimal")&&base2.contentEquals("Binary")) {
				System.out.println("What is the decimal you wish to change to binary?");
				double decimal = input.nextDouble();
				input.nextLine();
				while(decimal >0) {
					if((decimal%2) == 0) {
						binary+= "0";
						decimal -= Math.ceil(decimal/2);
						
					}
					else {
						binary+= "1";
						decimal -= Math.ceil(decimal/2);

					}
					
				}
				System.out.println(binary);
				}
			else if(base1.contentEquals("Decimal")&&base2.contentEquals("Hexadecimal")) {
				System.out.println("What is the decimal you wish to change to Hexadecimal?");
				int rem ;
				int decimal = input.nextInt();
				input.nextLine();
				for(int i = 0; i <= (digitCounter(decimal)+1);i++) {
					rem = decimal%16;
					hexadecimal = toString(rem) + hexadecimal;
					decimal = decimal/16;
				}
				System.out.println(hexadecimal);
			}
			else if(base1.contentEquals("Binary")&&base2.contentEquals("Decimal")) {
				
			}
			else if(base1.contentEquals("Binary")&&base2.contentEquals("Hexadecimal")) {

			}
			else if(base1.contentEquals("Hexadecimal")&&base2.contentEquals("Binary")) {

			}
			else if(base1.contentEquals("Hexadecimal")&&base2.contentEquals("Decimal")) {

			}
			else {
				System.out.println("no");
			}





		}
	}

	public static String toString(int num) {
		String res = "";
		if(num == 0) {
			res = "0";
		}
		if(num == 1) {
			res = "1";
		}
		if(num == 2) {
			res = "2";
		}
		if(num == 3) {
			res = "3";
		}
		if(num == 4) {
			res = "4";
		}
		if(num == 5) {
			res = "5";
		}
		if(num == 6) {
			res = "6";
		}
		if(num == 7) {
			res = "7";
		}
		if(num == 8) {
			res = "8";
		}
		if(num == 9) {
			res = "9";
		}
		if(num == 10) {
			res = "A";
		}
		if(num == 11) {
			res = "B";
		}
		if(num == 12) {
			res = "C";
		}
		if(num == 13) {
			res = "D";
		}
		if(num == 14) {
			res = "E";
		}
		if(num == 15) {
			res = "F";
		}

		return res;
	}
	public static int digitCounter(double number) {
		int count = 0 , num = (int)number;
		
		while(num!=0) {
			num/=10;
			count++;
		}
		return count;
	}

}
