package com.String;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		String s = "h9l1o ski11i0";
		int sum = 0;
		boolean isDigit = false;
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				isDigit=true;
				sum =sum +ch - 48;    ///'0' also 
				
			}
		}
		System.out.println(sum);

	}

}
