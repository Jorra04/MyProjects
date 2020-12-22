package Easy;
import java.util.*;
import Easy.debtRecord;
public class EasyClass {

	public static void main(String[] args) {
//		int[] nums = {4,3,2,7,8,2,3,1};
//		System.out.println(findDuplicates(nums));
//		System.out.println(removeConsecutiveVowels("aba"));
//		System.out.println(compareProduct(98));
//		System.out.println(calculateSumOfNumbersInString("12345"));
//		System.out.println(arrayFib(5));
//		System.out.println(recFib(5));
//		fizzBuzz(20);
//		betterFizzBuzz(20);
//		String[] logs = {"88 99 200","88 99 300","99 32 100", "12 12 15"};
//		System.out.println(processLogFile(logs, 2));
//		int numToys = 6;
//		int topToys = 2;
//		String[] toys = {"elmo", "elsa", "legos", "drone", "tablet", "warcraft"};
//		int numQuotes = 6;
//		String[] quotes = {
//"Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
//"The new Elmo dolls are super high quality",
//"Expect the Elsa dolls to be very popular this year, Elsa",
//"Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
//"For parents of older kids, look into buying them a drone",
//"Warcraft is slowly rising in popularity ahead of the holiday season"
//		};
//		System.out.println(getTopToys(numToys, topToys, toys, numQuotes, quotes));
		
//		String [] products = {"havana"};
//		
//		System.out.println(suggestedProducts(products, "tatiana"));
//		
//		
//		int[][] mat = {
//				{1,4,7,11,15},
//				{2,5,8,12,19},
//				{3,6,9,16,22},
//				{10,13,14,17,24},
//				{18,21,23,26,30}
//		};
//		
//		System.out.println(searchMatrix(mat, 20));
		
//		System.out.println(reverseVowels("leetcode"));
//		int instances = 2;
//		int[] averageUtil = {25, 23, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 76, 80};
//		System.out.println(finalInstances(instances, averageUtil));
//		debtRecord db1 = new debtRecord("Alex", "Blake", 2);
//		debtRecord db2 = new debtRecord("Blake", "Alex", 2);
//		debtRecord db3 = new debtRecord("Casey", "Alex", 5);
//		debtRecord db4 = new debtRecord("Blake", "Casey", 7);
//		debtRecord db5 = new debtRecord("Alex", "Blake", 4);
//		debtRecord db6 = new debtRecord("Alex", "Casey", 4);
//		
//		List<debtRecord> debts1 = new ArrayList();
//		debts1.add(db1);
//		debts1.add(db2);
//		debts1.add(db3);
//		debts1.add(db4);
//		debts1.add(db5);
//		debts1.add(db6);
//		
//		System.out.println(minimumDebtMembers(debts1));
//		List<debtRecord> debts2 = new ArrayList();
//		debts2.add(db1);
//		System.out.println(minimumDebtMembers(debts2));
//		int[] nums = {1,-1};
//		int k = 1;
//		arrayPrinter(maxSlidingWindow(nums, k));
	
//		System.out.println(isPalindrome(101));
//		int[] nums = {1};
//		int target = 0;
//		System.out.println(searchInsert(nums, target));
//		int[] nums = {1,4,2,5,3};
//		printAllSubarrays(nums);
		
//		String[] word1 = {"abc", "d", "defg"};
//		String[] word2 = {"abcddefg"};
//		
//		System.out.println(arrayStringsAreEqual(word1, word2));
		
//		int[][] accounts = {
//				{2,8,7},
//				{7,1,3},
//				{1,9,5}
//		};
//
//		System.out.println(maximumWealth(accounts));
//		String date = "26th May 1960";
//		System.out.println(reformatDate(date));
//		String s = "aaa";
//		System.out.println(countSubstrings(s));
//		String s = "abc";
//		System.out.println(numberOfSubstrings(s));
		
//		int[] nums = {1,2,3,4};
//		System.out.println(containsDuplicate(nums));
//		int[] nums = {0};
//		System.out.println(missingNumber(nums));
//		int[] nums = {1,1,2};
//		System.out.println(findDuplicate(nums));
//		int[] A = {-4,-1,0,3,10};
//		arrayPrinter(sortedSquares(A));
//		int[] nums = {2,2,1,1,1,2,2};
//		System.out.println(majorityElement(nums));
//		String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
//		String res = "abcdefghijklmnopqrstuvwxyz";
//		System.out.println(freqAlphabets(s).equals(res));
//		String s = "ac";
//		System.out.println(longestPalindrome(s));
		
//		String allowed = "fstqyienx";
//		String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
//		System.out.println(countConsistentStrings(allowed, words));
	
//		String num1 = "1234";
//		String num2 = "66";
//		
//		System.out.println(addStrings(num1, num2));
		
		
//		PriorityQueue<String> pq = new PriorityQueue<>(3, (a,b) -> a.length() - b.length());
//		
//			pq.add("Hello");
//			pq.add("Hello1");
//			pq.add("Hello2");
//			pq.add("Hello3");
//			pq.add("Hello4");
//		
//		System.out.println(pq.size());
//		
//		System.out.println(pq);
//	
//		int[] nums = {-1,1,-6,4,5,-6,1,4,1};
//		System.out.println(frequencySort(nums));
		
		int[][] points = {
				{1,3},
				{-2,2}
		};
		
		int k = 1;
		
		System.out.println(kClosest(points, k));
		
		
		
		
	}
	public static void arrayPrinter(int[] array) {
		for(int i = 0; i < array.length; i ++) {
			System.out.println("Element "+i + ": " + array[i] );
		}
	}
	 public static List<Integer> findDuplicates(int[] nums) {
	        List<Integer> res = new ArrayList();
	        for(int i = 0; i < nums.length; i ++){
	            if(nums[Math.abs(nums[i]) -1] < 0) res.add(Math.abs(nums[i]));
	            else nums[Math.abs(nums[i]) -1] *= -1;
	        }
	        
	        return res;
	    }
	 
