package NestedForLoop;

import java.util.Scanner;

public class Pattern7{ 

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int i = 1 ; i <= rows; i++)
		{
			if(i<=n)
			{
				for(int j = 1;j<=i;j++)
				{
					System.out.println("* ");
				}
			
			}else {
				for(int j = 1; j<=rows-i+1;j++) {
					System.out.println("* ");
				}
				
		}
			System.out.println();
			
		}
	}
	
		
		
	
