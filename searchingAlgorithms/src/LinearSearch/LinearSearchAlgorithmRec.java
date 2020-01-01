package LinearSearch;
import java.util.*;
public class LinearSearchAlgorithmRec {
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
	
}
