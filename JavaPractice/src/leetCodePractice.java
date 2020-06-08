import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class leetCodePractice {

	public static void main(String[] args) {
//		System.out.println(firstUniqChar("loveleetcode"));
		int[] nums = {1,2,1,3,5,6,4};
		 
		int[][] matrix = {
		                  {1,2,3},
		                  {4,5,6},
		                  {7,8,9}
		};
//		String [] words = {"leetcode", "et", "code"};
		String[] words = {"leetcoder", "leetcode", "od", "hamlet", "am"};
		int [] digits = {9,8,7,6,5,4,3,2,1,0};
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
//		System.out.println(stringMatching(words));
//		arrayPrinter(plusOne(digits));
//		System.out.println(containsNearbyDuplicate(nums, 2));
//		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
//		System.out.println(uniqueOccurrences(arr));
//		System.out.println(selfDividingNumbers(1, 22));
//		moveZeroes(nums);
//		arrayPrinter(nums);
//		arrayPrinter(getNoZeroIntegers(11));
//		System.out.println(backspace("s#acb##h"));
		
//		System.out.println(convertToBase7(-7));
		
//		int[] p1 = {0,1};
//		int [] p2 = {1,0};
//		int[] p3 = {0,0};
//		int[] p4 = {1,1};
//		System.out.println(validSquare(p1, p2, p3, p4));
		
//		System.out.println(findPairs(nums, 2));
//		System.out.println(isPalindrome(101));
//		int[] arr = {-2,0,10,-19,4,6,-8};
//		System.out.println(checkIfExist(arr));
		
//		System.out.println(majorityElement(nums));
		
//		System.out.println(removeElement(nums, 2));
//		moveZeroes(nums);
//		arrayPrinter(nums);
		
//		System.out.println(checkRecord("PPALLL"));
//		int[] flowerbed = {1,0,0,0,1};
//		System.out.println(canPlaceFlowers(flowerbed, 2));
//		System.out.println(checkPossibility(nums));
//		System.out.println(findPeakElement(nums));
//		System.out.println(trailingZeroes(13));
		int[] arr = {1,2,3,4,5,6,7};
//		arrayPrinter(productArray(arr));
//		System.out.println(2%5);
		arrayPrinter(rotateArr(arr, 2));
	}
	
	public static int[] rotateArr(int[] arr, int d ) {
		int[] returner = new int[arr.length];
		for(int i =0; i < arr.length; i ++) {
			returner[(i +d) %arr.length] = arr[i];
		}
		return returner;
	}
	
	
	public static int[] productArray(int[] arr ){
        int[] returner = new int[arr.length];
        int counter = 0;
        for(int i =0; i < arr.length; i ++ ){
            int runSum = 1;
            for(int j = 0; j < arr.length; j ++ ){
                if(i != j ) runSum *= arr[j];
            }
            System.out.println(runSum);
            returner[counter++] = runSum; 
        }

        return returner;
    }
	
	 public static int trailingZeroes(int n) {
		 long val =1;
	        for(int i = 1; i <= n; i ++ ){
	            val *=i;
	        }
	        int count =0;
	        while(val > 0 ){
	            if(val % 10 != 0) break;
	            
	            count ++;
	            val/=10;
	        }
	        return count;
	    }
	
	 public static boolean isPowerOfFour(int num) {
	        for(int i = 0; i <= num; i ++ ){
	        	System.out.println(Math.pow(i,4));
	            if(Math.pow(4,i) == num) return true;
	        }
	        
	        return false;
	    }
	
	
	public static int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        
        if(nums.length == 2) {
            if(nums[0] > nums[1]) return 0;
            return 1;
        }
        int index = 0;
        int max = nums[index];
        for(int i = 1; i < nums.length; i ++ ){
            if(nums[i] > nums[i-1]) {
            	max = nums[i];
            	index = i;
            }
        }
        
        return index;
    }
	
	 public static boolean checkPossibility(int[] nums) {
	        int [] copy = nums;
	        Arrays.sort(copy);
	        int k = 0;
	        int j = copy.length -1;
	        while(k != j) {
	        	int temp = copy[k];
	        	copy[k] = copy[j];
	        	copy[j] = temp;
	        	k++;
	        	j--;
	        }
	        int count = 0;
	        for(int i = 0; i < nums.length; i ++){
	            if(nums[i] != copy[i]){
	                count++;
	            }
	        }
	        return count <= 1;
	    }
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int count = 0;
	        for(int i = 1; i < flowerbed.length -1 ; i ++ ){
	            if(flowerbed[i] == 0 && flowerbed[i-1] ==0 && flowerbed[i+1] == 0) count ++;
	        }
	        
	        return count == n;
	    }
	
	
	public static boolean checkRecord(String s) {
		 return numAbsents(s) <= 1 && !containsMultipleL(s);
    }
    
    public static int numAbsents(String s){
        int count = 0;
        for(Character c : s.toCharArray()){
            if(c == 'A') count++;
        }
        return count;
    }
    
    public static boolean containsMultipleL(String s ){
        int count = 0;
        for(Character c :s.toCharArray()){
            if(c == 'L') count ++;
            
            else count = 0;
            
            
            if(count >2 ) return true;
        }
        
        return false;
    }
	public static int countSegments(String s) {
        String[] arr = s.split(" ");
        return arr.length;
    }
	public int reverse(int x) {
        if(x == 0) return 0;
        boolean isNeg;
        if(x <0) isNeg = true;
        else isNeg = false;
        
        int temp = x;
        String str = "";
        if(isNeg){
            temp *=-1;
        }
        while(temp != 0){
            str += temp%10;
            temp /= 10;
            
        }
        if(isNeg) return Integer.parseInt("-" + str); 
        return Integer.parseInt(str);
    }
	public static void moveZeroes(int[] nums) {
       /*
        * two pointer approach.
        */
		int i = 0;
		int j = 0;
		while( j < nums.length ) {
			if(nums[j] != 0) {
				nums[i] = nums[j];
				i++;
			}
			j++;
		}
		
		while(i < nums.length) {
			nums[i] = 0;
			i++;
		}
    }
	
	public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
	
	public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i : nums ){
            if(myMap.containsKey(i)) myMap.put(i, myMap.get(i) +1 );
            
            else myMap.put(i,1);
        }
        List<Integer> returner = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            if(entry.getValue() > nums.length /3 ){
                returner.add(entry.getKey());
            }
        }
        
        return returner;
    }
	
	
	public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> mySet = new HashSet<>();
        for(int i : arr ){
            mySet.add(i);
        }
        
        for(int i : mySet){
            if(mySet.contains(2 * i) && i!= 0) return true;
        }
        
        return false;
    }
	
	 public static boolean isPalindrome(int x) {
	        if(x < 0) return false;
	        
	        String num = ""+x;
	        
	        for(int i =0; i < num.length(); i++ ){
	            if(num.charAt(i) != num.charAt(num.length() - 1 - i)) return false;
	        }
	        
	        return true;
	    }
	
	 public static int findPairs(int[] nums, int k) {
	        HashSet<Integer> mySet = new HashSet<>();
	        for(int i: nums ){
	            mySet.add(i);
	        }
	        int count = 0;
	        for(int i : mySet){
	            if(mySet.contains(i + k) || mySet.contains(i-k)) count ++;
	        }
	        
	        return count;
	    }
	
	
	public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
		return distance(p1,p2) == distance(p2,p3) && distance(p3,p4) == distance(p4,p1);
 
    }
    public static double distance(int[] p1, int[] p2){
        double val1 = Math.pow(p1[0] + p2[0], 2);
        double val2 = Math.pow(p1[1] + p2[1], 2);
        
        return Math.sqrt(val1 + val2);
    }
	
	public static String convertToBase7(int num) {
        if(num == 0) return "0";
        long val = Math.abs(num);
        String res = "";
        while(val > 0 ){
            res = val % 7 + res;
            val/=7;
        }
        if(num < 0 ){
            res = "-" + res;
        }
        return res;
    }
	
	public static String backspace(String s){
        String returner = "";
        int counter = 0;
        for(int i = 1; i < s.length(); i ++ ){
            if(s.charAt(i) != '#'){
                returner += s.charAt(i-1);
            }
            else{
                
            }
        }
        return returner;
    }
	
	 public static int[] getNoZeroIntegers(int n) {
	        int[] myArr = new int[2];
//	        outer:
		        for(int i = 1; i < n; i ++){
		            for(int j = 1; j < n; j ++){
		                if(i+j == n){
		                    myArr[0] = i;
		                    myArr[1] = j;
//	                        break outer;          
		                }
		            }
		        }
		        return myArr;
	    }
	
	
	 public static List<Integer> selfDividingNumbers(int left, int right) {
	        boolean tf = false;
	        List<Integer> returner = new ArrayList<>();
	        for(int i = left; i <=right ; i ++ ){
	            int temp = i;
	            while(temp > 0){
	                if( (temp%10)!=0 && i%(temp%10) == 0 ) tf = true;
	                else {
	                	tf = false;
	                	break;
	                }
	                
	                temp/=10;
	            }
	            if(tf) returner.add(i);
	        }
	        return returner;
	    }
	
	public static boolean uniqueOccurrences(int[] arr) {
		HashMap <Integer, Integer> myMap = new HashMap<>();
        for(int i = 0 ;i < arr.length; i ++ ){
            int val = arr[i];
            if(myMap.containsKey(val)) myMap.put(val ,myMap.get(val) +1);
            
            else myMap.put(val, 1);
        }
        
        Set<Integer> mySet = new HashSet<>();
        for(int i : arr ){
            mySet.add(myMap.get(i));
        }
        
        return mySet.size() == myMap.size();
	    }
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
		 for(int i = 0; i < nums.length; i ++ ){
	            for(int j = 0; j < i; j ++ ){
	                if(nums[i] == nums[j] && Math.abs(i-j) <= k) return true;
	            }
	        }
	        return false;
	    }
	
	public static int[] plusOne(int[] digits) {
		int val = 0;
        for(int i = 0 ; i < digits.length; i ++ ){
            val+= digits[i] * Math.pow(10, digits.length -1 - i);
        }
        val += 1;
        
        int temp = val;
        int count = 0;
        while(temp > 0 ){
            temp/=10;
            count++;
        }
        int[] newArr = new int[count];
        for(int i = 0; i < count; i ++ ){
            newArr[count-1-i] = val%10;
            val/=10;
        }
        
        return newArr;
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
