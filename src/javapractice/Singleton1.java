package javapractice;

public class Singleton1 {
	
	private static final Singleton1 s ;
	
	static {
		 s = new Singleton1();
		 
	}
	private Singleton1() {
		
	}
	
	public static Singleton1 createInsatnce() {
		return s;
		
	}

}
