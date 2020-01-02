package selectionSort;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class selectionSortTester {

	@Test
	void test() {
		List<Integer> t = new ArrayList<>();
		Random rand = new Random();
		for(int i = 0; i < 10; i ++) {
			t.add(rand.nextInt(10));
		}
		
		Collections.sort(t);
		
		List<Integer> exp = new ArrayList<>(t);
		List<Integer> got = selectionSortAlgorithm.selectionSort(t);
		
		assertEquals(exp,got);
	}

}
