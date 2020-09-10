package testPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ToFindDuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = {"John", "Mary", "Adam", "John", "Rita", "Eve"};
		
		//1.Using HashSet
		Set<String> uniqueVal = new HashSet<String>();
		for(String name : names) {
			if(uniqueVal.add(name) == false) {
				System.out.println("The duplicate string is : " + name);
			}
		}
		
		
	}

}
