package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Pet p = d;
//		Animal a = d;
//		
//		
//		d.walk();
//		p.walk();

//		greetings( " Good Morning ", 5);
		System.out.println(d.name);
		System.out.println(p.name);
	

		}
		public static void  greetings() {
			System.out.println("Hi There");
	}
public static void greetings(String s) {
	System.out.println(s);
}
public static void greetings(String s , int count) {
	for(int i = 0 ; i<count;i++)
	{
		System.out.println(s);
	}
}
}

