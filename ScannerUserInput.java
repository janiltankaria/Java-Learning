package userinput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
				//int x = sc.nextInt();
		         
				//double y =sc.nextDouble();
				//System.out.println(x);
				//System.out.println(y);
              // String hello = sc.nextLine();
               //System.out.println(hello);

// Simple interest calculation by taking our own values
		
      //  int principal = 5000;
      //float rate = 12.5f;
      //  int time =12;
        
      //  float simpleinterest = principal * rate * time /100;
      //  System.out.println(" the simple interst is " +simpleinterest);
	
		
		// Simple interest calculation by taking values from users 
		Scanner sc = new Scanner(System.in);
	        int principal = sc.nextInt();
	      float rate = sc.nextFloat();
	        int time =sc.nextInt();
	        
	       float simpleinterest = principal * rate * time /100;
	        System.out.println(" the simple interst is " +simpleinterest);
		
	}
	


}
