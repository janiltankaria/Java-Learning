package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		//break 
//		for(int i = 1; i<=100; i++)
//		{
//			if(i==35)
//			{
//				break;
//			}
//			System.out.println(i);
//		}
		
		
		
//the loop runs till the user gives negative numbers
		Scanner sc = new Scanner(System.in);
		for (;;) {                               //for infinite loop
			
			int n = sc.nextInt();
			
			if(n < 0) {
				break;
			}
		}
	
	}


}
