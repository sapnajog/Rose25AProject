package com.asterikpattern;

public class RightPascal {

	public static void main(String[] args) {
		int n=5;
		for(int line=1;line<=n;line++) {
			for(int ast=1;ast<=line;ast++) {
				System.out.print("*");
			}
			for(int space=1;space<=(n-line);space++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int line=n-1;line>=1;line--) {
			for(int ast=1;ast<=line;ast++) {
				System.out.print("*");
			}
			for(int space=1;space<=(n-line);space++) {
				System.out.print(" ");
			}
			System.out.println();
				
		}
		
		
	}
	

}
