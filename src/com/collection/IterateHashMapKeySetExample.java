package com.collection;

import java.security.Key;
import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IterateHashMapKeySetExample {

	public static void main(String[] args) {
     
		HashMap hm = new HashMap();
		
		hm.put(1,"a");
		hm.put(2, "b");
		hm.put(null, null);
		hm.put(4, null);
		hm.put(3,"c");
        
		System.out.println(hm);
		
		Collection values = hm.values();
	    Set keys = hm.keySet();
	//...................//using Iterator//............................
	    
	    Iterator itr = keys.iterator();
	    
	    while(itr.hasNext()) {
           Integer fromKey = (Integer) itr.next();
           
           System.out.println((fromKey));
	        
	    	//System.out.println(hm.get(keys));     
	        // System.out.println( "value" + value);
	    }
	    
	    
	 //---------------using for each loop----------------------//
	    
	    
	    for(Object key :keys) {
	    	System.out.println(key);
	    }
	    for(Object value :values) {
	    	System.out.println(value);}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
