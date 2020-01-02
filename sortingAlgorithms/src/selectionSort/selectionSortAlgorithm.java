package selectionSort;

import java.util.*;

public class selectionSortAlgorithm {
	public static List<Integer> selectionSort(List<Integer> t) {
		if (t.isEmpty()) {
			return t;
		}
		
		for (int i = 0; i < t.size() -1; i++) {
			int minIndex = i;
			for (int k = i+1; k < t.size(); k++) {
				if(t.get(i) > t.get(k)) {
					minIndex = k;
				}
			}
			int temp = t.get(minIndex);
			t.set(minIndex, t.get(i));
			t.set(i, temp);
		}
		return t;

	}
}
