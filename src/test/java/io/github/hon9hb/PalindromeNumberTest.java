package io.github.hon9hb;

import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
	@Test
	void palindromeNumberTest() {
		int x = 1349431;

		// while문 방식
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		boolean result = palindromeNumber.solution(x);
		System.out.println("Is " + x + " a palindrome? : " + result);
	}
}
