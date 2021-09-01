package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
       int grade = 13;
//		
//		if(number >= 1 && number <= 100 )                      // in logical operators it only checks one condition
//			System.out.println( " number is in the range"); 
//		if(number >= 1 & number <= 100 )
//			System.out.println( " number is in the range");  // in bitwise operators it checks both the condition
		
//		if(grade == 10 || grade == 12)
//			
//		{
//		System.out.println(" you can give exams now");	
//		}
		
//if(grade == 10 | grade == 12)
//			
//		{
//		System.out.println(" you can give exams now");	
//		}
//
//	}
       if (!(grade == 10 || grade == 12))
			
		{
		System.out.println(" you can give exams now");	
		}
       
       else
   			
   		{
   		System.out.println(" you cannot give exams now");	
   		}

	}
}
