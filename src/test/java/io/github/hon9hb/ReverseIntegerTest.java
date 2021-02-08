package io.github.hon9hb;

import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {
	@Test
	void twoSumTest() {
		int x = -40859;

		// while문 방식
		ReverseInteger1 reverseInteger1 = new ReverseInteger1();
		int result1 = reverseInteger1.solution(x);
		System.out.println(result1);

		// StringBugger reverse 메서드 방식
		ReverseInteger2 reverseInteger2 = new ReverseInteger2();
		int result2 = reverseInteger2.solution(x);
		System.out.println(result2);
	}

}
