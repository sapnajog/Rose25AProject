package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//List<Object> aList = new ArrayList<Object>(List.of(18,23,23,"bmw",6.7f,null));
		//aList.forEach(  printList -> System.out.println("printList :: "+printList));
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(18);
		al.add(23);
		al.add(23);
		al.add("bmw");
		al.add(6.7f);
		al.add(null);
		
		
       //for(int i =0;i<=al.size();i++) {
	       al.get(3);
	      // al.remove(3);
//}
	System.out.println(al.get(3));
	}

}
