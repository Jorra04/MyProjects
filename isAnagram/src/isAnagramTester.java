
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
	

}
