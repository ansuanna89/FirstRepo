package interfacePack;

public interface InterfaceParent {
	
	int a=2;
	public static final int b=8;
	
	
	//a=5;
	
	public abstract void display();
	
	public abstract int abMeth(int a, int b);
	
	default void show() {
		//a=5;
		System.out.println("Inside default show");
	}
	
	public static void statMeth() {
		System.out.println("Inside static method");
	}

}
