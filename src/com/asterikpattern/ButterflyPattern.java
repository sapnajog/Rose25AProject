package com.asterikpattern;

public class ButterflyPattern {

	public static void main(String[] args) {
		int n =5;
		//upper half
		for(int line=1;line<=n;line++) {
			for(int ast=1;ast<=line;ast++) {	
				System.out.print("*");
			}
			for(int space=1;space<=2*(n-line);space++) {
				System.out.print(" ");
			}
			//right stars
			for(int ast=1;ast<=line;ast++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		//lower half
		for(int line=n-1;line>=1;line--) {
			for(int ast=1;ast<=line;ast++) {
				System.out.print("*");
			}
			for(int space=1;space<=2*(n-line);space++) {
			System.out.print(" ");	
			}
			//right star
			for(int ast=1;ast<=line;ast++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
