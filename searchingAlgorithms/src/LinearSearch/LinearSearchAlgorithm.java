package LinearSearch;
import java.util.*;
public class LinearSearchAlgorithm {
	public static boolean LinearSearch(List<Integer> myList, int val) {
		
		if(myList.isEmpty()) {
			return false;
		}
		int first = myList.get(0);
		if(first == val) {
			return true;
		}
		else {
			return LinearSearch(myList.subList(1, myList.size()), val);
		}
		
	}
	
	public static boolean LinearSearch2(List<Integer> myList, int val) {
		if(myList.isEmpty()) {
			return false;
		}
		if(myList.get(0).equals(val)) {
			return true;
		}
		for(int i = 0; i < myList.size(); i++) {
			if(myList.get(i).equals(val)) {
				return true;
			}
		}
		return false;
	}
	
}
