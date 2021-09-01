package methods;

public class PassByValue {

	public static void main(String[] args) {
	
//        int c =34;
//        int d= 12;
//        swap(c,d);
//        System.out.println(c + " "+d);
		
//		Dog c = new Dog();
//		c.legs = 5;
//
//		Dog d = new Dog();
//		d.legs = 6;
//		swap(c,d);
//		System.out.println(c.legs + " " + d.legs);
		
		Dog a = new Dog();
		a.legs = 4;
		changeDog(a);
		System.out.println(a.legs);
		
		
		
	}

	
	 private static void changeDog(Dog a) {
		 int legs = 6;
	}


	static void swap ( int a , int b)
	{
		int temp = a;
		a= b;
		b = temp;
	}
	 static void swap (Dog a , Dog b) {
		 	Dog temp = a;
		 	a=b;
		 	temp = b;
	 }
}

class Dog {
	int legs;
}
