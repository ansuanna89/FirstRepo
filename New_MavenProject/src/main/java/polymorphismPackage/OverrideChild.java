package polymorphismPackage;

public class OverrideChild extends OverrideParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverrideChild oc = new OverrideChild();
		oc.display();
		oc.sum(8, 5);
		oc.diff(8, 5);
		

	}
	
	public void display() {
		System.out.println("This is Child Display");
		super.display();
		System.out.println("Calling super class sum from child class display");
		super.sum(4,2);
	}

	public void sum(int a, int b) {
		
		super.sum(a, b);
		
		System.out.println("Inside child sum method");
		System.out.println(a+b+2);
	}

	@Override
	public void diff(int a, int b) {
		// TODO Auto-generated method stub
		super.diff(10, 1);
		int diff = a-b;
		System.out.println(diff);
	}

}
