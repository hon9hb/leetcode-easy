package io.github.hon9hb;

public class ReverseInteger2 {
	
	public int solution(int x) {
		// StringBugger를 이용해 주어진 숫자의 절대값의 역수를 문자열로 저장
		String reversed = new StringBuffer().append(Math.abs(x)).reverse().toString();
		try {
			// 음수인 경우, 음수값을 적용
			return (x < 0)? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
		}catch(NumberFormatException e) {
			return 0;
		}
	}
}
