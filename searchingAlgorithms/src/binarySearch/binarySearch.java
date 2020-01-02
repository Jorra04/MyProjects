package binarySearch;
import java.util.*;
public class binarySearch {
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
			return binarySearch.binarySearchAlgorithm(val, list.subList(0, mid));
		}
		else {
			return binarySearch.binarySearchAlgorithm(val, list.subList(mid+1, list.size()));
		}
	}
	
	public static boolean binarySearchAlgorithm2( int val, List<Integer> list) {
		if(list.isEmpty()) {
			return false;
		}
		int mid = list.size()/2;
		int e = list.get(mid);
		if(e == mid) {
			return true;
		}
		else if(val < e) {
			for(int i = 0; i < mid; i++) {
				if(list.get(i).equals(val)) {
					return true;
				}
			}
		}
		else {
			for(int i = mid; i < list.size(); i++ ) {
				if(list.get(i).equals(val)) {
					return true;
				}
			}
			
		}
		return false;
	}
	
}