	 static boolean is_vowel(char ch) {
	        return (ch == 'a') || (ch == 'e') ||
	                (ch == 'i') || (ch == 'o') ||
	                (ch == 'u');
	    }

	 static public String removeConsecutiveVowels(String str) {
	        String str1 = "";
	        str1 = str1+str.charAt(0);
	        for(int i = 1; i < str.length(); i++)
	            if((!is_vowel(str.charAt(i - 1))) ||
	                    (!is_vowel(str.charAt(i)))) {
	                char ch = str.charAt(i);
	                str1 = str1 + ch;
	                System.out.println(ch);
	            }
	        return str1;
	    }
	 
	  public static boolean compareProduct(int num) {
	        if (num < 10)
	            return false;
	        int oddProdValue = 1, evenProdValue = 1;

	        while(num > 0) {
	            int digit = num % 10;
	            oddProdValue *= digit;
	            num = num / 10;
	            if(num == 0)
	                break;
	            digit = num % 10;
	            evenProdValue *= digit;
	            num = num / 10;
	        }
	        if(evenProdValue == oddProdValue)
	            return true;
	        return false;
	    }
	  
	  public static int calculateSumOfNumbersInString(String inputString) {
	        String temp = "";
	        int sum = 0;
	        for(int i = 0; i < inputString.length(); i++) {
	            char ch = inputString.charAt(i);
	            if(Character.isDigit(ch))
	                sum += Integer.parseInt(ch + "");
	  
	           
	        }
	        return sum;
	    }
	  
	  public static int[] arrayFib (int n) { 
		  int[] arr = new int[n];
		  if(n <= 2) return new int[] {0,1};
		  
		  arr[0] = 0;
		  arr[1] = 1;
		  
		  
		  for(int i = 2; i < n; i ++) {
			  arr[i] = arr[i-1] + arr[i-2];
		  }
		  
		  return arr;
	  }
	  
	  public static int recFib(int n) {// fat runtime. exponential.
		  if(n == 0) return 0;
		  if(n == 1) return 1;
		  
		  return recFib(n-1) + recFib(n-2);
	  }
	  
