package superPackage;

public class SuperConstructor {
	
	public SuperConstructor() {
		System.out.println("Inside Super class default constructor");
	}
	
	public SuperConstructor(int a, int b) {
		
		System.out.println("Inside Super class Para constructor");
		System.out.println(a-b);
	}

}
