package io.github.hon9hb;

public class RomanToInteger1 {

	public int solution(String s) {
		int output = 0;
		for(int i = 0; i < s.length(); i++) {
			int thisNum = charToInt(s.charAt(i));
			output += thisNum;
			
			if ( (i != s.length() -1) && (thisNum < charToInt(s.charAt(i+1))) ) {
				output -= thisNum *2;
			}
		}
		
		return output;
	}
	
	private static int charToInt(Character c) {
		switch (c) {
			case 'I' : return 1;
			case 'V' : return 5;
			case 'X' : return 10;
			case 'L' : return 50;
			case 'C' : return 100;
			case 'D' : return 500;
			case 'M' : return 1000;
			default: return 0;
		}
	}
}