	  public static void fizzBuzz(int n) { //lol
		  for(int i = 1; i <=n; i ++) {
			  if(i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
			  else if(i % 3 == 0) System.out.println("Fizz");
			  else if(i % 5 == 0) System.out.println("Buzz");
			  else System.out.println(i);
		  }
	  }
	  
	  public static void betterFizzBuzz(int n) {
		  
		  for(int i = 1; i <= n; i ++) {
			  String output = "";
			  if(i %3 == 0) output+= "Fizz";
			  if(i % 5 == 0) output += "Buzz";
			  
			  if( output.equals("")) {
				  output = i + "";
			  }
			  System.out.println(output);
		  }
	  }
	  
	  public static String[] processLogFile(String[] logs, int threshold) {
		  String[] splitter;
		  List<String> myList = new ArrayList();
		  HashMap<String, Integer> map = new HashMap();
		  for(String word : logs) {
			  splitter = word.split(" ");
			  for(int i = 0; i <2 ; i++) {
				  if(splitter[0].equals(splitter[1])) {
					  if(map.containsKey(splitter[i])) {
						  map.put(splitter[i], map.get(splitter[i]) + 1);
					
					  }
					  
					  else map.put(splitter[i], 1);
					  break;
				  }
				  if(map.containsKey(splitter[i])) {
					  map.put(splitter[i], map.get(splitter[i]) + 1);
				
				  }
				  
				  else map.put(splitter[i], 1);
			  }
		  }
		  
		  for(Map.Entry<String,Integer> entry : map.entrySet()) {
			  if(entry.getValue() >= threshold) {
				  myList.add(entry.getKey());
			  }
		  }
		  String[] finalizer = new String[myList.size()];
		  for(int i = 0; i < finalizer.length; i ++) {
			  finalizer[i] = myList.get(i);
		  }
		  Arrays.sort(finalizer);
		  System.out.println(myList);
		  
		  return finalizer;
	  }
	  
	  public static Map<String, List<String>> favouriteGenres(Map<String, List<String>> userMap,Map<String, List<String>> genreMap ){
		  Map<String, List<String>> peopleGenres = new HashMap();
		  return userMap;
	  }
	  
	  public static List<String> getTopToys(int numCompetitors, int topNCompetitors, String[] competitors, int numReviews, String[] reviews) {
			Set<String> compCopy = new HashSet();
			Map<String, Integer> product_count_map = new HashMap();
			for(String string : competitors) {
				compCopy.add(string);
			}
			String[] splitter;
			for(String string : reviews) {
				splitter = string.split(" ");
				for(String string1 : splitter) {
					if( compCopy.contains(string1.toLowerCase())) {
						if(product_count_map.containsKey(string1)) product_count_map.put(string1, product_count_map.get(string1) +1);
						else product_count_map.put(string1, 1);
					}
				}
			}
			
			return (List<String>)compCopy;
		}
	  
	  
	  public static boolean searchMatrix(int[][] matrix, int target) {
	        for(int[] row : matrix){
	            if(Arrays.binarySearch(row, target) != -1) {
	            	return true;
	            }
	        
	        }
	        
	        return false;
	    }
	  
	  public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
	        List<List<String>> masterList = new ArrayList();
	        List<String> temp;
	        String searchWordPrefix = "";
	        for(int i = 0; i < searchWord.length(); i ++){
	            searchWordPrefix += searchWord.charAt(i);
	            temp = new ArrayList();
	            for(String product : products){
	                if(product.startsWith(searchWordPrefix)) {
	                	temp.add(product);
	                }
	                
	            }
	            Collections.sort(temp);
	            if(temp.size() > 3) masterList.add(temp.subList(0, 3));
	            
	            else masterList.add(temp);
	            
	            System.out.println(searchWordPrefix);
	        }
	        
	        return masterList;
	    }
	  
	  public static String reverseVowels(String s) {
	        int i = 0; 
	        int j = s.length() -1;
	        char[] charArr = s.toCharArray();
	        char temp;
	        while( i < j){
	            if(isVowel(charArr[i]) && isVowel(charArr[j])){
	                temp = charArr[i];
	                charArr[i] = charArr[j];
	                charArr[j] = temp;
	                i++;
	                j--;
	            
	            }
	            else if(!isVowel(charArr[i])) i++;
	            else if (!isVowel(charArr[j])) j--;
	            
	        }
	        
	        
	        return String.valueOf(charArr);
	    }
	    
	    public static boolean isVowel(char c){
	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	    }
	    
