package io.github.hon9hb;

class TwoSum1 {

	public int[] solution(int[] nums, int target) {

		// 이중 for문을 이용한 방식
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					// 두 요소의 합이 target과 같으면 각 인덱스를 담은 배열을 반환
					return new int[] { i, j };
				}
			}
		}

		// 전체 경우의 수를 돌아도 해당되는 값이 없는 경우 에러처리
		throw new IllegalArgumentException("No two sum solution");
	}
}