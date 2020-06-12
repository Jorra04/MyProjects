import java.util.*;

public class HelloWorldTester {

	public static void main(String[] args) {
//		ArrayList<Integer> myList = new ArrayList<>();
//		myList.add(-129);
//		
//		myList.add(-129);
//		
//		System.out.println(myList.get(0).equals(myList.get(1)));
//		Integer i = -129;
//		Integer j = -129;
//		System.out.println(i == j);
//		System.out.println(addStrings("5", "10"));
//		System.out.println(frequencySort("Hello"));
//		int [] a1 = {1,2,3,4};
//		int [] a2 = {4,6,7,8};
//		int [] a3 = {9,4,11,12};
//		System.out.println(threeCommon(a1, a2, a3));
//		System.out.println(reverse("Hello this is java"));
//		System.out.println(findLastBracket("hello(my name is jorra) hey"));
//		String s = "abbcccddddeeeeedcba";
////		s = "leetcode";
//		System.out.println(maxPower(s));
//		int [] myArr = {0,1,2,3,4,5,6,7,8,9};
//		System.out.println(validMountainArray(myArr));
//		System.out.println(rotateString("jorra", 1));
//		arrayPrinter(getNoZeroIntegers(1010));
//		System.out.println(sequentialDigits(10, 10000000));
//		int[][] coor = {{1,2},{2,3},{3,4},{4,8},{5,6},{6,7}};
//		System.out.println(checkStraightLine(coor));
//		String [] myArr = {"Jorra","Daniel","Jackson","Alpha","Kevin","Jorra","Daniel"};
//		System.out.println(putInTreeMap(myArr));
//		System.out.println(findNthDigit(11));
//		int[] startTime = {9,8,7,6,5,4,3,2,1};
//		int[] endTime = {10,10,10,10,10,10,10,10,10};
//		int queryTime = 5;
//		System.out.println(busyStudent(startTime, endTime, queryTime));
//		int [] A = {5,1,5,2,5,3,5,4};
//		System.out.println(repeatedNTimes(A));
//		System.out.println(isIsomorphic("aba", "baa"));
//		String [] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
//		
//		System.out.println(topKFrequent(words, 4));
//		System.out.println(firstNotRepeatingCharacter("abacabad"));
//		System.out.println(longestPalindrome("abccccdd"));
//		int[] prices = {7,6,4,3,1};
//		System.out.println(maxProfit(prices));
//		int[] nums = {1,3,5,4,2,3,4,5};
//		System.out.println(findLengthOfLCIS(nums));
//		int[] nums = {1, 2, 3, 4};
//		System.out.println(dominantIndex(nums));
//		int [] nums = {1,0,0,0,1,0,0,1};
//		System.out.println(kLengthApart(nums, 2));
//		int[] nums = {123,1222,11,1111,111111}; // should be 4
//		System.out.println(findNumbers(nums));
//		int[] nums = {3,2,2,3, 4,7,3,3,4};
//		System.out.println(removeElement(nums, 3));
//		int[] nums = {1,2,5,0,8,0,5,0,4,6,5,0};
//		moveZeros(nums);
//		arrayPrinter(nums);
//		int[] A = {3,1,2,4};
//		arrayPrinter(sortArrayByParity(A));
//		int[] nums = {1,2};
//		System.out.println(thirdMax(nums));
//		int[] heights = {1,2,3,4,5};
//		System.out.println(heightChecker(heights));
//		HashSet<Integer> mySet = new HashSet<>();
//		int[] nums = {0,0,1,1,1,2,2,3,3,4};
//		System.out.println(removeDuplicates(nums));
//		System.out.println(firstUniqChar("leetcode"));
//		arrayPrinter(countBits(5));
//		System.out.println(generateTheString(7));
//		System.out.println(isLongPressedName("laiden", "laiden"));
//		String paragraph = "a, a, a, a, b,b,b,c, c";
//		String[] banned = { "a" };
//		System.out.println(mostCommonWord(paragraph, banned));
//		int[] nums = {2,5,1,3,4,7};
//		System.out.println(shuffle(nums, 3));
//		PriorityQueue<Integer> myPQ = new PriorityQueue<>();
//		System.out.println(myPQ);
//		myPQ.add(5);
//		myPQ.add(10);
//		myPQ.add(4);
//		myPQ.add(11);
//		myPQ.add(120);
//		myPQ.add(2);
//		myPQ.poll();
//		myPQ.peek();
//		
//		System.out.println(myPQ);
//		int[] nums = {1,1,1,1,1,1,1,1,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0};
//		System.out.println(findMaxConsecutiveOnes(nums));
//		System.out.println(addStrings("1", "2"));
//		System.out.println(maxPower("ccbccbb"));
//		System.out.println(isPrefixOfWord("hello from the other side", "they"));
//		System.out.println(canConstruct("a", "b"));
//		int [] nums1 = {1,3,5,7,0,0,0,0};
//		int[] nums2 = {4,2,5,7};
//		merge(nums1, 4, nums2, 4);
//		arrayPrinter(nums1);

//		int[] nums = {0};
//		System.out.println(thirdMax(nums));
//		System.out.println( isIsomorphic("aba", "baa"));
//		System.out.println(getNumSum(38));
//		System.out.println(longestCommonSubsequence("ace", "abcde"));
//		int[] distance = {1,2,3,4};
//		System.out.println(distanceBetweenBusStops(distance, 0, 3));

//		List<Integer> l = new ArrayList<>();
//		l.add(10);
//		l.add(-20);
//		l.add(61);
//		l.add(-15);
//		
//		System.out.println(getBattery(l));

//		System.out.println(isAnagram("rawr", "warr"));

//		try {
//			Float f1 = new Float("3.0");
//			int x = f1.intValue();
//			byte b = f1.byteValue();
//			double d = f1.doubleValue();
//			System.out.println(x + b + d);
//		}
//		catch(NumberFormatException e) {
//			System.out.println("Bad number");
//		}

//		System.out.println(addDigits(10));
//		System.out.println(rotatedDigits(2));
//		int[] nums = {1,2,3,4,4,6,7,8};
//		System.out.println(findErrorNums(nums));
//		int [] arr = {1,3,5,7,9};
//		miniMaxSum(arr);
//		System.out.println(timeConversion("12:05:39AM"));
//		System.out.println(isValid("aabbccddeefghi"));
//		int [] scores = {3 ,4, 21, 36, 10, 28, 35, 5, 24, 42};
//		System.out.println(breakingRecords(scores));
//		int[] arr =  {4};
//		List<Integer> s = new ArrayList();
//		for(int i: arr) {
//			s.add(i);
//		}
//		System.out.println(birthday(s, 4, 1));

//		System.out.println(dayOfProgrammer(1836));
//		int[]nums = {0,4,0,3,2};
//		System.out.println(findMaxAverage2(nums, 1));
//		int[] nums = { 2, 3, -2, 4, 0, 5, 5, 0, 0 };
//		System.out.println(maxProduct(nums));
//		int[] A = {4,5,0,-2,-3,1};
//		System.out.println(subarraysDivByK(A, 5));
//		int[] A = {-7,-3,2,3,11};
//		System.out.println(sortedSquares(A));
//		arrayPrinter(sortedSquares(A));
//		int[]nums = {4,3,2,7,8,2,3,1};
//		System.out.println(findDuplicates(nums));
//		int [][] matrix = {{1}};
//		System.out.println(searchMatrix(matrix, 1));
//		int [] A = {1,1};
//		System.out.println(numSubarraysWithSum(A, 1));
		int [] nums = {3,6,5,1,8};
		System.out.println(maxSumDivThree(nums));
		
	}
	