	    public static int finalInstances(int instances, int[] averageUtil) {
	    	double max = 2 * Math.pow(10, 8);
	    	for(int i = 0; i < averageUtil.length; i ++) {
	    		if(averageUtil[i] < 25 && instances > 1) {
	    			instances = (int) Math.ceil(instances/2.0);
	    			i+=10;
	    		}
	    		else if(averageUtil[i] > 60 && (2*instances) <= max  ) {
	    			instances *=2;
	    			i+=10;
	    		}
	    	}
	    	
	    	return instances;
	    }
	    
	    
	   public static List<String> minimumDebtMembers(List<debtRecord> records){
	    	List<String> final_list = new ArrayList();
	    	
	    	Map<String, Integer> name_debt_map = new HashMap();
	    	for(debtRecord dbr : records) {
	    		if(name_debt_map.containsKey(dbr.lender)) {
	    			name_debt_map.put(dbr.lender, name_debt_map.get(dbr.lender) + dbr.amount);
	    		}
	    		else {
	    			name_debt_map.put(dbr.lender, dbr.amount);
	    		}
	    	}
	    	
	    	for(debtRecord dbr : records) {
	    		if(name_debt_map.containsKey(dbr.borrower)) {
	    			name_debt_map.put(dbr.borrower, name_debt_map.get(dbr.borrower) - dbr.amount);
	    		}
	    		else {
	    			name_debt_map.put(dbr.borrower, -1 *dbr.amount);
	    		}
	    	}
	    	int num_evens = 0;
	    	int min = Integer.MAX_VALUE;
	    	for(Map.Entry<String, Integer> entry : name_debt_map.entrySet()) {
	    		if(entry.getValue() <= min) {
	    			min = entry.getValue();
	    		}
	    	}
	    	for(Map.Entry<String, Integer> entry : name_debt_map.entrySet()) {
	    		if(entry.getValue().equals(min)) {
	    			final_list.add(entry.getKey());
	    			num_evens ++;
	    		}
	    	}
	    	if(num_evens == name_debt_map.size()) {
	    		final_list.clear();
	    		final_list.add("Nobody has a negative balance");
	    		return final_list;
	    	}
	    	Collections.sort(final_list);
	    	
	    	
	    	
	    	return final_list;
	    }
	   
	   public static int[] maxSlidingWindow(int[] nums, int k) {
	        List<Integer> nums2 = new ArrayList();
	        List<List<Integer>> wow = new ArrayList();
	        List<Integer> finalList = new ArrayList();
	        for(int i : nums){
	            nums2.add(i);
	        }
	        for(int i =0; i <= nums2.size() - k; i ++){
	            wow.add(nums2.subList(i,i + k));
	        }
	        
	        for(List<Integer> list : wow){
	            int max = Integer.MIN_VALUE;
	            for(int i : list ){
	                if(max <= i) max = i;
	            }
	            finalList.add(max);
	        }
	        System.out.println(wow);
	        int[] returner = new int[finalList.size()];
	        for(int i = 0; i < returner.length; i ++){
	            returner[i] = finalList.get(i);
	        }
	        return returner;
	    }
	   
	   public static boolean isPalindrome(int x) {
	        String int_rep = x +"";
	        int i = 0;
	        int j = int_rep.length() -1 ;
	        while(i < j){
	            if(int_rep.charAt(i++) != int_rep.charAt(j--)) return false;
	            
	        }
	        
	        return true;
	    }
	   
	   public static int searchInsert(int[] nums, int target) {
		   	int found_quick = Arrays.binarySearch(nums,target);
	        
	        if(found_quick >= 0) return found_quick;
	        int i;
	        for(i = 0; i < nums.length; i ++){
	            if(nums[i] > target) return i;
	        }
	        
	        return i;
	    }
	   
	   public static void printAllSubarrays(int[] array) {
		   for(int i = 0; i < array.length; i ++) {
			   for(int j = 0; j <array.length; j ++) {
				   System.out.print(array[j] + " ");
			   }
			   System.out.println();
		   }
	   }
	   
	   public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	        String string1 = "";
	        String string2 = "";
	        
	        for(int i = 0; i < word1.length; i ++){
	            string1+= word1[i]; 
	        }
	        for(int i = 0; i < word2.length; i ++){
	            string2+= word2[i]; 
	        }
	        
