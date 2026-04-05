package javapractice;

public class Singleton {

	public final static Singleton s = new Singleton();
		
	private Singleton(){
			
		}
		
    public static Singleton createInstance(){
			
			return s;
			
		}

	}


