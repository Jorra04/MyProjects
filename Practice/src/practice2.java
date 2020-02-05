import java.util.*;

public class practice2 {

	public static void main(String[] args) {
		int[] tester = { 3, 3 };
		int[] tester2 = { 3, 1 };
		int[] tester3 = { 1, 2, 3, 4 };
		int[] tester4 = { 1, 1 };
		int[] tester5 = { 1, 0, 1, 1, 0, 1 };
		int[] tester6 = { 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1 };
		int[] tester7 = { 1, 0, 1, 1, 1, 0, 1, 1 };
		int[] tester8 = { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 };
		int[] tester9 = { 0, 0, 0, 0, 0, 1, 0, 1 };
		String tester10 = "1.1.1.1";
		String tester11 = "255.100.50.0";
		int[] tester12 = { 1, 2, 3, 4 };
		int[] tester13 = { 1, 2, 3, 4, 1 };
		int[] tester14 = { 10, 6, 2, 0 };
		int[] tester15 = { 3, 1, 2, 4 };
		String test1 = "";
		String test2 = "loveleetcode";
		String num1 = "5100";
		String num2 = "5100";
		String brack = "()))((";
		int a = 15;
		String str1 = "apple apple";
		String str2 = "bannana";
		Integer[] myArr = { 1, 3, 5, 2 };
		List<Integer> myList = Arrays.asList(myArr);
		String h = "aA";
		String s2 = h.substring(0, 1);
		String h3 = "jorra jorra";
		int[] a1 = { 1, 3, 5 };
		String moves = "rlrlrlrl";
		String j = "AB";
		String s = "AAABCCS";
		int[] arr1 = { 1, 2, 2, 1, 1, 3 };
		List<String> words2 = Arrays.asList(num2.split(" "));
		int [] myarr = {-4,-3,-2,-1,60};
		int p41 = 1;
		int p42 = 1296;
		int p43 = 256;
		int p44 = 160000;
		int p45 = 20736;
		String word = "jorra     needs  to work on coding  ";

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
//		System.out.println(reverse(a));
//		System.out.println(baseNeg2(a));
//		System.out.println(sortArrayByParity(tester15));
//		System.out.println(fizzBuzz(a));
//		System.out.println(getNoZeroIntegers(a));
//		System.out.println(addStrings(str1,str2));
//		System.out.println(twoSum(myArr,4));
//		System.out.println(reverseVowels(h));
//		System.out.println(firstUniqChar(h3));
//		System.out.println(searchInsert(a1, 4));
//		System.out.println(numJewelsInStones(j,s));
//		System.out.println(judgeCircle(moves));
//		System.out.println(uniqueOccurrences(arr1));
//		System.out.println(uncommonFromSentences(str1, str2));
//		System.out.println(selfDividingNumbers(1,22));
//		System.out.println(1%0 ==0);
//		System.out.println(twoSum(myarr,5));
//		System.out.println(maximumProduct(myarr));
//		System.out.println(isPowerOfFour(p42));
		System.out.println(reverseWords(word));

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
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				listChecker.add(count);
				count = 0;
			}

		}
		if (nums[nums.length - 1] == 1) {
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

		for (int i = 0; i < A.length - 1; i++) {
			increasing = A[i] <= A[i + 1] && increasing;
		}
		if (increasing) {
			return true;
		}
		for (int i = 0; i < A.length - 1; i++) {
			decreasing = A[i] >= A[i + 1] && decreasing;
		}
		return increasing || decreasing;

	}

	public static boolean detectCapitalUse(String word) {
		String tf = word.toLowerCase();
		String proper1 = tf.toUpperCase();
		String proper2 = Character.toUpperCase(tf.charAt(0)) + tf.substring(1);

		return word.equals(proper1) || word.equals(proper2) || word.equals(tf);
	}