	        return string1.equals(string2);
	    }
	   
	   
	   public static int maximumWealth(int[][] accounts) {
		   	int sum ;
	        int max = Integer.MIN_VALUE;
	        for(int[] row : accounts){
	            sum = 0;
	            for(int i : row) sum+=i;
	            
	            max = Math.max(max, sum);
	        }
	        
	        return max;
	    }
	   
	   public static String reformatDate(String date) {
		   HashMap<String, String> months = new HashMap();
	        /*
	        hashmap tings.
	        */
	        
	        months.put("Jan", "01");
	        months.put("Feb", "02");
	        months.put("Mar", "03");
	        months.put("Apr", "04");
	        months.put("May", "05");
	        months.put("Jun", "06");
	        months.put("Jul", "07");
	        months.put("Aug", "08");
	        months.put("Sep", "09");
	        months.put("Oct", "10");
	        months.put("Nov", "11");
	        months.put("Dec", "12");
	        
	        /*
	        done the hashting
	        */
	      
	        
	        
	        StringBuilder date_thing = new StringBuilder();
	        String[] date_split = date.split("\\s+");
	        date_thing.append(date_split[2] + "-");
	        date_thing.append(months.get(date_split[1]) + "-");
	        String day = date_split[0].substring(0,date_split[0].length() - 2);
	        if(day.length() == 1) day = "0" + day;
	        date_thing.append(day);
	        return date_thing.toString();
	    }
	   
	   
	   public static int countSubstrings(String s) {
	        int num_pals = 0;
	        for(int i = 0; i < s.length(); i ++){
	            for(int j = i +1; j <=s.length(); j ++){
	                if(isPalindrome(s.substring(i,j))) num_pals ++;
	            }
	        }
	        return num_pals;
	    }
	    
	    public static boolean isPalindrome(String s){
	        if(s.length() == 1 || s.length() == 0 ) return true;
	        int i = 0;
	        int j = s.length() - 1;
	        while(i < j){
	            if(s.charAt(i++) != s.charAt(j--)) return false;
	        }
	        
	        
	        return true;
	    }
	    
	    
	    public static int numberOfSubstrings(String s) {
	        int count = 0;
	        String sub = "";
	        for(int i = 0; i < s.length(); i ++){
	            for(int j = i +1; j <= s.length(); j ++){
	                sub = s.substring(i,j);
	                if(sub.contains("a") && sub.contains("b") && sub.contains("c")){
	                    count ++;
	                }
	            }
	        }
	        
	        return count;
	    }
	    
	    
	    public static boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> nums_copy = new HashSet();
	        for(int i : nums){
	            if(nums_copy.contains(i)) return true;
	            
	            else nums_copy.add(i);
	        }
	        
	        return false;
	    }
	    
	    public static int missingNumber(int[] nums) {
	    	Set<Integer> nums_copy = new HashSet();
	        for(int i = 0; i < nums.length; i ++){
	            nums_copy.add(nums[i]);
	        }
	        
	        for(int i = 0; i <= nums.length; i ++){
	            if(!nums_copy.contains(i)) return i;
	        }
	        
	        
	        
	        return -1;
	    }
	    public static int findDuplicate(int[] nums) {
	        for(int i = 0; i < nums.length; i ++){
	            if(nums[Math.abs(nums[i])] < 0) return Math.abs(nums[i]);
	            
	            else nums[Math.abs(nums[i])] *= -1;
	        }
	        
	        return -1;
	    }
	    
	    public static int[] sortedSquares(int[] A) {
	        int[] res = new int[A.length];
	        int i = 0;
	        int j = A.length -1;
	        int pointer = A.length -1;
	        while(i <= j) {
	        	if(Math.abs(A[i]) >= Math.abs(A[j]) ) {
	        		res[pointer--] = A[i] * A[i];
	        		i++;
	        	}
	        	else if(Math.abs(A[i]) < Math.abs(A[j]) ) {
	        		res[pointer--] = A[j] * A[j];
	        		j--;
	        	}
	        }
	        return res;
	    }
	    
	    public static int majorityElement(int[] nums) {
	        HashMap<Integer, Integer> num_mapping = new HashMap();
	        for(int i : nums){
	            if(num_mapping.containsKey(i)) num_mapping.put(i,num_mapping.get(i) + 1);
	            
	            else num_mapping.put(i, 1);
	        }
	        
	        for(Map.Entry<Integer, Integer> entry : num_mapping.entrySet()){
	            if(entry.getValue() > nums.length/2) return entry.getKey();
	        }
	        
	        return -1;
	    }
	    
	    public static String freqAlphabets(String s) {
	        StringBuilder result = new StringBuilder();
	        HashMap<String, String> map = new HashMap();
	        map.put("1","a");
	        map.put("2","b");
	        map.put("3","c");
	        map.put("4","d");
	        map.put("5","e");
	        map.put("6","f");
	        map.put("7","g");
	        map.put("8","h");
	        map.put("9","i");
	        map.put("10","j");
	        map.put("11","k");
	        map.put("12","l");
	        map.put("13","m");
	        map.put("14","n");
	        map.put("15","o");
	        map.put("16","p");
	        map.put("17","q");
	        map.put("18","r");
	        map.put("19","s");
	        map.put("20","t");
	        map.put("21","u");
	        map.put("22","v");
	        map.put("23","w");
	        map.put("24","x");
	        map.put("25","y");
	        map.put("26", "z");
	        
	        
	        for(int i=  s.length() -1; i >=0; i --){
	            if(s.charAt(i) == '#'){
	            	
	                result.append(map.get(s.charAt(i -2) + "" + s.charAt(i-1)));
//	                System.out.println(s.charAt(i -1) + "" + s.charAt(i-2));
	                i-=2;
	            }
	            else {
	                result.append(map.get(s.charAt(i) +"" ));
	            }
	        }
	        return result.reverse().toString();
	    }
	    
	    public static String longestPalindrome(String s) {
	        String sub;
	        int max_val = 0;
	        String max_pal = "";
	        for(int i =0; i < s.length(); i ++){
	            for(int j = i + 1; j <= s.length(); j ++){
	                sub = s.substring(i,j);
	                if(is_palindrome(sub)){
	                    if(max_val <= sub.length()){
	                        max_pal = sub;
	                        max_val = sub.length();
	                    }
	                }
	            }
	            
	        }
	        return max_pal;
	    }
	    
	    public static boolean is_palindrome(String s){
	        int i = 0;
	        int j = s.length()- 1;
	        while( i < j){
	            if(s.charAt(i++) != s.charAt(j--)) return false;
	        }
	        
	        return true;
	    }
	    
	    public static int countConsistentStrings(String allowed, String[] words) {
	        int count = words.length;
	        Set<Character> allowed_set = new HashSet();
	        for(int i = 0; i < allowed.length(); i ++){
	            allowed_set.add(allowed.charAt(i));
	        }
	        for(String word : words){
	            for(int i = 0; i < word.length(); i ++){
	                if(!allowed_set.contains(word.charAt(i))) {
	                	count --;
	                	break;
	                }
	            }
	        }
	        
	        return count;
	    }
	    // [1,1,2,2,2,3]
	    public static int[] frequencySort(int[] nums) {
	    	Map<Integer, Integer> freq_map = new HashMap<>();
	    	for(int i : nums) {
	    		freq_map.put(i, freq_map.getOrDefault(i, 0) + 1);
	    	}
	    	
	    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> {
	    		if(freq_map.get(a) > freq_map.get(b)) {
	    			return 1;
	    		}
	    		else if(freq_map.get(a).equals(freq_map.get(b)) ) {
	    			return b-a;
	    		}
	    		return -1;
	    	});
	    	
	    	for(Integer number : freq_map.keySet()) {
	    		pq.add(number);
	    	}
	    	int count = 0;
	    	
	    	while(!pq.isEmpty()) {
	    		int val = pq.peek();
	    		int key = freq_map.get(pq.poll());
	    		
	    		for(int i = 0; i < key; i ++) {
	    			nums[count++] = val;
	    		}
	    	}
	    	
	        return nums;
	    }
	    
	    public static int[][] kClosest(int[][] points, int K) {
	        PriorityQueue<int[]> max_heap = new PriorityQueue<>((a,b) ->{
	        	if(Math.sqrt( (Math.pow(a[0], 2)) + (Math.pow(a[1], 2)) ) < Math.sqrt( (Math.pow(b[0], 2)) + (Math.pow(b[1], 2)) )) {
	        		return -1;
	        	}
	        	return 1;
	        });
	        
	        for(int[] arr : points) {
	        	max_heap.add(arr);
	        }
	        int[][] res = new int[K][2];
	        for(int i = 0; i <K; i ++) {
	        	res[i] = max_heap.poll();
	        }
	      
	        return res;
	    }
	    
	   
	  
}
