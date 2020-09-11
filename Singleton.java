package testPackage;

public class Singleton {

	//Singleton is a special class which will have only one object instance at a time
	//Conditions to achieve it
	//1.it should have a private constructor
	//2.write public static method (getInstance) which will have a return type of object of this singleton class
	
	
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {
		 str = "implementing singleton class";
	}
	
	public static Singleton getInstance() {
		if(singleton_instance == null) {
			singleton_instance = new Singleton();
		}		
		return singleton_instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str= x.str.toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str= z.str.toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}

}
