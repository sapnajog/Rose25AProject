package com.String;

public class ReverseString {

	public static void main2(String[] args) {
		String s = "I am Sapna";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

	}

	public static void main1(String[] args) {
		String s = "I am AI";
		String rev = "";
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];

		}

		System.out.println(rev);

	}

	public static void main(String[] args) {
		String s = "I am AI";
		String rev = "";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}
	
	public static void main3(String[] args) {
		String s = "I am AI";
		String rev = "";
		
		String[] str = s.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			rev = rev + str[i] + " ";

		}

}
	}
