package io.github.hon9hb;

public class LongestCommonPrefix {
	
	public String solution(String[] strs) {
		if (strs.length == 0) return "";
		if (strs.length > 200) return "ARRAY OVERFLOW";

		// 첫번째 문자열을 공통접두어로 가정
		String prefix = strs[0];
		
		for(int i = 1; i < strs.length; i++) {
			// 다음 배열이 prefix로 시작하지 않으면 뒤에서부터 한글자씩 잘라 다시 비교 (공통접두어가 나올때 까지)
			// 공통접두어가 없는 경우, prefix는 ""가 되어 while문 조건문에 충족하지 않게 됨
			while(!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() -1);
			}
		}
		return prefix;
    }
	
}
