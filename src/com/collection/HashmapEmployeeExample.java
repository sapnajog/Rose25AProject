package com.collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapEmployeeExample {

	public static void main(String[] args) {
		HashMap<Integer,EmployeeObjectHashmap> hm = new HashMap();
		
		EmployeeObjectHashmap e1 = new EmployeeObjectHashmap(10, " raj ", 20000f," loan ");
		EmployeeObjectHashmap e2 = new EmployeeObjectHashmap(16, " rohit ", 25000f," loan ");
		EmployeeObjectHashmap e3 = new EmployeeObjectHashmap(17, " ritik ", 25000f," loan ");
		EmployeeObjectHashmap e4 = new EmployeeObjectHashmap(17, " ritik ", 29000f," loan ");
		
		e1.setId(23);
		e1.setName("sapna");
		hm.put(1, e1);
		hm.put(2, e2);
		hm.put(3, e3);
		
		//System.out.println(hm);
		
		Set entries1 = hm.entrySet();
		
		for(Object entry : entries1) {
		
		System.out.println(entry);
		
		/*for(Object obj : hm.entrySet()) {
		 Map.Entry entry= (Map.Entry)obj;*/
			//System.out.println(entry.getKey() +  " = "  + entry.getValue() );
			
		}
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		
		System.out.println("-----------------------------------");
		
		HashMap<EmployeeObjectHashmap,String> hmap = new HashMap();
		hmap.put(e1, "developer");
		hmap.put(e2, "tester");
		hmap.put(e3, "owner");
		hmap.put(e3, "bmw");
		Set entries = hmap.entrySet();
		
		for(Object entry: entries) {
			System.out.println(entry);
			
		}
		

	}
}