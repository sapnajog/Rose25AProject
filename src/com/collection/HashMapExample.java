package com.collection;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		 
		HashMap hm = new HashMap ();
		
		hm.put(17,"a" );
		hm.put(12, "b");
		hm.put(13, "c");
		hm.put(12, "b");          
		
		System.out.println(hm);        //{17=a, 12=b, 13=c } overrides the duplicate key


	}

}
