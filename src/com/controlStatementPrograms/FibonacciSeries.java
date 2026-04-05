package com.controlStatementPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n =10;
		int a=0;
		int b=1;
		
		System.out.println("Fibonacci series : ");
		/*int i=1;
		
		while(i<=n) {
			System.out.println(a + " ");
			int nextNo = a+b;
			a=b;
			b=nextNo;
		i++;*/
		for(int i =2;i<=n;i++) {
			System.out.print(a +" ");
			int num = a+b;
			a=b;
			b=num;
		}
	}

}
