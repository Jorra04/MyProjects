package binarySearch;
import java.util.*;
public class binarySearchRec {
	public static boolean binarySearchAlgorithm(int val,List<Integer> list) {
		if(list.isEmpty()) {
			return false;
		}
		int mid = list.size()/2;
		int e = list.get(mid);
		if(e==val) {
			return true;
		}
		else if(val<e) {
			return binarySearchRec.binarySearchAlgorithm(val, list.subList(0, mid));
		}
		else {
			return binarySearchRec.binarySearchAlgorithm(val, list.subList(mid+1, list.size()));
		}
	}
}
