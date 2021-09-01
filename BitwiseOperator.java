package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
             
		// int a = 5;    // 5 = 101(binary representation) , 6 = 110 , now in the and operator  1 + 0 =0 and 1 + 1 = 1 therfore if we add we get 4
		// int b = 6;
		//int c = a & b; // and operator
		// int c = a|b ; // or operator
		// System.out.println(c);

		//right shift 
		// 1101 --> 0110 --> 0011
		int a = 10;
		int b = 11;
		//int c = b >> 1 ; // right shift 1 time 
		//int c = b >> 2 ; // right shift 2 times
		//int c = b<< 1; // left shift 1 times
		int c = b << 2 ; //left shift 2 times
		System.out.println(c);
		
	}

}
