package javapractice;

public class Singleton_Test {
 
	public static void main(String[] args) {
	
		Singleton s1 = Singleton.createInstance();
		Singleton s2 = Singleton.createInstance();
		Singleton s3 = Singleton.createInstance();
		if(s1==s3 && s1==s2 && s2==s3) {
			System.out.println("equal");
		}else {
			System.out.println("unequal");
		}
		
 }
	
}
