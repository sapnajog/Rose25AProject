package com.collection;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.rollNumber<s2.rollNumber)
		{
			return -2;
		} else if(s1.rollNumber>s2.rollNumber) {
			return 8;
		}
		return 0;
	}

}
