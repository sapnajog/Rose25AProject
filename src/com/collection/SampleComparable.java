package com.collection;

import java.util.TreeSet;

public class SampleComparable {

	public static void main(String[] args) {
		Student aarohi = new Student(45,"aarohi",7.3f);
		Student rudransh = new Student(17,"rudransh",7.5f);
	    Student rajveer = new Student(21,"rajveer",6.4f);
	    Student neera = new Student(19,"nera",6.7f);
	    
	    TreeSet ts = new TreeSet();
	    
	    ts.add(aarohi);
	    ts.add(rudransh);
	    ts.add(rajveer);
	    ts.add(neera);
	    
	    System.out.println(ts);
	   
	}

}
