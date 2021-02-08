package io.github.hon9hb;

public class ReverseInteger1 {
	
	public int solution(int x) {
		long output = 0;
		
		while(x != 0) {
			// 이전 loop에서 담은 숫자를 윗자리로 올리고, 10으로 나눈 나머지를 일의 자리로 가짐
			int digit = x%10;
			output = output * 10 + digit;
			
			// 역수로 취했을 때 Integer 범위가 넘어가는지 체크
			if (output > Integer.MAX_VALUE || output < Integer.MIN_VALUE) {
				return 0;
			}
			x = x/10;
		}
		return (int) output;
	}
}
