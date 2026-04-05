  package com.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String s = "I am an automation engineer";
		String result = "";
		
		for(int i=0;i<s.length();i++) {
			char ch  = s.charAt(i);
			boolean isDuplicate = false;
			for(int j=0;j<result.length();j++) {
				if(result.charAt(j)==ch) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				result = result+ch;
				
				}
		}
		
		/*
		 * Set<Character>set = new LinkedHashSet(); for(char ch : s.toCharArray()) {
		 * set.add(ch);
		 * 
		 * } StringBuilder sb = new StringBuilder(); for(char ch : set) { sb.append(ch);
		 * } System.out.println(sb.toString());
		 */
		
		
	System.out.println(result);	
		
	}

}