	public static int maxSumDivThree(int[] nums) {
        int sum = 0;
        int max_sum = 0;
        for(int i = 0; i < nums.length; i ++){
            for(int j = i; j < nums.length;j++){
                sum += nums[j];
                if(sum %3  == 0) {
                    max_sum = Math.max(sum,max_sum);
                }
                sum = 0;
            }
        }
        return max_sum;
    }
	
	public static int numSubarraysWithSum(int[] A, int S) {
        int count = 0;
        int sum = 0;
        for(int i = 0 ;i < A.length; i ++){
            sum = 0;
            for(int j = i; j < A.length; j ++){
                sum+=A[j];
                if(sum == S) count ++;
            }
        }
        
        return count;
    }
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        for(int[] inner : matrix){
            if(Arrays.binarySearch(inner, target) >= 0) return true;
        }
        
        return false;
    }
	
	
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList();
        for(int i = 0; i < nums.length; i ++){
            if(nums[Math.abs(nums[i]) -1] < 0) res.add(Math.abs(nums[i]));
            
            else nums[Math.abs(nums[i]) -1] *= -1;
        }
        return res;
    }
	
	public static int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int i = 0;
        int j = A.length -1;
        int pointer = A.length -1;
        while(i <= j) {
        	if(A[i] * A[i] >= A[j] * A[j]) {
        		res[pointer--] = A[i] * A[i];
        		i++;
        	}
        	else if(A[i] * A[i] < A[j] * A[j]) {
        		res[pointer--] = A[j] * A[j];
        		j--;
        	}
        }
        return res;
    }

	public static int subarraysDivByK(int[] A, int K) {
		int num_divisible = 0;
		
		int curr_sum = A[0];
		for(int i = 1; i < A.length; i ++) {
			curr_sum = Math.max(A[i], curr_sum + A[i]);
			if(curr_sum % K == 0) num_divisible ++;
		}
		
		
		return num_divisible;
	}

	public static int maxProduct(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int max_prod = nums[0];
		int curr_prod = nums[0];
		for (int i = 1; i < nums.length; i++) {
			curr_prod = Math.max(curr_prod, curr_prod * nums[i]);
			max_prod = Math.max(max_prod, curr_prod);
		}
		return max_prod;
	}

	public static double findMaxAverage2(int[] nums, int k) {
		double sum = 0;
		for (int i = 0; i < k; i++)
			sum += nums[i];
		double res = sum;
		for (int i = k; i < nums.length; i++) {
			sum += nums[i] - nums[i - k];
			res = Math.max(res, sum);
		}
		return res / k;
	}

	public static double findMaxAverage(int[] nums, int k) {
		double sum = 0;
		double max_avg = Double.NEGATIVE_INFINITY;
		int i = 0;
		for (int j = k - 1; j < nums.length; j++) {
			for (int l = i; l < k + i; l++) {
				sum += nums[l];
			}

			max_avg = Math.max(max_avg, sum /= k);
			sum = 0;
			i++;

		}
		return max_avg;
	}

	static String dayOfProgrammer(int year) {
		int day;
		if (year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0))
			day = 256 - 244;

		else
			day = 256 - 243;
		if (year < 1918)
			return --day + ".09." + year;
		return day + ".09." + year;

	}

	static int birthday(List<Integer> s, int d, int m) {
		if (m > s.size())
			return 0;
		int run_sum = 0;
		int i = 0;
		int count = 0;
		for (int j = m - 1; j < s.size(); j++) {
			for (int k = i; k <= j; k++) {
				run_sum += s.get(k);
			}
			if (run_sum == d)
				count++;
			run_sum = 0;
			i++;
		}
		return count;

	}

	static int[] breakingRecords(int[] scores) {
		int[] record_scores = new int[2];
		int highest = scores[0];
		int lowest = scores[0];
		for (int i : scores) {
			if (i > highest) {
				record_scores[0]++;
				highest = i;
			}

			if (i < lowest) {
				record_scores[1]++;
				lowest = i;
			}
		}

		return record_scores;

	}

	static String isValid(String s) {
		int greaterThanTwo = 0;
		HashMap<Character, Integer> map = new HashMap();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);

			else
				map.put(c, 1);
		}
		Set<Integer> set = new HashSet();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			set.add(entry.getValue());
		}

		if (greaterThanTwo > 1)
			return "NO";
		return "YES";
	}

	static String timeConversion(String s) {
		/*
		 * Write your code here.
		 */
		boolean isAM = s.contains("AM");
		System.out.println(isAM);
		s = s.substring(0, s.length() - 2);
		String res = "";
		String[] formatted_time = s.split(":");
		int val = Integer.parseInt(formatted_time[0]);
		if (val < 12 && !isAM) {
			val += 12;
		}
		if (val == 12 && isAM)
			val = 0;
		if (val < 12) {
			return "0" + val + ":" + formatted_time[1] + ":" + formatted_time[2];
		}
		return val + ":" + formatted_time[1] + ":" + formatted_time[2];

	}

	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		long max = 0;
		long min = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			max += arr[i];
		}
		for (int i = 0; i < arr.length - 1; i++) {
			min += arr[i];
		}
		System.out.println(min + " " + max);
	}

	public static int[] findErrorNums(int[] nums) {
		int[] res = new int[2];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				res[0] = nums[i - 1];
				res[1] = i + 1;
				break;
			}
		}
		return res;
	}

	public static int rotatedDigits(int N) {
		String s = "";
		int count = 0;
		for (int i = 1; i <= N; i++) {
			s = String.valueOf(i);
			if (s.indexOf('4') == -1 && s.indexOf('1') == -1 && s.indexOf('3') == -1 && s.indexOf('7') == -1
					&& s.indexOf('0') == -1 && s.indexOf('8') == -1) {
				count++;
			}
		}
		return count;
	}

	public static int addDigits(int num) {
		if (num < 10)
			return num;

		int temp = num;
		int sum = 0;
		int num_digits = String.valueOf(num).length();
		while (num_digits > 1) {
			sum = 0;
			while (temp >= 1) {
				int val = temp % 10;
				temp /= 10;
				sum += val;
			}
			temp = sum;
			num_digits = String.valueOf(sum).length();

		}

		return sum;
	}

	public static boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> s1 = new HashMap();
		HashMap<Character, Integer> t1 = new HashMap();
		for (char c : s.toCharArray()) {
			if (s1.containsKey(c))
				s1.put(c, s1.get(c) + 1);

			else
				s1.put(c, 1);
		}
		for (char c : t.toCharArray()) {
			if (t1.containsKey(c))
				t1.put(c, t1.get(c) + 1);

			else
				t1.put(c, 1);
		}

		return s1.equals(t1);
	}

	public static int getBattery(List<Integer> events) {
		// Write your code here
		int batteryLevel = 50;
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i) > 0) {
				if (batteryLevel + events.get(i) >= 100)
					batteryLevel = 100;

				else
					batteryLevel += events.get(i);
			}

			else {
				if (batteryLevel - events.get(i) < 0)
					batteryLevel = 0;

				else
					batteryLevel += events.get(i);
			}
		}

		return batteryLevel;

	}

	public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
		int distanceTravelledForward = 0;
		int distanceTravelledBackwards = 0;
		for (int i = start; i < destination; i++) {
			distanceTravelledForward += distance[i];
		}

		for (int i = destination; i != start; i--) {
			distanceTravelledBackwards += distance[i];
		}

		if (distanceTravelledBackwards < distanceTravelledForward)
			return distanceTravelledBackwards;

		return distanceTravelledForward;
	}

	public static int longestCommonSubsequence(String text1, String text2) {
		int i = 0;
		int j = 0;
		int count = 0;
		while (i != text1.length() && j != text2.length()) {
			if (text1.charAt(i) == text2.charAt(j)) {
				count++;
				i++;
				j++;
			} else {
				i++;
			}
		}
		return count;
	}

	public static int getNumSum(int num) {
		int temp = num;
		int sum = 0;
		while (temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		return sum;
	}

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() < 2 && t.length() < 2)
			return true;
		List<Integer> isoCountS = new ArrayList<>();
		List<Integer> isoCountT = new ArrayList<>();
		int count = 0;
		int i = 0;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(i) == s.charAt(j)) {
				count++;
				if (j == s.length() - 1) {
					isoCountS.add(count);
				}
			} else {
				isoCountS.add(count);
				count = 1;
				i = j;
			}
		}
		count = 0;
		i = 0;
		for (int j = 0; j < t.length(); j++) {
			if (t.charAt(i) == t.charAt(j)) {
				count++;
				if (j == t.length() - 1) {
					isoCountT.add(count);
				}
			} else {
				isoCountT.add(count);
				count = 1;
				i = j;
			}
		}

		return isoCountS.equals(isoCountT);
	}

	public static int thirdMax(int[] nums) {
		HashSet<Integer> mySet = new HashSet<>();
		for (int i : nums) {
			mySet.add(i);
		}
		List<Integer> list = new ArrayList<>(mySet);
		if (list.size() < 3)
			return list.get(list.size() - 1);

		return list.get(list.size() - 3);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < m; i++) {
			pq.offer(nums1[i]);
		}
		for (int i = 0; i < n; i++) {
			pq.offer(nums2[i]);
		}

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = pq.remove();
		}
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> ransom = new HashMap<>();
		HashMap<Character, Integer> mag = new HashMap<>();

		for (char c : ransomNote.toCharArray()) {
			if (ransom.containsKey(c))
				ransom.put(c, ransom.get(c) + 1);

			else
				ransom.put(c, 1);
		}
		for (char c : magazine.toCharArray()) {
			if (mag.containsKey(c))
				mag.put(c, mag.get(c) + 1);

			else
				mag.put(c, 1);
		}

		for (Map.Entry<Character, Integer> entry : mag.entrySet()) {
			Character key = entry.getKey();
			Integer val1 = entry.getValue();
//            if(!ransom.containsKey(key)) return false;
			Integer val2 = mag.get(key);
			if (val1 < val2)
				return false;
		}
		return true;
	}

	public static int isPrefixOfWord(String sentence, String searchWord) {
		String[] words = sentence.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(searchWord))
				return i + 1;
		}
		return -1;
	}

	public static int maxPower(String s) {
		int i = 0;
		int maxCount = 0;
		int count = 0;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(i) == s.charAt(j)) {
				count++;
			} else {
				if (maxCount < count)
					maxCount = count;
				count = 1;
				i = j;
			}
		}
		if (count > maxCount)
			return count;
		return maxCount;
	}

	public static int maxNumberOfBalloons(String text) {
		int n = text.length();
		int[] balloon = new int[5];
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'b')
				balloon[0]++;

			else if (text.charAt(i) == 'a')
				balloon[1]++;

			else if (text.charAt(i) == 'l')
				balloon[2]++;

			else if (text.charAt(i) == 'o')
				balloon[3]++;

			else if (text.charAt(i) == 'n')
				balloon[4]++;
		}

		balloon[2] /= 2;
		balloon[3] /= 2;
		Arrays.sort(balloon);
		return balloon[0];

	}

	public static String addStrings(String num1, String num2) {
		int res1 = 0;
		int res2 = 0;

		for (int i = 0; i < num1.length(); i++) {
			res1 = res1 + num1.charAt(i) - 48;
		}
		for (int i = 0; i < num2.length(); i++) {
			res2 = res2 + num2.charAt(i) - 48;
		}

		return (res1 + res2 + "");
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int currOnes = 0;
		int maxOnes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				currOnes++;
			} else {
				if (maxOnes < currOnes)
					maxOnes = currOnes;
				currOnes = 0;
			}
		}
		if (maxOnes < currOnes) {
			return currOnes;
		}
		return maxOnes;
	}

	public static int[] shuffle(int[] nums, int n) {
		int xn = nums[n - 1];
		int yn = nums[(2 * n) - 1];
		System.out.println(xn);
		System.out.println(yn);
		int[] returnArr = new int[nums.length];
		int validIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != xn && nums[i] != yn) {
				returnArr[validIndex++] = nums[i];
			}
		}
		// returnArr[validIndex++] = xn;
		// returnArr[validIndex] = yn;

		return returnArr;

	}

	public static String mostCommonWord(String paragraph, String[] banned) {

		HashSet<String> bannedSet = new HashSet<>();
		for (String s : banned) {
			bannedSet.add(s);
		}
		HashMap<String, Integer> wordCounts = new HashMap<>();
		String[] sentance = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
		for (String word : sentance) {
			if (wordCounts.containsKey(word) && !bannedSet.contains(word))
				wordCounts.put(word, wordCounts.get(word) + 1);

			else if (!bannedSet.contains(word))
				wordCounts.put(word, 1);
		}
		System.out.println(wordCounts);
		int max = 0;
		String freqWord = "";
		for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				freqWord = entry.getKey();
			}
		}

		return freqWord;
	}

	public static boolean isLongPressedName(String name, String typed) {
		if (name.equals(typed))
			return true;

		HashMap<Character, Integer> nameCounts = new HashMap<>();
		HashMap<Character, Integer> typedCounts = new HashMap<>();
		for (char c : name.toCharArray()) {
			if (nameCounts.containsKey(c))
				nameCounts.put(c, nameCounts.get(c) + 1);

			else
				nameCounts.put(c, 1);
		}

		for (char c : typed.toCharArray()) {
			if (typedCounts.containsKey(c))
				typedCounts.put(c, typedCounts.get(c) + 1);

			else
				typedCounts.put(c, 1);
		}
		for (Map.Entry<Character, Integer> entry1 : nameCounts.entrySet()) {
			Character key = entry1.getKey();
			Integer value1 = entry1.getValue();
			Integer value2 = typedCounts.get(key);
			if (value1 > value2)
				return false;
		}
		return true;
	}

	public static String generateTheString(int n) {
		String returner = "";
		if (n % 2 == 0) {
			for (int i = 0; i < n - 1; i++) {
				returner += "x";
			}
		} else {
			for (int i = 0; i < n; i++) {
				returner += "x";
			}
			return returner;
		}

		return returner + "y";
	}

	public static int[] countBits(int num) {
		int[] myArr = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			myArr[i] = getNumOnes(i);
		}
		return myArr;
	}

	public static int getNumOnes(int n) {
		String s = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1')
				count++;
		}
		return count;
	}

	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> charCounts = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (charCounts.containsKey(c))
				charCounts.put(c, charCounts.get(c) + 1);

			else
				charCounts.put(c, 1);
		}
