import java.util.*;

public class practice2 {

	public static void main(String[] args) {
		int[] tester = { 3, 3 };
		int[] tester2 = { 3, 1 };
		int[] tester3 = { 1, 2, 3, 4 };
		int[] tester4 = { 1, 1 };
		int[] tester5 = { 1, 0, 1, 1, 0, 1 };
		int[] tester6 = { 1, 0, 1, 1, 0, 1, 1, 0 ,1,1,1 };
		int[] tester7 = { 1, 0,1,1,1,0,1,1 };
		int[] tester8 = { 1, 0,1,1,1,0,1,1,1,1,1,1 };
		int[] tester9 = { 0,0,0,0,0,1,0,1 };
		String tester10 = "1.1.1.1";
		String tester11 = "255.100.50.0";
		int[] tester12 = { 1,2,3,4 };
		int[] tester13 = { 1,2,3,4 , 1 };
		int[] tester14 = { 10, 6, 2, 0 };
		int[] tester15 = {1,1,1,1 };
		String test1 = "";
		String test2 = "loveleetcode";
		String num1 = "5100";
		String num2 = "5100";
		String brack = "()))((";
		int a = 1200;
		
//		System.out.println(tester11.replaceAll("\\.", "[.]"));

//		System.out.println(containsDuplicate(tester));
//		System.out.println(containsDuplicate(tester2));
//		System.out.println(containsDuplicate(tester3));
//		System.out.println(findDisappearedNumbers(tester4));
//		System.out.println(findMaxConsecutiveOnes(tester5));
//		System.out.println(findMaxConsecutiveOnes(tester9));
//		System.out.println(findMaxConsecutiveOnes(tester7));
//		System.out.println(defangIPaddr(tester10));
//		System.out.println(defangIPaddr(tester11));
//		System.out.println(isMonotonic(tester12));
//		System.out.println(isMonotonic(tester13));
//		System.out.println(isMonotonic(tester14));
//		System.out.println(isMonotonic(tester15));
//		System.out.println(detectCapitalUse(test1));
//		System.out.println(firstUniqChar(test2));
//		System.out.println(addStrings(num1,num2));
//		System.out.println(minAddToMakeValid(brack));
		System.out.println(reverse(a));
	}

	public static boolean containsDuplicate(int[] nums) {
		List<Integer> myList = new ArrayList<>(nums.length);
		for (int i : nums) {
			myList.add(i);
		}

		Set<Integer> mySet = new HashSet<>(myList);
		

		if (mySet.containsAll(myList) && mySet.size() == myList.size()) {

			return false;
		}
		return true;
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> myList = new ArrayList<>(nums.length);
		List<Integer> finalList = new ArrayList<>();
		for (int i : nums) {
			myList.add(i);
		}
		for (int i = 1; i <= nums.length; i++) {
			if (!myList.contains(i)) {
				finalList.add(i);
			}
		}
		return finalList;
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		 List<Integer> listChecker = new ArrayList<>();
		 int count = 0;
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] == 1){
	                count++;
	            }
	            else{
	            	listChecker.add(count);
	                count =0;
	            }
	            
	        }
	        if(nums[nums.length -1] == 1) {
	        	listChecker.add(count);
	        }
	        Collections.sort(listChecker);
	        Collections.reverse(listChecker);
	        
	        return listChecker.get(0);
	        
	    }
	public static String defangIPaddr(String address) {
		String returner = address.replaceAll("\\.", "[.]");
		return returner;
		
    }
	public static boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        
        
        for( int i = 0; i <A.length-1; i ++) {
        	increasing = A[i] <= A[i+1] &&increasing;
        }
        if(increasing) {
        	return true;
        }
        for(int i = 0; i < A.length -1; i++) {
        	decreasing = A[i] >= A[i+1] &&decreasing;
        }
        return increasing || decreasing;
        
        
        
    }
	public static boolean detectCapitalUse(String word) {
		String tf = word.toLowerCase();
        String proper1 = tf.toUpperCase();
        String proper2 =  Character.toUpperCase(tf.charAt(0))+ tf.substring(1);
        
        return word.equals(proper1) || word.equals(proper2) || word.equals(tf);
    }
	 public static int firstUniqChar(String s) {
	        List<Character> myList = new ArrayList<>();
	        for(int i =0; i < s.length(); i++){
	            myList.add(s.charAt(i));
	        }
	        Set<Character> mySet = new HashSet<>(myList);
	        List<Character> finalList = new ArrayList<>(mySet);
	        
	        return finalList.indexOf(finalList.get(0));
	    }
	 public static String addStrings(String num1, String num2) {
	        int number1 = Integer.parseInt(num1);
	        int number2 = Integer.parseInt(num2);
	        int result = number1+number2;
	        return String.valueOf(result);
	    }
	 public static int minAddToMakeValid(String S) {
	        int leftBrack = 0;
	        int rightBrack = 0;
	        for(int i = 0; i < S.length(); i ++){
	            if(S.charAt(i) == '('){
	                leftBrack++;
	            }
	            else{
	                rightBrack++;
	            }
	        }
	        return Math.abs(leftBrack - rightBrack);
	    }
	 public static int reverse(int x) {
	        String returner = "";
	        int finalNum = 0;
	        if(x%10 == 0){
	            String res = Integer.toString(x);
	            String res2 = res.substring(0,res.length()-1);
	            returner = func(res2);
	            finalNum = Integer.parseInt(returner);
	            
	        }
	        else if(x < 0){
	            String res = Integer.toString(x);
	            String res2 = res.substring(1);
	            returner = res.charAt(0) + func(res2);
	            finalNum = Integer.parseInt(returner);
	        }
	        else{
	            String res = Integer.toString(x);
	            returner = func(res);
	            finalNum = Integer.parseInt(returner);
	            
	            
	        }
	        return finalNum;
	    }
	    public static String func(String x){
	        char [] charArr = x.toCharArray();
	        List<Character> myList = new ArrayList<>(charArr.length);
	        for(char character: charArr){
	            myList.add(character);
	        }
	        Collections.reverse(myList);
	        String returner = "";
	        for(int i = 0; i < myList.size(); i++){
	            returner+=myList.get(i);
	        }
	        return returner;
	    }

}