//	 public static int firstUniqChar(String s) {
//	        List<Character> myList = new ArrayList<>();
//	        for(int i =0; i < s.length(); i++){
//	            myList.add(s.charAt(i));
//	        }
//	        Set<Character> mySet = new HashSet<>(myList);
//	        List<Character> finalList = new ArrayList<>(mySet);
//	        
//	        return finalList.indexOf(finalList.get(0));
//	    }
//	 public static String addStrings(String num1, String num2) {
//	        int number1 = Integer.parseInt(num1);
//	        int number2 = Integer.parseInt(num2);
//	        int result = number1+number2;
//	        return String.valueOf(result);
//	    }
	public static int minAddToMakeValid(String S) {
		int leftBrack = 0;
		int rightBrack = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				leftBrack++;
			} else {
				rightBrack++;
			}
		}
		return Math.abs(leftBrack - rightBrack);
	}

	public static int reverse(int x) {
		String returner = "";
		int finalNum = 0;
		if (x % 10 == 0) {
			String res = Integer.toString(x);
			String res2 = res.substring(0, res.length() - 1);
			returner = func(res2);
			finalNum = Integer.parseInt(returner);

		} else if (x < 0) {
			String res = Integer.toString(x);
			String res2 = res.substring(1);
			returner = res.charAt(0) + func(res2);
			finalNum = Integer.parseInt(returner);
		} else {
			String res = Integer.toString(x);
			returner = func(res);
			finalNum = Integer.parseInt(returner);

		}
		return finalNum;
	}

	public static String func(String x) {
		char[] charArr = x.toCharArray();
		List<Character> myList = new ArrayList<>(charArr.length);
		for (char character : charArr) {
			myList.add(character);
		}
		Collections.reverse(myList);
		String returner = "";
		for (int i = 0; i < myList.size(); i++) {
			returner += myList.get(i);
		}
		return returner;
	}

	public static String baseNeg2(int N) {
		String prac = Integer.toString(N);
		int sum = 0;
		List<Character> myList = new ArrayList<>(prac.length());
		for (int i = 0; i < prac.length(); i++) {
			myList.add(prac.charAt(i));
		}
		for (int i = 0; i < myList.size(); i++) {
			sum += Math.pow(myList.get(i), myList.size() - i - 1);
		}
		String returner = Integer.toString(sum);

		return returner;
	}

	public static int[] sortArrayByParity(int[] A) {
		int count = 0;
		List<Integer> evens = new ArrayList<>();
		List<Integer> odds = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				evens.add(A[i]);
			} else {
				odds.add(A[i]);
			}
		}
		int[] myArr = new int[evens.size() + odds.size()];
		for (int i = 0; i < (odds.size() + evens.size()); i++) {
			if (i < evens.size()) {
				myArr[i] = evens.get(i);
			} else {
				myArr[i] = odds.get(count);
				count++;
			}
		}
		return myArr;

	}

	public static List<String> fizzBuzz(int n) {
		List<String> myList = new ArrayList<>();
		int count = 1;
		while (count <= n) {
			if (count % 3 == 0 && count % 5 == 0) {
				myList.add("FizzBuzz");
			} else if (count % 3 == 0) {
				myList.add("Fizz");
			} else if (count % 5 == 0) {
				myList.add("Buzz");
			} else {
				myList.add("" + count);
			}
			count++;
		}

		return myList;
	}

	public static int[] getNoZeroIntegers(int n) {
		int[] myArr = new int[2];
//	        outerloop:
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i + j == n) {
					myArr[0] = i;
					myArr[1] = j;
//	                    break outerloop;
				}
			}
		}
		return myArr;
	}

	public static String addStrings(String num1, String num2) {
		char[] arr1 = num1.toCharArray();
		char[] arr2 = num2.toCharArray();
		int sum1 = 0;
		int sum2 = 0;
		int totsum = 0;
		for (int i = 0; i < arr1.length; i++) {
			double adder = Character.getNumericValue(arr1[i]) * Math.pow(10, (arr1.length - i - 1));
			sum1 += adder;
		}
		for (int i = 0; i < arr2.length; i++) {
			double adder = Character.getNumericValue(arr2[i]) * Math.pow(10, (arr2.length - i - 1));
			sum2 += adder;
		}
		totsum = sum1 + sum2;
		return Integer.toString(totsum);

	}

