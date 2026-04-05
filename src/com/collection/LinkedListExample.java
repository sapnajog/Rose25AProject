
package com.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(13);
		list.add(25);
		list.add(13);
		list.add(null);
		list.add(7.4f);

		for (Object l : list) {
			System.out.println(l);

		}

		System.out.println(list.get(2));

		list.clear();
		System.out.println(list);

	}

}
