import java.lang.Math;
public class practice5 {


	public static void main(String[] args) {
//		System.out.println(sumDigits("5g40g"));
//		System.out.println(sumDigits("5g40g65"));
//		System.out.println(sumDigits("5g40g34"));
		
		System.out.println(middleChar("hello"));
		System.out.println(middleChar("indermohan"));
		System.out.println(middleChar("heck ya"));
		
		System.out.println(alternatingCaps("hello"));
		
		System.out.println(alternatingCaps("hello my name is jorra and i am sitting next to indermohan."));
	
	}
	
	
	public static int sumDigits(String str) {
		int count=0;
		int[] newArr = new int[10];
		char[] toArray = str.toCharArray();
		for(int i = 0; i < toArray.length;i++) {
			if(Character.isDigit(toArray[i])==true) {
				newArr[count] = Character.getNumericValue(toArray[i]);
				count++;
			}
		}
		
		
		
		int sum = sumArray(newArr);
		
		return sum;
	}
	public static int sumArray(int[] a) {
		int sum=0;
		for(int i = 0;i < a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static double averageOf(int[] a) {
		double average =0;
		average = sumArray(a)/a.length;
		return average;
	}
	
	public static char middleChar(String s) {
		int mid = 0;
		char result = ' ';
		if(s.length()>0) {
			if(s.length()%2==0) {
				mid = s.length()/2;
				result = s.charAt(mid);
			}
			else {
				mid = (s.length()/2);
				result = s.charAt(mid);
			}
		}
		else {
			throw new IllegalArgumentException();
		}
		
		return result;
	}
	
	public static String alternatingCaps(String s) {
		char[] charArr = s.toCharArray();
		for(int i = 0; i < charArr.length;i++) {
			if(i%2 != 0) {
				charArr[i] = Character.toUpperCase(charArr[i]);
			}
		}
		String s1 = String.copyValueOf(charArr);
		
		
		return s1;
	}
	
	
	
	
	
}
