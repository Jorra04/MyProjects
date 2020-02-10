import java.util.*;
public class scrabbleVal {

	public static void main(String[] args) {
		Map<Character,Integer> scrabVals = new HashMap<>();
		scrabVals.put('a', 1); scrabVals.put('b', 3); scrabVals.put('c', 3); scrabVals.put('d', 2); scrabVals.put('e', 1); 
		scrabVals.put('f', 4); scrabVals.put('g', 2); scrabVals.put('h', 4); scrabVals.put('i', 1); scrabVals.put('j', 8); 
		scrabVals.put('k', 5); scrabVals.put('l', 1); scrabVals.put('m', 3); scrabVals.put('n', 1); scrabVals.put('o', 1);
		scrabVals.put('p', 3); scrabVals.put('q', 10); scrabVals.put('r', 1); scrabVals.put('s', 1); scrabVals.put('t', 1);
		scrabVals.put('u', 1); scrabVals.put('v', 4); scrabVals.put('w', 4); scrabVals.put('x', 8); scrabVals.put('y', 4);
		scrabVals.put('z', 10); scrabVals.put(' ',0);
		
//		for(int i = 0; i < scrabVals.size(); i++) {
//			System.out.println(scrabVals.get((char)('a'+i)));
//		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string you'd like to decypher.");
		String ans = input.nextLine();
		ans = ans.toLowerCase();
		int sum = 0;
		for(int i =0; i < ans.length() ; i ++) {
			sum+=scrabVals.get(ans.charAt(i));
		}
		
		
		System.out.println(sum);

	}

}