//        System.out.println(charCounts);
		for (int i = 0; i < s.length(); i++) {
			if (charCounts.get(s.charAt(i)) == 1)
				return i;
		}

		return -1;
	}

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				nums[++i] = nums[j];
			}
		}
		return i + 1;
	}

	public static int heightChecker(int[] heights) {
		int[] myArr = Arrays.copyOf(heights, heights.length);
		Arrays.sort(myArr);
		int counter = 0;
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] != heights[i])
				counter++;
		}
		return counter;
	}

	public static int[] sortArrayByParity(int[] A) {
		int[] evenArr = new int[A.length];
		int[] oddArr = new int[A.length];
		int[] finalArr = new int[A.length];
		int evens = 0;
		int odds = 0;
		int counter = 0;
		for (int i : A) {
			if (i % 2 == 0)
				evenArr[evens++] = i;
		}
		for (int i : A) {
			if (i % 2 != 0)
				oddArr[odds++] = i;
		}
		for (int i = 0; i < evens; i++) {
			finalArr[counter++] = evenArr[i];
		}
		for (int i = 0; i < odds; i++) {
			finalArr[counter++] = oddArr[i];
		}

		return finalArr;
	}

	public static void moveZeros(int[] nums) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
			}
		}
	}

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	public static int findNumbers(int[] nums) {
		int evens = 0;
		for (int i : nums) {
			int temp = i;
			int count = 0;
			while (temp > 0) {
				count++;
				temp /= 10;
			}
			if (count % 2 == 0) {
				evens++;
			}
		}
		return evens;
	}

	public static boolean kLengthApart(int[] nums, int k) {
		List<Integer> distance = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				distance.add(i);
		}
		for (int i = 1; i < distance.size(); i++) {
			if (distance.get(i) - distance.get(i - 1) - 1 < k)
				return false;
		}

		return true;
	}

	public static int dominantIndex(int[] nums) {
		int max = nums[0];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= max) {
				max = nums[i];
				index = i;
			}
		}

		for (int i : nums) {
			if (max < 2 * i && max != i)
				return -1;
		}

		return index;
	}

	public static int findLengthOfLCIS(int[] nums) {
		if (nums.length == 0 || nums.length == 1)
			return 1;
		int highest = 1;
		int currentHeight = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1])
				currentHeight++;
			else {
				if (currentHeight > highest)
					highest = currentHeight;
				currentHeight = 1;
			}
		}
		if (currentHeight > highest)
			return currentHeight;
		return highest;
	}

	public static int maxProfit(int[] prices) {
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] - prices[i] >= max)
					max = prices[j] - prices[i];
			}
		}

		return max;
	}

	public static int longestPalindrome(String s) {
		int[] char_counts = new int[128];
		for (char c : s.toCharArray()) {
			char_counts[c]++;
		}
		int result = 0;
		for (Integer char_count : char_counts) {
			result += char_count / 2 * 2;
			if (result % 2 == 0 && char_count % 2 == 1) {
				result += 1;
			}
		}
		return result;
	}

	public static char firstNotRepeatingCharacter(String s) {
		char[] charArr = s.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (s.contains("" + charArr[i])) {
				Character.toUpperCase(charArr[i]);
			} else {
				if (Character.isUpperCase(charArr[i])) {
					return Character.toLowerCase(charArr[i]);
				}
			}
		}
		return '_';
	}

	public static List<String> topKFrequent(String[] words, int k) {
		TreeMap<String, Integer> wordFreq = new TreeMap<>();
		List<String> returner = new ArrayList<>();
		for (String s : words) {
			if (wordFreq.containsKey(s))
				wordFreq.put(s, wordFreq.get(s) + 1);

			else
				wordFreq.put(s, 1);
		}

		for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
			if (entry.getValue() == k) {
				returner.add(entry.getKey());
				k--;

			}
		}
		return returner;
	}

	public static int repeatedNTimes(int[] A) {
		HashMap<Integer, Integer> myMap = new HashMap<>();

		for (int i : A) {
			if (myMap.containsKey(i))
				myMap.put(i, myMap.get(i) + 1);

			else
				myMap.put(i, 1);
		}
		for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
			if (entry.getValue() == A.length / 2)
				return entry.getKey();
		}

		return -1;
	}

	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int busyStudents = 0;
		for (int i = 0; i < startTime.length; i++) {
			if (startTime[i] <= queryTime && endTime[i] >= queryTime)
				busyStudents++;
		}
		return busyStudents;
	}

	public static int findNthDigit(int n) {
		String s = "";
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		return s.charAt(n - 1) - 48;
	}

	public static TreeMap putInTreeMap(String[] arr) {
		TreeMap<String, Integer> myTree = new TreeMap<>();
		for (String i : arr) {
			if (myTree.containsKey(i))
				myTree.put(i, myTree.get(i) + 1);

			else
				myTree.put(i, 1);
		}
		return myTree;
	}

	public static boolean checkStraightLine(int[][] coordinates) {
		double deltaX = coordinates[0][0] - coordinates[1][0];
		double deltaY = coordinates[0][1] - coordinates[1][1];
		double origSlope = deltaY / deltaX;
		for (int i = 1; i < coordinates.length; i++) {
			for (int j = 1; j < coordinates[i].length; j++) {

				deltaX = coordinates[i][j - 1] - coordinates[i - 1][j - 1];
				deltaY = coordinates[i][j] - coordinates[i - 1][j];
				double newSlope = deltaY / deltaX;
				if (newSlope != origSlope)
					return false;
			}
		}
		return true;
	}

	public static void arrayPrinter(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static List<Integer> sequentialDigits(int low, int high) {
		List<Integer> returner = new ArrayList<>();
		for (int i = low; i <= high; i++) {
			if (isSeq(i))
				returner.add(i);
		}
		return returner;
	}

	public static boolean isSeq(int n) {
		String numRep = String.valueOf(n);
		if (numRep.length() == 1)
			return true;
		for (int i = 1; i < numRep.length(); i++) {
			if (numRep.charAt(i - 1) - 48 != (numRep.charAt(i) - 49))
				return false;
		}
		return true;
	}

	static int[] getNoZeroIntegers(int n) {

		int i = 1;
		while (true) {
			int j = n - i;
			if ((containsZero(i) == false) && (containsZero(j) == false)) {
				return new int[] { i, j };
			}
			i++;
		}
	}

	public static boolean containsZero(int n) {
		return String.valueOf(n).contains("0");
	}

	public static String rotateString(String s, int rotations) {
		char[] charArr = s.toCharArray();
		for (int i = 0; i < rotations; i++) {
			charArr[i % charArr.length] = charArr[i];
		}
		return Arrays.toString(charArr);
	}

	public static boolean validMountainArray(int[] A) {
		if (A.length < 3)
			return false;
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
				maxIndex = i;
			}
		}
		if (maxIndex == A.length - 1)
			return false;
		for (int i = 1; i < maxIndex; i++) {
			if (A[i - 1] >= A[i])
				return false;
		}
		for (int i = maxIndex + 1; i < A.length; i++) {
			if (A[i - 1] <= A[i])
				return false;
		}

		return true;
	}

	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		List<String> strings = new ArrayList<>();
		String returner = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				strings.add(sb.toString());
				sb = new StringBuilder();
			} else {
				sb.append(s.charAt(i));
				if (i == s.length() - 1) {
					strings.add(sb.toString());
					sb = new StringBuilder();
				}
			}
		}
		for (String s1 : strings) {
			returner = s1 + " " + returner;
		}
		return returner;
	}

	public static int findLastBracket(String s) {
		int length = s.length();
		int count = -1;
		for (int i = length - 1; i > 0; i--) {
			if (s.charAt(i) == ')') {
				count = i;
				break;
			}
		}
		return count;

	}

	public static int threeCommon(int[] a1, int[] a2, int[] a3) {
		HashMap<Integer, Integer> myMap = new HashMap<>();
		for (int i : a1) {
			if (myMap.containsKey(i))
				myMap.put(i, myMap.get(i) + 1);

			else
				myMap.put(i, 1);
		}
		for (int i : a2) {
			if (myMap.containsKey(i))
				myMap.put(i, myMap.get(i) + 1);

			else
				myMap.put(i, 1);
		}
		for (int i : a3) {
			if (myMap.containsKey(i))
				myMap.put(i, myMap.get(i) + 1);

			else
				myMap.put(i, 1);
		}
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
			if (entry.getValue() > 2)
				count++;
		}
		return count;
	}

//	 public static String frequencySort(String s) {
//	        HashMap<Character, Integer> myMap = new HashMap<>();
//	        for(char c : s.toCharArray()){
//	            if(myMap.containsKey(c)) myMap.put(c,myMap.get(c) +1);
//	            
//	            else myMap.put(c,1);
//	        }
//	        System.out.println(myMap);
//	        for(Map.Entry<Character, Integer> entry : myMap.entrySet()){
//	            
//	        }
//	        return " ";
//	    }

}
