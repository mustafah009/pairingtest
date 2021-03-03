package com.olr.pairingtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PairingtestApplicationTests {

	@Test
   public void testPalindrome() {
     	Palindrome palindrome = new Palindrome();
			assertEquals(true, palindrome.isPalindrome("abcba"));			
			assertEquals(false, palindrome.isPalindrome("abc"));
			assertEquals(false, palindrome.isPalindrome(null));
   }

   @Test
   public void testFindLongestPalindrome() {
		Palindrome palindrome = new Palindrome();
		assertEquals("", palindrome.findLongestPalindrome(null));
		assertEquals("a", palindrome.findLongestPalindrome("ab"));
		assertEquals("aba", palindrome.findLongestPalindrome("ababcbcas"));
		assertEquals("baabcbaab", palindrome.findLongestPalindrome("abaabcbaabcdcba"));
   }

}
