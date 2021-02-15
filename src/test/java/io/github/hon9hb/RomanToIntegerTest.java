package io.github.hon9hb;

import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {
	
	@Test
	void romanToIntegerTest() {
		String s1 = "LXXIV";
		String s2 = "MCMXCIV";
		
		// Switch문을 이용한 방식
		RomanToInteger1 romanToInteger1 = new RomanToInteger1();
		int result1 = romanToInteger1.solution(s1);
		System.out.println(s1 + " refers to " + result1);

		// Map을 이용한 방식
		RomanToInteger2 romanToInteger2 = new RomanToInteger2();
		int result2 = romanToInteger2.solution(s2);
		System.out.println(s2 + " refers to " + result2);
		
	}
}
