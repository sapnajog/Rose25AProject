package com.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();     // insertion order is not preserved.but sorted in ascending order.
		
		ts.add(23);                     //duplicates are not allowed.
		ts.add(34);           //heterogeneous elements are not allowed.means only homogeneous allowed.
		ts.add(45);
		ts.add(56);
		ts.add(43);
		ts.add(21);
		
		System.out.println(ts);

	}

}
