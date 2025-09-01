package superPackage;

public class SuperChild extends SuperParent{

	String color ="Red";
	
	public static void main(String[] args) {

		SuperChild sc = new SuperChild();
		 System.out.println(sc.color);
		 sc.dispSuperInstance();
		 
		 //sc.display();
		 sc.show();

	}
	public void dispSuperInstance() {
		System.out.println(super.color);
		System.out.println(color);
	}
	
	public void show() {
		System.out.println("Inside child-show");
		super.display();
		super.displayName("Ann");
		int s = this.sum(9, 2);
		System.out.println(s);
	}
	
	public int sum(int a, int b) {
		
		return a+b;
	}

}
