
public class StringManipulation {
	public static String subString1(String str,int start, int end) {
		if(end < start) {
			throw new IllegalArgumentException();
		}
		if(start < 0) {
			throw new IllegalArgumentException();
			
		}
		String returner = "";
		char[] charArr = str.toCharArray();
		for(int i = start; i < end; i++) {
			returner+= charArr[i];
		}
		System.out.println(returner);
		return returner;
	}
	public static char charAt1(String str, int index) {
		char[] charArr = str.toCharArray();
		return charArr[index];
	}
	public static String replaceChars1(String str, char character, char character2) {
		char[] charArr = str.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] == character) {
				charArr[i] = character2;
			}
		}
		String returner = String.copyValueOf(charArr);
		return returner;
	}
	public static String toLowerCase1(String str) {
		char[] charArr = str.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			if(Character.isUpperCase(charArr[i])) {
				charArr[i]+=32;
			}
		}
		String returner = String.copyValueOf(charArr);
		return returner;
	}
	public static String toUpperCase1(String str) {
		char[] charArr = str.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			if(Character.isLowerCase(charArr[i])) {
				charArr[i]-=32;
			}
		}
		return String.copyValueOf(charArr);
	}
}
