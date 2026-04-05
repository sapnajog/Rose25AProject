package javapractice;

public class Singleton1_Test {
	
	public static void main(String[] args) {
		
		Singleton1 s1 = Singleton1.createInsatnce();
		Singleton1 s2 = Singleton1.createInsatnce();
		//Singleton1 s3 = new Singleton1();
		if(s1==s2) {
			System.out.println("same");
			
		}else {
			System.out.println("different");
		}
	}

}
