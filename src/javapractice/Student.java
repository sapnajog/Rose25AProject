package javapractice;

public class Student {
	int roll_no=20;
	String name="abc";
	
	public Student s1() {
		return new Student();
	}
	

	public static void main(String[] args) {
		Student a = new Student();
		Student t = a.s1();
		System.out.println(a.roll_no);
		System.out.println(a.name);

	}

}
