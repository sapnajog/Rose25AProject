package com.collection;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		v.add(12);
		v.add(34);
		v.add(12);
		v.add("d");
		v.add(null);
		
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		System.out.println(v.size());
	}

}
