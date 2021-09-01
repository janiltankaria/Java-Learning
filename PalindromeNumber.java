package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int reversedNumber = 0;
		
		while(temp > 0) {
			
			int LastDigit = temp % 10;
			
			reversedNumber = reversedNumber * 10;
			
			temp /= 10;
		}
	    
			
if ( reversedNumber == n)
{
	System.out.println(n + "is Palindrome");
}else
{
	System.out.println(n +" is not a palindrome");
}
	}

}
