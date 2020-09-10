package testPackage;

public class ToRemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "%^&*(*)* testing *!@#$#%$ java";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("After removing junk characters" +s);

	}

}
