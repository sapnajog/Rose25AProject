package com.collection;

public class Student implements Comparable{

	int rollNumber;
	String name;
	float marks;
	
	public Student(int rollNumber,String name,float marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks= marks;
		
		
		
	}

	@Override
	public int compareTo(Object o) {    //comparing on basis of marks...
		//this<o  -ve
		//this>o  +ve
		//this==o zero
		Student s = (Student)o;
		
		//return this.name.compareTo(s.name); //comparing on basis of name...
		//}
		
		if(this.marks< s.marks) {
		return -5;
		}
		else if(this.marks > s.marks){
			return 4;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "[" + rollNumber + "=" + name +"]";
		
		
	}
	

}
