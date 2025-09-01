package abstraction;

public abstract class Parent {
	
	public abstract void display();
	
	public abstract int sum(int a, int b);
	
	public void diff(int a, int b) {
		System.out.println(a-b);
	}
	
	public Parent() {
		System.out.println("Inside parent constructor");
	}
	
	public Parent(int x, int y) {
		System.out.println("Inside parent param constructor "+x+" "+y);
	}


}
