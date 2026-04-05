package com.collection;

import java.util.TreeSet;

public class SampleComparator {

	public static void main(String[] args) {
		Student aarohi = new Student(45,"aarohi",7.3f);
		Student rudransh = new Student(17,"rudransh",7.5f);
	    Student rajveer = new Student(21,"rajveer",6.4f);
	    Student neera = new Student(19,"nera",6.7f);
	    
	    TreeSet<Student> ncc = new TreeSet<Student>(new MarksComparator());
	    
	    ncc.add(aarohi);
	    ncc.add(rudransh);
	    ncc.add(rajveer);
	    ncc.add(neera);
	    
	    System.out.println(ncc);
	    
        TreeSet<Student> singers = new TreeSet<Student>(new RollNoComparator());
	    
	    singers.add(aarohi);
	    singers.add(rudransh);
	    singers.add(rajveer);
	    singers.add(neera);
	    
	    System.out.println(singers);

	}

}
