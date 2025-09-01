package exceptionPack;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 // ArithmeticException Example
		int a=5;
		int b=0;
		int c= a/b;
		System.out.println(c);
		*/
		
		/*
		//ArrayIndexOutofBoundException example
		int a[]= {1, 2, 3,4};
		for(int i= 0; i<=6;i++) {
			System.out.println(a[i]);
			
		
		}
		
		*/
		
		/*
		//NullPointer Exception
		
		String s=null;
		System.out.println(s.length());
		*/
		
		//StringIndexOutofBoundException
		try {
			
			String s ="Ann";
			char ch =s.charAt(8);
			System.out.println(ch);
			
		}	
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Handled Exception: "+ e);
		}
		
		finally {
			System.out.println("Executed Finally");
		}
		
		System.out.println("Hello");

		
	}

}
