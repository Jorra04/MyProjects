import java.util.Arrays;
public class isAnagram {
	public static String isAnagram1(String str1, String str2) {
		/*
		 * first method of testing if two strings are anagrams of each other.
		 */
		if(str1.length() != str2.length()) {
			return str1 + " and " + str2 + " are not anagrams"; 
		}
		str1.strip();
		str2.strip();
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 =  str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
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
		if(str1.length() != str2.length()) {
			return str1 + " and " + str2 + " are not anagrams";
		}
		str1.strip();
		str2.strip(); // removes white space.
		
		int val = 0;
		for(int i = 0; i < str1.length(); i ++) { // find value in ascii code
			val += str1.toLowerCase().charAt(i);
		}
		int val2 = 0;
		for(int i = 0; i < str2.length(); i ++) { // find value in ascii code.
			val2+= str2.toLowerCase().charAt(i); // to make values equal in ascii and not differ by 32.
		}
		System.out.println(val);
		System.out.println(val2);
		if(val == val2 ) { // compare ascii code.
			return str1 + " and " + str2 + " are anagrams";
		}
		return str1 + " and " + str2 + " are not anagrams";
		
	}
	



}