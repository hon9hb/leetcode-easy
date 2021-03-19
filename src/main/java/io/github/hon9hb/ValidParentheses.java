package io.github.hon9hb;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
		
		if(s.length() < 1 || s.length() > Math.pow(10, 4)) return false;
		if(s.length() % 2 != 0) return false;
		
		Stack<Byte> codeStack = new Stack<Byte>();
		for(char c : s.toCharArray()) {
			byte thisCode = toCode(c);
			
			if (codeStack.size() == 0 && thisCode%2 == 1) return false;
			if (thisCode%2 == 0) codeStack.push(thisCode);
			else if (codeStack.pop() != thisCode -1) return false;
		}
		
		if (codeStack.size() > 0) return false;
		
		return true;
	}
	
	private byte toCode(char c) {
		switch(c) {
		case '(' : return 10;
		case ')' : return 11;
		case '[' : return 20;
		case ']' : return 21;
		case '{' : return 30;
		case '}' : return 31;
		}
		return 0;
	}
	
}
