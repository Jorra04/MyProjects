import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class leetCodePractice {

	public static void main(String[] args) {
//		System.out.println(firstUniqChar("loveleetcode"));
		int[] nums = { 2,2,2,2,2,2};
		 
		int[][] matrix = {
		                  {1,2,3},
		                  {4,5,6},
		                  {7,8,9}
		};
//		String [] words = {"leetcode", "et", "code"};
		String[] words = {"leetcoder", "leetcode", "od", "hamlet", "am"};
		
//		arrayPrinter(smallerNumbersThanCurrent(nums));
//		System.out.println(frequencySort("hello"));
//		arrayPrinter(sortedSquares(nums));
//		System.out.println(smallestChar("abcd"));
//		System.out.println(findDuplicates(nums));
//		System.out.println(findKthLargest(nums, 4));
//		System.out.println(reverse(5));
//		System.out.println(countPrimes(499979));
//		System.out.println(singleNonDuplicate(nums));
//		System.out.println(majorityElement(nums));
//		System.out.println(missingNumber(nums));
//		System.out.println(findDuplicate(nums));
//		System.out.println(isPerfectSquare(4));
//		System.out.println(reverseString("hello"));
//		System.out.println(kthSmallest(matrix, 9));
		System.out.println(stringMatching(words));
	}
	
	
	public static List<String> stringMatching(String[] words) {
        List<String> returner = new ArrayList<>();
        for( int i = 0; i < words.length; i ++ ){
            for(int j = 0; j < words.length; j ++ ){
                if(words[i].contains(words[j]) && i != j) returner.add(words[j]);
            }
        }
        return returner.stream().distinct().collect(Collectors.toList());
    }
	
	  public static int kthSmallest(int[][] matrix, int k) {
	        List<Integer> myList = new ArrayList<>();
	        for(int i = 0; i < matrix.length; i ++){
	            for(int j = 0; j < matrix[i].length; j ++){
	                int val = matrix[i][j];
	                myList.add(val);
	            }
	        }
	        Collections.sort(myList);
	        System.out.println(myList);
	        return myList.get(k -1 );
	    }
	
	 public static String reverseString(String s){
	        String returner = "";
	        for(int i = s.length() -1 ; i >= 0; i --  ){
	            returner +=s.charAt(i);
	        }
	        
	        return returner;
	    }

	public static boolean isPerfectSquare(int num) {
        for(int i = 0; i <= num/2 ; i ++ ){
            if(i * i == num ) return true;
        }
        
        return false;
    }
	
	public static int findDuplicate(int[] nums) {
		HashMap<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];
			if (myMap.containsKey(val))
				myMap.put(val, myMap.get(val) + 1);

			else
				myMap.put(val, 1);
		}

		for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
			if (entry.getValue() >= 2)
				return entry.getKey();
		}

		return -1;
	}

	public static int missingNumber(int[] nums) {
		if (nums.length == 0)
			return 0;
		List<Integer> myList1 = new ArrayList<>();
		for (int i = 0; i < nums.length + 1; i++) {
			myList1.add(i);
		}
		List<Integer> list2 = new ArrayList<>();
		for (int i : nums) {
			list2.add(i);
		}

		for (int i : myList1) {
			if (!list2.contains(i))
				return i;
		}
		return -1;
	}

	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];
			if (myMap.containsKey(val))
				myMap.put(val, myMap.get(val) + 1);

			else
				myMap.put(val, 1);
		}
		int max = -100000;
		for (int i : myMap.values()) {
			if (i > max)
				max = i;
		}

		for (Entry<Integer, Integer> entry : myMap.entrySet()) {
			if (entry.getValue() == max)
				return entry.getKey();
		}

		return -1;
	}

	public static int singleNonDuplicate(int[] nums) {
		HashMap<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];
			if (myMap.containsKey(val))
				myMap.put(val, myMap.get(val) + 1);

			else
				myMap.put(val, 1);
		}

		for (Entry<Integer, Integer> entry : myMap.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();
		}

		return -1;
	}

	public static int countPrimes(int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (isPrime(i))
				count++;
		}
		return count;
	}

	static boolean isPrime(int x) {
		int count = 0;
		if (x == 1 || x == 0)
			return false;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0)
				count++;

			if (count > 2)
				return false;
		}
		return true;
	}

	public static int reverse(int x) {
		boolean isNeg;
		if (x < 0)
			isNeg = true;
		else
			isNeg = false;

		int temp = x;
		String str = "";
		if (isNeg) {
			temp *= -1;
		}
		while (temp != 0) {
			str += temp % 10;
			temp /= 10;

		}
		if (isNeg)
			return Integer.parseInt("-" + str);
		return Integer.parseInt(str);
	}

	public static int findKthLargest(int[] nums, int k) {
		List<Integer> myList = new ArrayList<>();
		for (int i : nums) {
			myList.add(i);
		}

		Collections.sort(myList);

		return myList.get(myList.size() - k);
	}

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> returner = new ArrayList<>();
		HashMap<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];
			if (myMap.containsKey(val))
				myMap.put(val, myMap.get(val) + 1);

			else
				myMap.put(val, +1);
		}
		for (Entry<Integer, Integer> entry : myMap.entrySet()) {
			if (entry.getValue() == 2) {
				returner.add(entry.getKey());
			}
		}
		return returner;
	}

//	public String sortString(String s) {
//        
//    }
	public static char smallestChar(String s) {
		char min = s.charAt(1);
		for (int i = 0; i < s.length(); i++) {
			char val = s.charAt(i);
			if (val < min)
				min = val;
		}

		return min;
	}

	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> charCount = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (charCount.containsKey(c))
				charCount.put(c, charCount.get(c) + 1);

			else
				charCount.put(c, 1);
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (charCount.get(c) == 1)
				return i;
		}
		return -1;
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] returner = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j] && i != j) {
					returner[i]++;
				}
			}
		}

		return returner;
	}

	public static String frequencySort(String s) {
		HashMap<Character, Integer> myMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (myMap.containsKey(c))
				myMap.put(c, myMap.get(c) + 1);

			else
				myMap.put(c, 1);
		}
		List<Integer> myList = new ArrayList<>();
		for (Integer i : myMap.values()) {
			myList.add(i);
		}
		Collections.sort(myList);

		return "";
	}

	public static int[] sortedSquares(int[] A) {
		List<Integer> myList = new ArrayList<>();
		for (int i : A) {
			myList.add(i * i);
		}

		Collections.sort(myList);

		int[] returner = new int[myList.size()];

		for (int i = 0; i < myList.size(); i++) {
			returner[i] = myList.get(i);
		}

		return returner;
	}

	public static void arrayPrinter(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}
	}

}
