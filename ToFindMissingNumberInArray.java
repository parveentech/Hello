package testPackage;

public class ToFindMissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,5,6};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum=sum + a[i];
		}
		
		System.out.println("Sum of the array is : " + sum);
		
		int sum1 = 0;
		for(int j=1; j<=6; j++) {
			sum1 = sum1 + j;
		}
		
		System.out.println("The missing number is : " + (sum1-sum));
	}
}
