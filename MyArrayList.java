package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;



public class MyArrayList {

	public static void main(String[] args) {
	    
		List <String> fruits = new LinkedList();
//		List<String> vegetables = new ArrayList();
//		ArrayList<String> fruits= new ArrayList();
		
//		List<String> toRemove = new ArrayList();
		fruits.add("apple");
		fruits.add("orrange");
		fruits.add("hi");
//		System.out.println(fruits.size());
//		System.out.println(fruits.contains("Gauva"));
//		toRemove.add("apple");
//	fruits.removeAll(toRemove);
		
	//	System.out.println(fruits.isEmpty());
		String temp[] = new String[fruits.size()];
		fruits.toArray();
		 fruits.toArray();
		System.out.println(fruits.isEmpty());
		
//		
//		vegetables.add("Potato");
//		vegetables.add("tomato");
//		vegetables.add("carrot");
		
//		fruits.addAll(vegetables);
//		System.out.println(fruits);
		
//		System.out.println(fruits.get(1));
//		
//		fruits.set(1, "Banana");
//		System.out.println(fruits);
//		
//		fruits.remove(2);
//		System.out.println(fruits);
		
//		fruits.clear();
//		System.out.println(fruits);
		
		fruits.toArray(temp);
		for(String e : temp) {
			System.out.println(e);
		}
//		
//		ArrayList<Integer> marks = new ArrayList();
//           Double x= 45.08;
//		Pair<String , Integer> p1 = new Pair("Janil", 876);
//		Pair<Boolean , String> p2 = new Pair(true, "Hello");
//		
//		p1.getDescription();
//		p2.getDescription();
//		
	}

}
