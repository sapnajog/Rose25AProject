package com.practiceArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a = {1,23,34,23,23,34};
		List<Integer> al= Arrays.asList(1,23,34,23,23,34) ;
		HashSet hs = new HashSet(al);
		
		/*
		 * for(int n : a) { hs.add(n); }
		 */
	    
	    System.out.println(hs);

	}

}
