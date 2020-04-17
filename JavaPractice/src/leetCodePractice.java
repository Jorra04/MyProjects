import java.util.*;
import java.util.Map.Entry;
public class leetCodePractice {

	public static void main(String[] args) {
//		System.out.println(firstUniqChar("loveleetcode"));
		int [] nums = {4,3,2,7,8,2,3,1};
//		arrayPrinter(smallerNumbersThanCurrent(nums));
//		System.out.println(frequencySort("hello"));
//		arrayPrinter(sortedSquares(nums));
//		System.out.println(smallestChar("abcd"));
		System.out.println(findDuplicates(nums));
	}
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> returner = new ArrayList<>();
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i ++ ){
            int val = nums[i];
            if(myMap.containsKey(val)) myMap.put(val, myMap.get(val) +1);
            
            else myMap.put(val, +1);
        }
        for(Entry<Integer, Integer> entry : myMap.entrySet()){
            if(entry.getValue() == 2) {
            	returner.add(entry.getKey());
            }
        }
        return returner;
    }
//	public String sortString(String s) {
//        
//    }
    public static char smallestChar(String s){
        char min = s.charAt(1);
        for(int i =0; i < s.length(); i ++) {
        	char val = s.charAt(i);
        	if(val  < min) min = val;
        }
        
        return min;
    }
	
	
	 public static int firstUniqChar(String s) {
	        HashMap<Character, Integer> charCount = new HashMap<>();
	        for(int i =0; i < s.length(); i ++){
	            char c = s.charAt(i);
	            if(charCount.containsKey(c)) charCount.put(c, charCount.get(c) +1);
	            
	            else charCount.put(c,1);
	        }
	        
	        for(int i = 0; i < s.length(); i ++){
	            char c = s.charAt(i);
	            if(charCount.get(c) == 1) return i;
	        }
	        return -1;
	    }
	 
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
	        int[] returner = new int[nums.length];
	    
	        for(int i = 0; i < nums.length; i ++){
	            for(int j = 0; j < nums.length; j ++){
	                if(nums[i] > nums[j] && i != j){
	                    returner[i]++;
	                }
	            }
	        }
	        
	        return returner;
	    }
	 
	 
	 public static String frequencySort(String s) {
	        HashMap<Character, Integer> myMap = new HashMap<>();
	        for(int i = 0; i < s.length(); i ++){
	            char c = s.charAt(i);
	            if(myMap.containsKey(c)) myMap.put(c, myMap.get(c) + 1);
	            
	            else myMap.put(c, 1);
	        }
	        List<Integer> myList = new ArrayList<>();
	        for(Integer i : myMap.values()) {
	        	myList.add(i);
	        }
	        Collections.sort(myList);
	        
	        return "";
	    }
	 
	 public static int[] sortedSquares(int[] A) {
	        List<Integer> myList = new ArrayList<>();
	        for(int i : A){
	            myList.add(i*i);
	        }
	        
	        Collections.sort(myList);
	        
	        int[] returner = new int[myList.size()];
	        
	        for(int i = 0; i < myList.size(); i ++){
	            returner[i] = myList.get(i);
	        }
	        
	        return returner;
	    }
	 
	 public static void arrayPrinter(int[] arr) {
		 for(int i = 0; i < arr.length; i ++) {
			 if(i != arr.length -1) {
				 System.out.print(arr[i]+ ", ");
			 }
			 else {
				 System.out.print(arr[i]);
			 }
		 }
	 }

}
