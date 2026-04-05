package com.String;

public class CountOccurencesOfEachCharacters {

	public static void main(String[] args) {
		String s = "programming";
		for(int i=0;i<=s.length()-1;i++) {
		char ch = s.charAt(i);
		int count = 0;
		
		boolean isAlreadyCounted = false;
		for(int k =0;k<i;k++) {
			if(s.charAt(k)==ch) {
				isAlreadyCounted = true;
				break;
			}
			
		}
		if(isAlreadyCounted) {
			continue;
		}
		for(int j=0;j<=s.length()-1;j++) {
			if(s.charAt(j)==ch) {
				count++;
			}
		}
		System.out.println(ch + " = " + count);
		
		}
		
	}

}
