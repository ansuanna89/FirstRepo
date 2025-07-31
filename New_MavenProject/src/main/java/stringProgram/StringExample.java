package stringProgram;

public class StringExample {

	public static void main(String[] args) {
			
		String s1 = "Hello";
		System.out.println(s1);
		
		
		String s2 = new String("Hai");
		System.out.println(s2);
		
		//length - returns the length/size of the string
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		
		//charAt()--Return character of the string based on index
		
		System.out.println(s1.charAt(0));
		
		//concat(); -- To add two string
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s2));	//Still s1 is Hello only, since it is immutable . So the concat will not affect s1(It just printing only). So s1 doesn't have s2.
		
		
		//contains() -- To check whether a char/string is present in the string-it returns true/false
		String s3 ="Hello, How are you?";
		System.out.println(s3.contains(s1));
		System.out.println(s3.contains("this"));
		System.out.println(s3.contains("w"));		
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains(s2));
		
		
		//toUpperCase -convert string to Capital Letter		
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		//toLowercase() -- covert the string to lowercase
		System.out.println(s1.toLowerCase());
		
		

		
		
		//equals() --To check whether 2 strings are equal or not, this is case sensitive
		String st ="java";
		String nst = "java";
		String ms = "JAVA";
		String a ="Selenium";
		
		System.out.println(st.equals(nst));
		System.out.println(st.equals(ms));	//case sensitive
		System.out.println(st.equals(a));
		
		//equalsignorecase() --just check whether two strings are equal or not without considering the case(upper/lower case
		System.out.println(st.equalsIgnoreCase(ms));
		
		// ==
		System.out.println(st==nst); //true
				
		String p = new String("java");
		System.out.println(st==p); //false--> st is in constant pool and p is in heap memory, so it points to different m/y location , so it return false. 
		//it compare the m/y location , not conetnt.
		
		System.out.println(st.equals(p)); //true -- equals () compares the content of the string instead of m/y location
		
		
		
		
		
		//isEmpty() --Check whether the string is empty or not (ie string contains value or not)
		System.out.println(s1.isEmpty());
		
		
		String q="";
		System.out.println(q.isEmpty()); //true
		
		
		//trim(); --To remove white space from first or last
		String r =" hey";
		System.out.println(r.trim());
		String s4 ="Welcome to java";
		System.out.println(s4.trim().replaceAll(" ", ""));
		
		//subString();
		System.out.println(s3.substring(7,12)); //index starting from 0
		
		
		//valueOf() --to convert any datatype into string
		int num = 10;
		System.out.println(String.valueOf(num));
		
		System.out.println("Hiiirrr");
		
		
		
		
		
			
		
	}

}
