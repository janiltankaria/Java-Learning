package conditionalstatements;


public class Calculator {

	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(" Enter First Number");
//		int a = sc.nextInt();
//		
//		System.out.println(" Enter Second Number");
//		int b = sc.nextInt();
//
//		System.out.println(" Enter the operation");
//		sc.nextLine();
//		char operation = sc.nextLine().charAt(0);
//		
//		int result=0;
//		
//		switch (operation) {
//		case '+':
//			result = a + b;
//			break;
//		case '-' :
//			result = a - b;
//			break;
//		case '*' :
//			result = a*b;
//			break;
//		case '/' :
//			result = a/b;
//			break;
//		default:
//			System.out.println(" invalid operation");
//		}
//		System.out.println(" the result is " + result);
		
	     int rating = 3;
	     
	     switch(rating) {
	     
	     case 1 :
	     case 2:
	    	 System.out.println("bad review");
	    	 break;
	     case 3 :
	    	 System.out.println(" Average Review");
	    	 break;
	     case 4 :
	     case 5 :
	    	 System.out.println( " good review ");
	    	 break;
	    	 
	     }
		
		}
		
	

}