//	public static int[] twoSum(int[] arr, int val) {
//		int i = 0;
//		int j = arr.length - 1;
//		int[] myArr = new int[2];
//		outerloop: while (i < j) {
//			if (arr[i] + arr[j] == val) {
//				myArr[0] = i;
//				myArr[1] = j;
//				break outerloop;
//			}
//			i++;
//			j--;
//		}
//		System.out.println(i + " " + j);
//		return myArr;
//	}

	public static String reverseVowels(String s) {
		char[] string = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		char temp;
		while (i < j) {
			if (isVowel(string[i]) && isVowel(string[j])) {
				temp = string[i];
				string[i] = string[j];
				string[j] = temp;
				j--;
				i++;
			} else if (!isVowel(string[i])) {
				i++;
			} else if (!isVowel(string[j])) {
				j--;
			}
		}

		return String.valueOf(string);

	}

	public static boolean isVowel(char c) {
		char checker = Character.toLowerCase(c);

		return checker == 'a' || checker == 'e' || checker == 'i' || checker == 'o' || checker == 'u';
	}

	public static int firstUniqChar(String s) {
		if (s.length() == 1) {
			return 0;
		}
		int indexer = -1;
		String S = s.replaceAll(" ", "");
		for (int i = 1; i < s.length(); i++) {
			String s1 = S.substring(i);
			String s2 = S.substring(i - 1, i);
			if (!s1.contains(s2)) {
				return i - 1;
			}
		}
		return indexer;
	}

	public static int searchInsert(int[] nums, int target) {
		int i = 0;
		int counter = 0;
		while (counter != nums.length) {
			if (target > nums[i]) {
				i++;
			}
			counter++;

		}

		return i;
	}

	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		for (int i = 0; i < J.length(); i++) {
			for (int j = 0; j < S.length(); j++) {
				if (J.charAt(i) == S.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}

	public static boolean judgeCircle(String moves) {
		int Xdistance = 0;
		int Ydistance = 0;
		for (int i = 0; i < moves.length(); i++) {
			if (Character.toLowerCase(moves.charAt(i)) == 'u') {
				Ydistance++;
			} else if (Character.toLowerCase(moves.charAt(i)) == 'd') {
				Ydistance--;
			} else if (Character.toLowerCase(moves.charAt(i)) == 'l') {
				Xdistance++;
			} else if (Character.toLowerCase(moves.charAt(i)) == 'r') {
				Xdistance--;
			}

		}
		return (Xdistance == 0 && Ydistance == 0);
	}

	public static boolean uniqueOccurrences(int[] arr) {
		int[] myArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
				// System.out.println(count);
				myArr[i] = count;
			}
		}
		boolean res = true;
		for (int i = 1; i < myArr.length; i++) {
			res = res && (myArr[i] != myArr[i - 1]);
		}
		return res;
	}

	public static Set<String> uncommonFromSentences(String A, String B) {
		List<String> words1 = Arrays.asList(A.split(" "));
		List<String> words2 = Arrays.asList(B.split(" "));
        Set<String> set1 = new HashSet<>(words1);
        Set<String> set2 = new HashSet<>(words2);
        Set<String> set1c = new HashSet<>(words1);
        Set<String> set2c = new HashSet<>(words2);
        Set<String> finalSet = new HashSet<>();
        set1.removeAll(set2c);
        set2.removeAll(set1c);
        finalSet.addAll(set1);
        finalSet.addAll(set2);
        
        // System.out.println(set2);
        // System.out.println(set1);
        // System.out.println(finalSet);
        String [] returner = new String[finalSet.size()];
//        return finalSet.toArray(returner);
        return finalSet;

	}
	 public static int[] twoSum(int[] nums, int target) {
	        int[] index = new int[2];
	        for(int i = 0; i < nums.length; i ++){
	            for(int j =1; j < nums.length && (i!=j); j++){
	                if(nums[i] + nums[j] == target){
	                    index[0] = i;
	                    index[1] = j;
	                }
	            }
	        }
	        System.out.println(index[0] + " " + index[1]);
	        return index;
	    }
	 public static int maximumProduct(int[] nums) {
	        List<Integer> list = new ArrayList<>();
	        for(int i:nums){
	            list.add(Math.abs(i));
	        }
	        Collections.sort(list);
	        Collections.reverse(list);
	        int prod = 1;
	        for(int i = 0; i < 3; i ++){
	            prod*=list.get(i);
	        }
	        return prod;
	    }
	 public static boolean isPowerOfFour(int num) {
	        if(num == 1){
	            return true;
	        }
	        if(num % 4 !=0 || num ==0 ){
	            return false;
	        }
	        return isPowerOfFour(num/4);
	    }
	 public static String reverseWords(String s) {
		 String s1 = s.trim().replaceAll(" +", " ");
	        List<String> myString = Arrays.asList(s1.split(" "));
	        
	        Collections.reverse(myString);
	        String returner = "";
	        for(int i = 0; i < myString.size(); i ++){
	            if(i != myString.size() -1){
	                returner+= myString.get(i) + " ";
	            }
	            else{
	                returner+= myString.get(i);
	            }
	            
	        }
	        
	        return returner ;
	    }
	

}
