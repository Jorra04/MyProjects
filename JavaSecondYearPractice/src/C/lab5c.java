package C;

public class lab5c {

	public static void main(String[] args) {
		String s1 = "abababababababababababab";
		System.out.println(lab5a(s1,1));
//		System.out.println((int)'a');
//		System.out.println((int)'b');

	}
	
	public static boolean lab5a(String s, int j) {
		boolean tf;
		int count = 1;
		for(int i =1; i < s.length(); i++) {
			System.out.println((int)s.charAt(i));
			System.out.println((int)s.charAt(i-1));
			if((int)s.charAt(i) == (s.charAt(i-1)+1) || (int)s.charAt(i) == (s.charAt(i-1)-31)  
					||(int)s.charAt(i) == (s.charAt(i-1)+33)) {
				count++;
				if(count == j) {
					return true;
				}
			}
			else {
				count = 1;
			}
		}
		return false;
	}

}
