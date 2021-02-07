package io.github.hon9hb;

import java.util.HashMap;
import java.util.Map;

class TwoSum2 {
	
	public int[] solution(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		// 보수와 Map의 containsKey 메서드를 이용한 방식
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			
			// 현재 요소(nums[i])의 보수가 현재 Map에 있으면 반환하고, 없으면 Map에 추가
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		
		// 전체 경우의 수를 돌아도 해당되는 값이 없는 경우 에러처리
		throw new IllegalArgumentException("No two sum solution");
	}
}