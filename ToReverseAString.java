package testPackage;

public class ToReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Selenium";
		
		//1. Using For Loop
		String rev = " ";
		int strLen = str.length();
		
		for (int i=strLen-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev); 
		
		//2.Using StringBuffer
		StringBuffer sf = new StringBuffer(str);
		System.out.println(sf.reverse());
	}

}
