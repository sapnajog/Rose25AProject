package com.String;

public class CheckStringContainsDigit {

	public static void main(String[] args) {
		String s = "ssss123";
		boolean isDigit = false;
		
		for(int i =0;i<=s.length()-1;i++) {
			char ch =s.charAt(i);
			if(Character.isDigit(ch)) {
				isDigit = true;
				break;
			}
		}
		System.out.println(isDigit);
	}

}
