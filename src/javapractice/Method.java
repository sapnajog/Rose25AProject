package javapractice;

/*  return keyword is used to exit a method,optionally it return value to the calling method,it immediately stop the execution of the method and sends control back to the caller.

    its return with int value and if return type is void means it does not return any value.
    
    <access-modifier><returntype><method-name>(){}
*/

public class Method {
	
	protected int m1(int x,int y) {        //method m1()- its a group of instruction we can write logic once and call multiple times.
		return x+y;         
	}
	public String m2(String s) {
		return s;
	}
	public static int m3(int x,int y) {
		return x*y;
	}
	
	public static void main(String[] args) {
		System.out.println(6);
		System.out.println("abc"); //accesible only within class
		m3(2,5);        //static method does not need to create object to invoke.

	}

}
