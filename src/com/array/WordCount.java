 package com.array;

public class WordCount {

	public static void main(String[] args) {
		String s= "Hello Pune";
		char[] ch = s.toCharArray();
		int count =0;
		boolean word = false;
		for(int i=0;i<ch.length;i++) {
			char c =ch[i];
			if(c!=' '&& !word) {
				count++;
				word=true;
				
			}else if(c==' ') {
				word = false;
			}
		}
		System.out.println(count);

	}

}
