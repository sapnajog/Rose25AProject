package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashmapEntrySetExample {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put(1,"a");
		hm.put(2, "b");
		hm.put(null, null);
		hm.put(4, null);
		hm.put(3,"c");
  System.out.println(hm);
  
           Set entries = hm.entrySet();
  
      //---------------using  iterator-----------------------//
           
           // Iterator itr =  entries. iterator();
           
          /* while(itr.hasNext()) {
        	Entry nextElement =(Entry)itr.next();
        	
        	System.out.println(nextElement.getKey() + "=" + nextElement.getValue());*/
        	   
          // }
           
     //-------------using enterySet() by for each loop-----------------------//      
	
           for(Object entry: entries) {
		      System.out.println(entry);
	}
	
	}

}
