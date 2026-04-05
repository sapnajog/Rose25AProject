  package com.String;

public class AllNonRepeatingCharacters {

	public static void main(String[] args) {
		String s = "programming";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			boolean isUnique=true;
			
			for(int j=0;j<s.length();j++) {
				if(i!=j && s.charAt(j)==ch) {
					isUnique = false;
					break;
				}
			}
			if(isUnique) {
				System.out.println(ch);
			}
		}

	}

}
