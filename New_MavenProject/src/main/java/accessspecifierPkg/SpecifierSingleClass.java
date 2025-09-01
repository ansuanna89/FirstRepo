package accessspecifierPkg;

public class SpecifierSingleClass {
	
	private int a=10;
	private static int b=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecifierSingleClass ssc = new SpecifierSingleClass();
		
		ssc.methodPrivate();
		ssc.methodPublic();
		ssc.methodDefault();
		ssc.methodProtected();
		statPrivateVarAccess();
		statPrivateMethAccess();
		
	}
	
	public void methodPublic() {
		System.out.println("This is a public method "+a);
	}
	
	private void methodPrivate() {
		
		System.out.println("This is a private method ");
	}
	
	void methodDefault() {
		System.out.println("This is a Default method");
	}
	
	protected void methodProtected() {
		System.out.println("This is a Protected method");
	}
	
	//static method
	
	public static void statPrivateVarAccess() {
		System.out.println("Inside static meth "+b);
	}
	private static void statPrivateMethAccess() {
		System.out.println("Inside static meth "+b);
	}
	static void statDefaultMethAccess() {
		System.out.println("Inside static meth "+b);
	}
	protected static void statProtectedMethAccess() {
		System.out.println("Inside static meth "+b);
	}
	
}
