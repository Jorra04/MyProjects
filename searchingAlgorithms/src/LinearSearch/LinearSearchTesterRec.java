package LinearSearch;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinearSearchTesterRec {

	@Test
	void test01() {
		Random rand = new Random();
		List<Integer> t = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			t.add(rand.nextInt(10));
		}
		
		
		int x = rand.nextInt(10);
		boolean exp = t.contains(x);
		boolean got = LinearSearchAlgorithmRec.LinearSearch(t,x);
//		System.out.println(t);
//		System.out.println(x);
//		System.out.println(exp);
//		System.out.println(got);
		assertEquals(exp,got);
	}

}
