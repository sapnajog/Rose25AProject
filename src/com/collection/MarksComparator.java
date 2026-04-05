package com.collection;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student> {


	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.marks<s2.marks) {
			return -4;
		}else if(s1.marks>s2.marks) {
			return 5;
		}else
		
		return 0;
	}

}
