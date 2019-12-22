package recursiveMethods;
import java.util.*;

import static org.junit.Assert.*;


import org.junit.Test;

public class recursiveMethodsTester {

	@Test
	public void recursionFactorialTest01() {
		// test case for n == 5
		int expect = 120;
		int got = recursiveMethods.recursiveFactorial(5);
		assertEquals(expect, got);
	}
	@Test
	public void recursionFactorialTest02() {
		recursiveMethods rm = new recursiveMethods();
		// test case for n == 0
		int expect = 1;
		int got = recursiveMethods.recursiveFactorial(0);
		assertEquals(expect, got);
	}
	@Test
	public void recursionFactorialTest03() {
		// test case for n == 1
		int expect = 1;
		int got = recursiveMethods.recursiveFactorial(1);
		assertEquals(expect, got);
	}
	@Test
	public void recursionFactorialTest04() {
		// test case for n == 8
		int expect = 40320;
		int got = recursiveMethods.recursiveFactorial(8);
		assertEquals(expect, got);
	}
	@Test
	public void maxRecursion() {
		List<Integer> ls = new ArrayList<>();
		for(int  i = 1; i <= 5; i++) {
			ls.add(i);
		}
		int expect = 5;
		int got = recursiveMethods.maxOf(ls);
		assertEquals(expect, got);
	}
	@Test
	public void maxRecursion02() {
		List<Integer> ls = new ArrayList<>();
		ls.add(550);
		ls.add(342);
		ls.add(2221);
		ls.add(4536);
		ls.add(769);
		int expect = 4536;
		int got = recursiveMethods.maxOf(ls);
		assertEquals(expect, got);
	}

}
