package com.asterikpattern;

public class DiamondAsterik {

	public static void main(String[] args) {
		
				for(int line=5;line>=1;line--){
					for(int space=2;space<=line;space++){
						System.out.print(" ");
					}
					for(int ast=5;ast>=line;ast--){
						System.out.print("* ");
					}
					System.out.println();
				}
				for(int line=2;line<=5;line++){
					for(int space=2;space<=line;space++){
						System.out.print(" ");
					}
					for(int ast=5;ast>=line;ast--){
						System.out.print("* ");
					}
					System.out.println();
				}
			}
		}
