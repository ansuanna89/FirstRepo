package superPackage;

public class SuperConChild extends SuperConstructor{

	public SuperConChild() {
		
		System.out.println("Inside child constructor");
		
	}
	
	public SuperConChild(int a, int b) {
		super(8,4);
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		SuperConChild sc1 = new SuperConChild(8,4);		
		SuperConChild sc = new SuperConChild();
		SuperConstructor scp = new SuperConstructor(12,5);
		
		
	}

}
