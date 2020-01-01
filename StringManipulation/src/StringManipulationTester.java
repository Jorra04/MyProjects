import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringManipulationTester {

	@Test
	void test01() {
		String h = "Hello";
		String exp = h.substring(1, 3);
		String got = StringManipulation.subString1(h, 1, 3);
		System.out.println(got);
		assertEquals(exp, got);
	}

	@Test
	void test02() {
		String h = "Hello";
		String exp = h.substring(0, 4);
		String got = StringManipulation.subString1(h, 0, 4);
		System.out.println(got);
		assertEquals(exp, got);
	}
	@Test
	void test03() {
		String h = "Hello";
		String exp = h.substring(0, 5);
		String got = StringManipulation.subString1(h, 0, 5);
		System.out.println(got);
		assertEquals(exp, got);
	}

	@Test
	void test03MethodThrows() {
		String h = "Hello";
		try {
			String got = StringManipulation.subString1(h, 4, 3);
			
			fail("should have thrown an exception");
		} catch (IllegalArgumentException x) {
		}
	}
	@Test
	void test04() {
		String h = "Hello";
		char exp = h.charAt(4);
		char got = StringManipulation.charAt1(h, 4);
		System.out.println(got);
		assertEquals(exp, got);
	}
	@Test
	void test05() {
		String h = "Hello";
		String exp = h.replace('e', 'f');
		String got = StringManipulation.replaceChars1(h, 'e', 'f');
		System.out.println(got);
		assertEquals(exp, got);
	}
	@Test
	void test06() {
		String h = "HelLo";
		String exp = h.toLowerCase();
		String got = StringManipulation.toLowerCase1(h);
		System.out.println(got);
		assertEquals(exp, got);
	}
	@Test
	void test07() {
		String h = "HelLo";
		String exp = h.toUpperCase();
		String got = StringManipulation.toUpperCase1(h);
		System.out.println(got);
		assertEquals(exp, got);
	}

}
