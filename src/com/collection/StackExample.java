package com.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(10);
		s.push(null);
		s.push(20);
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		s.peek();
         System.out.println(s);
	}

}
