package javapractice;

public class Method1 {

	public static void main(String[] args) {
		Method m = new Method();
       
		int a = m.m1(54,23);
       
        // m.m2();      //method is private, so not accessible outside the class.
      
        int b = Method.m3(2,6);
      
        System.out.println(a);
        System.out.println(b);
	}

}
