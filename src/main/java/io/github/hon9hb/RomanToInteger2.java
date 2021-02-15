package io.github.hon9hb;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger2 {

	public int solution(String s) {
		String[] charArr = s.split("");
		
		Map<String, Integer> romanMap = new HashMap<String, Integer>();
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);
		
		int output = 0;
		for(int i = 0; i < charArr.length; i++) {
			int thisNum = romanMap.get(charArr[i]);
			if (i != charArr.length -1)
				output += (thisNum >= romanMap.get(charArr[i+1]))? thisNum : thisNum * -1;
			else
				output += thisNum;
		}
		
		return output;
	}
}
