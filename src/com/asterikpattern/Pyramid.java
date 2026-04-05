package com.asterikpattern;

public class Pyramid {

	public static void main(String[] args) {
		for(int line=1;line<=5;line++) {
			for(int space=4;space>=line;space--) {
				System.out.print(" ");
			}
			for(int ast=1;ast<=line;ast++) {
				System.out.print("* ");
			}
			
		System.out.println();
		}

	}

}
