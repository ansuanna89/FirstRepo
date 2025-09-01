package collectionPack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Blue");
		al.add("Red");
		al.add("White");
		al.add("Black");
		System.out.println(al);
		
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Apple");
		name.add("Banana");
		name.add("Orange");
		name.add("Grapes");
		System.out.println(name);
		
		//addAll()-To add/combine one collection to another collection		
		al.addAll(name);
		System.out.println(al);
		System.out.println(name);
		
		//containsAll()- To check all the elements of one collection is present in another collection
		System.out.println(al.containsAll(name));
		System.out.println(name.containsAll(al));
		
		//isEmpty()--To check the collection is empty or not
		System.out.println(al.isEmpty());
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		System.out.println(num.isEmpty());
		
		//iterator()--
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(al);
		
		
		
		
		
		
		
		/*
		for(String color:al) {
			System.out.println(color);
		}*/
	}

}
