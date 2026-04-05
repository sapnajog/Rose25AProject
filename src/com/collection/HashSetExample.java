

















package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet(); // insertion order is preserved.
           
		hs.add(12);
		hs.add(21);
		hs.add(8);
		hs.add(9);
		hs.add(11);
		System.out.println(hs);
	}

}
