package arraysProblemsInterview;

public class MinandMaxElement {
	
	
	
	static int GetMin(int arr[], int n)
    {
        int res = arr[0];
         
        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }
     
    static int getMax(int arr[], int n)
    {
        int res = arr[0];
         
        for (int i = 1; i < n; i++)
            res = Math.max(res, arr[i]);
        return res;
    }
	
	
	public static void main(String[] args, int[] arr) {
		
		int a[]= { 2, 789 , 6 , 89, 42 };
		int n = a.length;
		  System.out.println( "Minimum element"   + " of array: " + GetMin(arr, n));
		        System.out.println( "Maximum element"    + " of array: " + getMax(arr, n));

	}

}
