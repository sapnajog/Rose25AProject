package com.String;

public class CountOccurenceOfcharacter {

	public static void main(String[] args) {
		String s = "programming";
		char ch = 'm';
		int count = 0;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(ch + " = " + count);

	}

}
