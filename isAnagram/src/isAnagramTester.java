
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isAnagramTester {

	@Test
	void test01() {
		String str1 = "Listen";
		String str2 = "Silent";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram1(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test02() {
		String str1 = "Listen";
		String str2 = "Silent";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram2(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test03() {
		String str1 = "West";
		String str2 = "Test";
		String exp = str1 + " and " + str2 + " are not anagrams";
		String got = isAnagram.isAnagram1(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test04() {
		String str1 = "West";
		String str2 = "Test";
		String exp = str1 + " and " + str2 + " are not anagrams";
		String got = isAnagram.isAnagram2(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test05() {
		String str1 = "aaaa";
		String str2 = "bbbb";
		String exp = str1 + " and " + str2 + " are not anagrams";
		String got = isAnagram.isAnagram1(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test06() {
		String str1 = "aaaa";
		String str2 = "bbbb";
		String exp = str1 + " and " + str2 + " are not anagrams";
		String got = isAnagram.isAnagram2(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test07() {
		String str1 = "School master";
		String str2 = "The Classroom";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram1(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test08() {
		String str1 = "School master";
		String str2 = "The Classroom";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram2(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test09() {
		String str1 = "Astronomer";
		String str2 = "Moon Starer";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram1(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test10() {
		String str1 = "Astronomer";
		String str2 = "Moon Starer";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram2(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test11() {
		String str1 = "Funeral";
		String str2 = "Real Fun";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram1(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test12() {
		String str1 = "Funeral";
		String str2 = "Real Fun";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram2(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test13() {
		String str1 = "A Gentleman";
		String str2 = "Elegant man ";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram1(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test14() {
		String str1 = "a Gentleman";
		String str2 = "elegant Man";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram2(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test15() {
		String str1 = "A GeNt lE man";
		String str2 = "ElEga Nt m a N ";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram1(str1, str2);
		assertEquals(exp,got);
	}
	@Test
	void test16() {
		String str1 = "a GE nt Lem an";
		String str2 = "EL e G ant MAN";
		String exp = str1 + " and " + str2 + " are anagrams";
		String got = isAnagram.isAnagram2(str1, str2);
		assertEquals(exp,got);
	}

}
