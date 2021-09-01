package conditionalstatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		
		
//		int a =12 , b=8,c=10;
//		int result = 0;
//		
//		if(a>b) {
//			if(a>c) {
//				result = a;
//			}else {
//				
//				result = c;
//			}
//				
//			}else {
//				if(b>c) {
//					result = b;
//				}else {
//					result = c;
//				}
//			}
//				
//		
//		System.out.println(" the largest number is " +result);
             	
		// by ternary operator 
		
		int a = 12 , b = 180 , c= 100;
		int result=0;
		
		result = a>b ? a>c ? a : c : b >c ? b : c;
		System.out.println(" the largest number is " +  result);
    }

}
