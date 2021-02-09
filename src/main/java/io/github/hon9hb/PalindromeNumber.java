package io.github.hon9hb;

public class PalindromeNumber {

	public boolean solution(int x) {
		// 음수인 경우, 부호로 인해 비대칭수
		if (x < 0)
			return false;

		int orgin = x;
		int reversed = 0;
		// 역수(ReversedInteger)를 구함
		while (x != 0) {
			reversed = (reversed * 10) + (x % 10);
			x = x / 10;
		}
		
		// 주어진 수와 역수의 비교 결과 반환
		return orgin == reversed;
	}
}
