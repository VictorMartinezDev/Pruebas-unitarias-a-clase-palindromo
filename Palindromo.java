package org.generation;

public class Palindromo {
	
	public boolean isPalindrome(String text) {
		
		String textFormat = formated(text);
		String textInvert = invertText(textFormat);
		
		if(textFormat.equals(textInvert)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String formated(String text) {
		
		return text.toLowerCase().replaceAll("\\s+", "");
		
	}
	
	public String invertText(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		return sb.toString();
	}

}