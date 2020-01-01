import java.util.Arrays;
public class isAnagram {
	public static String isAnagram1(String str1, String str2) {
		/*
		 * first method of testing if two strings are anagrams of each other.
		 */
		
		str1.strip();
		str2.strip();
		String str3 = str1.replaceAll("\\s+","");
		String str4 = str2.replaceAll("\\s+","");
		char[] arr1 = str3.toLowerCase().toCharArray();
		char[] arr2 = str4.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
//		System.out.println(arr1);
//		System.out.println(arr2);
		boolean isEqual =  Arrays.equals(arr1, arr2);
		if(isEqual) {
			return str1 + " and " + str2 + " are anagrams";
		}
		return str1 + " and " + str2 + " are not anagrams";
	}
	
	public static String isAnagram2(String str1, String str2) { 
		/*
		 * this is another way to see if two strings are anagrams.
		 */
		str1.strip();
		str2.strip(); // removes trailing white space.
		
		String str3 = str1.replaceAll("\\s+","");
		String str4 = str2.replaceAll("\\s+","");
		
		int val = 0;
		for(int i = 0; i < str3.length(); i ++) { // find value in ASCII code
			val += str3.toLowerCase().charAt(i);
		}
		int val2 = 0;
		for(int i = 0; i < str4.length(); i ++) { // find value in ASCII code.
			val2+= str4.toLowerCase().charAt(i); // to make values equal in ASCII and not differ by 32.
		}
//		System.out.println(val);
//		System.out.println(val2);
		if(val == val2 ) { // compare ASCII code.
			return str1 + " and " + str2 + " are anagrams";
		}
		return str1 + " and " + str2 + " are not anagrams";
		
	}
	



}