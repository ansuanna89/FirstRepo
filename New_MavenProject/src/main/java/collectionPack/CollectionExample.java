package collectionPack;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li =new ArrayList<String>();
		
		//add elements to list
		li.add("Ann");
		li.add("Matt");
		li.add("Ann");
		li.add("Eve");
		li.add("Ann");
		li.add("Ann");
		
		System.out.println(li);
		
		//set - To Replace an element from the list
		System.out.println(li.set(0, "Ian"));
		System.out.println(li);
		
		//indexOf - To get the index of the element, if duplicates are available, return the index of the first one.		
		System.out.println(li.indexOf("Ann"));
		
		//lastIndexOf() -  To get the index of the last occurrence of the element
		System.out.println(li.lastIndexOf("Ann"));
		
		//get()-To get the element based on the index
		System.out.println(li.get(0));
		
		//remove()- To remove an element based on index
		li.remove(2);
		System.out.println(li);
		
		
		//contains() -To check whether the element is present or not, it return true or false		
		System.out.println(li.contains("Matt"));
		System.out.println(li.contains("Iza"));
		
		//Iterate through for loop
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		//Iterate through for each loop
		for(String a: li) {
			System.out.println(a);
		}
		
		
		
		
		
		
/*		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		int sum=0;
		for(Integer num:al) {
			sum=sum+num;
			
		}
		System.out.println(sum);
		*/
	}

}
