package io.github.hon9hb;

import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

	@Test
	void longestCommonPrefixTest() {
		
		String[] strs1 = {"flower", "flow", "flight"};
		String[] strs2 = {"dog", "race", "car"};
		
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		
		String result1 = longestCommonPrefix.solution(strs1);
		System.out.println("longest common prefix : " + result1);
		
		String result2 = longestCommonPrefix.solution(strs2);
		System.out.println("longest common prefix : " + result2);
		
	}
}
