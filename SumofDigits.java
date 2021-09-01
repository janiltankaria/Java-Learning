package whileLoops;

import java.util.Scanner; 
public class SumofDigits {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
	
//		while (temp > 0) {
//			
//			
//			int LastDigit = temp % 10;
//			temp /= 10;
//			
//			sum += LastDigit;
//			System.out.println(LastDigit +" " + temp + "  " + sum );
//		}
//				
//		System.out.println(" the sum of digits of "+ n + " is " + sum);

		int numberOfDigits =(int)Math.log10(n) + 1;
		System.out.println(numberOfDigits);
	}

}
