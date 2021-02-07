package io.github.hon9hb;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TwoSumTest {
	
	@Test
	void twoSumTest() {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 17;

		// 이중 for문 방식
		TwoSum1 twoSum1 = new TwoSum1();
		int[] result1 = twoSum1.solution(nums, target);
		printIntArray(result1);

		// 보수와 Map의 containsKey 메서드 방식
		TwoSum2 twoSum2 = new TwoSum2();
		int[] result2 = twoSum2.solution(nums, target);
		printIntArray(result2);
	}

	private void printIntArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
