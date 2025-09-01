package polymorphismPackage;

public class OverrideParent {
	
	public void display() {
		System.out.println("This is the parent class mathod");
	}
	
	public void sum(int a, int b) {
		System.out.println("Inside Parent sum method");
		System.out.println(a+b);
	}

	public void diff(int a, int b) {
		System.out.println("Inside Parent Diff method");
		System.out.println(a-b);
	}
}
