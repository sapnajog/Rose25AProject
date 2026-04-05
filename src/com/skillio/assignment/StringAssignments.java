package com.skillio.assignment;

public class StringAssignments {
	public boolean isPalindrome(String str) {
		String cleanStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String reversedStr = new StringBuilder(cleanStr).reverse().toString();
		return cleanStr.equals(reversedStr);
	}

}
