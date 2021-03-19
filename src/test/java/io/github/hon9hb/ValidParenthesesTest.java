package io.github.hon9hb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

	@Test
	public void validParenthesesTest() {
		String[] testStrs = {"()", "()[]{}", "(]", "([)]", "{[]}"};
		boolean[] results = {true, true, false, false, true};
		
		ValidParentheses validParentheses = new ValidParentheses();
		for(int i = 0; i < testStrs.length; i++) {
			assertEquals(results[i], validParentheses.isValid(testStrs[i]));
		}
	}
}
