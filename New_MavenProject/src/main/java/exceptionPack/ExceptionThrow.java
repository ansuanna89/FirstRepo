package exceptionPack;

public class ExceptionThrow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int age =15;
		try {
		
			if(age>=18) {
				System.out.println("Eligible for votting");
				
			}
			else {
				throw new Exception("Not Eligible");
				
			}
		}
		catch(Exception e) {
			System.out.println("Handled Exception: "+e);

		}
		
		finally {
		System.out.println("Hello");
		}

	}

}
