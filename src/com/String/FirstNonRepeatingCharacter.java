package com.String;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "swiss";
		
		for(int i=0;i<s.length()-1;i++) {
		char ch = s.charAt(i);
		boolean isUnique = true;
		
		for(int j=0;j<s.length()-1;j++) {
			if(i!=j && s.charAt(j)==ch) {
				isUnique = false;
				break;
			}
		}
		if(isUnique){
			System.out.println(ch);
			break;
		}
		}
		

	}

}
