package collectionPack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> st = new HashSet<String>();
		
		st.add("Cat");
		st.add("Dog");
		st.add("Frog");
		st.add("Elephant");
		st.add("Dog");
		
		System.out.println(st);
		
		st.remove("Frog");
		System.out.println(st);
		
		//adAll, contains, containsAll, remove, size, isEmpty,iterate,  clear
		System.out.println(st.contains("cat"));
		
		Set<String> birds = new HashSet<String>();
		birds.add("Peacock");
		birds.add("crow");
		birds.add(null);
		birds.add("falcon");
		birds.add("Pigeon");
		birds.add("Peacock");
		birds.add("");
		birds.add(null);
		
		System.out.println(birds);
		
		
		System.out.println(st.containsAll(birds));
		st.addAll(birds);
		System.out.println(st);
		System.out.println(st.containsAll(birds));
		
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		
		Iterator<String> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(st);
		System.out.println(st.size());
		st.clear();
		System.out.println(st);
		
		
		
		
	}

}
