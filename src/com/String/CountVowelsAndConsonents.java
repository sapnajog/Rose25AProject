package com.String;

public class CountVowelsAndConsonents {

	public static void main(String[] args) {
		String s = "I am an AI agent.";
		s =s.toLowerCase();
		int vowels =0;
		int consonants =0;
		
		/*
		 * for(int i =0;i<=s.length()-1;i++) { char a = s.charAt(i); if(a>='a' &&
		 * a<='z') { if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') { vowels++; }else {
		 * consonents++; } } }
		 */
		
		for(char ch:s.toCharArray()) {
			if(Character.isLetter(ch)) {
				if("aeiou".indexOf(ch)!=-1) {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		
		System.out.println("no.of vowels " + vowels);
		System.out.println("no.of consonents " + consonants);
		

	}

}
