package stringProgram;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);

		StringBuilder sbs = new StringBuilder("Hey");
		System.out.println(sbs);
		
		
		//insert -- to insert a particular element in the given string based on index
		System.out.println(sb.insert(1, "WWW"));

		//append
		System.out.println(sb.append("World"));
		
		//replace -To replace the string based on index
		
		System.out.println(sb.replace(0, 5, "You"));
		
		
		//reverse - To reverse a string
		System.out.println(sb.reverse());
		
		//delete - To delete the elements from the string - it is index based
		System.out.println(sb.delete(5, 8));
		
	}

}
